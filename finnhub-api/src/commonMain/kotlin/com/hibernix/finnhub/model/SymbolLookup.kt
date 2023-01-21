package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property result Array of search results.
 * @property count Number of results.
 */
@Serializable
data class SymbolLookup(
    @SerialName("result") var result: List<SymbolLookupInfo>? = null,
    @SerialName("count") var count: Long? = null
)
