plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
    maven("https://redirector.kotlinlang.org/maven/kotlin-dependencies")
}

dependencies {
    implementation("org.jetbrains.dukat:dukat:0.5.8-rc.6")
    // Gson rather than kotlinx.serialization: the dukat fat jar bundles an old, incompatible kotlinx.serialization.
    implementation("com.google.code.gson:gson:2.11.0")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
    systemProperty("kotlinx.browser.updateGolden", providers.gradleProperty("updateGolden").getOrElse("false"))
}

task("generateWebApi", JavaExec::class) {
    description = "Regenerates src/webMain/generated and surface-report.txt from the pinned Web IDL."
    mainClass = "org.jetbrains.kotlin.tools.idl.GenerateWebApiKt"
    classpath = sourceSets["main"].runtimeClasspath
    systemProperty("line.separator", "\n")
}

task("generateUtils", JavaExec::class) {
    mainClass.set("org.jetbrains.kotlin.generators.helpers.GenerateKt")
    classpath = sourceSets["main"].runtimeClasspath
    dependsOn("build")
}

task("dumpIdlIr", JavaExec::class) {
    description = "Renders the IR of the whole webref corpus back as Web IDL into build/idl-ir (debugging aid)."
    mainClass = "org.jetbrains.kotlin.tools.idl.DumpIdlIrKt"
    classpath = sourceSets["main"].runtimeClasspath
}
