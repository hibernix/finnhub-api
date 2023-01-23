package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property id Transcript's ID used to get the <a href="#transcripts">full transcript).
 * @property title Title.
 * @property time Time of the event.
 * @property year Year of earnings result in the case of earnings call transcript.
 * @property quarter Quarter of earnings result in the case of earnings call transcript.
 */
@Serializable
data class StockTranscripts(
    @SerialName("id") var id: String? = null,
    @SerialName("title") var title: String? = null,
    @SerialName("time") var time: String? = null,
    @SerialName("year") var year: Long? = null,
    @SerialName("quarter") var quarter: Long? = null,
)
