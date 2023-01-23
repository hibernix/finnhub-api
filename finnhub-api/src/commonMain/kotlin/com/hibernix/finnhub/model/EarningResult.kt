package com.hibernix.finnhub.model

import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property actual Actual earning result.
 * @property estimate Estimated earning.
 * @property surprise Surprise - The difference between actual and estimate.
 * @property surprisePercent Surprise percent.
 * @property period Reported period.
 * @property symbol Company symbol.
 */
@Serializable
data class EarningResult(
    @SerialName("actual") var actual: Float? = null,
    @SerialName("estimate") var estimate: Float? = null,
    @SerialName("surprise") var surprise: Float? = null,
    @SerialName("surprisePercent") var surprisePercent: Float? = null,
    @SerialName("period") var period: LocalDate? = null,
    @SerialName("symbol") var symbol: String? = null,
)
