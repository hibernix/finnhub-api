# <img height=38 style="margin:0 0 -8px 0" src="docs/finnhub-logo.png"/> Finnhub API&nbsp;&nbsp;<i style="color: #555555">(Kotlin Multiplatform)</i>

[![Kotlin Beta](https://kotl.in/badges/beta.svg)](https://kotlinlang.org/docs/components-stability.html)
[![Kotlin](https://img.shields.io/badge/kotlin-1.8.0-blue.svg?logo=kotlin)](http://kotlinlang.org)
![badge][badge-jvm]
![badge][badge-android]
![badge][badge-ios]
![badge][badge-mac]
![badge][badge-linux]
![badge][badge-windows]
![badge][badge-js]
<br>
![GitHub release (latest SemVer)](https://img.shields.io/github/v/release/hibernix/finnhub-api)
![Maven Central](https://img.shields.io/maven-central/v/com.hibernix.finnhub/finnhub-api?color=blue)
![GitHub](https://img.shields.io/github/license/hibernix/finnhub-api?style=flat)

Unofficial kotlin-multiplatform library for [Finnhub API](https://finnhub.io).
Unlike the [official](https://github.com/Finnhub-Stock-API/finnhub-kotlin)  kotlin library, this one supports also
WebSockets for real-time updates, uses kotlin coroutines and can be used on multiple platforms (currently android, ios,
JVM, macos, windows, linux, web/JS).

<i><b>Note:</b> Not all endpoints were tested yet, especially the premium ones, please feel free to open an issue
or pull request, if any of the endpoints is not working or up-to-date.</i>

## Setup

### Single platform project / module

Add the finnhub-api dependencies in `build.gradle.kts` in your module.

```kotlin
val finnhubApiVersion = "0.1.0"

dependencies {
    implementation("com.hibernix.finnhub:finnhub-api-[PLATFORM]:$finnhubApiVersion") // for REST API
    implementation("com.hibernix.finnhub:finnhub-websocket-[PLATFORM]:$finnhubApiVersion") // for real-time updates
}
```

replace `[PLATFORM]` with one of platfroms, depending on the platform you are using (e.g. `android` for Android)

### Multiplatform project / module

Add the finnhub-api dependencies in `build.gradle.kts` in your multiplatform module.

```kotlin
val finnhubApiVersion = "0.1.0"

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
- [ ] Tests
- [ ] WebSocket ping and auto-reconnect

[badge-android]: http://img.shields.io/badge/-android-6EDB8D.svg?style=flat

[badge-android-native]: http://img.shields.io/badge/support-[AndroidNative]-6EDB8D.svg?style=flat

[badge-jvm]: http://img.shields.io/badge/-jvm-DB413D.svg?style=flat

[badge-js]: http://img.shields.io/badge/-js-F8DB5D.svg?style=flat

[badge-js-ir]: https://img.shields.io/badge/support-[IR]-AAC4E0.svg?style=flat

[badge-nodejs]: https://img.shields.io/badge/-nodejs-68a063.svg?style=flat

[badge-linux]: http://img.shields.io/badge/-linux-2D3F6C.svg?style=flat

[badge-windows]: http://img.shields.io/badge/-windows-4D76CD.svg?style=flat

[badge-wasm]: https://img.shields.io/badge/-wasm-624FE8.svg?style=flat

[badge-apple-silicon]: http://img.shields.io/badge/support-[AppleSilicon]-43BBFF.svg?style=flat

[badge-ios]: http://img.shields.io/badge/-ios-CDCDCD.svg?style=flat

[badge-mac]: http://img.shields.io/badge/-macos-111111.svg?style=flat&color=707070

[badge-watchos]: http://img.shields.io/badge/-watchos-C0C0C0.svg?style=flat

[badge-tvos]: http://img.shields.io/badge/-tvos-808080.svg?style=flat
