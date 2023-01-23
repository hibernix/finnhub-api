package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property cik CIK.
 * @property item1 Cosine similarity of Item 1 (Business). This number is only available for Annual reports.
 * @property item1a Cosine similarity of Item 1A (Risk Factors). This number is available for both Annual
 * and Quarterly reports.
 * @property item2 Cosine similarity of Item 2 (Management’s Discussion and Analysis of Financial Condition
 * and Results of Operations). This number is only available for Quarterly reports.
 * @property item7 Cosine similarity of Item 7 (Management’s Discussion and Analysis of Financial Condition
 * and Results of Operations). This number is only available for Annual reports.
 * @property item7a Cosine similarity of Item 7A (Quantitative and Qualitative Disclosures About Market Risk).
 * This number is only available for Annual reports.
 * @property accessNumber Access number.
 * @property form Form type.
 * @property filedDate Filed date *%Y-%m-%d %H:%M:%S*.
 * @property acceptedDate Accepted date *%Y-%m-%d %H:%M:%S*.
 * @property reportUrl Report's URL.
 * @property filingUrl Filing's URL.
 */
@Serializable
data class SimilarityIndexInfo(
    @SerialName("cik") var cik: String? = null,
    @SerialName("item1") var item1: Float? = null,
    @SerialName("item1a") var item1a: Float? = null,
    @SerialName("item2") var item2: Float? = null,
    @SerialName("item7") var item7: Float? = null,
    @SerialName("item7a") var item7a: Float? = null,
    @SerialName("accessNumber") var accessNumber: String? = null,
    @SerialName("form") var form: String? = null,
    @SerialName("filedDate") var filedDate: String? = null,
    @SerialName("acceptedDate") var acceptedDate: String? = null,
    @SerialName("reportUrl") var reportUrl: String? = null,
    @SerialName("filingUrl") var filingUrl: String? = null,
)
