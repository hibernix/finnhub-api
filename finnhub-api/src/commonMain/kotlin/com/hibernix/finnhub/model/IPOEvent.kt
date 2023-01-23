package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.datetime.LocalDate

/**
 * @property symbol Symbol.
 * @property date IPO date.
 * @property exchange Exchange.
 * @property name Company's name.
 * @property status IPO status. Can take 1 of the following values: *expected*,*priced*,*withdrawn*,*filed*
 * @property price Projected price or price range.
 * @property numberOfShares Number of shares offered during the IPO.
 * @property totalSharesValue Total shares value.
 */
@Serializable
data class IPOEvent(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("date") var date: LocalDate? = null,
    @SerialName("exchange") var exchange: String? = null,
    @SerialName("name") var name: String? = null,
    @SerialName("status") var status: String? = null,
    @SerialName("price") var price: String? = null,
    @SerialName("numberOfShares") var numberOfShares: Float? = null,
    @SerialName("totalSharesValue") var totalSharesValue: Float? = null
)
