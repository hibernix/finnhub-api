package com.hibernix.finnhub.websocket

import com.hibernix.finnhub.model.NewsItem
import com.hibernix.finnhub.model.TradeItem
import kotlinx.coroutines.flow.SharedFlow

interface FinnhubWebSocket {

    /**
     * Flow of all trades the client is subscribed to. Each list contains only items of single symbol.
     * If there are subscriptions for multiple symbols, each will emit in separate lists, you have to distinguish them
     * by [TradeItem.s] of any item in the list.
     */
    val tradesFlow: SharedFlow<List<TradeItem>>

    /**
     * Flow of all news the client is subscribed to. If you are subscribed to multiple symbols, they might be mixed
     * together and Finnhub currently doesn't seem to provide clear distinction from the response, but you can check
     * the [NewsItem.related] item.
     */
    val newsFlow: SharedFlow<List<NewsItem>>

    /**
     * Called when the websocket succesfully connects to the server. You might want to include some initialization
     * here and do the subscriptions.
     */
    var onConnected: () -> Unit

    /**
     * Called when the websocket disconnects. The lambda parameter indicates, whether the connection was closed
     * on demand by user, or by some external factors, like connection problems. You might want to use this
     * for auto-reconnect logic, if the connection was closed unexpectedly.
     */
    var onDisconnected: (Boolean) -> Unit

    /**
     * Callback called when any error occurred. For finnhub error responses you will get [FinnhubException]
     * with the received message. For all other errors the original exception will be emitted.
     */
    var onError: (Throwable) -> Unit

    /**
     * Connect to the websocket server.
     * @param connected convenience block to be executed after successful connection. You can use this instead of
     * [onConnected] callback.
     */
    fun connect(connected: (() -> Unit)? = null)

    /**
     * Disconnect from websocket server.
     */
    fun disconnect()

    /**
     * Subscribe to the trades.
     * @param symbol Ticker symbol for which the trade ticks should be received.
     */
    fun subscribeTrades(symbol: String)

    /**
     * Unsubscribe from trades.
     * @param symbol Ticker symbol for which you don't want to receive the trade ticks anymore
     */
    fun unsubscribeTrades(symbol: String)

    /**
     * Subscribe to the news.
     * @param symbol Ticker symbol for which the news should be received.
     */
    fun subscribeNews(symbol: String)

    /**
     * Unsubscribe from news.
     * @param symbol Ticker symbol for which you don't want to receive the news anymore
     */
    fun unsubscribeNews(symbol: String)

    companion object {

        /**
         * Used for creating of an instance of [FinnhubWebSocket].
         * @param apiKey Your finnhub API key.
         */
        fun create(apiKey: String): FinnhubWebSocket = FinnhubWebSocketImpl(apiKey)
    }
}
