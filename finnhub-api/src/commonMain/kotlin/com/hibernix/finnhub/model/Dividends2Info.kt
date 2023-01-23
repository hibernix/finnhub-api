package com.hibernix.finnhub.model

import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property exDate Ex-Dividend date.
 * @property amount Amount in local currency.
 */
@Serializable
data class Dividends2Info(
    @SerialName("exDate") var exDate: LocalDate? = null,
    @SerialName("amount") var amount: Float? = null,
)
