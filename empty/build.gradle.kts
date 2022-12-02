plugins {
    kotlin("js")
}

repositories {
    mavenCentral()
}

kotlin {
    js {
        nodejs()
    }
}
