@file:OptIn(org.jetbrains.kotlin.gradle.ExperimentalWasmDsl::class)

plugins {
    kotlin("multiplatform") version "2.5.0-Beta2"
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
    @OptIn(org.jetbrains.kotlin.gradle.dsl.abi.ExperimentalAbiValidation::class)
    abiValidation()

    compilerOptions {
        optIn.add("kotlin.js.ExperimentalWasmJsInterop")
    }

    js {
        nodejs()
    }

    wasmJs {
        nodejs()
    }

    applyDefaultHierarchyTemplate()

    sourceSets {
        val commonMain by getting
        val webMain by getting {
            // Generated from Web IDL by `./gradlew :generator:generateWebApi`; do not edit.
            kotlin.srcDir("src/webMain/generated")
        }
        val webTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}