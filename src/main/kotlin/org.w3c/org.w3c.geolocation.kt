/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.geolocation

import kotlin.js.*
import org.khronos.webgl.*

public external interface Geolocation {
    fun getCurrentPosition(successCallback: (Position) -> Unit, errorCallback: (PositionError) -> Unit = definedExternally, options: PositionOptions = definedExternally)
    fun watchPosition(successCallback: (Position) -> Unit, errorCallback: (PositionError) -> Unit = definedExternally, options: PositionOptions = definedExternally): Int
    fun clearWatch(watchId: Int)
}

public external interface PositionOptions {
    var enableHighAccuracy: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var timeout: Int? /* = definedExternally */
        get() = definedExternally
        set(value) = definedExternally
    var maximumAge: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun PositionOptions(enableHighAccuracy: Boolean? = false, timeout: Int? = definedExternally, maximumAge: Int? = 0): PositionOptions {
    val o = js("({})")
    o["enableHighAccuracy"] = enableHighAccuracy
    o["timeout"] = timeout
    o["maximumAge"] = maximumAge
    return o
}

public external interface Position {
    val coords: Coordinates
    val timestamp: Number
}

public external interface Coordinates {
    val latitude: Double
    val longitude: Double
    val altitude: Double?
        get() = definedExternally
    val accuracy: Double
    val altitudeAccuracy: Double?
        get() = definedExternally
    val heading: Double?
        get() = definedExternally
    val speed: Double?
        get() = definedExternally
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface PositionError {
    val code: Short
    val message: String

    companion object {
        val PERMISSION_DENIED: Short
        val POSITION_UNAVAILABLE: Short
        val TIMEOUT: Short
    }
}