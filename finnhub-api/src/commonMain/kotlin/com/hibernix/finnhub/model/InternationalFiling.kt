package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property symbol Symbol.
 * @property companyName Company name.
 * @property filedDate Filed date <code>%Y-%m-%d %H:%M:%S</code>.
 * @property category Category.
 * @property title Document's title.
 * @property description Document's description.
 * @property url Url.
 * @property language Language.
 * @property country Country.
 */
@Serializable
data class InternationalFiling(
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("companyName") var companyName: String? = null,
    @SerialName("filedDate") var filedDate: String? = null,
    @SerialName("category") var category: String? = null,
    @SerialName("title") var title: String? = null,
    @SerialName("description") var description: String? = null,
    @SerialName("url") var url: String? = null,
    @SerialName("language") var language: String? = null,
    @SerialName("country") var country: String? = null
)
