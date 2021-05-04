plugins {
    kotlin("jvm")
}

repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
    maven("https://kotlin.bintray.com/dukat")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.json:json:20090211")
    implementation("org.jetbrains.dukat:dukat:0.5.8-rc.4")
    implementation("org.jsoup:jsoup:1.12.2")
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
