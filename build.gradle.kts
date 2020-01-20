import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

plugins {
    id("kotlin2js") version "1.3.61"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

tasks.withType<Kotlin2JsCompile>().configureEach {
    kotlinOptions {
        freeCompilerArgs = freeCompilerArgs + "-Xallow-kotlin-package"
    }
}

group = "org.jetbrains.kotlinx"
version = "1.0"