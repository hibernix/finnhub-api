package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property sector Sector
 * @property exposure Percent of exposure.
 */
@Serializable
data class MutualFundSectorExposureData(
    @SerialName("sector") var sector: String? = null,
    @SerialName("exposure") var exposure: Float? = null,
)
