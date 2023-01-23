plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("com.android.library")
    id("com.google.devtools.ksp")
    id("de.jensklingenberg.ktorfit")
    id("org.jetbrains.dokka")
    id("io.gitlab.arturbosch.detekt")
    `maven-publish`
}

val ktorVersion = extra["versions.ktor"]
val ktorfitVersion = extra["versions.ktorfit"]
val coroutinesVersion = extra["versions.coroutines"]
val serializationVersion = extra["versions.serialization"]
val datetimeVersion = extra["versions.datetime"]

group = requireNotNull(extra["project.group"])
version = requireNotNull(extra["project.version"])

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
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
                implementation("de.jensklingenberg.ktorfit:ktorfit-lib:$ktorfitVersion")
                implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
                implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting
        val androidMain by getting
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

val kspRetrofit = "de.jensklingenberg.ktorfit:ktorfit-ksp:$ktorfitVersion"
dependencies {
    add("kspCommonMainMetadata", kspRetrofit)
    add("kspJvm", kspRetrofit)
    add("kspAndroid", kspRetrofit)
    add("kspJs", kspRetrofit)
}
