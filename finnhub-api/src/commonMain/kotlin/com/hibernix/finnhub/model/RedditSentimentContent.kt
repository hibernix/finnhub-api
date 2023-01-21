package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property mention Number of mentions
 * @property positiveMention Number of positive mentions
 * @property negativeMention Number of negative mentions
 * @property positiveScore Positive score. Range 0-1
 * @property negativeScore Negative score. Range 0-1
 * @property score Final score. Range: -1 to 1 with 1 is very positive and -1 is very negative
 * @property atTime Period.
 */
@Serializable
data class RedditSentimentContent(
    @SerialName("mention") var mention: Long? = null,
    @SerialName("positiveMention") var positiveMention: Long? = null,
    @SerialName("negativeMention") var negativeMention: Long? = null,
    @SerialName("positiveScore") var positiveScore: Float? = null,
    @SerialName("negativeScore") var negativeScore: Float? = null,
    @SerialName("score") var score: Float? = null,
    @SerialName("atTime") var atTime: String? = null
)
