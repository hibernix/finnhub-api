package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property negative % of negative words in the filing.
 * @property positive % of positive words in the filing.
 * @property polarity % of polarity words in the filing.
 * @property litigious % of litigious words in the filing.
 * @property uncertainty % of uncertainty words in the filing.
 * @property constraining % of constraining words in the filing.
 * @property modal-weak % of modal-weak words in the filing.
 * @property modal-strong % of modal-strong words in the filing.
 * @property modal-moderate % of modal-moderate words in the filing.
 */
@Serializable
data class FilingSentiment(
    @SerialName("negative") var negative: Float? = null,
    @SerialName("positive") var positive: Float? = null,
    @SerialName("polarity") var polarity: Float? = null,
    @SerialName("litigious") var litigious: Float? = null,
    @SerialName("uncertainty") var uncertainty: Float? = null,
    @SerialName("constraining") var constraining: Float? = null,
    // TODO !!! "-"
    @SerialName("modal-weak") var modalWeak: Float? = null,
    @SerialName("modal-strong") var modalStrong: Float? = null,
    @SerialName("modal-moderate") var modalModerate: Float? = null,
)
