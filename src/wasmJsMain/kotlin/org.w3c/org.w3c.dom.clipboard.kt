/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE", "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION", "JS_NAME_CLASH", "EXPECT_ACTUAL_IR_INCOMPATIBILITY", "EXPECT_ACTUAL_IR_MISMATCH", "AMBIGUOUS_ACTUALS", "WRONG_JS_INTEROP_TYPE")
package org.w3c.dom.clipboard

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.undefined

public actual external interface ClipboardEventInit : EventInit, JsAny {
    actual var clipboardData: DataTransfer? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ClipboardEventInit(clipboardData: DataTransfer?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): ClipboardEventInit = js("({ clipboardData: clipboardData, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [ClipboardEvent](https://developer.mozilla.org/en/docs/Web/API/ClipboardEvent) to Kotlin
 */
public actual external open class ClipboardEvent actual constructor(type: String, eventInitDict: ClipboardEventInit) : Event, JsAny {
    actual open val clipboardData: DataTransfer?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

/**
 * Exposes the JavaScript [Clipboard](https://developer.mozilla.org/en/docs/Web/API/Clipboard) to Kotlin
 */
public actual external abstract class Clipboard : EventTarget, JsAny {
    actual fun read(): Promise<DataTransfer>
    actual fun readText(): Promise<JsString>
    actual fun write(data: DataTransfer): Promise<Nothing?>
    actual fun writeText(data: String): Promise<Nothing?>
}

public actual external interface ClipboardPermissionDescriptor : JsAny {
    actual var allowWithoutGesture: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ClipboardPermissionDescriptor(allowWithoutGesture: Boolean?): ClipboardPermissionDescriptor = js("({ allowWithoutGesture: allowWithoutGesture })")