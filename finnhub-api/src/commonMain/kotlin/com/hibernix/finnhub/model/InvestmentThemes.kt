package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property theme Investment theme
 * @property data Investment theme portfolio.
 */
@Serializable
data class InvestmentThemes(
    @SerialName("theme") var theme: String? = null,
    @SerialName("data") var data: List<InvestmentThemePortfolio>? = null,
)
