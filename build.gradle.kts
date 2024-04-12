import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import java.net.URI

plugins {
    kotlin("multiplatform") version "1.9.23"
    `maven-publish`
}

fun Project.getSensitiveProperty(name: String): String? =
    project.findProperty(name) as? String ?: System.getenv(name)

publishing {
    repositories {
        maven {
            url = URI("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
            credentials {
                username = getSensitiveProperty("publish.user")
                password = getSensitiveProperty("publish.password")
            }
        }
    }
}

repositories {
    mavenCentral()
}


val artifactId = "kotlinx-browser"
val deployVersion = properties["deployVersion"]
val versionSuffix = properties["versionSuffix"]
if (deployVersion != null) {
    version = "$version-$deployVersion"
}
if (versionSuffix != null) {
    version = "$version-$versionSuffix"
}

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