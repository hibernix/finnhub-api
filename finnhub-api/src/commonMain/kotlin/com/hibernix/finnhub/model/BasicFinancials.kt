package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol of the company.
 * @property metricType Metric type.
 * @property series Map key-value pair of time-series ratios.
 * @property metric Map key-value pair of key ratios and metrics.
 */
@Serializable
data class BasicFinancials(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("metricType") var metricType: String? = null,
    @SerialName("series") var series: MetricSeriesMap? = null,
    @SerialName("metric") var metric: MetricMap? = null,
)
