plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-dependencies")
}

dependencies {
    implementation("org.jetbrains.dukat:dukat:0.5.8-rc.5")
    implementation("org.jsoup:jsoup:1.14.2")
}

task("downloadIDL", JavaExec::class) {
    mainClass = "org.jetbrains.kotlin.tools.dukat.DownloadKt"
    classpath = sourceSets["main"].runtimeClasspath
    dependsOn("build")
}

task("generateStdlibFromIDL", JavaExec::class) {
    mainClass = "org.jetbrains.kotlin.tools.dukat.LaunchBrowserKt"
    classpath = sourceSets["main"].runtimeClasspath
    dependsOn("build")
    systemProperty("line.separator", "\n")
}

task("generateUtils", JavaExec::class) {
    mainClass.set("org.jetbrains.kotlin.generators.helpers.GenerateKt")
    classpath = sourceSets["main"].runtimeClasspath
    dependsOn("build")
}
