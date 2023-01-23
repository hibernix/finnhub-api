plugins {
    kotlin("multiplatform") apply false
    id("org.jetbrains.dokka")
    id("com.android.library") apply false
    id("org.jetbrains.kotlin.android") apply false
}

subprojects {
    repositories {
        google()
        mavenLocal()
        mavenCentral()
    }

}
