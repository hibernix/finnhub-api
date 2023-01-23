package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property sector Sector
 * @property metrics Metrics data in key-value format. *a* and *m* fields are for average and median respectively.
 */
@Serializable
data class SectorMetricData(
    @SerialName("sector") var sector: String? = null,
    @SerialName("metrics") var metrics: Map<String, Int?>? = null
)
