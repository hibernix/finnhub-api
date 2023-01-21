plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization") version "1.8.0"
    id("com.google.devtools.ksp") version "1.8.0-1.0.8"
    id("com.vanniktech.maven.publish")
}

group = property("project.group")!!
version = property("project.version")!!

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

mavenPublishing {
    //publishToMavenCentral()
    // publishToMavenCentral(SonatypeHost.S01) for publishing through s01.oss.sonatype.org
    /*
        if(enableSigning.toBoolean()){
            signAllPublications()
        }
    */
}

kotlin {
    /*
        android {
            publishLibraryVariants("release", "debug")
        }
    */
    jvm {
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")
                implementation("de.jensklingenberg.ktorfit:ktorfit-lib:1.0.0-beta17")
                implementation("io.ktor:ktor-client-content-negotiation:2.2.2")
                implementation("io.ktor:ktor-serialization-kotlinx-json:2.2.2")
            }
        }
    }
}

dependencies {
    add("kspCommonMainMetadata", "de.jensklingenberg.ktorfit:ktorfit-ksp:1.0.0-beta17")
    add("kspJvm", "de.jensklingenberg.ktorfit:ktorfit-ksp:1.0.0-beta17")
}
