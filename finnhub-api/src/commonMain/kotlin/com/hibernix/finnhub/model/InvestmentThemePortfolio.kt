package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol
 */
@Serializable
data class InvestmentThemePortfolio(
    @SerialName("symbol") var symbol: String? = null,
)
