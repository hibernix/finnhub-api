plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("com.android.library")
    id("io.gitlab.arturbosch.detekt")
    id("org.jetbrains.dokka")
    `maven-publish`
    signing
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
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    ios("ios") {
        binaries {
            framework {
                baseName = "library"
            }
        }
    }
    macosX64()
    mingwX64()
    linuxX64 {
        /*
                binaries {
                    executable()
                }
        */
    }
    js(IR) {
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
    repositories {
        maven {
            name = "Oss"
            setUrl {
                val repositoryId =
                    System.getenv("SONATYPE_REPOSITORY_ID") ?: error("Missing env variable: SONATYPE_REPOSITORY_ID")
                //"https://oss.sonatype.org/service/local/staging/deployByRepositoryId/${repositoryId}/"
                "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
            }
            credentials {
                username = System.getenv("SONATYPE_USERNAME")
                password = System.getenv("SONATYPE_PASSWORD")
            }
        }
        maven {
            name = "Snapshot"
            setUrl { "https://oss.sonatype.org/content/repositories/snapshots/" }
            credentials {
                username = System.getenv("SONATYPE_USERNAME")
                password = System.getenv("SONATYPE_PASSWORD")
            }
        }
    }
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
                        url.set("https://github.com/hibernix/finnhub-api/blob/main/LICENSE")
                    }
                }
                scm {
                    url.set("https://github.com/hibernix/finnhub-api")
                    connection.set("scm:git:git://github.com/hibernix/finnhub-api.git")
                }
                developers {
                    developer {
                        name.set("hibernix")
                        url.set("https://hibernix.com")
                    }
                }
            }
        }
    }
}

signing {
    sign(publishing.publications)
}

android {
    compileSdk = androidCompileSdk
    defaultConfig {
        minSdk = androidMinSdk
        targetSdk = androidTargetSdk
    }
    namespace = "com.hibernix.finnhub.websocket"
}

//region Fix Gradle warning about signing tasks using publishing task outputs without explicit dependencies
// <https://youtrack.jetbrains.com/issue/KT-46466>
tasks.withType<AbstractPublishToMaven>().configureEach {
    val signingTasks = tasks.withType<Sign>()
    mustRunAfter(signingTasks)
}
//endregion
