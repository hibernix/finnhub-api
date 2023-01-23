package com.hibernix.finnhub.model

import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property ebitAvg Average EBIT estimates including Finnhub's proprietary estimates.
 * @property ebitHigh Highest estimate.
 * @property ebitLow Lowest estimate.
 * @property numberAnalysts Number of Analysts.
 * @property period Period.
 */
@Serializable
data class EbitEstimatesInfo(
    @SerialName("ebitAvg") var ebitAvg: Float? = null,
    @SerialName("ebitHigh") var ebitHigh: Float? = null,
    @SerialName("ebitLow") var ebitLow: Float? = null,
    @SerialName("numberAnalysts") var numberAnalysts: Long? = null,
    @SerialName("period") var period: LocalDate? = null,
)
