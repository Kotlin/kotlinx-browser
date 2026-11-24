import org.gradle.api.Task
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Input
import org.gradle.kotlin.dsl.newInstance
import org.gradle.process.CommandLineArgumentProvider
import org.gradle.process.JavaForkOptions

abstract class SystemPropertyValueProvider : CommandLineArgumentProvider {
    @get:Input
    abstract val value: Property<String>

    @get:Input
    abstract val property: Property<String>

    override fun asArguments(): Iterable<String> = listOf("-D${property.get()}=${value.get()}")
}

fun <T> T.inputProperty(name: String, value: Provider<String>) where T : JavaForkOptions, T : Task {
    jvmArgumentProviders += project.objects.newInstance<SystemPropertyValueProvider>().apply {
        this.value.set(value)
        property.set(name)
    }
}