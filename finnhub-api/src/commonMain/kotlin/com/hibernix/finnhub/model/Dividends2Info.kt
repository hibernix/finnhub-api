package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.datetime.LocalDate

/**
 * @property exDate Ex-Dividend date.
 * @property amount Amount in local currency.
 */
@Serializable
data class Dividends2Info(
    @SerialName("exDate") var exDate: LocalDate? = null,
    @SerialName("amount") var amount: Float? = null
)
