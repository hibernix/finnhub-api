package com.hibernix.finnhub.model

import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol.
 * @property date Date.
 * @property hour Indicates whether the earnings is announced before market open(*bmo*), after market close(*amc*),
 * or during market hour(*dmh*).
 * @property year Earnings year.
 * @property quarter Earnings quarter.
 * @property epsEstimate EPS estimate.
 * @property epsActual EPS actual.
 * @property revenueEstimate Revenue estimate including Finnhub's proprietary estimates.
 * @property revenueActual Revenue actual.
 */
@Serializable
data class EarningRelease(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("date") var date: LocalDate? = null,
    @SerialName("hour") var hour: String? = null,
    @SerialName("year") var year: Long? = null,
    @SerialName("quarter") var quarter: Long? = null,
    @SerialName("epsEstimate") var epsEstimate: Float? = null,
    @SerialName("epsActual") var epsActual: Float? = null,
    @SerialName("revenueEstimate") var revenueEstimate: Float? = null,
    @SerialName("revenueActual") var revenueActual: Float? = null,
)
