package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.datetime.LocalDate

/**
 * @property epsAvg Average EPS estimates including Finnhub's proprietary estimates.
 * @property epsHigh Highest estimate.
 * @property epsLow Lowest estimate.
 * @property numberAnalysts Number of Analysts.
 * @property period Period.
 */
@Serializable
data class EarningsEstimatesInfo(
    @SerialName("epsAvg") var epsAvg: Float? = null,
    @SerialName("epsHigh") var epsHigh: Float? = null,
    @SerialName("epsLow") var epsLow: Float? = null,
    @SerialName("numberAnalysts") var numberAnalysts: Long? = null,
    @SerialName("period") var period: LocalDate? = null
)
