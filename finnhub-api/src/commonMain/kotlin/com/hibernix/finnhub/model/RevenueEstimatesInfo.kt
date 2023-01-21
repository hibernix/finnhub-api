package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.datetime.LocalDate

/**
 * @property revenueAvg Average revenue estimates including Finnhub's proprietary estimates.
 * @property revenueHigh Highest estimate.
 * @property revenueLow Lowest estimate.
 * @property numberAnalysts Number of Analysts.
 * @property period Period.
 */
@Serializable
data class RevenueEstimatesInfo(
    @SerialName("revenueAvg") var revenueAvg: Float? = null,
    @SerialName("revenueHigh") var revenueHigh: Float? = null,
    @SerialName("revenueLow") var revenueLow: Float? = null,
    @SerialName("numberAnalysts") var numberAnalysts: Long? = null,
    @SerialName("period") var period: LocalDate? = null
)
