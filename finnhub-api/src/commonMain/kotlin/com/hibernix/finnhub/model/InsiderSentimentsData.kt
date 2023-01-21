package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol.
 * @property year Year.
 * @property month Month.
 * @property change Net buying/selling from all insiders' transactions.
 * @property mspr Monthly share purchase ratio.
 */
@Serializable
data class InsiderSentimentsData(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("year") var year: Long? = null,
    @SerialName("month") var month: Long? = null,
    @SerialName("change") var change: Long? = null,
    @SerialName("mspr") var mspr: Float? = null
)
