plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("com.android.library")
    id("io.gitlab.arturbosch.detekt")
    id("org.jetbrains.dokka")
    `maven-publish`
}

val coroutinesVersion = extra["versions.coroutines"]
val serializationVersion = extra["versions.serialization"]
val datetimeVersion = extra["versions.datetime"]
val ktorVersion = extra["versions.ktor"]

group = property("project.group")!!
version = property("project.version")!!

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

detekt {
    config = files("../detekt-config.yml")
    buildUponDefaultConfig = true
}

kotlin {
    jvm()
    android {
        publishLibraryVariants("release", "debug")
    }
    js {
        browser()
        nodejs()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:$datetimeVersion")
                implementation("io.ktor:ktor-client-websockets:$ktorVersion")
            }
        }
    }
}

android {
    compileSdk = 33
    defaultConfig {
        minSdk = 19
        targetSdk = 33
    }
    namespace = "com.hibernix.finnhub.api"
}
