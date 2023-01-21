package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol.
 * @property `data` Array of H1b and Permanent visa applications.
 */
@Serializable
data class VisaApplicationResult(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("data") var `data`: List<VisaApplication>? = null
)
