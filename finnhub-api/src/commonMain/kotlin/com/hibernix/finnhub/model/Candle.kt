package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName

/**
 *
 */
data class Candle(
    @SerialName("o") var o: Float? = null,
    @SerialName("h") var h: Float? = null,
    @SerialName("l") var l: Float? = null,
    @SerialName("c") var c: Float? = null,
    @SerialName("v") var v: Float? = null,
    @SerialName("t") var t: Long? = null,
    @SerialName("s") var s: String? = null,
)
