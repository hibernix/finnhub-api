package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property accessNumber Access number.
 * @property symbol Symbol.
 * @property cik CIK.
 * @property sentiment Filing Sentiment
 */
@Serializable
data class SECSentimentAnalysis(
    @SerialName("accessNumber") var accessNumber: String? = null,
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("cik") var cik: String? = null,
    @SerialName("sentiment") var sentiment: FilingSentiment? = null
)
