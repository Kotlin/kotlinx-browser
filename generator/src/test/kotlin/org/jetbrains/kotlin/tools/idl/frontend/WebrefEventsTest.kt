/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.frontend

import kotlinx.serialization.SerializationException
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class WebrefEventsTest {

    @Test
    fun readsEventsAndSkipsWhatTheGeneratorDoesNotUse() {
        val events = WebrefEvents.fromString(
            """
            [
              {"type": "click", "interface": "PointerEvent", "href": "https://example.org/#click",
               "src": {"format": "summary table"},
               "targets": [{"target": "Element", "bubblingPath": ["Document", "Window"]}, {"target": "Window"}]},
              {"type": "load", "interface": "Event"}
            ]
            """
        )
        assertEquals(
            listOf(
                WebrefEvent(
                    type = "click",
                    eventInterface = "PointerEvent",
                    targets = listOf(WebrefEventTarget("Element", listOf("Document", "Window")), WebrefEventTarget("Window")),
                    href = "https://example.org/#click",
                ),
                WebrefEvent(type = "load", eventInterface = "Event", targets = emptyList()),
            ),
            events,
        )
    }

    @Test
    fun eventWithoutInterfaceFails() {
        assertFailsWith<SerializationException> { WebrefEvents.fromString("""[{"type": "click"}]""") }
    }
}
