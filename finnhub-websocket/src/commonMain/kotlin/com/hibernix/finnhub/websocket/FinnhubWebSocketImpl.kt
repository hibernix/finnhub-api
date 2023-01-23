package com.hibernix.finnhub.websocket

import com.hibernix.finnhub.model.ErrorFrame
import com.hibernix.finnhub.model.FinnhubMessageFrame
import com.hibernix.finnhub.model.MessageType
import com.hibernix.finnhub.model.NewsItem
import com.hibernix.finnhub.model.TradeItem
import com.hibernix.finnhub.model.WsNewsFrame
import com.hibernix.finnhub.model.WsTradeFrame
import io.ktor.client.HttpClient
import io.ktor.client.plugins.websocket.DefaultClientWebSocketSession
import io.ktor.client.plugins.websocket.WebSockets
import io.ktor.client.plugins.websocket.webSocket
import io.ktor.utils.io.errors.IOException
import io.ktor.websocket.Frame
import io.ktor.websocket.readText
import io.ktor.websocket.send
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json

/**
 * Implementation of [FinnhubWebSocket]
 */
internal class FinnhubWebSocketImpl(private val apiKey: String) : FinnhubWebSocket {

    private val _newsFlow: MutableSharedFlow<List<NewsItem>> = MutableSharedFlow()
    override val newsFlow = _newsFlow.asSharedFlow()

    private val _tradesFlow: MutableSharedFlow<List<TradeItem>> = MutableSharedFlow()
    override val tradesFlow = _tradesFlow.asSharedFlow()

    private val scope = CoroutineScope(Dispatchers.Default)
    private val json = Json.Default

    private val client = HttpClient {
        install(WebSockets)
    }
    private var session: DefaultClientWebSocketSession? = null

    override var onConnected: () -> Unit = { println("Finnhub WebSocket connected") }
    override var onDisconnected: (Boolean) -> Unit = { println("Finnhub WebSocket disconnected, byUser = $it") }
    override var onError: (Throwable) -> Unit = { it.printStackTrace() }

    override fun connect(connected: (() -> Unit)?) {
        scope.launch {
            client.webSocket("$FINNHUB_WEBSOCKET_BASE_URL$apiKey") {
                session = this
                connected?.invoke()
                onConnected()
                while (true) {
                    try {
                        val frame = incoming.receive() as? Frame.Text ?: continue
                        val msg = frame.readText()
                        when {
                            msg.contains("\"type\":\"trade\"") -> parseTrade(msg)
                            msg.contains("\"type\":\"news\"") -> parseNews(msg)
                            msg.contains("\"type\":\"error\"") -> parseError(msg)
                            msg.contains("\"type\":\"ping\"") -> {
                                /* do nothing */
                            }

                            else -> throw UnsupportedOperationException("This type of message is not supported! ($msg)")
                        }
                    } catch (e: IOException) {
                        // connection problem or other network error
                        onError(e)
                        onDisconnected(false)
                    } catch (e: Throwable) {
                        onError(e)
                    }
                }
            }
        }
    }

    private suspend fun parseNews(msg: String) {
        val newsData = json.decodeFromString(WsNewsFrame.serializer(), msg)
        _newsFlow.emit(newsData.data)
    }

    private suspend fun parseTrade(msg: String) {
        val tradeData = json.decodeFromString(WsTradeFrame.serializer(), msg)
        _tradesFlow.emit(tradeData.data)
    }

    private fun parseError(msg: String) {
        val error = json.decodeFromString(ErrorFrame.serializer(), msg)
        onError(FinnhubException(error.msg ?: "Unknown finnhub error"))
    }

    override fun disconnect() {
        onDisconnected(true)
        client.close()
    }

    override fun subscribeNews(symbol: String) {
        val frame = FinnhubMessageFrame(type = MessageType.SUBSCRIBE_NEWS, symbol)
        sendFrame(frame)
    }

    override fun unsubscribeNews(symbol: String) {
        val frame = FinnhubMessageFrame(type = MessageType.UNSUBSCRIBE_NEWS, symbol)
        sendFrame(frame)
    }

    override fun subscribeTrades(symbol: String) {
        val frame = FinnhubMessageFrame(type = MessageType.SUBSCRIBE_TRADES, symbol)
        sendFrame(frame)
    }

    override fun unsubscribeTrades(symbol: String) {
        val frame = FinnhubMessageFrame(type = MessageType.UNSUBSCRIBE_TRADES, symbol)
        sendFrame(frame)
    }

    fun ping() {
        val frame = FinnhubMessageFrame(type = MessageType.PING, null)
        sendFrame(frame)
    }

    private fun sendFrame(frame: FinnhubMessageFrame) {
        scope.launch {
            try {
                session?.send(json.encodeToString(FinnhubMessageFrame.serializer(), frame).also { println(it) })
            } catch (ex: Throwable) {
                onError(ex)
            }
        }
    }

    companion object {
        private const val FINNHUB_WEBSOCKET_BASE_URL = "wss://ws.finnhub.io?token="
    }
}



