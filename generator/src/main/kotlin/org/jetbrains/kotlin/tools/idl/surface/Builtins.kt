/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.surface

import org.jetbrains.kotlin.tools.idl.mapping.WasmTypeMapping

/** Type names that resolve without a Web IDL definition in the generated surface. */
object Builtins {
    /** Web IDL primitive and string types. */
    val PRIMITIVES: Set<String> = buildSet {
        addAll(setOf("undefined", "any", "object", "boolean", "bigint", "symbol"))
        addAll(WasmTypeMapping.STRING_TYPES)
        addAll(WasmTypeMapping.NUMERIC_TYPES.keys)
    }

    /**
     * ECMAScript built-ins that Web IDL references but never defines (`ArrayBuffer`, typed arrays, `DataView`), plus
     * the `webidl` buffer typedefs that are modelled by the same hand-written declarations (`BufferSource`,
     * `ArrayBufferView`). They are provided by the hand-written `org.khronos.webgl` sources.
     */
    val HAND_WRITTEN: Set<String> = WasmTypeMapping.BUFFER_TYPES.keys

    /** Names defined only in spec prose. `WindowProxy` is how HTML spells "the Window object" in IDL. */
    val ALIASES: Map<String, String> = mapOf("WindowProxy" to "Window")

    fun isBuiltin(name: String): Boolean = name in PRIMITIVES || name in HAND_WRITTEN || name in ALIASES
}
