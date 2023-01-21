package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Company symbol.
 * @property targetHigh Highes analysts' target.
 * @property targetLow Lowest analysts' target.
 * @property targetMean Mean of all analysts' targets.
 * @property targetMedian Median of all analysts' targets.
 * @property lastUpdated Updated time of the data
 */
@Serializable
data class PriceTarget(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("targetHigh") var targetHigh: Float? = null,
    @SerialName("targetLow") var targetLow: Float? = null,
    @SerialName("targetMean") var targetMean: Float? = null,
    @SerialName("targetMedian") var targetMedian: Float? = null,
    @SerialName("lastUpdated") var lastUpdated: String? = null
)
