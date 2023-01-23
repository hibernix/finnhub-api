package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol
 * @property freq Frequency
 * @property data Array of earnings quality score.
 */
@Serializable
data class CompanyEarningsQualityScore(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("freq") var freq: String? = null,
    @SerialName("data") var data: List<CompanyEarningsQualityScoreData>? = null,
)
