plugins {
    `maven-publish`
    kotlin("multiplatform") version "1.8.0-Beta"
}

group = "org.jetbrains.kotlinx"
val deployVersion = findProperty("kotlinxBrowserDeployVersion") as String?
version = deployVersion ?: "0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    js(IR) {
        nodejs()
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile>().configureEach {
    kotlinOptions.freeCompilerArgs += listOf(
        "-Xallow-kotlin-package",
        "-opt-in=kotlin.ExperimentalMultiplatform",
        "-opt-in=kotlin.contracts.ExperimentalContracts"
    )
    kotlinOptions.allWarningsAsErrors = true
}