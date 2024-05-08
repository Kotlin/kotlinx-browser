import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

plugins {
    kotlin("multiplatform") version "1.9.24"
    `maven-publish`
    signing
}

// empty xxx-javadoc.jar
tasks.withType<Jar> {
    archiveClassifier = "javadoc"
}

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