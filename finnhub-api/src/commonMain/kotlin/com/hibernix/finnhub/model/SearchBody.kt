package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property query Search query
 * @property isins List of isin to search, comma separated (Max: 50).
 * @property cusips List of cusip to search, comma separated (Max: 50).
 * @property ciks List of SEC Center Index Key to search, comma separated (Max: 50).
 * @property sedarIds List of SEDAR issuer number to search, comma separated (Max: 50).
 * @property chIds List of Companies House number to search, comma separated (Max: 50).
 * @property symbols List of symbols to search, comma separated (Max: 50).
 * @property sedols List of sedols to search, comma separated (Max: 50).
 * @property sources List of sources to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values.
 * @property forms List of forms to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values.
 * @property gics List of gics to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values.
 * @property naics List of sources to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values.
 * @property exhibits List of exhibits to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values.
 * @property exchanges List of exchanges to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values.
 * @property countries List of sources to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values.
 * @property acts List of SEC's exchanges act to search, comma separated. Look at <code>/filter</code> endpoint to see all available values.
 * @property caps List of market capitalization to search, comma separated. Look at <code>/filter</code> endpoint to see all available values.
 * @property fromDate Search from date in format: YYYY-MM-DD, default from the last 2 years
 * @property toDate Search to date in format: YYYY-MM-DD, default to today
 * @property page Use for pagination, default to page 1
 * @property sort Sort result by, default: sortMostRecent. Look at <code>/filter</code> endpoint to see all available values.
 * @property highlighted Enable highlight in returned filings. If enabled, only return 10 results each time
 */
@Serializable
data class SearchBody(
    @SerialName("query") var query: String,
    @SerialName("isins") var isins: String? = null,
    @SerialName("cusips") var cusips: String? = null,
    @SerialName("ciks") var ciks: String? = null,
    @SerialName("sedarIds") var sedarIds: String? = null,
    @SerialName("chIds") var chIds: String? = null,
    @SerialName("symbols") var symbols: String? = null,
    @SerialName("sedols") var sedols: String? = null,
    @SerialName("sources") var sources: String? = null,
    @SerialName("forms") var forms: String? = null,
    @SerialName("gics") var gics: String? = null,
    @SerialName("naics") var naics: String? = null,
    @SerialName("exhibits") var exhibits: String? = null,
    @SerialName("exchanges") var exchanges: String? = null,
    @SerialName("countries") var countries: String? = null,
    @SerialName("acts") var acts: String? = null,
    @SerialName("caps") var caps: String? = null,
    @SerialName("fromDate") var fromDate: String? = null,
    @SerialName("toDate") var toDate: String? = null,
    @SerialName("page") var page: String? = null,
    @SerialName("sort") var sort: String? = null,
    @SerialName("highlighted") var highlighted: Boolean? = null
)
