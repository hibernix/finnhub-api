package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property points Array of patterns.
 */
@Serializable
data class PatternRecognition(
    @SerialName("points") var points: List<ScanPattern>? = null
)
