package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property code Finnhub economic code used to get historical data
 * @property country Country
 * @property name Indicator name
 * @property unit Unit
 */
@Serializable
data class EconomicCode(
    @SerialName("code") var code: String? = null,
    @SerialName("country") var country: String? = null,
    @SerialName("name") var name: String? = null,
    @SerialName("unit") var unit: String? = null,
)
