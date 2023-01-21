package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property technicalAnalysis Number of indicator signals strong buy, buy, neutral, sell, strong sell signals.
 * @property trend Whether the market is trending.
 */
@Serializable
data class AggregateIndicators(
    @SerialName("technicalAnalysis") var technicalAnalysis: TechnicalAnalysis? = null,
    @SerialName("trend") var trend: Trend? = null
)
