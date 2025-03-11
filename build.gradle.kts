import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.tasks.KotlinCompileCommon

plugins {
    kotlin("multiplatform") version "2.1.10"
    `maven-publish`
    signing
}

afterEvaluate {
    publishing {
        repositories {
            configureMavenPublication(this, project)
        }

        publications.forEach {
            it as MavenPublication
            it.pom.configureMavenCentralMetadata(project)
            signPublicationIfKeyPresent(project, it)
        }

        tasks.withType<AbstractPublishToMaven>().configureEach {
            dependsOn(tasks.withType<Sign>())
        }
    }
}

repositories {
    mavenCentral()
    mavenLocal()
}

val artifactId = "kotlinx-browser"
val deployVersion = properties["deployVersion"]?.toString()
val versionSuffix = properties["versionSuffix"]?.toString()
if (!deployVersion.isNullOrBlank()) {
    version = "$version-$deployVersion"
}
if (!versionSuffix.isNullOrBlank()) {
    version = "$version-$versionSuffix"
}

kotlin {
    js()

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        nodejs()
    }

    sourceSets {
        val commonMain by getting
        val commonTest by getting
        val browserMain by creating {
            dependsOn(commonMain)
        }
        val browserTest by creating {
            dependsOn(commonTest)
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jsMain by getting {
            dependsOn(browserMain)
            dependencies {
                implementation(kotlin("wasm-js-interop", "0.0.1-SNAPSHOT"))
            }
        }
        val jsTest by getting {
            dependsOn(browserTest)
        }
        val wasmJsMain by getting {
            dependsOn(browserMain)
        }
        val wasmJsTest by getting {
            dependsOn(browserTest)
        }
    }
}

tasks.withType<KotlinCompileCommon>().configureEach {
    enabled = false
}