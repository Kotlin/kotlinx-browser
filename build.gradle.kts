import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
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
    wasmJs {
        nodejs()
    }

    sourceSets {
        val wasmJsTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

rootProject.the<NodeJsRootExtension>().apply {
    nodeVersion = "21.0.0-v8-canary202309167e82ab1fa2"
    nodeDownloadBaseUrl = "https://nodejs.org/download/v8-canary"
}

tasks.withType<org.jetbrains.kotlin.gradle.targets.js.npm.tasks.KotlinNpmInstallTask>().configureEach {
    args.add("--ignore-engines")
}