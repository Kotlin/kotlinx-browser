import org.gradle.api.Task
import org.gradle.api.file.RegularFile
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.kotlin.dsl.newInstance
import org.gradle.process.CommandLineArgumentProvider
import org.gradle.process.JavaForkOptions

abstract class SystemPropertyFileProvider : CommandLineArgumentProvider {
    @get:InputFile
    @get:PathSensitive(PathSensitivity.NONE)
    abstract val file: RegularFileProperty

    @get:Input
    abstract val property: Property<String>

    override fun asArguments(): Iterable<String> {
        return listOf(
            "-D${property.get()}=${file.get().asFile.absolutePath}"
        )
    }
}

fun <T> T.property(name: String, file: Provider<RegularFile>) where T : JavaForkOptions, T : Task {
    jvmArgumentProviders += project.objects.newInstance<SystemPropertyFileProvider>().apply {
        this.file.set(file)
        property.set(name)
    }
}

fun <T> T.property(name: String, file: RegularFile) where T : JavaForkOptions, T : Task {
    jvmArgumentProviders += project.objects.newInstance<SystemPropertyFileProvider>().apply {
        this.file.set(file)
        property.set(name)
    }
}