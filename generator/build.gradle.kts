plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.gson:gson:2.11.0")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
    systemProperty("kotlinx.browser.updateGolden", providers.gradleProperty("updateGolden").getOrElse("false"))
    // Read by the tests from the repository root (inputs, and committed outputs compared with fresh generation), so
    // an edit to any of them reruns the tests instead of leaving them up to date.
    val root = rootProject.layout.projectDirectory
    inputs.files(
        root.file("webref-idl.json"),
        root.file("webref-events.json"),
        root.file("webref-css.json"),
        root.file("surface-report.txt"),
        root.file("src/webMain/kotlin/arrayCopy.kt"),
        root.file("src/jsMain/kotlin/arrayCopy.js.kt"),
        root.file("src/wasmJsMain/kotlin/arrayCopy.wasm.kt"),
        root.file("src/webTest/kotlin/arrayCopyTest.kt"),
    ).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.dir(root.dir("src/webMain/generated")).withPathSensitivity(PathSensitivity.RELATIVE)
}

tasks.register("generateWebApi", JavaExec::class) {
    description = "Regenerates src/webMain/generated and surface-report.txt from the pinned Web IDL."
    mainClass = "org.jetbrains.kotlin.tools.idl.GenerateWebApiKt"
    classpath = sourceSets["main"].runtimeClasspath
    systemProperty("line.separator", "\n")
}

tasks.register("generateUtils", JavaExec::class) {
    description = "Regenerates the typed-array conversion helpers (arrayCopy*.kt) and their test."
    mainClass = "org.jetbrains.kotlin.generators.helpers.GenerateKt"
    classpath = sourceSets["main"].runtimeClasspath
}

tasks.register("dumpIdlIr", JavaExec::class) {
    description = "Renders the IR of the whole webref corpus back as Web IDL into build/idl-ir (debugging aid)."
    mainClass = "org.jetbrains.kotlin.tools.idl.DumpIdlIrKt"
    classpath = sourceSets["main"].runtimeClasspath
}
