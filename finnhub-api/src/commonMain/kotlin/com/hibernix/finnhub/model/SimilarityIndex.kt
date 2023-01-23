package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol.
 * @property cik CIK.
 * @property similarity Array of filings with its cosine similarity compared to the same report of the previous year.
 */
@Serializable
data class SimilarityIndex(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("cik") var cik: String? = null,
    @SerialName("similarity") var similarity: List<SimilarityIndexInfo>? = null,
)
