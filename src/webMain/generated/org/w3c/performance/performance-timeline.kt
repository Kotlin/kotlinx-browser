/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'performance-timeline', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.performance

import kotlin.js.*
import org.w3c.dom.*

public external abstract class PerformanceEntry : JsAny {
    open val id: Double
    open val name: String
    open val entryType: String
    open val startTime: Double
    open val duration: Double
    open val navigationId: Double
    open fun toJSON(): JsAny
}

public external open class PerformanceObserver : JsAny {
    constructor(callback: (PerformanceObserverEntryList, PerformanceObserver, PerformanceObserverCallbackOptions) -> Unit)
    open fun observe(options: PerformanceObserverInit = definedExternally)
    open fun disconnect()
    open fun takeRecords(): JsArray<PerformanceEntry>

    companion object {
        val supportedEntryTypes: JsArray<JsString>
    }
}

public external interface PerformanceObserverCallbackOptions : JsAny {
    var droppedEntriesCount: Double?
}

public fun PerformanceObserverCallbackOptions(droppedEntriesCount: Double? = null): PerformanceObserverCallbackOptions = newJsObject<PerformanceObserverCallbackOptions>().apply {
    if (droppedEntriesCount != null) this.droppedEntriesCount = droppedEntriesCount
}

public external interface PerformanceObserverInit : JsAny {
    var entryTypes: JsArray<JsString>?
    var type: String?
    var buffered: Boolean?
}

public fun PerformanceObserverInit(entryTypes: JsArray<JsString>? = null, type: String? = null, buffered: Boolean? = null): PerformanceObserverInit = newJsObject<PerformanceObserverInit>().apply {
    if (entryTypes != null) this.entryTypes = entryTypes
    if (type != null) this.type = type
    if (buffered != null) this.buffered = buffered
}

public external abstract class PerformanceObserverEntryList : JsAny {
    open fun getEntries(): JsArray<PerformanceEntry>
    open fun getEntriesByType(type: String): JsArray<PerformanceEntry>
    open fun getEntriesByName(name: String, type: String = definedExternally): JsArray<PerformanceEntry>
}
