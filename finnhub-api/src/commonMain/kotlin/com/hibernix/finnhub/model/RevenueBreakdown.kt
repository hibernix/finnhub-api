package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol
 * @property cik CIK
 * @property data Array of revenue breakdown over multiple periods.
 */
@Serializable
data class RevenueBreakdown(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("cik") var cik: String? = null,
    @SerialName("data") var data: List<BreakdownItem>? = null,
)
