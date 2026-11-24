import org.gradle.api.Task
import org.gradle.api.file.FileSystemLocation
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.kotlin.dsl.newInstance
import org.gradle.process.CommandLineArgumentProvider
import org.gradle.process.JavaForkOptions

/**
 * A path passed as a system property but not tracked: a location the task writes into, or resolves files against, that
 * is not an output Gradle may own. (Declaring `src/` as an output would make every compilation depend on the task.)
 */
abstract class SystemPropertyLocationProvider : CommandLineArgumentProvider {
    @get:Internal
    abstract val location: Property<FileSystemLocation>

    @get:Input
    abstract val property: Property<String>

    override fun asArguments(): Iterable<String> =
        listOf("-D${property.get()}=${location.get().asFile.absolutePath}")
}

fun <T> T.locationProperty(name: String, location: FileSystemLocation) where T : JavaForkOptions, T : Task {
    jvmArgumentProviders += project.objects.newInstance<SystemPropertyLocationProvider>().apply {
        this.location.set(location)
        property.set(name)
    }
}