plugins {
    kotlin("multiplatform") apply false
    id("com.android.library") apply false
    id("org.jetbrains.kotlin.android") apply false
    id("org.jetbrains.dokka")
    id("com.github.ben-manes.versions")
}

subprojects {
    repositories {
        google()
        mavenLocal()
        mavenCentral()
    }
}
