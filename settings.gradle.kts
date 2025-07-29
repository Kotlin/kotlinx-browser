pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    plugins {
        kotlin("multiplatform").version("2.2.20-Beta2")
    }
}

include(":generator")

rootProject.name = "kotlinx-browser"
