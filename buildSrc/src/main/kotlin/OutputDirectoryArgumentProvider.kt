import org.gradle.api.file.Directory
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.JavaExec
import org.gradle.api.tasks.OutputDirectory
import org.gradle.kotlin.dsl.newInstance
import org.gradle.process.CommandLineArgumentProvider

abstract class OutputDirectoryArgumentProvider : CommandLineArgumentProvider {
    @get:OutputDirectory
    abstract val directory: DirectoryProperty

    override fun asArguments(): Iterable<String> = listOf(directory.get().asFile.absolutePath)
}

fun JavaExec.outputDirectoryArgument(directory: Provider<Directory>) {
    argumentProviders += project.objects.newInstance<OutputDirectoryArgumentProvider>().apply {
        this.directory.set(directory)
    }
}