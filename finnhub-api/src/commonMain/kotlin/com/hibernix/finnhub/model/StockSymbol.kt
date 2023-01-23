package com.hibernix.finnhub.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property description Symbol description
 * @property displaySymbol Display symbol name.
 * @property symbol Unique symbol used to identify this symbol used in [FinnhubApi.stockCandle] endpoint.
 * @property type Security type.
 * @property mic Primary exchange's MIC.
 * @property figi FIGI identifier.
 * @property shareClassFIGI Global Share Class FIGI.
 * @property currency Price's currency. This might be different from the reporting currency of fundamental data.
 * @property symbol2 Alternative ticker for exchanges with multiple tickers for 1 stock such as BSE.
 * @property isin ISIN. This field is only available for EU stocks and selected Asian markets.
 * Entitlement from Finnhub is required to access this field.
 */
@Serializable
data class StockSymbol(
    @SerialName("description") var description: String? = null,
    @SerialName("displaySymbol") var displaySymbol: String? = null,
    @SerialName("symbol") var symbol: String? = null,
    @SerialName("type") var type: String? = null,
    @SerialName("mic") var mic: String? = null,
    @SerialName("figi") var figi: String? = null,
    @SerialName("shareClassFIGI") var shareClassFIGI: String? = null,
    @SerialName("currency") var currency: String? = null,
    @SerialName("symbol2") var symbol2: String? = null,
    @SerialName("isin") var isin: String? = null
)
