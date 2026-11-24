@file:OptIn(org.jetbrains.kotlin.gradle.ExperimentalWasmDsl::class)

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.jvm) apply false
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

// The generated KDoc includes MDN content under CC-BY-SA 2.5: every published jar (sources jars carry the KDoc)
// ships the attribution next to the license.
tasks.withType<org.gradle.jvm.tasks.Jar>().configureEach {
    metaInf {
        from(layout.projectDirectory.file("NOTICE"))
        from(layout.projectDirectory.file("LICENSE"))
    }
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
        // The typed-array built-ins are expect/actual classes (Beta), declared once in webMain for both targets.
        freeCompilerArgs.add("-Xexpect-actual-classes")
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