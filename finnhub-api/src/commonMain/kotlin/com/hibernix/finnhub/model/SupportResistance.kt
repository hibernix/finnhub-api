package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property levels Array of support and resistance levels.
 */
@Serializable
data class SupportResistance(
    @SerialName("levels") var levels: List<Float>? = null,
)
