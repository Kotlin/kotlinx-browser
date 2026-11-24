import com.github.gradle.node.task.NodeTask

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.node.gradle)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlinx.serialization.json)

    testImplementation(kotlin("test"))
}

val repositoryRoot = rootProject.layout.projectDirectory

node {
    download = true
    version = libs.versions.nodejs
    npmInstallCommand = "ci"
    nodeProjectDir = repositoryRoot
}

val webrefDir = layout.buildDirectory.dir("webref")
val idlIrDir = layout.buildDirectory.dir("idl-ir")

val prepareWebref by tasks.registering(NodeTask::class) {
    description =
        "Parses the pinned @webref/idl with webidl2 and writes it, @webref/events, @webref/css and BCD to build/webref."
    group = "generation"
    dependsOn(tasks.npmInstall)
    script = repositoryRoot.file("scripts/prepare-webref.js")

    args.add(webrefDir.map { it.asFile.path })

    inputs.file(
        repositoryRoot.file("package-lock.json")
    )
        .withPropertyName("packages")
        .withPathSensitivity(
            PathSensitivity.RELATIVE
        )

    outputs.dir(webrefDir)
}

val webref: Provider<Directory> = prepareWebref.map { webrefDir.get() }

val updateMdnSummaries by tasks.registering(NodeTask::class) {
    description = "Fetches the MDN summaries of the Web API pages into mdn/ (committed; MDN has no versioned release)."
    group = "generation"
    script = repositoryRoot.file("scripts/fetch-mdn.js")
    args.add(repositoryRoot.dir("mdn").asFile.path)
    outputs.files(repositoryRoot.file("mdn/summaries.json"), repositoryRoot.file("mdn/commit"))
    // Fetches the latest MDN metadata: never up to date.
    outputs.upToDateWhen { false }
}

val generateWebApi by tasks.registering(JavaExec::class) {
    mustRunAfter(updateMdnSummaries)
    description = "Regenerates src/webMain/generated and surface-report.txt from the pinned Web IDL."
    group = "generation"
    mainClass = "org.jetbrains.kotlin.tools.idl.GenerateWebApiKt"
    classpath = sourceSets["main"].runtimeClasspath
    webrefProperties()
    docsProperties()

    locationProperty(
        "kotlinx.browser.generatedSources",
        repositoryRoot.dir("src/webMain/generated")
    )

    locationProperty(
        "kotlinx.browser.surfaceReport",
        repositoryRoot.file("surface-report.txt")
    )
}

val generateUtils by tasks.registering(JavaExec::class) {
    description = "Regenerates the typed-array conversion helpers (arrayCopy*.kt) and their test."
    group = "generation"
    mainClass = "org.jetbrains.kotlin.generators.helpers.GenerateKt"
    classpath = sourceSets["main"].runtimeClasspath

    locationProperty("kotlinx.browser.repositoryRoot", repositoryRoot)
}

val dumpIdlIr by tasks.registering(JavaExec::class) {
    description = "Renders the IR of the whole webref corpus back as Web IDL into build/idl-ir."
    group = "generation"
    mainClass = "org.jetbrains.kotlin.tools.idl.DumpIdlIrKt"
    classpath = sourceSets["main"].runtimeClasspath
    webrefProperties()

    outputDirectoryArgument(idlIrDir)
}

val checkIrRoundTrip by tasks.registering(NodeTask::class) {
    description = "Checks that the IR is lossless: dumpIdlIr's output re-parses with webidl2 into the parsed corpus."
    group = "verification"
    dependsOn(tasks.npmInstall)
    script = repositoryRoot.file("scripts/check-ir-roundtrip.js")

    args.add(webref.map { it.file("webref-idl.json").asFile.path })
    args.add(idlIrDir.map { it.asFile.path })

    inputs.files(dumpIdlIr).withPropertyName("rendered").withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.files(prepareWebref).withPropertyName("webref").withPathSensitivity(PathSensitivity.RELATIVE)

    val marker = layout.buildDirectory.file("checkIrRoundTrip/passed")
    outputs.file(marker)

    doLast { marker.get().asFile.writeText("") }
}

tasks.check {
    dependsOn(checkIrRoundTrip)
}

tasks.test {
    mustRunAfter(updateMdnSummaries)
    useJUnitPlatform()
    webrefProperties()
    docsProperties()

    property("kotlinx.browser.generatedSources", repositoryRoot.dir("src/webMain/generated"))
    property("kotlinx.browser.surfaceReport", repositoryRoot.file("surface-report.txt"))
    property("kotlinx.browser.goldenDir", layout.projectDirectory.dir("src/test/resources/golden"))
    inputProperty("kotlinx.browser.updateGolden", providers.gradleProperty("updateGolden").orElse("false"))

    locationProperty("kotlinx.browser.repositoryRoot", repositoryRoot)

    inputs.files(
        repositoryRoot.file("src/webMain/kotlin/org/khronos/webgl/arrayCopy.kt"),
        repositoryRoot.file("src/jsMain/kotlin/org/khronos/webgl/arrayCopy.js.kt"),
        repositoryRoot.file("src/wasmJsMain/kotlin/org/khronos/webgl/arrayCopy.wasm.kt"),
        repositoryRoot.file("src/webTest/kotlin/arrayCopyTest.kt"),
    ).withPropertyName("arrayCopy").withPathSensitivity(PathSensitivity.RELATIVE)
}

fun <T> T.webrefProperties() where T : Task, T : JavaForkOptions {
    property("kotlinx.browser.webrefIdl", webref.map { it.file("webref-idl.json") })
    property("kotlinx.browser.webrefEvents", webref.map { it.file("webref-events.json") })
    property("kotlinx.browser.webrefCss", webref.map { it.file("webref-css.json") })
}

/** The KDoc inputs: BCD (MDN pages, deprecation) and the committed MDN summaries. */
fun <T> T.docsProperties() where T : Task, T : JavaForkOptions {
    property("kotlinx.browser.bcd", webref.map { it.file("bcd-api.json") })
    property("kotlinx.browser.mdnSummaries", repositoryRoot.file("mdn/summaries.json"))
}
