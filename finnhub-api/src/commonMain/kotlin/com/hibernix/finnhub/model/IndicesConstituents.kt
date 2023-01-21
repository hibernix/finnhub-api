package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Index's symbol.
 * @property constituents Array of constituents.
 */
@Serializable
data class IndicesConstituents(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("constituents") var constituents: List<String>? = null
)
