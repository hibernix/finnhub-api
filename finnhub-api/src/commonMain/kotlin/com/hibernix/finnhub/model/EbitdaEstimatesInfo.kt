package com.hibernix.finnhub.model

import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property ebitdaAvg Average EBITDA estimates including Finnhub's proprietary estimates.
 * @property ebitdaHigh Highest estimate.
 * @property ebitdaLow Lowest estimate.
 * @property numberAnalysts Number of Analysts.
 * @property period Period.
 */
@Serializable
data class EbitdaEstimatesInfo(
    @SerialName("ebitdaAvg") var ebitdaAvg: Float? = null,
    @SerialName("ebitdaHigh") var ebitdaHigh: Float? = null,
    @SerialName("ebitdaLow") var ebitdaLow: Float? = null,
    @SerialName("numberAnalysts") var numberAnalysts: Long? = null,
    @SerialName("period") var period: LocalDate? = null,
)
