package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property category News category.
 * @property datetime Published time in UNIX timestamp.
 * @property headline News headline.
 * @property id News ID. This value can be used for <code>minId</code> params to get the latest news only.
 * @property image Thumbnail image URL.
 * @property related Related stocks and companies mentioned in the article.
 * @property source News source.
 * @property summary News summary.
 * @property url URL of the original article.
 */
@Serializable
data class MarketNews(
    @SerialName("category") var category: String? = null,
    @SerialName("datetime") var datetime: Long? = null,
    @SerialName("headline") var headline: String? = null,
    @SerialName("id") var id: Long? = null,
    @SerialName("image") var image: String? = null,
    @SerialName("related") var related: String? = null,
    @SerialName("source") var source: String? = null,
    @SerialName("summary") var summary: String? = null,
    @SerialName("url") var url: String? = null
)
