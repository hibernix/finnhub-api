plugins {
    kotlin("multiplatform") apply false
    id("com.vanniktech.maven.publish") version "0.23.2" apply false
}

buildscript {
    repositories {
        google()
        gradlePluginPortal()
        mavenLocal()
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap")
        }
    }
    dependencies {
        /*
                classpath("com.vanniktech:gradle-maven-publish-plugin:0.23.1")
                classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.7.20")
                classpath("org.jetbrains.kotlin:kotlin-serialization:1.8.0")
                classpath("com.android.tools.build:gradle:7.2.2")
                classpath ("app.cash.licensee:licensee-gradle-plugin:1.5.0")
                classpath("de.jensklingenberg.ktorfit:gradle-plugin:1.0.0")
        */
    }
}

subprojects {
    repositories {
        google()
        mavenLocal()
        mavenCentral()
    }
}