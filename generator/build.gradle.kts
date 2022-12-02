plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-dependencies")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.json:json:20090211")
    implementation("org.jetbrains.dukat:dukat:0.5.8-rc.5")
    implementation("org.jsoup:jsoup:1.12.1")
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
