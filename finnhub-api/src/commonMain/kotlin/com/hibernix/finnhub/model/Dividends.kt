package com.hibernix.finnhub.model

import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol.
 * @property date Ex-Dividend date.
 * @property amount Amount in local currency.
 * @property adjustedAmount Adjusted dividend.
 * @property payDate Pay date.
 * @property recordDate Record date.
 * @property declarationDate Declaration date.
 * @property currency Currency.
 * @property freq Dividend frequency. Can be 1 of the following values: 0: Annually, 1: Monthly, 2: Quarterly,
 * 3: Semi-annually, 4: Other/Unknown, 5: Bimonthly, 6: Trimesterly, 7: Weekly
 */
@Serializable
data class Dividends(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("date") var date: LocalDate? = null,
    @SerialName("amount") var amount: Float? = null,
    @SerialName("adjustedAmount") var adjustedAmount: Float? = null,
    @SerialName("payDate") var payDate: LocalDate? = null,
    @SerialName("recordDate") var recordDate: LocalDate? = null,
    @SerialName("declarationDate") var declarationDate: LocalDate? = null,
    @SerialName("currency") var currency: String? = null,
    @SerialName("freq") var freq: String? = null,
)
