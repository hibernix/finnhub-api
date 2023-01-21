package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property fromDate Start time of the event in EST.
 * @property toDate End time of the event in EST.
 * @property eventDescription Event's description.
 * @property url URL.
 */
@Serializable
data class FDAComitteeMeeting(
    @SerialName("fromDate") var fromDate: String? = null,
    @SerialName("toDate") var toDate: String? = null,
    @SerialName("eventDescription") var eventDescription: String? = null,
    @SerialName("url") var url: String? = null
)
