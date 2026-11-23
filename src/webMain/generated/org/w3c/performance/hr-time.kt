/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'hr-time', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.performance

import kotlin.js.*
import org.w3c.dom.*

public external abstract class Performance : EventTarget {
    open fun now(): Double
    open val timeOrigin: Double
    open fun toJSON(): JsAny
    open val timing: PerformanceTiming
    open val navigation: PerformanceNavigation
    open fun getEntries(): JsArray<PerformanceEntry>
    open fun getEntriesByType(type: String): JsArray<PerformanceEntry>
    open fun getEntriesByName(name: String, type: String = definedExternally): JsArray<PerformanceEntry>
    open fun clearResourceTimings()
    open fun setResourceTimingBufferSize(maxSize: Int)
    open var onresourcetimingbufferfull: ((Event) -> Unit)?
}
