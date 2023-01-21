package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property actual Actual release
 * @property prev Previous release
 * @property country Country
 * @property unit Unit
 * @property estimate Estimate
 * @property event Event
 * @property impact Impact level
 * @property time Release time
 */
@Serializable
data class EconomicEvent(
    @SerialName("actual") var actual: Float? = null,
    @SerialName("prev") var prev: Float? = null,
    @SerialName("country") var country: String? = null,
    @SerialName("unit") var unit: String? = null,
    @SerialName("estimate") var estimate: Float? = null,
    @SerialName("event") var event: String? = null,
    @SerialName("impact") var impact: String? = null,
    @SerialName("time") var time: String? = null
)
