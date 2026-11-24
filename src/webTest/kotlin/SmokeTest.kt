import kotlinx.browser.window
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

// A stub on Node, which has no `window`; a browser's own is read-only.
fun declareWindow() {
    js("if (typeof window === 'undefined') globalThis.window = {};")
}

class SmokeTest {
    @BeforeTest
    fun tearUp() {
        declareWindow()
        window.name = "stub_window"
    }

    @Test
    fun test() {
        assertEquals("stub_window", window.name)
    }
}