package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property b Bid price.
 * @property a Ask price.
 * @property bv Bid volume.
 * @property av Ask volume.
 * @property t Reference UNIX timestamp in ms.
 */
@Serializable
data class LastBidMinusAsk(
    @SerialName("b") var b: Float? = null,
    @SerialName("a") var a: Float? = null,
    @SerialName("bv") var bv: Float? = null,
    @SerialName("av") var av: Float? = null,
    @SerialName("t") var t: Long? = null,
)
