package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property earningsCalendar Array of earnings release.
 */
@Serializable
data class EarningsCalendar(
    @SerialName("earningsCalendar") var earningsCalendar: List<EarningRelease>? = null
)
