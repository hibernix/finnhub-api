package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol.
 * @property countryExposure Array of countries and and exposure levels.
 */
@Serializable
data class MutualFundCountryExposure(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("countryExposure") var countryExposure: List<MutualFundCountryExposureData>? = null,
)
