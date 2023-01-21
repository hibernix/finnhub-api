package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property c List of close prices for returned candles.
 * @property t List of timestamp for returned candles.
 * @property s Status of the response. This field can either be ok or no_data.
 */
@Serializable
data class BondCandles(
    @SerialName("c") var c: List<Float>? = null,
    @SerialName("t") var t: List<Long>? = null,
    @SerialName("s") var s: String? = null
)
