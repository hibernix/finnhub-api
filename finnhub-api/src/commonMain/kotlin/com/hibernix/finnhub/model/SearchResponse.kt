package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property count Total filing matched your search criteria.
 * @property took Time took to execute your search query on our server, value in ms.
 * @property page Current search page
 * @property filings Filing match your search criteria.
 */
@Serializable
data class SearchResponse(
    @SerialName("count") var count: Int? = null,
    @SerialName("took") var took: Int? = null,
    @SerialName("page") var page: Int? = null,
    @SerialName("filings") var filings: List<FilingResponse>? = null,
)
