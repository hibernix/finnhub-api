package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property o Open price of the day
 * @property h High price of the day
 * @property l Low price of the day
 * @property c Current price
 * @property pc Previous close price
 * @property d Change
 * @property dp Percent change
 */
@Serializable
data class Quote(
    @SerialName("o") var o: Float? = null,
    @SerialName("h") var h: Float? = null,
    @SerialName("l") var l: Float? = null,
    @SerialName("c") var c: Float? = null,
    @SerialName("pc") var pc: Float? = null,
    @SerialName("d") var d: Float? = null,
    @SerialName("dp") var dp: Float? = null,
)
