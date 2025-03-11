pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    plugins {
        kotlin("multiplatform").version("2.1.10")
    }
}

include(":generator")

rootProject.name = "kotlinx-browser"
