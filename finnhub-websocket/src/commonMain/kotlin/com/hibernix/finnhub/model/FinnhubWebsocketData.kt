package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TradeItem(
    val s: String? = null,
    val p: Float? = null,
    val t: Long? = null,
    val v: Float? = null,
    val c: List<String>? = null,
)

@Serializable
data class NewsItem(
    val category: String? = null,
    val datetime: Long? = null,
    val headline: String? = null,
    val urlId: String? = null,
    val image: String? = null,
    val related: String? = null,
    val source: String? = null,
)

@Serializable
internal data class FinnhubMessageFrame(
    val type: MessageType,
    val symbol: String? = null,
)

@Serializable
internal enum class MessageType {
    @SerialName("subscribe")
    SUBSCRIBE_TRADES,

    @SerialName("unsubscribe")
    UNSUBSCRIBE_TRADES,

    @SerialName("subscribe-news")
    SUBSCRIBE_NEWS,

    @SerialName("unsubscribe-news")
    UNSUBSCRIBE_NEWS,

    @SerialName("ping")
    PING,

    @SerialName("error")
    ERROR,
}

@Serializable
internal data class WsTradeFrame(
    val type: String,
    val data: List<TradeItem> = emptyList(),
)

@Serializable
internal data class WsNewsFrame(
    val type: String,
    val data: List<NewsItem> = emptyList(),
)

@Serializable
internal data class ErrorFrame(
    val type: String,
    val msg: String? = null,
)
