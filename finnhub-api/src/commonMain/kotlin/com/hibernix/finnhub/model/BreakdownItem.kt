package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property accessNumber Access number of the report from which the data is sourced.
 * @property breakdown Revenue breakdown.
 */
@Serializable
data class BreakdownItem(
    @SerialName("accessNumber") var accessNumber: String? = null,
    @SerialName("breakdown") var breakdown: BreakdownItemMap? = null,
)
