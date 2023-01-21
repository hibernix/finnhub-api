pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }
    plugins {
        kotlin("multiplatform") version "1.8.0" apply false
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }
}

rootProject.name = "finnhub-api"

include(":finnhub-api")
