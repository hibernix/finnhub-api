package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property o List of open prices for returned candles.
 * @property h List of high prices for returned candles.
 * @property l List of low prices for returned candles.
 * @property c List of close prices for returned candles.
 * @property v List of volume data for returned candles.
 * @property t List of timestamp for returned candles.
 * @property s Status of the response. This field can either be ok or no_data.
 */
@Serializable
data class CryptoCandles(
    @SerialName("o") var o: List<Float>? = null,
    @SerialName("h") var h: List<Float>? = null,
    @SerialName("l") var l: List<Float>? = null,
    @SerialName("c") var c: List<Float>? = null,
    @SerialName("v") var v: List<Float>? = null,
    @SerialName("t") var t: List<Long>? = null,
    @SerialName("s") var s: String? = null
)
