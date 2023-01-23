# <img height=38 style="margin:0 0 -8px 0" src="docs/finnhub-logo.png"/> Finnhub API&nbsp;&nbsp;<i style="color: #555555">(Kotlin Multiplatform)</i>

[![Kotlin Beta](https://kotl.in/badges/beta.svg)](https://kotlinlang.org/docs/components-stability.html)
[![Kotlin](https://img.shields.io/badge/kotlin-1.8.0-blue.svg?logo=kotlin)](http://kotlinlang.org)
![badge-jvm](http://img.shields.io/badge/platform-jvm-DB413D.svg?style=flat)
![badge-android](http://img.shields.io/badge/platform-android-6EDB8D.svg?style=flat)
![badge-ios](http://img.shields.io/badge/platform-ios-CDCDCD.svg?style=flat)
![badge-js](http://img.shields.io/badge/platform-js-F8DB5D.svg?style=flat)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)

Unofficial kotlin-multiplatform library for [Finnhub API](https://finnhub.io).
Unlike the [official](https://github.com/Finnhub-Stock-API/finnhub-kotlin)  kotlin library, this one supports also
WebSockets for real-time updates, uses kotlin coroutines and can be used on multiple platforms
(currently supported for now are JVM (java), Android, IOS and web (JS / nodeJS)).

<i><b>Note:</b> Not all endpoints were tested yet, especially the premium ones, please feel free to open an issue
or pull request, if any of the endpoints is not working or up-to-date.</i>

## Setup

### Single platform project / module

Add the finnhub-api dependencies in `build.gradle.kts` in your module.

```kotlin
val finnhubApiVersion = "0.1.0-beta01"
dependencies {
    implementation("com.hibernix.finnhub:finnhub-api-[PLATFORM]:$finnhubApiVersion") // for REST API
    implementation("com.hibernix.finnhub:finnhub-websocket-[PLATFORM]:$finnhubApiVersion") // for real-time updates
}
```

where `[PLATFORM]` is one of `jvm`, `android`, `ios`, `js`, depending on the platform you are using.

### Multiplatform project / module

Add the finnhub-api dependencies in `build.gradle.kts` in your multiplatform module.

```kotlin
val finnhubApiVersion = "0.1.0-beta01"
sourceSets {
    val commonMain by getting {
        dependencies {
            implementation("com.hibernix.finnhub:finnhub-api:$finnhubApiVersion") // for REST API
            implementation("com.hibernix.finnhub:finnhub-websocket:$finnhubApiVersion") // for real-time updates
        }
    }
}
```

## Usage

#### REST API:

```kotlin
 val finnhubApi = FinnhubApi.create(apiKey = "<finnhub API key>")

scope.launch {
    // company profile
    finnhubApi.companyProfile2("AAPL").let { println(it) }

    // price candles history
    val fromDate = LocalDate.parse("2022-01-01").atStartOfDayIn(TimeZone.UTC)
    finnhubApi.cryptoCandles(
        symbol = "BINANCE:BTCUSDT",
        resolution = "60",
        from = fromDate.epochSeconds,
        to = (fromDate + 3.days).epochSeconds,
    )
        .toCandleList() // convenience method that converts the response to a more useful list of candles
        .forEach { candle -> println("$candle") }
}
```

#### WebSocket:

```kotlin
val ws = FinnhubWebSocket.create("finnhub API key")

ws.onError = { error -> ... }
ws.connect {
    subscribeTrades("AAPL")
    subscribeNews("GOOGL")
}

ws.tradesFlow.onEach { trades ->  // you can lso use flow.collect {} in coroutine
    trades.forEach { trade -> println("Trade: $trade") }
}.launchIn(GlobalScope) // use your regular scope

ws.newsFlow.onEach { news -> ... }
    .launchIn(GlobalScope) // use your regular scope


```

## Documentation

See official [Finnhub API Docs](https://finnhub.io/docs/api)
or [project docs](https://hibernix.github.io/finnhub-api/docs)

## Samples

Check some examples in samples folder (coming soon)

## ToDo

- [ ] Error response transformation for REST API
- [ ] Examples
- [ ] WebSocket ping and auto-reconnect
