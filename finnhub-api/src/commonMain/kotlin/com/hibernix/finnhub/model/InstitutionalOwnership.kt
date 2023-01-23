package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol.
 * @property cusip Cusip.
 * @property data Array of institutional investors.
 */
@Serializable
data class InstitutionalOwnership(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("cusip") var cusip: String? = null,
    @SerialName("data") var data: List<InstitutionalOwnershipGroup>? = null,
)
