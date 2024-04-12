import kotlinx.browser.window
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

fun declareWindow(): Unit = js("globalThis.window = { name: \"stub_window\"}")

class SmokeTest {
    @BeforeTest
    fun tearUp() {
        declareWindow()
    }

    @Test
    fun test() {
        assertEquals(window.name, "stub_window")
    }
}