package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property accessNumber Access number.
 * @property symbol Symbol.
 * @property cik CIK.
 * @property form Form type.
 * @property filedDate Filed date ```%Y-%m-%d %H:%M:%S```.
 * @property acceptedDate Accepted date ```%Y-%m-%d %H:%M:%S```.
 * @property reportUrl Report's URL.
 * @property filingUrl Filing's URL.
 */
@Serializable
data class Filing(
    @SerialName("accessNumber") var accessNumber: String? = null,
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("cik") var cik: String? = null,
    @SerialName("form") var form: String? = null,
    @SerialName("filedDate") var filedDate: String? = null,
    @SerialName("acceptedDate") var acceptedDate: String? = null,
    @SerialName("reportUrl") var reportUrl: String? = null,
    @SerialName("filingUrl") var filingUrl: String? = null
)
