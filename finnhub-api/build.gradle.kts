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

val androidMinSdk = extra["project.android.minSdk"].toString().toInt()
val androidTargetSdk = extra["project.android.targetSdk"].toString().toInt()
val androidCompileSdk = extra["project.android.compileSdk"].toString().toInt()

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
    compileSdk = androidCompileSdk
    defaultConfig {
        minSdk = androidMinSdk
        targetSdk = androidTargetSdk
    }
    namespace = "com.hibernix.finnhub.api"
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
                description.set("Finnhub REST API")
                url.set("https://github.com/hibernix/finnhub-api")

                licenses {
                    license {
                        name.set("Apache License 2.0")
                        url.set("https://github.com/Foso/Ktorfit/blob/master/LICENSE.txt")
                    }
                }
                scm {
                    url.set("https://github.com/hibernix/finnhub-api")
                    connection.set("https://github.com/hibernix/finnhub-api.git")
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

val kspRetrofit = "de.jensklingenberg.ktorfit:ktorfit-ksp:$ktorfitVersion"
dependencies {
    add("kspCommonMainMetadata", kspRetrofit)
    add("kspJvm", kspRetrofit)
    add("kspAndroid", kspRetrofit)
    add("kspJs", kspRetrofit)
}
