package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property s Symbol.
 * @property skip Number of ticks skipped.
 * @property count Number of ticks returned. If ```count``` < ```limit```, all data for that date has been returned.
 * @property total Total number of ticks for that date.
 * @property av List of Ask volume data.
 * @property a List of Ask price data.
 * @property ax List of venues/exchanges - Ask price. A list of exchange codes can be found
 * [here](https://docs.google.com/spreadsheets/d/1Tj53M1svmr-hfEtbk6_NpVR1yAyGLMaH6ByYU6CG0ZY/edit?usp=sharing)
 * @property bv List of Bid volume data.
 * @property b List of Bid price data.
 * @property bx List of venues/exchanges - Bid price. A list of exchange codes can be found
 * [here](https://docs.google.com/spreadsheets/d/1Tj53M1svmr-hfEtbk6_NpVR1yAyGLMaH6ByYU6CG0ZY/edit?usp=sharing)
 * @property t List of timestamp in UNIX ms.
 * @property c List of quote conditions. A comprehensive list of quote conditions code can be found
 * [here](https://docs.google.com/spreadsheets/d/1iiA6e7Osdtai0oPMOUzgAIKXCsay89dFDmsegz6OpEg/edit?usp=sharing)
 */
@Serializable
data class HistoricalNBBO(
    @SerialName("s") var s: String? = null,
    @SerialName("skip") var skip: Long? = null,
    @SerialName("count") var count: Long? = null,
    @SerialName("total") var total: Long? = null,
    @SerialName("av") var av: List<Float>? = null,
    @SerialName("a") var a: List<Float>? = null,
    @SerialName("ax") var ax: List<String>? = null,
    @SerialName("bv") var bv: List<Float>? = null,
    @SerialName("b") var b: List<Float>? = null,
    @SerialName("bx") var bx: List<String>? = null,
    @SerialName("t") var t: List<Long>? = null,
    @SerialName("c") var c: List<List<String>>? = null,
)
