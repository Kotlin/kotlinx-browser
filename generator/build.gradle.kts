plugins {
    kotlin("jvm")
}

repositories {
    maven("https://kotlin.bintray.com/kotlin-bootstrap/")
    mavenCentral()
    maven("https://kotlin.bintray.com/dukat")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.json:json:20090211")
    implementation("org.jetbrains.dukat:dukat:0.0.26")
    implementation("org.jsoup:jsoup:1.8.2")
}

task("downloadIDL", JavaExec::class) {
    main = "org.jetbrains.kotlin.tools.dukat.DownloadKt"
    classpath = sourceSets["main"].runtimeClasspath
    dependsOn(":generator:build")
}

task("generateStdlibFromIDL", JavaExec::class) {
    main = "org.jetbrains.kotlin.tools.dukat.LaunchKt"
    classpath = sourceSets["main"].runtimeClasspath
    dependsOn(":generator:build")
    systemProperty("line.separator", "\n")
}
