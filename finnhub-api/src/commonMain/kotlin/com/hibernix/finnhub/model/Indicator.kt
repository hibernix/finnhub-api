package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property buy Number of buy signals
 * @property neutral Number of neutral signals
 * @property sell Number of sell signals
 */
@Serializable
data class Indicator(
    @SerialName("buy") var buy: Long? = null,
    @SerialName("neutral") var neutral: Long? = null,
    @SerialName("sell") var sell: Long? = null,
)
