package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol.
 * @property profile Profile data.
 */
@Serializable
data class ETFsProfile(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("profile") var profile: ETFProfileData? = null
)
