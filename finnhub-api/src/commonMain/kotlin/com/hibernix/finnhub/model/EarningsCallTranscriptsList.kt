package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Company symbol.
 * @property transcripts Array of transcripts' metadata
 */
@Serializable
data class EarningsCallTranscriptsList(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("transcripts") var transcripts: List<StockTranscripts>? = null
)
