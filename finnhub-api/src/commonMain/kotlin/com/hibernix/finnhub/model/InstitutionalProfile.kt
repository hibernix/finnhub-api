package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property cik CIK.
 * @property `data` Array of investors.
 */
@Serializable
data class InstitutionalProfile(
    @SerialName("cik") var cik: String? = null,
    @SerialName("data") var `data`: List<InstitutionalProfileInfo>? = null
)
