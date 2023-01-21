package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property base Base currency.
 * @property quote A map of base/quote rates for all currency pair.
 */
@Serializable
data class Forexrates(
    @SerialName("base") var base: String? = null,
    @SerialName("quote") var quote: ForexRate? = null
)
