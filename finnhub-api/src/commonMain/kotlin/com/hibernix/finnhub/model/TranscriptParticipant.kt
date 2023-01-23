package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property name Participant's name
 * @property description Participant's description
 * @property role Whether the speak is a company's executive or an analyst
 */
@Serializable
data class TranscriptParticipant(
    @SerialName("name") var name: String? = null,
    @SerialName("description") var description: String? = null,
    @SerialName("role") var role: String? = null,
)
