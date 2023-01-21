package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property atDate Event's date.
 * @property oldIsin Old ISIN.
 * @property newIsin New ISIN.
 */
@Serializable
data class IsinChangeInfo(
    @SerialName("atDate") var atDate: String? = null,
    @SerialName("oldIsin") var oldIsin: String? = null,
    @SerialName("newIsin") var newIsin: String? = null
)
