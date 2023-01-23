package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property reportDate Report date.
 * @property filingDate Filing date.
 * @property portfolio Array of positions.
 */
@Serializable
data class InstitutionalPortfolioGroup(
    @SerialName("reportDate") var reportDate: String? = null,
    @SerialName("filingDate") var filingDate: String? = null,
    @SerialName("portfolio") var portfolio: List<InstitutionalPortfolioInfo>? = null,
)
