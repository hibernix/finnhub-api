package com.hibernix.finnhub.model

import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property name Investor's name.
 * @property share Number of shares held by the investor.
 * @property change Number of share changed (net buy or sell) from the last period.
 * @property filingDate Filing date.
 * @property portfolioPercent Percent of the fund's portfolio comprised of the company's share.
 */
@Serializable
data class FundOwnershipInfo(
    @SerialName("name") var name: String? = null,
    @SerialName("share") var share: Long? = null,
    @SerialName("change") var change: Long? = null,
    @SerialName("filingDate") var filingDate: LocalDate? = null,
    @SerialName("portfolioPercent") var portfolioPercent: Float? = null,
)
