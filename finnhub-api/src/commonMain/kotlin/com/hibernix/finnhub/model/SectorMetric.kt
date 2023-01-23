package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property region Region.
 * @property data Metrics for each sector.
 */
@Serializable
data class SectorMetric(
    @SerialName("region") var region: String? = null,
    @SerialName("data") var data: List<SectorMetricData>? = null
)
