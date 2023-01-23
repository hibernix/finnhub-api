package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property state State.
 * @property case Number of confirmed cases.
 * @property death Number of confirmed deaths.
 * @property updated Updated time.
 */
@Serializable
data class CovidInfo(
    @SerialName("state") var state: String? = null,
    @SerialName("case") var case: Float? = null,
    @SerialName("death") var death: Float? = null,
    @SerialName("updated") var updated: String? = null,
)
