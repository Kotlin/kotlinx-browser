/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE", "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION", "JS_NAME_CLASH", "EXPECT_ACTUAL_IR_INCOMPATIBILITY", "EXPECT_ACTUAL_IR_MISMATCH", "AMBIGUOUS_ACTUALS", "WRONG_JS_INTEROP_TYPE")
package org.w3c.dom.pointerevents

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.undefined

public actual external interface PointerEventInit : MouseEventInit, JsAny {
    actual var pointerId: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var width: Double? /* = 1.0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var height: Double? /* = 1.0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var pressure: Float? /* = 0f */
        get() = definedExternally
        set(value) = definedExternally
    actual var tangentialPressure: Float? /* = 0f */
        get() = definedExternally
        set(value) = definedExternally
    actual var tiltX: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var tiltY: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var twist: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var pointerType: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var isPrimary: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun PointerEventInit(pointerId: Int?, width: Double?, height: Double?, pressure: Float?, tangentialPressure: Float?, tiltX: Int?, tiltY: Int?, twist: Int?, pointerType: String?, isPrimary: Boolean?, screenX: Int?, screenY: Int?, clientX: Int?, clientY: Int?, button: Short?, buttons: Short?, relatedTarget: EventTarget?, region: String?, ctrlKey: Boolean?, shiftKey: Boolean?, altKey: Boolean?, metaKey: Boolean?, modifierAltGraph: Boolean?, modifierCapsLock: Boolean?, modifierFn: Boolean?, modifierFnLock: Boolean?, modifierHyper: Boolean?, modifierNumLock: Boolean?, modifierScrollLock: Boolean?, modifierSuper: Boolean?, modifierSymbol: Boolean?, modifierSymbolLock: Boolean?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): PointerEventInit = js("({ pointerId: pointerId, width: width, height: height, pressure: pressure, tangentialPressure: tangentialPressure, tiltX: tiltX, tiltY: tiltY, twist: twist, pointerType: pointerType, isPrimary: isPrimary, screenX: screenX, screenY: screenY, clientX: clientX, clientY: clientY, button: button, buttons: buttons, relatedTarget: relatedTarget, region: region, ctrlKey: ctrlKey, shiftKey: shiftKey, altKey: altKey, metaKey: metaKey, modifierAltGraph: modifierAltGraph, modifierCapsLock: modifierCapsLock, modifierFn: modifierFn, modifierFnLock: modifierFnLock, modifierHyper: modifierHyper, modifierNumLock: modifierNumLock, modifierScrollLock: modifierScrollLock, modifierSuper: modifierSuper, modifierSymbol: modifierSymbol, modifierSymbolLock: modifierSymbolLock, view: view, detail: detail, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [PointerEvent](https://developer.mozilla.org/en/docs/Web/API/PointerEvent) to Kotlin
 */
public actual external open class PointerEvent actual constructor(type: String, eventInitDict: PointerEventInit) : MouseEvent, JsAny {
    actual open val pointerId: Int
    actual open val width: Double
    actual open val height: Double
    actual open val pressure: Float
    actual open val tangentialPressure: Float
    actual open val tiltX: Int
    actual open val tiltY: Int
    actual open val twist: Int
    actual open val pointerType: String
    actual open val isPrimary: Boolean

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}