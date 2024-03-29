pluginManagement {

    val kotlinVersion = extra["versions.kotlin"].toString()
    val kspVersion = extra["versions.ksp"].toString()

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }
    plugins {
        kotlin("multiplatform") version kotlinVersion apply false
        kotlin("plugin.serialization") version kotlinVersion apply false
        id("com.google.devtools.ksp") version kspVersion apply false
        id("org.jetbrains.dokka") version "1.8.20" apply false
        id("io.gitlab.arturbosch.detekt") version "1.23.1" apply false
        id("de.jensklingenberg.ktorfit") version "1.0.0" apply false
        id("com.android.library") version "8.0.2" apply false
        id("org.jetbrains.kotlin.android") version "1.9.0" apply false
        id("com.github.ben-manes.versions") version "0.47.0" apply false
        //id("com.vanniktech.maven.publish") version "0.23.2" apply false
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
include(":finnhub-websocket")
