package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property ipoCalendar Array of IPO events.
 */
@Serializable
data class IPOCalendar(
    @SerialName("ipoCalendar") var ipoCalendar: List<IPOEvent>? = null,
)
