package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol of the company.
 * @property data Array of sentiment data.
 */
@Serializable
data class InsiderSentiments(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("data") var data: List<InsiderSentimentsData>? = null,
)
