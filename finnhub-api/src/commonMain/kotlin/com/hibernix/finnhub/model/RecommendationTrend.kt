package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Company symbol.
 * @property buy Number of recommendations that fall into the Buy category
 * @property hold Number of recommendations that fall into the Hold category
 * @property period Updated period
 * @property sell Number of recommendations that fall into the Sell category
 * @property strongBuy Number of recommendations that fall into the Strong Buy category
 * @property strongSell Number of recommendations that fall into the Strong Sell category
 */
@Serializable
data class RecommendationTrend(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("buy") var buy: Long? = null,
    @SerialName("hold") var hold: Long? = null,
    @SerialName("period") var period: String? = null,
    @SerialName("sell") var sell: Long? = null,
    @SerialName("strongBuy") var strongBuy: Long? = null,
    @SerialName("strongSell") var strongSell: Long? = null,
)
