# <img height=40 style="margin:0 0 -7px 0" src="docs/finnhub-logo.png"/> Finnhub API <i>(Kotlin Multiplatform)</i>

[![Kotlin Beta](https://kotl.in/badges/beta.svg)](https://kotlinlang.org/docs/components-stability.html)
[![Kotlin](https://img.shields.io/badge/kotlin-1.8.0-blue.svg?logo=kotlin)](http://kotlinlang.org)
![badge-jvm](http://img.shields.io/badge/platform-jvm-DB413D.svg?style=flat)
![badge-android](http://img.shields.io/badge/platform-android-6EDB8D.svg?style=flat)
![badge-ios](http://img.shields.io/badge/platform-ios-CDCDCD.svg?style=flat)
![badge-js](http://img.shields.io/badge/platform-js-F8DB5D.svg?style=flat)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)

Unofficial kotlin-multiplatform library for [Finnhub API](https://finnhub.io).
This library supports kotlin coroutines and WebSocket API.
Supported platforms for now are JVM, Android, IOS and web (JS).

<i><b>Note:</b> Not all endpoints were tested yet, please feel free to open an issue or pull request, if any of the
endpoints is not up-to-date.</i>

### Documentation

See official [Finnhub API Docs](https://finnhub.io/docs/api)

### Setup in multiplatform project / module

Add the finnhub-api to your multiplatform module `build.gradle.kts`.

```kotlin
val finnhubApiVersion = "LATEST_FINNHUB_API_VERSION"
sourceSets {
    val commonMain by getting {
        dependencies {
            implementation("com.hibernix.finnhub:finnhub-api:$finnhubApiVersion") // for REST API
            implementation("com.hibernix.finnhub:finnhub-websocket:$finnhubApiVersion") // for real-time updates
        }
    }
}
```

### Setup in single platform project / module

Add the finnhub-api to your common module.

```kotlin
val finnhubApiVersion = "LATEST_FINNHUB_API_VERSION"
dependencies {
    implementation("com.hibernix.finnhub:finnhub-api-<platform>:$finnhubApiVersion") // for REST API
    implementation("com.hibernix.finnhub:finnhub-websocket-<platform>:$finnhubApiVersion") // for real-time updates
}
```

where `<platform>` is one of `jvm`, `android`, `ios`, `js`, depending on the platform you are using.