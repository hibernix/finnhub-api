package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property data Array of economic data for requested code.
 * @property code Finnhub economic code
 */
@Serializable
data class EconomicData(
    @SerialName("data") var data: List<EconomicDataInfo>? = null,
    @SerialName("code") var code: String? = null
)
