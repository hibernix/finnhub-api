package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Mutual symbol.
 * @property sectorExposure Array of sector and exposure levels.
 */
@Serializable
data class MutualFundSectorExposure(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("sectorExposure") var sectorExposure: List<MutualFundSectorExposureData>? = null
)
