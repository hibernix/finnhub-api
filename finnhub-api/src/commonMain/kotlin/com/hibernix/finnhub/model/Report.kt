package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property accessNumber Access number.
 * @property symbol Symbol.
 * @property cik CIK.
 * @property year Year.
 * @property quarter Quarter.
 * @property form Form type.
 * @property startDate Period start date <code>%Y-%m-%d %H:%M:%S</code>.
 * @property endDate Period end date <code>%Y-%m-%d %H:%M:%S</code>.
 * @property filedDate Filed date <code>%Y-%m-%d %H:%M:%S</code>.
 * @property acceptedDate Accepted date <code>%Y-%m-%d %H:%M:%S</code>.
 * @property report Report data.
 */
@Serializable
data class Report(
    @SerialName("accessNumber") var accessNumber: String? = null,
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("cik") var cik: String? = null,
    @SerialName("year") var year: Long? = null,
    @SerialName("quarter") var quarter: Long? = null,
    @SerialName("form") var form: String? = null,
    @SerialName("startDate") var startDate: String? = null,
    @SerialName("endDate") var endDate: String? = null,
    @SerialName("filedDate") var filedDate: String? = null,
    @SerialName("acceptedDate") var acceptedDate: String? = null,
    @SerialName("report") var report: ReportDataMap? = null
)
