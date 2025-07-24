pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    plugins {
        kotlin("multiplatform").version("2.2.0")
    }
}

include(":generator")

rootProject.name = "kotlinx-browser"
