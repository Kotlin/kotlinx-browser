/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl

import org.jetbrains.kotlin.tools.idl.ir.*
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * The golden slice: a fixed set of definitions picked from the pinned corpus because together they exercise every
 * hard construct (not because they are representative in volume). Its IR is pinned as Web IDL text in
 * `golden/golden-slice.idl`; later steps add expected-lowered-IR and expected-Kotlin goldens for the same slice.
 */
class GoldenSliceTest {

    @Test
    fun goldenSliceIr() {
        val ir = loadAllowlistedIdl()
        val slice = ir.slice(GOLDEN_SLICE)

        val found = slice.definitions.filterIsInstance<IdlNamedDefinition>().map { it.name }.toSet()
        assertEquals(emptySet(), GOLDEN_SLICE - found, "golden slice names missing from the corpus")

        Golden.assertMatches("golden-slice.idl", slice.render())
    }

    companion object {
        val GOLDEN_SLICE: Set<String> = linkedSetOf(
            // deep hierarchy, [SameObject], constants, partials across specs
            "Node", "Element", "Document",
            // mixins and `includes`
            "ParentNode", "NonElementParentNode",
            // partial interfaces across specs, [LegacyNullToEmptyString], [ReflectRange=(0, 8)]
            "HTMLElement",
            // EventHandler typedef, nullable callbacks
            "GlobalEventHandlers", "EventHandler", "EventHandlerNonNull", "OnErrorEventHandler", "OnErrorEventHandlerNonNull",
            // dictionary inheritance, optional members with defaults
            "MouseEventInit", "EventModifierInit", "UIEventInit", "EventInit",
            // wide unions, overload explosion
            "CanvasRenderingContext2D", "CanvasDrawImage", "CanvasImageSource",
            // iterable<>, record<>
            "Headers", "HeadersInit", "FormData",
            // IDL enums (ReferrerPolicy lives in the non-allowlisted referrer-policy spec)
            "RequestMode", "RequestCredentials",
            // fetch: Promise<T>, BodyInit union, partial mixin
            "WindowOrWorkerGlobalScope", "BodyInit", "XMLHttpRequestBodyInit", "RequestInfo", "RequestInit",
            // typed arrays, BufferSource, long long
            "WebGLRenderingContext", "WebGLRenderingContextOverloads", "Float32List", "GLintptr", "GLsizeiptr",
            // [Reflect="rel"], [PutForwards]
            "HTMLAnchorElement",
            // [ReflectRange=(1, 1000)], [ReflectDefault=1]
            "HTMLTableCellElement",
            // length + getter item(unsigned long): ItemArrayLike<Node>
            "NodeList",
            // [LegacyFactoryFunction=Image(...)]
            "HTMLImageElement",
            // [Exposed=*], constructor()
            "Event", "EventTarget",
            // callback interface
            "EventListener",
            // anonymous getter/setter/deleter
            "DOMStringMap",
            // setlike
            "CustomStateSet",
            // namespace
            "CSS",
            // bigint
            "ClipboardChangeEvent",
            // ObservableArray
            "DocumentOrShadowRoot",
            // static operation, unsigned long long with [EnforceRange]
            "AbortSignal",
        )

        /** Every definition with one of [names] (including partials), plus `includes` statements targeting them. */
        fun IdlIR.slice(names: Set<String>): IdlIR = IdlIR(
            specs.map { spec ->
                spec.copy(definitions = spec.definitions.filter {
                    when (it) {
                        is IdlNamedDefinition -> it.name in names
                        is IdlIncludes -> it.target in names
                    }
                })
            }.filter { it.definitions.isNotEmpty() }
        )
    }
}
