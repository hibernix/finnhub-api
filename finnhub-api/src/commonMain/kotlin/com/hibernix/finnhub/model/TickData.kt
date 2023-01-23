package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property s Symbol.
 * @property skip Number of ticks skipped.
 * @property count Number of ticks returned. If *count* < *limit*, all data for that date has been returned.
 * @property total Total number of ticks for that date.
 * @property v List of volume data.
 * @property p List of price data.
 * @property t List of timestamp in UNIX ms.
 * @property x List of venues/exchanges. A list of exchange codes can be found
 * [here](https://docs.google.com/spreadsheets/d/1Tj53M1svmr-hfEtbk6_NpVR1yAyGLMaH6ByYU6CG0ZY/edit?usp=sharing)
 * @property c List of trade conditions. A comprehensive list of trade conditions code can be found
 * [here](https://docs.google.com/spreadsheets/d/1PUxiSWPHSODbaTaoL2Vef6DgU-yFtlRGZf19oBb9Hp0/edit?usp=sharing)
 */
@Serializable
data class TickData(
    @SerialName("s") var s: String? = null,
    @SerialName("skip") var skip: Long? = null,
    @SerialName("count") var count: Long? = null,
    @SerialName("total") var total: Long? = null,
    @SerialName("v") var v: List<Float>? = null,
    @SerialName("p") var p: List<Float>? = null,
    @SerialName("t") var t: List<Long>? = null,
    @SerialName("x") var x: List<String>? = null,
    @SerialName("c") var c: List<List<String>>? = null,
)
