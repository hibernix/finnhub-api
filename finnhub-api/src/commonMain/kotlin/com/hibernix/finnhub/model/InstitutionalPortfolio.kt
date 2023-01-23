package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property name Investor's name.
 * @property cik CIK.
 * @property data Array of positions.
 */
@Serializable
data class InstitutionalPortfolio(
    @SerialName("name") var name: String? = null,
    @SerialName("cik") var cik: String? = null,
    @SerialName("data") var data: List<InstitutionalPortfolioGroup>? = null,
)
