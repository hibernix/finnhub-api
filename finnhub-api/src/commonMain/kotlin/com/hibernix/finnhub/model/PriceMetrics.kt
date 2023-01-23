package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol of the company.
 * @property data Map key-value pair of key ratios and metrics.
 */
@Serializable
data class PriceMetrics(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("data") var data: PriceMetricMap? = null,
)
