package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property skip Number of ticks skipped.
 * @property count Number of ticks returned. If <code>count</code> < <code>limit</code>, all data for that date has been returned.
 * @property total Total number of ticks for that date.
 * @property v List of volume data.
 * @property p List of price data.
 * @property y List of yield data.
 * @property t List of timestamp in UNIX ms.
 * @property si List of values showing the side (Buy/sell) of each trade. List of supported values: [here](https://docs.google.com/spreadsheets/d/1O3aueXSPOqo7Iuyz4PqDG6yZunHsX8BTefZ2kFk5pz4/edit?usp=sharing)
 * @property cp List of values showing the counterparty of each trade. List of supported values: [here](https://docs.google.com/spreadsheets/d/1O3aueXSPOqo7Iuyz4PqDG6yZunHsX8BTefZ2kFk5pz4/edit?usp=sharing)
 * @property rp List of values showing the reporting party of each trade. List of supported values: [here](https://docs.google.com/spreadsheets/d/1O3aueXSPOqo7Iuyz4PqDG6yZunHsX8BTefZ2kFk5pz4/edit?usp=sharing)
 * @property ats ATS flag. Y or empty
 * @property c List of trade conditions. A comprehensive list of trade conditions code can be found [here](https://docs.google.com/spreadsheets/d/1O3aueXSPOqo7Iuyz4PqDG6yZunHsX8BTefZ2kFk5pz4/edit?usp=sharing)
 */
@Serializable
data class BondTickData(
    @SerialName("skip") var skip: Long? = null,
    @SerialName("count") var count: Long? = null,
    @SerialName("total") var total: Long? = null,
    @SerialName("v") var v: List<Float>? = null,
    @SerialName("p") var p: List<Float>? = null,
    @SerialName("y") var y: List<Float>? = null,
    @SerialName("t") var t: List<Long>? = null,
    @SerialName("si") var si: List<String>? = null,
    @SerialName("cp") var cp: List<String>? = null,
    @SerialName("rp") var rp: List<String>? = null,
    @SerialName("ats") var ats: List<String>? = null,
    @SerialName("c") var c: List<List<String>>? = null
)
