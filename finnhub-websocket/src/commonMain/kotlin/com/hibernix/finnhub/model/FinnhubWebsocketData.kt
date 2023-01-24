package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Tick representing a single trade.
 * @property s Symbol
 * @property p Last price
 * @property t UNIX milisecond timestamp
 * @property v Volume
 * @property c List of trade conditions. A comprehensive list of trade conditions code can be found
 * [here](https://docs.google.com/spreadsheets/d/1PUxiSWPHSODbaTaoL2Vef6DgU-yFtlRGZf19oBb9Hp0/edit?usp=sharing)
 */
@Serializable
data class TradeItem(
    val s: String? = null,
    val p: Float? = null,
    val t: Long? = null,
    val v: Float? = null,
    val c: List<String>? = null,
)

/**
 * @property category News category
 * @property datetime Published time in UNIX timestamp
 * @property headline News headline
 * @property urlId News ID
 * @property image Thumbnail image URL
 * @property related Related stocks and companies mentioned in the article
 * @property source News source
 * @property summary News summary
 * @property url URL of the original article
 */
@Serializable
data class NewsItem(
    val category: String? = null,
    val datetime: Long? = null,
    val headline: String? = null,
    val urlId: String? = null,
    val image: String? = null,
    val related: String? = null,
    val source: String? = null,
    val summary: String? = null,
    val url: String? = null,
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
