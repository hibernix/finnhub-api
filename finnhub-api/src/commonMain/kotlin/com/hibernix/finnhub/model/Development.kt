package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Company symbol.
 * @property datetime Published time in <code>YYYY-MM-DD HH:MM:SS</code> format.
 * @property headline Development headline.
 * @property description Development description.
 * @property url URL.
 */
@Serializable
data class Development(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("datetime") var datetime: String? = null,
    @SerialName("headline") var headline: String? = null,
    @SerialName("description") var description: String? = null,
    @SerialName("url") var url: String? = null
)
