pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    plugins {
        kotlin("multiplatform").version("2.1.20")
    }
}

include(":generator")

rootProject.name = "kotlinx-browser"
