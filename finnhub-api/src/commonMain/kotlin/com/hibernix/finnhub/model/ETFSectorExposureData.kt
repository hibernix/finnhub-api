package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property industry Industry
 * @property exposure Percent of exposure.
 */
@Serializable
data class ETFSectorExposureData(
    @SerialName("industry") var industry: String? = null,
    @SerialName("exposure") var exposure: Float? = null
)
