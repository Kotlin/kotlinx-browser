pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    plugins {
        kotlin("multiplatform").version("1.9.23")
    }
}

include(":generator")

rootProject.name = "kotlinx-browser"
