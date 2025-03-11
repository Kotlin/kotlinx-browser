/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.dom.pointerevents

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.undefined

public external interface PointerEventInit : MouseEventInit, JsAny {
    var pointerId: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    var width: Double? /* = 1.0 */
        get() = definedExternally
        set(value) = definedExternally
    var height: Double? /* = 1.0 */
        get() = definedExternally
        set(value) = definedExternally
    var pressure: Float? /* = 0f */
        get() = definedExternally
        set(value) = definedExternally
    var tangentialPressure: Float? /* = 0f */
        get() = definedExternally
        set(value) = definedExternally
    var tiltX: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    var tiltY: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    var twist: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    var pointerType: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var isPrimary: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public fun PointerEventInit(pointerId: Int? = 0, width: Double? = 1.0, height: Double? = 1.0, pressure: Float? = 0f, tangentialPressure: Float? = 0f, tiltX: Int? = 0, tiltY: Int? = 0, twist: Int? = 0, pointerType: String? = "", isPrimary: Boolean? = false, screenX: Int? = 0, screenY: Int? = 0, clientX: Int? = 0, clientY: Int? = 0, button: Short? = 0, buttons: Short? = 0, relatedTarget: EventTarget? = null, region: String? = null, ctrlKey: Boolean? = false, shiftKey: Boolean? = false, altKey: Boolean? = false, metaKey: Boolean? = false, modifierAltGraph: Boolean? = false, modifierCapsLock: Boolean? = false, modifierFn: Boolean? = false, modifierFnLock: Boolean? = false, modifierHyper: Boolean? = false, modifierNumLock: Boolean? = false, modifierScrollLock: Boolean? = false, modifierSuper: Boolean? = false, modifierSymbol: Boolean? = false, modifierSymbolLock: Boolean? = false, view: Window? = null, detail: Int? = 0, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): PointerEventInit = js("({ pointerId: pointerId, width: width, height: height, pressure: pressure, tangentialPressure: tangentialPressure, tiltX: tiltX, tiltY: tiltY, twist: twist, pointerType: pointerType, isPrimary: isPrimary, screenX: screenX, screenY: screenY, clientX: clientX, clientY: clientY, button: button, buttons: buttons, relatedTarget: relatedTarget, region: region, ctrlKey: ctrlKey, shiftKey: shiftKey, altKey: altKey, metaKey: metaKey, modifierAltGraph: modifierAltGraph, modifierCapsLock: modifierCapsLock, modifierFn: modifierFn, modifierFnLock: modifierFnLock, modifierHyper: modifierHyper, modifierNumLock: modifierNumLock, modifierScrollLock: modifierScrollLock, modifierSuper: modifierSuper, modifierSymbol: modifierSymbol, modifierSymbolLock: modifierSymbolLock, view: view, detail: detail, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [PointerEvent](https://developer.mozilla.org/en/docs/Web/API/PointerEvent) to Kotlin
 */
public external open class PointerEvent(type: String, eventInitDict: PointerEventInit = definedExternally) : MouseEvent, JsAny {
    open val pointerId: Int
    open val width: Double
    open val height: Double
    open val pressure: Float
    open val tangentialPressure: Float
    open val tiltX: Int
    open val tiltY: Int
    open val twist: Int
    open val pointerType: String
    open val isPrimary: Boolean

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}