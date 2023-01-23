package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property economicCalendar Array of economic events.
 */
@Serializable
data class EconomicCalendar(
    @SerialName("economicCalendar") var economicCalendar: List<EconomicEvent>? = null,
)
