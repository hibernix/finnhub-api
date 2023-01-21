package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol
 * @property `data`
 */
@Serializable
data class Dividends2(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("data") var `data`: List<Dividends2Info>? = null
)
