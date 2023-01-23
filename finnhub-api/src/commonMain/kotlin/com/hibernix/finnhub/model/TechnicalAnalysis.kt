package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property count Number of indicators for each signal
 * @property signal Aggregate Signal
 */
@Serializable
data class TechnicalAnalysis(
    @SerialName("count") var count: Indicator? = null,
    @SerialName("signal") var signal: String? = null,
)
