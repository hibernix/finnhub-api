package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property country Country
 * @property exposure Percent of exposure.
 */
@Serializable
data class MutualFundCountryExposureData(
    @SerialName("country") var country: String? = null,
    @SerialName("exposure") var exposure: Float? = null
)
