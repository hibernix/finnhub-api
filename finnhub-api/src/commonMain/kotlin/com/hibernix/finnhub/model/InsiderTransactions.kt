package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol of the company.
 * @property data Array of insider transactions.
 */
@Serializable
data class InsiderTransactions(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("data") var data: List<Transactions>? = null,
)
