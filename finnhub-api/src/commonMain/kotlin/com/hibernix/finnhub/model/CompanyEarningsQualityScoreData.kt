package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property period Period
 * @property growth Growth Score
 * @property profitability Profitability Score
 * @property cashGenerationCapitalAllocation Cash Generation and Capital Allocation
 * @property leverage Leverage Score
 * @property score Total Score
 * @property letterScore Letter Score
 */
@Serializable
data class CompanyEarningsQualityScoreData(
    @SerialName("period") var period: String? = null,
    @SerialName("growth") var growth: Float? = null,
    @SerialName("profitability") var profitability: Float? = null,
    @SerialName("cashGenerationCapitalAllocation") var cashGenerationCapitalAllocation: Float? = null,
    @SerialName("leverage") var leverage: Float? = null,
    @SerialName("score") var score: Float? = null,
    @SerialName("letterScore") var letterScore: String? = null,
)
