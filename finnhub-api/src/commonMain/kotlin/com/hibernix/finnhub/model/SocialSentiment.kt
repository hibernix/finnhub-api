package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Company symbol.
 * @property reddit Reddit sentiment.
 * @property twitter Twitter sentiment.
 */
@Serializable
data class SocialSentiment(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("reddit") var reddit: List<RedditSentimentContent>? = null,
    @SerialName("twitter") var twitter: List<TwitterSentimentContent>? = null
)
