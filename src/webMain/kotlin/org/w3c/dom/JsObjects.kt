/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.w3c.dom

import kotlin.js.JsAny

// Helpers for generated declarations. On Wasm, the declared types of a `js()` function decide the conversion at the
// boundary (a `String` is copied, an `Int` becomes a number, an external type is passed as is), so there is one
// helper per key and value kind rather than a single untyped one.

/** A new empty JavaScript object (`{}`); the generated dictionary factories fill it with the members passed. */
internal fun <T : JsAny> newJsObject(): T = js("({})")

/** `obj[key]`, for the generated `operator get` of an indexed getter returning an external type. */
internal fun <T : JsAny?> getProperty(obj: JsAny, key: Int): T = js("obj[key]")

/** `obj[key]`, for the generated `operator get` of a named getter returning an external type. */
internal fun <T : JsAny?> getProperty(obj: JsAny, key: String): T = js("obj[key]")

/** `obj[key]`, for the generated `operator get` of an indexed getter returning a string. */
internal fun getStringProperty(obj: JsAny, key: Int): String? = js("obj[key]")

/** `obj[key]`, for the generated `operator get` of a named getter returning a string. */
internal fun getStringProperty(obj: JsAny, key: String): String? = js("obj[key]")

/** `obj[key] = value`, for the generated `operator set` of an indexed setter taking an external type. */
internal fun setProperty(obj: JsAny, key: Int, value: JsAny?) { js("obj[key] = value;") }

/** `obj[key] = value`, for the generated `operator set` of a named setter taking an external type. */
internal fun setProperty(obj: JsAny, key: String, value: JsAny?) { js("obj[key] = value;") }

/** `obj[key] = value`, for the generated `operator set` of an indexed setter taking a string. */
internal fun setStringProperty(obj: JsAny, key: Int, value: String) { js("obj[key] = value;") }

/** `obj[key] = value`, for the generated `operator set` of a named setter taking a string. */
internal fun setStringProperty(obj: JsAny, key: String, value: String) { js("obj[key] = value;") }
