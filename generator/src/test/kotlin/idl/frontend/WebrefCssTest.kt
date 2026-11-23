/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.frontend

import org.jetbrains.kotlin.tools.idl.ir.IdlAttribute
import org.jetbrains.kotlin.tools.idl.ir.IdlInterface
import org.jetbrains.kotlin.tools.idl.loadCssProperties
import org.jetbrains.kotlin.tools.idl.loadSurface
import org.jetbrains.kotlin.tools.idl.lowering.lower
import org.jetbrains.kotlin.tools.idl.loadEvents
import kotlin.test.*

class WebrefCssTest {

    @Test
    fun readsProperties() {
        val properties = WebrefCss.fromString(
            """
            [
              {"name": "-webkit-align-content", "legacyAliasOf": "align-content",
               "styleDeclaration": ["-webkit-align-content", "WebkitAlignContent", "webkitAlignContent"]},
              {"name": "align-content", "styleDeclaration": ["align-content", "alignContent"]},
              {"name": "color", "styleDeclaration": ["color"]}
            ]
            """
        )
        assertEquals(
            listOf(
                WebrefCssProperty("-webkit-align-content", listOf("-webkit-align-content", "WebkitAlignContent", "webkitAlignContent"), "align-content"),
                WebrefCssProperty("align-content", listOf("align-content", "alignContent")),
                WebrefCssProperty("color", listOf("color")),
            ),
            properties,
        )
        assertEquals(listOf("alignContent", "color"), cssPropertiesPartial(properties).members.map { (it as IdlAttribute).name })
    }

    @Test
    fun ambiguousCamelCasedNameFails() {
        val e = assertFailsWith<IllegalArgumentException> {
            cssPropertiesPartial(listOf(WebrefCssProperty("x", listOf("x", "xY"))))
        }
        assertEquals("CSS property 'x': expected one camel-cased attribute, got [x, xY]", e.message)
    }

    /** The pinned `@webref/css`: the attributes are shaped exactly like the one CSSOM writes in IDL, `cssFloat`. */
    @Test
    fun pinnedProperties() {
        val properties = loadCssProperties()
        assertEquals(822, properties.size)
        assertEquals(64, properties.count { it.legacyAliasOf != null })

        val styleProperties = loadSurface().ir.lower(loadEvents()).ir.definitions
            .filterIsInstance<IdlInterface>()
            .single { it.name == "CSSStyleProperties" }
        val attributes = styleProperties.members.filterIsInstance<IdlAttribute>().associateBy { it.name }
        assertEquals(1 + 758 + 5, attributes.size, "cssFloat, one per standard property, the unprefixed aliases")
        val cssFloat = attributes.getValue("cssFloat")
        for (name in listOf("color", "alignContent", "float", "backgroundColor", "gridTemplateColumns")) {
            assertEquals(cssFloat.copy(name = name), attributes[name])
        }
        assertNull(attributes["webkitAlignContent"], "vendor-prefixed legacy alias")
        assertEquals(cssFloat.copy(name = "wordWrap"), attributes["wordWrap"], "unprefixed legacy alias")
    }
}
