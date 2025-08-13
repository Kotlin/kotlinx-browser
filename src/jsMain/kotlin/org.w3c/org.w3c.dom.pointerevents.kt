/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
package org.w3c.dom.pointerevents

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*

actual external interface PointerEventInit : MouseEventInit {
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

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun PointerEventInit(pointerId: Int?, width: Double?, height: Double?, pressure: Float?, tangentialPressure: Float?, tiltX: Int?, tiltY: Int?, twist: Int?, pointerType: String?, isPrimary: Boolean?, screenX: Int?, screenY: Int?, clientX: Int?, clientY: Int?, button: Short?, buttons: Short?, relatedTarget: EventTarget?, region: String?, ctrlKey: Boolean?, shiftKey: Boolean?, altKey: Boolean?, metaKey: Boolean?, modifierAltGraph: Boolean?, modifierCapsLock: Boolean?, modifierFn: Boolean?, modifierFnLock: Boolean?, modifierHyper: Boolean?, modifierNumLock: Boolean?, modifierScrollLock: Boolean?, modifierSuper: Boolean?, modifierSymbol: Boolean?, modifierSymbolLock: Boolean?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): PointerEventInit {
    val o = js("({})")
    o["pointerId"] = pointerId
    o["width"] = width
    o["height"] = height
    o["pressure"] = pressure
    o["tangentialPressure"] = tangentialPressure
    o["tiltX"] = tiltX
    o["tiltY"] = tiltY
    o["twist"] = twist
    o["pointerType"] = pointerType
    o["isPrimary"] = isPrimary
    o["screenX"] = screenX
    o["screenY"] = screenY
    o["clientX"] = clientX
    o["clientY"] = clientY
    o["button"] = button
    o["buttons"] = buttons
    o["relatedTarget"] = relatedTarget
    o["region"] = region
    o["ctrlKey"] = ctrlKey
    o["shiftKey"] = shiftKey
    o["altKey"] = altKey
    o["metaKey"] = metaKey
    o["modifierAltGraph"] = modifierAltGraph
    o["modifierCapsLock"] = modifierCapsLock
    o["modifierFn"] = modifierFn
    o["modifierFnLock"] = modifierFnLock
    o["modifierHyper"] = modifierHyper
    o["modifierNumLock"] = modifierNumLock
    o["modifierScrollLock"] = modifierScrollLock
    o["modifierSuper"] = modifierSuper
    o["modifierSymbol"] = modifierSymbol
    o["modifierSymbolLock"] = modifierSymbolLock
    o["view"] = view
    o["detail"] = detail
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as PointerEventInit
}

/**
 * Exposes the JavaScript [PointerEvent](https://developer.mozilla.org/en/docs/Web/API/PointerEvent) to Kotlin
 */
actual external open class PointerEvent actual constructor(type: String, eventInitDict: PointerEventInit) : MouseEvent {
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