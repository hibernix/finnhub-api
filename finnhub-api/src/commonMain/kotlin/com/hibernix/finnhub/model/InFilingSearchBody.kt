package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property query Search query
 * @property filingId Filing Id to search
 */
@Serializable
data class InFilingSearchBody(
    @SerialName("query") var query: String,
    @SerialName("filingId") var filingId: String
)
