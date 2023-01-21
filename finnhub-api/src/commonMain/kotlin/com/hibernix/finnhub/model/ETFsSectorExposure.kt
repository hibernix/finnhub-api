package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol ETF symbol.
 * @property sectorExposure Array of industries and exposure levels.
 */
@Serializable
data class ETFsSectorExposure(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("sectorExposure") var sectorExposure: List<ETFSectorExposureData>? = null
)
