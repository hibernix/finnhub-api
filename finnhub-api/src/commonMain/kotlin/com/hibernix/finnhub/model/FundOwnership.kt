package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol of the company.
 * @property ownership Array of investors with detailed information about their holdings.
 */
@Serializable
data class FundOwnership(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("ownership") var ownership: List<FundOwnershipInfo>? = null
)
