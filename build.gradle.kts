import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl
import java.net.URI

plugins {
    kotlin("multiplatform") version "1.9.23"
    `maven-publish`
}

publishing {
    repositories {
        maven {
            url = URI("URI")
            credentials {
                username = "USERNAME"
                password = "PASSWORD"
            }
        }
    }
}

repositories {
    mavenCentral()
}

group = "org.jetbrains.kotlinx"
val artifactId = "kotlinx-browser"
version = "0.1"

kotlin {
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs { }
}