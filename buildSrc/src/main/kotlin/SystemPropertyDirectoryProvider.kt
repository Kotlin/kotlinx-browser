import org.gradle.api.Task
import org.gradle.api.file.Directory
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.kotlin.dsl.newInstance
import org.gradle.process.CommandLineArgumentProvider
import org.gradle.process.JavaForkOptions

abstract class SystemPropertyDirectoryProvider : CommandLineArgumentProvider {
    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val directory: DirectoryProperty

    @get:Input
    abstract val property: Property<String>

    override fun asArguments(): Iterable<String> =
        listOf("-D${property.get()}=${directory.get().asFile.absolutePath}")
}

fun <T> T.property(name: String, directory: Directory) where T : JavaForkOptions, T : Task {
    jvmArgumentProviders += project.objects.newInstance<SystemPropertyDirectoryProvider>().apply {
        this.directory.set(directory)
        property.set(name)
    }
}