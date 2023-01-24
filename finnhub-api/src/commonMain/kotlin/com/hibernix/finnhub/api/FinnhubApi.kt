package com.hibernix.finnhub.api

import com.hibernix.finnhub.model.AggregateIndicators
import com.hibernix.finnhub.model.BasicFinancials
import com.hibernix.finnhub.model.BondProfile
import com.hibernix.finnhub.model.BondTickData
import com.hibernix.finnhub.model.BondYieldCurve
import com.hibernix.finnhub.model.Candles
import com.hibernix.finnhub.model.CompanyESG
import com.hibernix.finnhub.model.CompanyEarningsQualityScore
import com.hibernix.finnhub.model.CompanyExecutive
import com.hibernix.finnhub.model.CompanyNews
import com.hibernix.finnhub.model.CompanyProfile
import com.hibernix.finnhub.model.CompanyProfile2
import com.hibernix.finnhub.model.CountryMetadata
import com.hibernix.finnhub.model.CovidInfo
import com.hibernix.finnhub.model.CryptoProfile
import com.hibernix.finnhub.model.CryptoSymbol
import com.hibernix.finnhub.model.Dividends
import com.hibernix.finnhub.model.Dividends2
import com.hibernix.finnhub.model.ETFsCountryExposure
import com.hibernix.finnhub.model.ETFsHoldings
import com.hibernix.finnhub.model.ETFsProfile
import com.hibernix.finnhub.model.ETFsSectorExposure
import com.hibernix.finnhub.model.EarningResult
import com.hibernix.finnhub.model.EarningsCalendar
import com.hibernix.finnhub.model.EarningsCallTranscripts
import com.hibernix.finnhub.model.EarningsCallTranscriptsList
import com.hibernix.finnhub.model.EarningsEstimates
import com.hibernix.finnhub.model.EbitEstimates
import com.hibernix.finnhub.model.EbitdaEstimates
import com.hibernix.finnhub.model.EconomicCalendar
import com.hibernix.finnhub.model.EconomicCode
import com.hibernix.finnhub.model.EconomicData
import com.hibernix.finnhub.model.FDAComitteeMeeting
import com.hibernix.finnhub.model.Filing
import com.hibernix.finnhub.model.FinancialStatements
import com.hibernix.finnhub.model.FinancialsAsReported
import com.hibernix.finnhub.model.ForexSymbol
import com.hibernix.finnhub.model.Forexrates
import com.hibernix.finnhub.model.FundOwnership
import com.hibernix.finnhub.model.HistoricalNBBO
import com.hibernix.finnhub.model.IPOCalendar
import com.hibernix.finnhub.model.InFilingResponse
import com.hibernix.finnhub.model.InFilingSearchBody
import com.hibernix.finnhub.model.IndicesConstituents
import com.hibernix.finnhub.model.IndicesHistoricalConstituents
import com.hibernix.finnhub.model.InsiderSentiments
import com.hibernix.finnhub.model.InsiderTransactions
import com.hibernix.finnhub.model.InstitutionalOwnership
import com.hibernix.finnhub.model.InstitutionalPortfolio
import com.hibernix.finnhub.model.InstitutionalProfile
import com.hibernix.finnhub.model.InternationalFiling
import com.hibernix.finnhub.model.InvestmentThemes
import com.hibernix.finnhub.model.IsinChange
import com.hibernix.finnhub.model.LastBidMinusAsk
import com.hibernix.finnhub.model.LobbyingResult
import com.hibernix.finnhub.model.MarketNews
import com.hibernix.finnhub.model.MutualFundCountryExposure
import com.hibernix.finnhub.model.MutualFundEet
import com.hibernix.finnhub.model.MutualFundEetPai
import com.hibernix.finnhub.model.MutualFundHoldings
import com.hibernix.finnhub.model.MutualFundProfile
import com.hibernix.finnhub.model.MutualFundSectorExposure
import com.hibernix.finnhub.model.NewsSentiment
import com.hibernix.finnhub.model.Ownership
import com.hibernix.finnhub.model.PatternRecognition
import com.hibernix.finnhub.model.PressRelease
import com.hibernix.finnhub.model.PriceMetrics
import com.hibernix.finnhub.model.PriceTarget
import com.hibernix.finnhub.model.Quote
import com.hibernix.finnhub.model.RecommendationTrend
import com.hibernix.finnhub.model.RevenueBreakdown
import com.hibernix.finnhub.model.RevenueEstimates
import com.hibernix.finnhub.model.SECSentimentAnalysis
import com.hibernix.finnhub.model.SearchBody
import com.hibernix.finnhub.model.SearchFilter
import com.hibernix.finnhub.model.SearchResponse
import com.hibernix.finnhub.model.SectorMetric
import com.hibernix.finnhub.model.SimilarityIndex
import com.hibernix.finnhub.model.SocialSentiment
import com.hibernix.finnhub.model.Split
import com.hibernix.finnhub.model.StockSymbol
import com.hibernix.finnhub.model.SupplyChainRelationships
import com.hibernix.finnhub.model.SupportResistance
import com.hibernix.finnhub.model.SymbolChange
import com.hibernix.finnhub.model.SymbolLookup
import com.hibernix.finnhub.model.TechnicalIndicator
import com.hibernix.finnhub.model.TickData
import com.hibernix.finnhub.model.UpgradeDowngrade
import com.hibernix.finnhub.model.UsaSpendingResult
import com.hibernix.finnhub.model.UsptoPatentResult
import com.hibernix.finnhub.model.VisaApplicationResult
import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Headers
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.Query
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.header
import io.ktor.client.request.headers
import io.ktor.serialization.kotlinx.json.json
import kotlinx.datetime.LocalDate
import kotlinx.serialization.json.Json

interface FinnhubApi {
    /**
     * Aggregate Indicators *(Premium API)*
     *
     * Get aggregate signal of multiple technical indicators such as MACD, RSI, Moving Average v.v.
     * A full list of indicators can be found
     * [here](https://docs.google.com/spreadsheets/d/1MWuy0WuT2yVlxr1KbPdggVygMZtJfunDnhe-C0GEXYM/edit?usp=sharing).
     * @param symbol symbol (required)
     * @param resolution Supported resolution includes *1, 5, 15, 30, 60, D, W, M *.Some timeframes might not
     *  be available depending on the exchange. (required)
     */
    @Headers("X-Operation-ID: aggregate-indicator")
    @GET("scan/technical-indicator")
    suspend fun aggregateIndicator(
        @Query("symbol") symbol: String,
        @Query("resolution") resolution: String,
    ): AggregateIndicators

    /**
     * Bond price data *(Premium API)*
     *
     * Get bond's price data. The following datasets are supported:
     * ```
     *  Exchange              | Segment                  | Delay
     * ----------------------------------------------------------------------
     * - US Government Bonds  | Government Bonds         | End-of-day
     * - FINRA Trace          | BTDS: US Corporate Bonds | Delayed 4h
     * - FINRA Trace          | 144A Bonds               | Delayed 4h
     * ```
     * @param isin ISIN. (required)
     * @param from UNIX timestamp. Interval initial value. (required)
     * @param to UNIX timestamp. Interval end value. (required)
     */
    @Headers("X-Operation-ID: bond-price")
    @GET("bond/price")
    suspend fun bondPrice(
        @Query("isin") isin: String,
        @Query("from") from: Long,
        @Query("to") to: Long,
    ): Candles

    /**
     * Bond Profile *(Premium API)*
     *
     * Get general information of a bond. You can query by FIGI, ISIN or CUSIP
     * @param isin ISIN (optional)
     * @param cusip CUSIP (optional)
     * @param figi FIGI (optional)
     */
    @Headers("X-Operation-ID: bond-profile")
    @GET("bond/profile")
    suspend fun bondProfile(
        @Query("isin") isin: String? = null,
        @Query("cusip") cusip: String? = null,
        @Query("figi") figi: String? = null,
    ): BondProfile

    /**
     * Bond Tick Data *(Premium API)*
     *
     * Get trade-level data for bonds. The following datasets are supported:
     * ```
     *  Exchange              | Segment                  | Delay
     * ----------------------------------------------------------------------
     *  FINRA Trace           | BTDS: US Corporate Bonds | Delayed 4h
     *  FINRA Trace           | 144A Bonds               | Delayed 4h
     * ```
     * @param isin ISIN. (required)
     * @param date Date: 2020-04-02. (required)
     * @param limit Limit number of ticks returned. Maximum value: *25000* (required)
     * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
     * @param exchange Currently support the following values: *trace*. (required)
     */
    @Headers("X-Operation-ID: bond-tick")
    @GET("bond/tick")
    suspend fun bondTick(
        @Query("isin") isin: String,
        @Query("date") date: LocalDate,
        @Query("limit") limit: Long,
        @Query("skip") skip: Long,
        @Query("exchange") exchange: String,
    ): BondTickData

    /**
     * Bond Yield Curve *(Premium API)*
     *
     * Get yield curve data for Treasury bonds.
     * @param code Bond's code. You can find the list of supported code
     * [here](https://docs.google.com/spreadsheets/d/1iA-lM0Kht7lsQZ7Uu_s6r2i1BbQNUNO9eGkO5-zglHg/edit?usp=sharing)
     * (required)
     */
    @Headers("X-Operation-ID: bond-yield-curve")
    @GET("bond/yield-curve")
    suspend fun bondYieldCurve(
        @Query("code") code: String,
    ): BondYieldCurve

    /**
     * Basic Financials
     *
     * Get company basic financials such as margin, P/E ratio, 52-week high/low etc.
     * @param symbol Symbol of the company: AAPL. (required)
     * @param metric Metric type. Can be 1 of the following values *all* (required)
     */
    @Headers("X-Operation-ID: company-basic-financials")
    @GET("stock/metric")
    suspend fun companyBasicFinancials(
        @Query("symbol") symbol: String,
        @Query("metric") metric: String,
    ): BasicFinancials

    /**
     * Earnings Surprises
     *
     * Get company historical quarterly earnings surprise going back to 2000.
     * @param symbol Symbol of the company: AAPL. (required)
     * @param limit Limit number of period returned. Leave blank to get the full history. (optional)
     */
    @Headers("X-Operation-ID: company-earnings")
    @GET("stock/earnings")
    suspend fun companyEarnings(
        @Query("symbol") symbol: String,
        @Query("limit") limit: Long? = null,
    ): List<EarningResult>

    /**
     * Company Earnings Quality Score *(Premium API)*
     *
     * This endpoint provides Earnings Quality Score for global companies. Earnings quality refers to the extent
     * to which current earnings predict future earnings. \"High-quality\" earnings are expected to persist,
     * while \"low-quality\" earnings do not. A higher score means a higher earnings quality. Finnhub uses a proprietary
     * model which takes into consideration 4 criteria:
     * - Profitability
     * - Growth
     * - Cash Generation & Capital Allocation
     * - Leverage
     * We then compare the metrics of each company in each category
     * against its peers in the same industry to gauge how quality its earnings is.
     * @param symbol Symbol. (required)
     * @param freq Frequency. Currently support *annual* and *quarterly* (required)
     */
    @Headers("X-Operation-ID: company-earnings-quality-score")
    @GET("stock/earnings-quality-score")
    suspend fun companyEarningsQualityScore(
        @Query("symbol") symbol: String,
        @Query("freq") freq: String,
    ): CompanyEarningsQualityScore

    /**
     * EBIT Estimates *(Premium API)*
     *
     * Get company's ebit estimates.
     * @param symbol Symbol of the company: AAPL. (required)
     * @param freq Can take 1 of the following values: *annual, quarterly*.
     *  Default to *quarterly* (optional)
     */
    @Headers("X-Operation-ID: company-ebit-estimates")
    @GET("stock/ebit-estimate")
    suspend fun companyEbitEstimates(
        @Query("symbol") symbol: String,
        @Query("freq") freq: String? = null,
    ): EbitEstimates

    /**
     * EBITDA Estimates *(Premium API)*
     *
     * Get company's ebitda estimates.
     * @param symbol Symbol of the company: AAPL. (required)
     * @param freq Can take 1 of the following values: *annual, quarterly*.
     *  Default to *quarterly* (optional)
     */
    @Headers("X-Operation-ID: company-ebitda-estimates")
    @GET("stock/ebitda-estimate")
    suspend fun companyEbitdaEstimates(
        @Query("symbol") symbol: String,
        @Query("freq") freq: String? = null,
    ): EbitdaEstimates

    /**
     * Earnings Estimates *(Premium API)*
     *
     * Get company's EPS estimates.
     * @param symbol Symbol of the company: AAPL. (required)
     * @param freq Can take 1 of the following values: *annual, quarterly*.
     *  Default to *quarterly* (optional)
     */
    @Headers("X-Operation-ID: company-eps-estimates")
    @GET("stock/eps-estimate")
    suspend fun companyEpsEstimates(
        @Query("symbol") symbol: String,
        @Query("freq") freq: String? = null,
    ): EarningsEstimates

    /**
     * Company ESG Scores *(Premium API)*
     *
     * This endpoint provides ESG scores and important indicators for 1000+ global companies.
     * The data is collected through company's public ESG disclosure and public sources.
     * Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks
     * and how well a company is managing them. A higher score means lower ESG risk or better ESG management.
     * ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+
     * with C- is the lowest score and A+ is the highest score.
     * @param symbol Symbol. (required)
     */
    @Headers("X-Operation-ID: company-esg-score")
    @GET("stock/esg")
    suspend fun companyEsgScore(
        @Query("symbol") symbol: String,
    ): CompanyESG

    /**
     * Company Executive *(Premium API)*
     *
     * Get a list of company's executives and members of the Board.
     * @param symbol Symbol of the company: AAPL. (required)
     */
    @Headers("X-Operation-ID: company-executive")
    @GET("stock/executive")
    suspend fun companyExecutive(
        @Query("symbol") symbol: String,
    ): CompanyExecutive

    /**
     * Company News
     *
     * List latest company news by symbol. This endpoint is only available for North American companies.
     * @param symbol Company symbol. (required)
     * @param from From date *YYYY-MM-DD*. (required)
     * @param to To date *YYYY-MM-DD*. (required)
     */
    @Headers("X-Operation-ID: company-news")
    @GET("company-news")
    suspend fun companyNews(
        @Query("symbol") symbol: String,
        @Query("from") from: LocalDate,
        @Query("to") to: LocalDate,
    ): List<CompanyNews>

    /**
     * Peers
     *
     * Get company peers. Return a list of peers operating in the same country and sector/industry.
     * @param symbol Symbol of the company: AAPL. (required)
     * @param grouping Specify the grouping criteria for choosing peers.Supporter values: *sector*,
     *  *industry*, *subIndustry*. Default to *subIndustry*. (optional)
     */
    @Headers("X-Operation-ID: company-peers")
    @GET("stock/peers")
    suspend fun companyPeers(
        @Query("symbol") symbol: String,
        @Query("grouping") grouping: String? = null,
    ): List<String>

    /**
     * Company Profile *(Premium API)*
     *
     * Get general information of a company. You can query by symbol, ISIN or CUSIP
     * @param symbol Symbol of the company: AAPL e.g. (optional)
     * @param isin ISIN (optional)
     * @param cusip CUSIP (optional)
     */
    @Headers("X-Operation-ID: company-profile")
    @GET("stock/profile")
    suspend fun companyProfile(
        @Query("symbol") symbol: String? = null,
        @Query("isin") isin: String? = null,
        @Query("cusip") cusip: String? = null,
    ): CompanyProfile

    /**
     * Company Profile 2
     *
     * Get general information of a company. You can query by symbol, ISIN or CUSIP.
     * This is the free version of [companyProfile].
     * @param symbol Symbol of the company: AAPL e.g. (optional)
     * @param isin ISIN (optional)
     * @param cusip CUSIP (optional)
     */
    @Headers("X-Operation-ID: company-profile2")
    @GET("stock/profile2")
    suspend fun companyProfile2(
        @Query("symbol") symbol: String? = null,
        @Query("isin") isin: String? = null,
        @Query("cusip") cusip: String? = null,
    ): CompanyProfile2

    /**
     * Revenue Estimates *(Premium API)*
     *
     * Get company's revenue estimates.
     * @param symbol Symbol of the company: AAPL. (required)
     * @param freq Can take 1 of the following values: *annual, quarterly*. Default to *quarterly* (optional)
     */
    @Headers("X-Operation-ID: company-revenue-estimates")
    @GET("stock/revenue-estimate")
    suspend fun companyRevenueEstimates(
        @Query("symbol") symbol: String,
        @Query("freq") freq: String? = null,
    ): RevenueEstimates

    /**
     * Country Metadata
     *
     * List all countries and metadata.
     */
    @Headers("X-Operation-ID: country")
    @GET("country")
    suspend fun country(): List<CountryMetadata>

    /**
     * COVID-19
     *
     * Get real-time updates on the number of COVID-19 (Corona virus) cases in the US with a state-by-state breakdown.
     * Data is sourced from CDC and reputable sources. You can also access this API
     * [here](https://rapidapi.com/Finnhub/api/finnhub-real-time-covid-19)
     */
    @Headers("X-Operation-ID: covid-19")
    @GET("covid19/us")
    suspend fun covid19(): List<CovidInfo>

    /**
     * Crypto Candles
     *
     * Get candlestick data for crypto symbols.
     * @param symbol Use symbol returned in [cryptoSymbols] endpoint for this field. (required)
     * @param resolution Supported resolution includes *1, 5, 15, 30, 60, D, W, M *.Some timeframes might
     *  not be available depending on the exchange. (required)
     * @param from UNIX timestamp. Interval initial value. (required)
     * @param to UNIX timestamp. Interval end value. (required)
     */
    @Headers("X-Operation-ID: crypto-candles")
    @GET("crypto/candle")
    suspend fun cryptoCandles(
        @Query("symbol") symbol: String,
        @Query("resolution") resolution: String,
        @Query("from") from: Long,
        @Query("to") to: Long,
    ): Candles

    /**
     * Crypto Exchanges
     *
     * List supported crypto exchanges
     */
    @Headers("X-Operation-ID: crypto-exchanges")
    @GET("crypto/exchange")
    suspend fun cryptoExchanges(): List<String>

    /**
     * Crypto Profile *(Premium API)*
     *
     * Get crypto's profile.
     * @param symbol Crypto symbol such as BTC or ETH. (required)
     */
    @Headers("X-Operation-ID: crypto-profile")
    @GET("crypto/profile")
    suspend fun cryptoProfile(
        @Query("symbol") symbol: String,
    ): CryptoProfile

    /**
     * Crypto Symbol
     *
     * List supported crypto symbols by exchange
     * @param exchange Exchange you want to get the list of symbols from. (required)
     */
    @Headers("X-Operation-ID: crypto-symbols")
    @GET("crypto/symbol")
    suspend fun cryptoSymbols(
        @Query("exchange") exchange: String,
    ): List<CryptoSymbol>

    /**
     * Earnings Calendar
     *
     * Get historical and coming earnings release. EPS and Revenue in this endpoint are non-GAAP, which means they are
     * adjusted to exclude some one-time or unusual items. This is the same data investors usually react to and talked
     * about on the media. Estimates are sourced from both sell-side and buy-side analysts.
     * @param from From date: 2020-03-15. (optional)
     * @param to To date: 2020-03-16. (optional)
     * @param symbol Filter by symbol: AAPL. (optional)
     * @param international Set to *true* to include international markets. Default value is *false* (optional)
     */
    @Headers("X-Operation-ID: earnings-calendar")
    @GET("calendar/earnings")
    suspend fun earningsCalendar(
        @Query("from") from: LocalDate? = null,
        @Query("to") to: LocalDate? = null,
        @Query("symbol") symbol: String? = null,
        @Query("international") international: Boolean? = null,
    ): EarningsCalendar

    /**
     * Economic Calendar *(Premium API)*
     *
     * Get recent and upcoming economic releases.Historical events and surprises are available for Enterprise clients.
     * @param from From date *YYYY-MM-DD*. (optional)
     * @param to To date *YYYY-MM-DD*. (optional)
     */
    @Headers("X-Operation-ID: economic-calendar")
    @GET("calendar/economic")
    suspend fun economicCalendar(
        @Query("from") from: LocalDate? = null,
        @Query("to") to: LocalDate? = null,
    ): EconomicCalendar

    /**
     * Economic Code *(Premium API)*
     *
     * List codes of supported economic data.
     */
    @Headers("X-Operation-ID: economic-code")
    @GET("economic/code")
    suspend fun economicCode(): List<EconomicCode>

    /**
     * Economic Data *(Premium API)*
     *
     * Get economic data.
     * @param code Economic code. (required)
     */
    @Headers("X-Operation-ID: economic-data")
    @GET("economic")
    suspend fun economicData(
        @Query("code") code: String,
    ): EconomicData

    /**
     * ETFs Country Exposure *(Premium API)*
     *
     * Get ETF country exposure data.
     * @param symbol ETF symbol. (required)
     */
    @Headers("X-Operation-ID: etfs-country-exposure")
    @GET("etf/country")
    suspend fun etfsCountryExposure(
        @Query("symbol") symbol: String,
    ): ETFsCountryExposure

    /**
     * ETFs Holdings *(Premium API)*
     *
     * Get full ETF holdings/constituents. This endpoint has global coverage. Widget only shows top 10 holdings.
     * @param symbol ETF symbol. (optional)
     * @param isin ETF isin. (optional)
     * @param skip Skip the first n results. You can use this parameter to query historical constituents data.
     *  The latest result is returned if skip=0 or not set. (optional)
     * @param date Query holdings by date. You can use either this param or *skip* param, not both. (optional)
     */
    @Headers("X-Operation-ID: etfs-holdings")
    @GET("etf/holdings")
    suspend fun etfsHoldings(
        @Query("symbol") symbol: String? = null,
        @Query("isin") isin: String? = null,
        @Query("skip") skip: Long? = null,
        @Query("date") date: String? = null,
    ): ETFsHoldings

    /**
     * ETFs Profile *(Premium API)*
     *
     * Get ETF profile information. This endpoint has global coverage.
     * @param symbol ETF symbol. (optional)
     * @param isin ETF isin. (optional)
     */
    @Headers("X-Operation-ID: etfs-profile")
    @GET("etf/profile")
    suspend fun etfsProfile(
        @Query("symbol") symbol: String? = null,
        @Query("isin") isin: String? = null,
    ): ETFsProfile

    /**
     * ETFs Sector Exposure *(Premium API)*
     *
     * Get ETF sector exposure data.
     * @param symbol ETF symbol. (required)
     */
    @Headers("X-Operation-ID: etfs-sector-exposure")
    @GET("etf/sector")
    suspend fun etfsSectorExposure(
        @Query("symbol") symbol: String,
    ): ETFsSectorExposure

    /**
     * FDA Committee Meeting Calendar
     *
     * FDA's advisory committees are established to provide functions which support the agency's mission of protecting
     * and promoting the public health, while meeting the requirements set forth in the Federal Advisory Committee Act.
     * Committees are either mandated by statute or established at the discretion of the Department of Health and Human
     * Services. Each committee is subject to renewal at two-year intervals unless the committee charter states
     * otherwise.
     */
    @Headers("X-Operation-ID: fda-committee-meeting-calendar")
    @GET("fda-advisory-committee-calendar")
    suspend fun fdaCommitteeMeetingCalendar(): List<FDAComitteeMeeting>

    /**
     * SEC Filings
     *
     * List company's filing. Limit to 250 documents at a time. This data is available for bulk download on
     * [here](https://www.kaggle.com/finnhub/sec-filings>Kaggle SEC Filings database).
     * @param symbol Symbol. Leave *symbol*,*cik* and *accessNumber* empty to list latest filings. (optional)
     * @param cik CIK. (optional)
     * @param accessNumber Access number of a specific report you want to retrieve data from. (optional)
     * @param form Filter by form. You can use this value *NT 10-K* to find non-timely filings for a company. (optional)
     * @param from From date: 2020-03-15. (optional)
     * @param to To date: 2020-03-16. (optional)
     */
    @Headers("X-Operation-ID: filings")
    @GET("stock/filings")
    suspend fun filings(
        @Query("symbol") symbol: String? = null,
        @Query("cik") cik: String? = null,
        @Query("accessNumber") accessNumber: String? = null,
        @Query("form") form: String? = null,
        @Query("from") from: LocalDate? = null,
        @Query("to") to: LocalDate? = null,
    ): List<Filing>

    /**
     * SEC Sentiment Analysis *(Premium API)*
     *
     * Get sentiment analysis of 10-K and 10-Q filings from SEC. An abnormal increase in the number of positive/negative
     * words in filings can signal a significant change in the company's stock price in the upcoming 4 quarters.
     * We make use of [Loughran and McDonald Sentiment Word Lists](https://sraf.nd.edu/textual-analysis/resources/)
     * to calculate the sentiment for each filing.
     * @param accessNumber Access number of a specific report you want to retrieve data from. (required)
     */
    @Headers("X-Operation-ID: filings-sentiment")
    @GET("stock/filings-sentiment")
    suspend fun filingsSentiment(
        @Query("accessNumber") accessNumber: String,
    ): SECSentimentAnalysis

    /**
     * Financial Statements *(Premium API)*
     *
     * Get standardized balance sheet, income statement and cash flow for global companies going back 30+ years.
     * Data is sourced from original filings most of which made available through [filings] and [internationalFilings]
     * endpoints.*Wondering why our standardized data is different from Bloomberg, Reuters, Factset, S&P
     * or Yahoo Finance ? Check out our [here](https://finnhub.io/faq) to learn more.*
     * @param symbol Symbol of the company: AAPL. (required)
     * @param statement Statement can take 1 of these values *bs, ic, cf* for Balance Sheet, Income Statement,
     *  Cash Flow respectively. (required)
     * @param freq Frequency can take 1 of these values *annual, quarterly, ttm, ytd*. TTM (Trailing Twelve Months)
     *  option is available for Income Statement and Cash Flow. YTD (Year To Date) option is only available
     *  for Cash Flow. (required)
     */
    @Headers("X-Operation-ID: financials")
    @GET("stock/financials")
    suspend fun financials(
        @Query("symbol") symbol: String,
        @Query("statement") statement: String,
        @Query("freq") freq: String,
    ): FinancialStatements

    /**
     * Financials As Reported
     *
     * Get financials as reported. This data is available for bulk download on
     * [Kaggle SEC Financials database](https://www.kaggle.com/finnhub/reported-financials).
     * @param symbol Symbol. (optional)
     * @param cik CIK. (optional)
     * @param accessNumber Access number of a specific report you want to retrieve financials from. (optional)
     * @param freq Frequency. Can be either *annual* or *quarterly*.
     *  Default to *annual*. (optional)
     * @param from From date *YYYY-MM-DD*. Filter for endDate. (optional)
     * @param to To date *YYYY-MM-DD*. Filter for endDate. (optional)
     */
    @Headers("X-Operation-ID: financials-reported")
    @GET("stock/financials-reported")
    suspend fun financialsReported(
        @Query("symbol") symbol: String? = null,
        @Query("cik") cik: String? = null,
        @Query("accessNumber") accessNumber: String? = null,
        @Query("freq") freq: String? = null,
        @Query("from") from: LocalDate? = null,
        @Query("to") to: LocalDate? = null,
    ): FinancialsAsReported

    /**
     * Forex Candles *(Premium API)*
     *
     * Get candlestick data for forex symbols.
     * @param symbol Use symbol returned in [forexSymbols] endpoint for this field. (required)
     * @param resolution Supported resolution includes *1, 5, 15, 30, 60, D, W, M *.Some timeframes might not
     *  be available depending on the exchange. (required)
     * @param from UNIX timestamp. Interval initial value. (required)
     * @param to UNIX timestamp. Interval end value. (required)
     */
    @Headers("X-Operation-ID: forex-candles")
    @GET("forex/candle")
    suspend fun forexCandles(
        @Query("symbol") symbol: String,
        @Query("resolution") resolution: String,
        @Query("from") from: Long,
        @Query("to") to: Long,
    ): Candles

    /**
     * Forex Exchanges
     *
     * List supported forex exchanges
     */
    @Headers("X-Operation-ID: forex-exchanges")
    @GET("forex/exchange")
    suspend fun forexExchanges(): List<String>

    /**
     * Forex rates *(Premium API)*
     *
     * Get rates for all forex pairs. Ideal for currency conversion
     * @param base Base currency. Default to EUR. (optional)
     * @param date Date. Leave blank to get the latest data. (optional)
     */
    @Headers("X-Operation-ID: forex-rates")
    @GET("forex/rates")
    suspend fun forexRates(
        @Query("base") base: String? = null,
        @Query("date") date: String? = null,
    ): Forexrates

    /**
     * Forex Symbol
     *
     * List supported forex symbols.
     * @param exchange Exchange you want to get the list of symbols from. (required)
     */
    @Headers("X-Operation-ID: forex-symbols")
    @GET("forex/symbol")
    suspend fun forexSymbols(
        @Query("exchange") exchange: String,
    ): List<ForexSymbol>

    /**
     * Fund Ownership *(Premium API)*
     *
     * Get a full list fund and institutional investors of a company in descending order of the number of shares held.
     * Data is sourced from *13F form*, *Schedule 13D* and *13G* for US market,
     * *UK Share Register* for UK market, *SEDI* for Canadian market and equivalent filings
     * for other international markets.
     * @param symbol Symbol of the company: AAPL. (required)
     * @param limit Limit number of results. Leave empty to get the full list. (optional)
     */
    @Headers("X-Operation-ID: fund-ownership")
    @GET("stock/fund-ownership")
    suspend fun fundOwnership(
        @Query("symbol") symbol: String,
        @Query("limit") limit: Long? = null,
    ): FundOwnership

    /**
     * Global Filings Search *(Premium API)*
     *
     * Search for best-matched filings across global companies' filings, transcripts and press releases.
     * You can filter by anything from symbol, ISIN to form type, and document sources.This endpoint will return a list
     * of documents that match your search criteria. If you would like to get the excerpts as well, please set
     * *highlighted* to *true*. Once you have the list of documents, you can get a list of
     * excerpts and positions to highlight the document using the [searchInFiling] endpoint.
     * This endpoint is powered by [here](https://alpharesearch.io/>AlphaResearch.io)
     * @param search Search body (optional)
     */
    @Headers("X-Operation-ID: global-filings-search")
    @POST("global-filings/search")
    suspend fun globalFilingsSearch(
        @Body search: SearchBody,
    ): SearchResponse

    /**
     * Search Filter *(Premium API)*
     *
     * Get available values for each filter in search body.This endpoint is powered
     * by [alpharesearch.io](https://alpharesearch.io)
     * @param field Field to get available filters. Available filters are
     * "countries", "exchanges", "exhibits", "forms", "gics", "naics", "caps", "acts", and "sort". (required)
     * @param source Get available forms for each source. (optional)
     */
    @Headers("X-Operation-ID: global-filings-search-filter")
    @GET("global-filings/filter")
    suspend fun globalFilingsSearchFilter(
        @Query("field") field: String,
        @Query("source") source: String? = null,
    ): SearchFilter

    /**
     * Indices Constituents
     *
     * Get a list of index's constituents. A list of supported indices for this endpoint can be found
     * [here](https://docs.google.com/spreadsheets/d/1Syr2eLielHWsorxkDEZXyc55d6bNx1M3ZeI4vdn7Qzo/edit?usp=sharing).
     * @param symbol symbol (required)
     */
    @Headers("X-Operation-ID: indices-constituents")
    @GET("index/constituents")
    suspend fun indicesConstituents(
        @Query("symbol") symbol: String,
    ): IndicesConstituents

    /**
     * Indices Historical Constituents *(Premium API)*
     *
     * Get full history of index's constituents including symbols and dates of joining and leaving the Index.
     * Currently support *^GSPC*, *^NDX*, *^DJI*
     * @param symbol symbol (required)
     */
    @Headers("X-Operation-ID: indices-historical-constituents")
    @GET("index/historical-constituents")
    suspend fun indicesHistoricalConstituents(
        @Query("symbol") symbol: String,
    ): IndicesHistoricalConstituents

    /**
     * Insider Sentiment
     *
     * Get insider sentiment data for US companies calculated using method discussed
     * [here](https://medium.com/@stock-api/finnhub-insiders-sentiment-analysis-cc43f9f64b3a).
     * The MSPR ranges from -100 for the most negative to 100 for the most positive which can signal price changes
     * in the coming 30-90 days.
     * @param symbol Symbol of the company: AAPL. (required)
     * @param from From date: 2020-03-15. (required)
     * @param to To date: 2020-03-16. (required)
     */
    @Headers("X-Operation-ID: insider-sentiment")
    @GET("stock/insider-sentiment")
    suspend fun insiderSentiment(
        @Query("symbol") symbol: String,
        @Query("from") from: LocalDate,
        @Query("to") to: LocalDate,
    ): InsiderSentiments

    /**
     * Insider Transactions
     *
     * Company insider transactions data sourced from *Form 3,4,5*, SEDI and relevant companies' filings.
     * This endpoint covers US, Canada, Australia, and selected EU companies. Limit to 100 transactions per API call.
     * @param symbol Symbol of the company: AAPL. Leave this param blank to get the latest transactions. (required)
     * @param from From date: 2020-03-15. (optional)
     * @param to To date: 2020-03-16. (optional)
     */
    @Headers("X-Operation-ID: insider-transactions")
    @GET("stock/insider-transactions")
    suspend fun insiderTransactions(
        @Query("symbol") symbol: String,
        @Query("from") from: LocalDate? = null,
        @Query("to") to: LocalDate? = null,
    ): InsiderTransactions

    /**
     * Institutional Ownership *(Premium API)*
     *
     * Get a list institutional investors' positions for a particular stock overtime. Data from 13-F filings.
     * Limit to 1 year of data at a time.
     * @param symbol Filter by symbol. (required)
     * @param cusip Filter by CUSIP. (required)
     * @param from From date *YYYY-MM-DD*. (required)
     * @param to To date *YYYY-MM-DD*. (required)
     */
    @Headers("X-Operation-ID: institutional-ownership")
    @GET("institutional/ownership")
    suspend fun institutionalOwnership(
        @Query("symbol") symbol: String,
        @Query("cusip") cusip: String,
        @Query("from") from: String,
        @Query("to") to: String,
    ): InstitutionalOwnership

    /**
     * Institutional Portfolio *(Premium API)*
     *
     * Get the holdings/portfolio data of institutional investors from 13-F filings. Limit to 1 year of data at a time.
     * You can get a list of supported CIK [here](/api/v1/institutional/list?token=).
     * @param cik Fund's CIK. (required)
     * @param from From date *YYYY-MM-DD*. (required)
     * @param to To date *YYYY-MM-DD*. (required)
     */
    @Headers("X-Operation-ID: institutional-portfolio")
    @GET("institutional/portfolio")
    suspend fun institutionalPortfolio(
        @Query("cik") cik: String,
        @Query("from") from: String,
        @Query("to") to: String,
    ): InstitutionalPortfolio

    /**
     * Institutional Profile *(Premium API)*
     *
     * Get a list of well-known institutional investors. Currently support 60+ profiles.
     * @param cik Filter by CIK. Leave blank to get the full list. (optional)
     */
    @Headers("X-Operation-ID: institutional-profile")
    @GET("institutional/profile")
    suspend fun institutionalProfile(
        @Query("cik") cik: String? = null,
    ): InstitutionalProfile

    /**
     * International Filings *(Premium API)*
     *
     * List filings for international companies. Limit to 250 documents at a time. These are the documents we use to
     * source our fundamental data. Only support SEDAR and UK Companies House for normal usage. Enterprise clients who
     * need access to the full filings for global markets should contact us for the access.
     * @param symbol Symbol. Leave empty to list latest filings. (optional)
     * @param country Filter by country using country's 2-letter code. (optional)
     */
    @Headers("X-Operation-ID: international-filings")
    @GET("stock/international-filings")
    suspend fun internationalFilings(
        @Query("symbol") symbol: String? = null,
        @Query("country") country: String? = null,
    ): List<InternationalFiling>

    /**
     * Investment Themes (Thematic Investing). *(Premium API)*
     *
     * Thematic investing involves creating a portfolio (or portion of a portfolio) by gathering together a collection
     * of companies involved in certain areas that you predict will generate above-market returns over the long term.
     * Themes can be based on a concept such as ageing populations or a sub-sector such as robotics, and drones.
     * Thematic investing focuses on predicted long-term trends rather than specific companies or sectors,
     * enabling investors to access structural, one-off shifts that can change an entire industry.
     * This endpoint will help you get portfolios of different investment themes that are changing our life
     * and are the way of the future.A full list of themes supported can be found
     * [here](https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp=sharing).
     * The theme coverage and portfolios are updated bi-weekly by our analysts.
     * Our approach excludes penny, super-small cap and illiquid stocks.
     * @param theme Investment theme. A full list of themes supported can be found
     * [here](https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp=sharing).
     * (required)
     */
    @Headers("X-Operation-ID: investment-themes")
    @GET("stock/investment-theme")
    suspend fun investmentThemes(
        @Query("theme") theme: String,
    ): InvestmentThemes

    /**
     * IPO Calendar.
     *
     * Get recent and upcoming IPO.
     * @param from From date: 2020-03-15. (required)
     * @param to To date: 2020-03-16. (required)
     */
    @Headers("X-Operation-ID: ipo-calendar")
    @GET("calendar/ipo")
    suspend fun ipoCalendar(
        @Query("from") from: LocalDate,
        @Query("to") to: LocalDate,
    ): IPOCalendar

    /**
     * ISIN Change *(Premium API)*
     *
     * Get a list of ISIN changes for EU-listed securities. Limit to 2000 events at a time.
     * @param from From date *YYYY-MM-DD*. (required)
     * @param to To date *YYYY-MM-DD*. (required)
     */
    @Headers("X-Operation-ID: isin-change")
    @GET("ca/isin-change")
    suspend fun isinChange(
        @Query("from") from: String,
        @Query("to") to: String,
    ): IsinChange

    /**
     * Market News
     *
     * Get latest market news.
     * @param category This parameter can be 1 of the following values *general, forex, crypto, merger*. (required)
     * @param minId Use this field to get only news after this ID. Default to 0 (optional)
     */
    @Headers("X-Operation-ID: market-news")
    @GET("news")
    suspend fun marketNews(
        @Query("category") category: String,
        @Query("minId") minId: Long? = null,
    ): List<MarketNews>

    /**
     * Mutual Funds Country Exposure *(Premium API)*
     *
     * Get Mutual Funds country exposure data.
     * @param symbol Symbol. (required)
     */
    @Headers("X-Operation-ID: mutual-fund-country-exposure")
    @GET("mutual-fund/country")
    suspend fun mutualFundCountryExposure(
        @Query("symbol") symbol: String,
    ): MutualFundCountryExposure

    /**
     * Mutual Funds EET *(Premium API)*
     *
     * Get EET data for EU funds. For PAIs data, please see the EET PAI endpoint.
     * @param isin ISIN. (required)
     */
    @Headers("X-Operation-ID: mutual-fund-eet")
    @GET("mutual-fund/eet")
    suspend fun mutualFundEet(
        @Query("isin") isin: String,
    ): MutualFundEet

    /**
     * Mutual Funds EET PAI *(Premium API)*
     *
     * Get EET PAI data for EU funds.
     * @param isin ISIN. (required)
     */
    @Headers("X-Operation-ID: mutual-fund-eet-pai")
    @GET("mutual-fund/eet-pai")
    suspend fun mutualFundEetPai(
        @Query("isin") isin: String,
    ): MutualFundEetPai

    /**
     * Mutual Funds Holdings *(Premium API)*
     *
     * Get full Mutual Funds holdings/constituents. This endpoint covers both US and global mutual funds.
     * For international funds, you must query the data using ISIN.
     * @param symbol Fund's symbol. (optional)
     * @param isin Fund's isin. (optional)
     * @param skip Skip the first n results. You can use this parameter to query historical constituents data.
     *  The latest result is returned if skip=0 or not set. (optional)
     */
    @Headers("X-Operation-ID: mutual-fund-holdings")
    @GET("mutual-fund/holdings")
    suspend fun mutualFundHoldings(
        @Query("symbol") symbol: String? = null,
        @Query("isin") isin: String? = null,
        @Query("skip") skip: Long? = null,
    ): MutualFundHoldings

    /**
     * Mutual Funds Profile *(Premium API)*
     *
     * Get mutual funds profile information. This endpoint covers both US and global mutual funds.
     * For international funds, you must query the data using ISIN.
     * @param symbol Fund's symbol. (optional)
     * @param isin Fund's isin. (optional)
     */
    @Headers("X-Operation-ID: mutual-fund-profile")
    @GET("mutual-fund/profile")
    suspend fun mutualFundProfile(
        @Query("symbol") symbol: String? = null,
        @Query("isin") isin: String? = null,
    ): MutualFundProfile

    /**
     * Mutual Funds Sector Exposure *(Premium API)*
     *
     * Get Mutual Funds sector exposure data.
     * @param symbol Mutual Fund symbol. (required)
     */
    @Headers("X-Operation-ID: mutual-fund-sector-exposure")
    @GET("mutual-fund/sector")
    suspend fun mutualFundSectorExposure(
        @Query("symbol") symbol: String,
    ): MutualFundSectorExposure

    /**
     * News Sentiment *(Premium API)*
     *
     * Get company's news sentiment and statistics. This endpoint is only available for US companies.
     * @param symbol Company symbol. (required)
     */
    @Headers("X-Operation-ID: news-sentiment")
    @GET("news-sentiment")
    suspend fun newsSentiment(
        @Query("symbol") symbol: String,
    ): NewsSentiment

    /**
     * Ownership *(Premium API)*
     *
     * Get a full list of shareholders of a company in descending order of the number of shares held.
     * Data is sourced from *13F form*, *Schedule 13D* and *13G* for US market,
     * *UK Share Register* for UK market, *SEDI* for Canadian market and equivalent filings
     * for other international markets.
     * @param symbol Symbol of the company: AAPL. (required)
     * @param limit Limit number of results. Leave empty to get the full list. (optional)
     */
    @Headers("X-Operation-ID: ownership")
    @GET("stock/ownership")
    suspend fun ownership(
        @Query("symbol") symbol: String,
        @Query("limit") limit: Long? = null,
    ): Ownership

    /**
     * Pattern Recognition *(Premium API)*
     *
     * Run pattern recognition algorithm on a symbol. Support double top/bottom, triple top/bottom, head and shoulders,
     * triangle, wedge, channel, flag, and candlestick patterns.
     * @param symbol Symbol (required)
     * @param resolution Supported resolution includes *1, 5, 15, 30, 60, D, W, M *.Some timeframes might
     *   not be available depending on the exchange. (required)
     */
    @Headers("X-Operation-ID: pattern-recognition")
    @GET("scan/pattern")
    suspend fun patternRecognition(
        @Query("symbol") symbol: String,
        @Query("resolution") resolution: String,
    ): PatternRecognition

    /**
     * Major Press Releases *(Premium API)*
     *
     * Get latest major press releases of a company. This data can be used to highlight the most significant events
     * comprised of mostly press releases sourced from the exchanges, BusinessWire, AccessWire, GlobeNewswire, Newsfile,
     * and PRNewswire.Full-text press releases data is available for Enterprise clients.
     * [here](mailto:support@finnhub.io\">Contact Us) to learn more.
     * @param symbol Company symbol. (required)
     * @param from From time: 2020-01-01. (optional)
     * @param to To time: 2020-01-05. (optional)
     */
    @Headers("X-Operation-ID: press-releases")
    @GET("press-releases")
    suspend fun pressReleases(
        @Query("symbol") symbol: String,
        @Query("from") from: LocalDate? = null,
        @Query("to") to: LocalDate? = null,
    ): PressRelease

    /**
     * Price Metrics *(Premium API)*
     *
     * Get company price performance statistics such as 52-week high/low, YTD return and much more.
     * @param symbol Symbol of the company: AAPL. (required)
     */
    @Headers("X-Operation-ID: price-metrics")
    @GET("stock/price-metric")
    suspend fun priceMetrics(
        @Query("symbol") symbol: String,
    ): PriceMetrics

    /**
     * Price Target *(Premium API)*
     *
     * Get latest price target consensus.
     * @param symbol Symbol of the company: AAPL. (required)
     */
    @Headers("X-Operation-ID: price-target")
    @GET("stock/price-target")
    suspend fun priceTarget(
        @Query("symbol") symbol: String,
    ): PriceTarget

    /**
     * Quote
     *
     * Get real-time quote data for US stocks. Constant polling is not recommended. Use websocket if you need real-time
     * updates.Real-time stock prices for international markets are supported for Enterprise clients via our partner's
     * feed. [here](mailto:support@finnhub.io\">Contact Us) to learn more.
     * @param symbol Symbol (required)
     */
    @Headers("X-Operation-ID: quote")
    @GET("quote")
    suspend fun quote(
        @Query("symbol") symbol: String,
    ): Quote

    /**
     * Recommendation Trends
     *
     * Get latest analyst recommendation trends for a company.
     * @param symbol Symbol of the company: AAPL. (required)
     */
    @Headers("X-Operation-ID: recommendation-trends")
    @GET("stock/recommendation")
    suspend fun recommendationTrends(
        @Query("symbol") symbol: String,
    ): List<RecommendationTrend>

    /**
     * Revenue Breakdown *(Premium API)*
     *
     * Get revenue breakdown by product. This dataset is only available for US companies which disclose their revenue
     * breakdown in the annual or quarterly reports.
     * @param symbol Symbol. (optional)
     * @param cik CIK. (optional)
     */
    @Headers("X-Operation-ID: revenue-breakdown")
    @GET("stock/revenue-breakdown")
    suspend fun revenueBreakdown(
        @Query("symbol") symbol: String? = null,
        @Query("cik") cik: String? = null,
    ): RevenueBreakdown

    /**
     * Search In Filing *(Premium API)*
     *
     * Get a list of excerpts and highlight positions within a document using your query.This endpoint is powered
     * by [here](https://alpharesearch.io/>AlphaResearch.io)
     * @param search Search body (optional)
     */
    @Headers("X-Operation-ID: search-in-filing")
    @POST("global-filings/search-in-filing")
    suspend fun searchInFiling(
        @Body search: InFilingSearchBody,
    ): InFilingResponse

    /**
     * Sector Metrics *(Premium API)*
     *
     * Get ratios for different sectors and regions/indices.
     * @param region Region. A list of supported values for this field can be found
     * [here](https://docs.google.com/spreadsheets/d/1afedyv7yWJ-z7pMjaAZK-f6ENY3mI3EBCk95QffpoHw/edit?usp=sharing)
     * (required)
     */
    @Headers("X-Operation-ID: sector-metric")
    @GET("sector/metrics")
    suspend fun sectorMetric(
        @Query("region") region: String,
    ): SectorMetric

    /**
     * Similarity Index *(Premium API)*
     *
     * Calculate the textual difference between a company's 10-K / 10-Q reports and the same type of report
     * in the previous year using Cosine Similarity. For example, this endpoint compares 2019's 10-K with 2018's 10-K.
     * Companies breaking from its routines in disclosure of financial condition and risk analysis section can signal
     * a significant change in the company's stock price in the upcoming 4 quarters.
     * @param symbol Symbol. Required if cik is empty (optional)
     * @param cik CIK. Required if symbol is empty (optional)
     * @param freq *annual* or *quarterly*. Default to *annual* (optional)
     */
    @Headers("X-Operation-ID: similarity-index")
    @GET("stock/similarity-index")
    suspend fun similarityIndex(
        @Query("symbol") symbol: String? = null,
        @Query("cik") cik: String? = null,
        @Query("freq") freq: String? = null,
    ): SimilarityIndex

    /**
     * Social Sentiment
     *
     * Get social sentiment for stocks on Reddit and Twitter. This endpoint is currently in Beta.
     * @param symbol Company symbol. (required)
     * @param from From date *YYYY-MM-DD*. (optional)
     * @param to To date *YYYY-MM-DD*. (optional)
     */
    @Headers("X-Operation-ID: social-sentiment")
    @GET("stock/social-sentiment")
    suspend fun socialSentiment(
        @Query("symbol") symbol: String,
        @Query("from") from: LocalDate? = null,
        @Query("to") to: LocalDate? = null,
    ): SocialSentiment

    /**
     * Dividends 2 (Basic) *(Premium API)*
     *
     * Get global dividends data.
     * @param symbol Symbol. (required)
     */
    @Headers("X-Operation-ID: stock-basic-dividends")
    @GET("stock/dividend2")
    suspend fun stockBasicDividends(
        @Query("symbol") symbol: String,
    ): Dividends2

    /**
     * Last Bid-Ask *(Premium API)*
     *
     * Get last bid/ask data for US stocks.
     * @param symbol Symbol. (required)
     */
    @Headers("X-Operation-ID: stock-bidask")
    @GET("stock/bidask")
    suspend fun stockBidask(
        @Query("symbol") symbol: String,
    ): LastBidMinusAsk

    /**
     * Stock Candles
     *
     * Get candlestick data (OHLCV) for stocks.Daily data will be adjusted for Splits.
     * Intraday data will remain unadjusted.
     * @param symbol Symbol. (required)
     * @param resolution Supported resolution includes *1, 5, 15, 30, 60, D, W, M *.
     *  Some timeframes might not be available depending on the exchange. (required)
     * @param from UNIX timestamp. Interval initial value. (required)
     * @param to UNIX timestamp. Interval end value. (required)
     */
    @Headers("X-Operation-ID: stock-candles")
    @GET("stock/candle")
    suspend fun stockCandles(
        @Query("symbol") symbol: String,
        @Query("resolution") resolution: String,
        @Query("from") from: Long,
        @Query("to") to: Long,
    ): Candles

    /**
     * Dividends *(Premium API)*
     *
     * Get dividends data for common stocks going back 30 years.
     * @param symbol Symbol. (required)
     * @param from YYYY-MM-DD. (required)
     * @param to YYYY-MM-DD. (required)
     */
    @Headers("X-Operation-ID: stock-dividends")
    @GET("stock/dividend")
    suspend fun stockDividends(
        @Query("symbol") symbol: String,
        @Query("from") from: LocalDate,
        @Query("to") to: LocalDate,
    ): List<Dividends>

    /**
     * Senate Lobbying
     *
     * Get a list of reported lobbying activities in the Senate and the House.
     * @param symbol Symbol. (required)
     * @param from From date *YYYY-MM-DD*. (required)
     * @param to To date *YYYY-MM-DD*. (required)
     */
    @Headers("X-Operation-ID: stock-lobbying")
    @GET("stock/lobbying")
    suspend fun stockLobbying(
        @Query("symbol") symbol: String,
        @Query("from") from: LocalDate,
        @Query("to") to: LocalDate,
    ): LobbyingResult

    /**
     * Historical NBBO *(Premium API)*
     *
     * Get historical best bid and offer for US stocks, LSE, TSX, Euronext and Deutsche Borse.For US market,
     * this endpoint only serves historical NBBO from the beginning of 2020. To download more historical data,
     * please visit our bulk download page in the [Dashboard](https://finnhub.io/dashboard/download).
     * @param symbol Symbol. (required)
     * @param date Date: 2020-04-02. (required)
     * @param limit Limit number of ticks returned. Maximum value: *25000* (required)
     * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
     */
    @Headers("X-Operation-ID: stock-nbbo")
    @GET("stock/bbo")
    suspend fun stockNbbo(
        @Query("symbol") symbol: String,
        @Query("date") date: LocalDate,
        @Query("limit") limit: Long,
        @Query("skip") skip: Long,
    ): HistoricalNBBO

    /**
     * Splits *(Premium API)*
     *
     * Get splits data for stocks.
     * @param symbol Symbol. (required)
     * @param from YYYY-MM-DD. (required)
     * @param to YYYY-MM-DD. (required)
     */
    @Headers("X-Operation-ID: stock-splits")
    @GET("stock/split")
    suspend fun stockSplits(
        @Query("symbol") symbol: String,
        @Query("from") from: LocalDate,
        @Query("to") to: LocalDate,
    ): List<Split>

    /**
     * Stock Symbol
     *
     * List supported stocks. We use the following symbology to identify stocks
     * on Finnhub *Exchange_Ticker.Exchange_Code*. A list of supported exchange codes can be found
     * [here](https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp=sharing).
     * @param exchange Exchange you want to get the list of symbols from. List of exchange codes can be found
     * [here](https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp=sharing).
     * (required)
     * @param mic Filter by MIC code. (optional)
     * @param securityType Filter by security type used by OpenFigi standard. (optional)
     * @param currency Filter by currency. (optional)
     */
    @Headers("X-Operation-ID: stock-symbols")
    @GET("stock/symbol")
    suspend fun stockSymbols(
        @Query("exchange") exchange: String,
        @Query("mic") mic: String? = null,
        @Query("securityType") securityType: String? = null,
        @Query("currency") currency: String? = null,
    ): List<StockSymbol>

    /**
     * Tick Data *(Premium API)*
     *
     * Get historical tick data for global exchanges. You can send the request directly to our tick server
     * at [here](https://tick.finnhub.io) with the same path and parameters or get
     * redirected there if you call our main server.For US market, you can visit our bulk download page
     * in the [Dashboard](https://finnhub.io/dashboard/download) to speed up the download process.
     * See [doc](https://finnhub.io/docs/api/stock-tick) for supported exchanges, segments and delays.
     * @param symbol Symbol. (required)
     * @param date Date: 2020-04-02. (required)
     * @param limit Limit number of ticks returned. Maximum value: *25000* (required)
     * @param skip Number of ticks to skip. Use this parameter to loop through the entire data. (required)
     */
    @Headers("X-Operation-ID: stock-tick")
    @GET("stock/tick")
    suspend fun stockTick(
        @Query("symbol") symbol: String,
        @Query("date") date: LocalDate,
        @Query("limit") limit: Long,
        @Query("skip") skip: Long,
    ): TickData

    /**
     * USA Spending
     *
     * Get a list of government's spending activities from USASpending dataset for public companies.
     * This dataset can help you identify companies that win big government contracts which is extremely important
     * for industries such as Defense, Aerospace, and Education.
     * @param symbol Symbol. (required)
     * @param from From date *YYYY-MM-DD*. Filter for *actionDate* (required)
     * @param to To date *YYYY-MM-DD*. Filter for *actionDate* (required)
     */
    @Headers("X-Operation-ID: stock-usa-spending")
    @GET("stock/usa-spending")
    suspend fun stockUsaSpending(
        @Query("symbol") symbol: String,
        @Query("from") from: LocalDate,
        @Query("to") to: LocalDate,
    ): UsaSpendingResult

    /**
     * USPTO Patents
     *
     * List USPTO patents for companies. Limit to 250 records per API call.
     * @param symbol Symbol. (required)
     * @param from From date *YYYY-MM-DD*. (required)
     * @param to To date *YYYY-MM-DD*. (required)
     */
    @Headers("X-Operation-ID: stock-uspto-patent")
    @GET("stock/uspto-patent")
    suspend fun stockUsptoPatent(
        @Query("symbol") symbol: String,
        @Query("from") from: LocalDate,
        @Query("to") to: LocalDate,
    ): UsptoPatentResult

    /**
     * H1-B Visa Application
     *
     * Get a list of H1-B and Permanent visa applications for companies from the DOL. The data is updated quarterly.
     * @param symbol Symbol. (required)
     * @param from From date *YYYY-MM-DD*. Filter on the *beginDate* column. (required)
     * @param to To date *YYYY-MM-DD*. Filter on the *beginDate* column. (required)
     */
    @Headers("X-Operation-ID: stock-visa-application")
    @GET("stock/visa-application")
    suspend fun stockVisaApplication(
        @Query("symbol") symbol: String,
        @Query("from") from: LocalDate,
        @Query("to") to: LocalDate,
    ): VisaApplicationResult

    /**
     * Supply Chain Relationships *(Premium API)*
     *
     * This endpoint provides an overall map of public companies' key customers and suppliers. The data offers a deeper
     * look into a company's supply chain and how products are created. The data will help investors manage risk, limit
     * exposure or generate alpha-generating ideas and trading insights.
     * @param symbol Symbol. (required)
     */
    @Headers("X-Operation-ID: supply-chain-relationships")
    @GET("stock/supply-chain")
    suspend fun supplyChainRelationships(
        @Query("symbol") symbol: String,
    ): SupplyChainRelationships

    /**
     * Support/Resistance *(Premium API)*
     *
     * Get support and resistance levels for a symbol.
     * @param symbol Symbol (required)
     * @param resolution Supported resolution includes *1, 5, 15, 30, 60, D, W, M *.Some timeframes might not
     * be available depending on the exchange. (required)
     */
    @Headers("X-Operation-ID: support-resistance")
    @GET("scan/support-resistance")
    suspend fun supportResistance(
        @Query("symbol") symbol: String,
        @Query("resolution") resolution: String,
    ): SupportResistance

    /**
     * Symbol Change *(Premium API)*
     *
     * Get a list of symbol changes for US-listed, EU-listed, NSE and ASX securities. Limit to 2000 events at a time.
     * @param from From date *YYYY-MM-DD*. (required)
     * @param to To date *YYYY-MM-DD*. (required)
     */
    @Headers("X-Operation-ID: symbol-change")
    @GET("ca/symbol-change")
    suspend fun symbolChange(
        @Query("from") from: String,
        @Query("to") to: String,
    ): SymbolChange

    /**
     * Symbol Lookup
     *
     * Search for best-matching symbols based on your query. You can input anything from symbol,
     * security's name to ISIN and Cusip.
     * @param q Query text can be symbol, name, isin, or cusip. (required)
     */
    @Headers("X-Operation-ID: symbol-search")
    @GET("search")
    suspend fun symbolSearch(
        @Query("q") q: String,
    ): SymbolLookup

    /**
     * Technical Indicators
     *
     * Return technical indicator with price data. List of supported indicators can be found
     * [here](https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp=sharing).
     * @param symbol symbol (required)
     * @param resolution Supported resolution includes *1, 5, 15, 30, 60, D, W, M *.Some timeframes might not
     *  be available depending on the exchange. (required)
     * @param from UNIX timestamp. Interval initial value. (required)
     * @param to UNIX timestamp. Interval end value. (required)
     * @param indicator Indicator name. Full list can be found
     * [here](https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp=sharing)
     *  (required)
     * @param indicatorFields Check out
     * [here](https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp=sharing)
     * to see which indicators and params are supported. (optional)
     */
    @Headers("X-Operation-ID: technical-indicator")
    @GET("indicator")
    suspend fun technicalIndicator(
        @Query("symbol") symbol: String,
        @Query("resolution") resolution: String,
        @Query("from") from: Long,
        @Query("to") to: Long,
        @Query("indicator") indicator: String,
        @Query("indicator_fields") indicatorFields: Map<String, Any>,
    ): TechnicalIndicator

    /**
     * Earnings Call Transcripts *(Premium API)*
     *
     * Get earnings call transcripts, audio and participants' list. Data is available for US, UK, European, Australian
     * and Canadian companies.15+ years of data is available with 220,000+ audio which add up to 7TB in size.
     * @param id Transcript's id obtained with <a href="#transcripts-list">Transcripts List endpoint). (required)
     */
    @Headers("X-Operation-ID: transcripts")
    @GET("stock/transcripts")
    suspend fun transcripts(
        @Query("id") id: String,
    ): EarningsCallTranscripts

    /**
     * Earnings Call Transcripts List
     *
     * List earnings call transcripts' metadata. This endpoint is available for US, UK, European, Australian
     * and Canadian companies.
     * @param symbol Company symbol: AAPL. Leave empty to list the latest transcripts (required)
     */
    @Headers("X-Operation-ID: transcripts-list")
    @GET("stock/transcripts/list")
    suspend fun transcriptsList(
        @Query("symbol") symbol: String,
    ): EarningsCallTranscriptsList

    /**
     * Stock Upgrade/Downgrade *(Premium API)*
     *
     * Get latest stock upgrade and downgrade.
     * @param symbol Symbol of the company: AAPL. If left blank, the API will return
     * latest stock upgrades/downgrades. (optional)
     * @param from From date: 2000-03-15. (optional)
     * @param to To date: 2020-03-16. (optional)
     */
    @Headers("X-Operation-ID: upgrade-downgrade")
    @GET("stock/upgrade-downgrade")
    suspend fun upgradeDowngrade(
        @Query("symbol") symbol: String? = null,
        @Query("from") from: LocalDate? = null,
        @Query("to") to: LocalDate? = null,
    ): List<UpgradeDowngrade>

    companion object {

        private const val FINNUB_API_URL = "https://finnhub.io/api/v1/"
        private const val HEADER_API_KEY = "X-Finnhub-Token"
        private const val HEADER_CONTENT_KEY = "Content-Type"
        private const val HEADER_CONTENT_VALUE = "application/json"

        fun create(apiKey: String): FinnhubApi =
            Ktorfit.Builder()
                .baseUrl(FINNUB_API_URL)
                .httpClient {
                    /*                    install(Logging) {
                                            level = LogLevel.HEADERS
                                        }*/
                    install(ContentNegotiation) {
                        json(Json {
                            prettyPrint = true
                            isLenient = true
                        })
                    }

                    defaultRequest {
                        headers {
                            header(HEADER_API_KEY, apiKey)
                            header(HEADER_CONTENT_KEY, HEADER_CONTENT_VALUE)
                        }
                    }
                }
                .responseConverter(FinnhubRepsonseConverter())
                .build().create()
    }
}
