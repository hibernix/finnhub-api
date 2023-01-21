package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property bearishPercent
 * @property bullishPercent
 */
@Serializable
data class Sentiment(
    @SerialName("bearishPercent") var bearishPercent: Float? = null,
    @SerialName("bullishPercent") var bullishPercent: Float? = null
)
