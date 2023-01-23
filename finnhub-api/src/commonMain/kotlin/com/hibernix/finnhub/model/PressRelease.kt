package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Company symbol.
 * @property majorDevelopment Array of major developments.
 */
@Serializable
data class PressRelease(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("majorDevelopment") var majorDevelopment: List<Development>? = null,
)
