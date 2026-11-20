/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.w3c.dom

import kotlin.js.JsAny

/** A new empty JavaScript object (`{}`); the generated dictionary factories fill it with the members passed. */
internal fun <T : JsAny> newJsObject(): T = js("({})")
