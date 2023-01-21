package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Index's symbol.
 * @property historicalConstituents Array of historical constituents.
 */
@Serializable
data class IndicesHistoricalConstituents(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("historicalConstituents") var historicalConstituents: List<IndexHistoricalConstituent>? = null
)
