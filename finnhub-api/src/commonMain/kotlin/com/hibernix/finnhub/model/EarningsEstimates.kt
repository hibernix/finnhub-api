package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property data List of estimates
 * @property freq Frequency: annual or quarterly.
 * @property symbol Company symbol.
 */
@Serializable
data class EarningsEstimates(
    @SerialName("data") var data: List<EarningsEstimatesInfo>? = null,
    @SerialName("freq") var freq: String? = null,
    @SerialName("symbol") var symbol: String? = null,
)
