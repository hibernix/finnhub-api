package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property buzz Statistics of company news in the past week.
 * @property companyNewsScore News score.
 * @property sectorAverageBullishPercent Sector average bullish percent.
 * @property sectorAverageNewsScore Sectore average score.
 * @property sentiment News sentiment.
 * @property symbol Requested symbol.
 */
@Serializable
data class NewsSentiment(
    @SerialName("buzz") var buzz: CompanyNewsStatistics? = null,
    @SerialName("companyNewsScore") var companyNewsScore: Float? = null,
    @SerialName("sectorAverageBullishPercent") var sectorAverageBullishPercent: Float? = null,
    @SerialName("sectorAverageNewsScore") var sectorAverageNewsScore: Float? = null,
    @SerialName("sentiment") var sentiment: Sentiment? = null,
    @SerialName("symbol") var symbol: String? = null
)
