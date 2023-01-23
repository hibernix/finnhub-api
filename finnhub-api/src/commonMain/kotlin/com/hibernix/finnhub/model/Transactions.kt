package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.datetime.LocalDate

/**
 * @property symbol Symbol.
 * @property name Insider's name.
 * @property share Number of shares held after the transaction.
 * @property change Number of share changed from the last period. A positive value suggests a *BUY* transaction.
 * A negative value suggests a *SELL* transaction.
 * @property filingDate Filing date.
 * @property transactionDate Transaction date.
 * @property transactionPrice Average transaction price.
 * @property transactionCode Transaction code. A list of codes and their meanings can be found
 * [here](https://www.sec.gov/about/forms/form4data.pdf).
 */
@Serializable
data class Transactions(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("name") var name: String? = null,
    @SerialName("share") var share: Long? = null,
    @SerialName("change") var change: Long? = null,
    @SerialName("filingDate") var filingDate: LocalDate? = null,
    @SerialName("transactionDate") var transactionDate: LocalDate? = null,
    @SerialName("transactionPrice") var transactionPrice: Float? = null,
    @SerialName("transactionCode") var transactionCode: String? = null
)
