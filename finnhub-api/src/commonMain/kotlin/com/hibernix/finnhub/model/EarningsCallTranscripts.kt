package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Company symbol.
 * @property transcript Transcript content.
 * @property participant Participant list
 * @property audio Audio link.
 * @property id Transcript's ID.
 * @property title Title.
 * @property time Time of the event.
 * @property year Year of earnings result in the case of earnings call transcript.
 * @property quarter Quarter of earnings result in the case of earnings call transcript.
 */
@Serializable
data class EarningsCallTranscripts(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("transcript") var transcript: List<TranscriptContent>? = null,
    @SerialName("participant") var participant: List<TranscriptParticipant>? = null,
    @SerialName("audio") var audio: String? = null,
    @SerialName("id") var id: String? = null,
    @SerialName("title") var title: String? = null,
    @SerialName("time") var time: String? = null,
    @SerialName("year") var year: Long? = null,
    @SerialName("quarter") var quarter: Long? = null,
)
