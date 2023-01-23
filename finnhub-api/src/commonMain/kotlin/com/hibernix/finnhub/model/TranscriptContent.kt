package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property name Speaker's name
 * @property speech Speaker's speech
 * @property session Earnings calls section (management discussion or Q&amp;A)
 */
@Serializable
data class TranscriptContent(
    @SerialName("name") var name: String? = null,
    @SerialName("speech") var speech: List<String>? = null,
    @SerialName("session") var session: String? = null,
)
