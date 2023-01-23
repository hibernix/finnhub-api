package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol.
 * @property data Array of government's spending data points.
 */
@Serializable
data class UsaSpendingResult(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("data") var data: List<UsaSpending>? = null,
)
