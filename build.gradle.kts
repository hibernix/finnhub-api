plugins {
    kotlin("multiplatform") apply false
    id("com.android.library") apply false
    id("org.jetbrains.kotlin.android") apply false
    id("org.jetbrains.dokka")
}

subprojects {
    repositories {
        google()
        mavenLocal()
        mavenCentral()
    }
}
