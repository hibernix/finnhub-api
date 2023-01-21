package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol of the company.
 * @property financials An array of map of key, value pairs containing the data for each period.
 */
@Serializable
data class FinancialStatements(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("financials") var financials: List<FinancialMap>? = null
)
