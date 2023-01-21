package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.datetime.LocalDate

/**
 * @property country Country of company's headquarters.
 * @property currency Currency used in company filings.
 * @property exchange Listed exchange.
 * @property name Company name.
 * @property ticker Company symbol/ticker as used on the listed exchange.
 * @property ipo IPO date.
 * @property marketCapitalization Market Capitalization.
 * @property shareOutstanding Number of oustanding shares.
 * @property logo Logo image.
 * @property phone Company phone number.
 * @property weburl Company website.
 * @property finnhubIndustry Finnhub industry classification.
 */
@Serializable
data class CompanyProfile2(
    @SerialName("country") var country: String? = null,
    @SerialName("currency") var currency: String? = null,
    @SerialName("exchange") var exchange: String? = null,
    @SerialName("name") var name: String? = null,
    @SerialName("ticker") var ticker: String? = null,
    @SerialName("ipo") var ipo: LocalDate? = null,
    @SerialName("marketCapitalization") var marketCapitalization: Float? = null,
    @SerialName("shareOutstanding") var shareOutstanding: Float? = null,
    @SerialName("logo") var logo: String? = null,
    @SerialName("phone") var phone: String? = null,
    @SerialName("weburl") var weburl: String? = null,
    @SerialName("finnhubIndustry") var finnhubIndustry: String? = null
)
