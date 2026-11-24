import org.jetbrains.kotlin.gradle.ExperimentalJsTestDsl

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
    // Every public declaration says so, generated ones included: the ABI is what users get (see api/).
    explicitApi()

    @OptIn(org.jetbrains.kotlin.gradle.dsl.abi.ExperimentalAbiValidation::class)
    abiValidation()

    compilerOptions {
        optIn.add("kotlin.js.ExperimentalWasmJsInterop")
    }

    js {
        nodejs()
        browser {
            @OptIn(ExperimentalJsTestDsl::class)
            test { chromium("chromium") }
        }
    }

    wasmJs {
        nodejs()
        @OptIn(ExperimentalJsTestDsl::class)
        browser { test { chromium("chromium") } }
    }

    applyDefaultHierarchyTemplate()

    sourceSets {
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