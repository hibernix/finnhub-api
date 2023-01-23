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

val androidMinSdk = extra["project.android.minSdk"].toString().toInt()
val androidCompileSdk = extra["project.android.compileSdk"].toString().toInt()
val androidTargetSdk = extra["project.android.targetSdk"].toString().toInt()

group = extra["project.group"].toString()
version = extra["project.version"].toString()

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
        publishLibraryVariants("release"/*, "debug"*/)
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

val dokkaOutputDir = "$buildDir/dokka"

tasks.getByName<org.jetbrains.dokka.gradle.DokkaTask>("dokkaHtml") {
    outputDirectory.set(file(dokkaOutputDir))
}

val deleteDokkaOutputDir by tasks.register<Delete>("deleteDokkaOutputDirectory") {
    delete(dokkaOutputDir)
}

val javadocJar = tasks.register<Jar>("javadocJar") {
    dependsOn(deleteDokkaOutputDir, tasks.dokkaHtml)
    archiveClassifier.set("javadoc")
    from(dokkaOutputDir)
}

publishing {
    publications {
        withType<MavenPublication> {
            artifact(tasks["javadocJar"])

            pom {
                name.set(project.name)
                description.set("Finnhub WebSocket Client")
                url.set("https://github.com/hibernix/finnhub-api")

                licenses {
                    license {
                        name.set("Apache License 2.0")
                        url.set("https://github.com/Foso/Ktorfit/blob/master/LICENSE.txt")
                    }
                }
                scm {
                    url.set("https://github.com/hibernix/finnhub-api")
                    connection.set("scm:git:git://github.com/hibernix/finnhub-api.git")
                }
                developers {
                    developer {
                        name.set("Hibernix s.r.o.")
                        url.set("https://hibernix.com")
                    }
                }
            }
        }
    }
}

android {
    compileSdk = androidCompileSdk
    defaultConfig {
        minSdk = androidMinSdk
        targetSdk = androidTargetSdk
    }
    namespace = "com.hibernix.finnhub.websocket"
}
