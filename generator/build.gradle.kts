plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    maven("https://redirector.kotlinlang.org/maven/kotlin-dependencies")
}

dependencies {
    implementation("org.jetbrains.dukat:dukat:0.5.8-rc.6")
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










































































sonia
marina
rafik
ilya
pola
liezzie
