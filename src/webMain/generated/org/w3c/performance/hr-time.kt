/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'hr-time', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.performance

import kotlin.js.*
import org.w3c.dom.*

/**
 * The Performance interface provides access to performance-related information for the current page.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance)
 */
public abstract external class Performance : EventTarget {
    /**
     * The performance.now() method returns a high resolution timestamp in milliseconds. It represents the time elapsed
     * since Performance.timeOrigin (the time when navigation has started in window contexts, or the time when the
     * worker is run in Worker and ServiceWorker contexts).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/now)
     */
    public open fun now(): Double

    /**
     * The timeOrigin read-only property of the Performance interface returns the high resolution timestamp that is used
     * as the baseline for performance-related timestamps.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/timeOrigin)
     */
    public open val timeOrigin: Double

    /**
     * The toJSON() method of the Performance interface returns a JSON-serializable plain object representing the
     * Performance object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/toJSON)
     */
    public open fun toJSON(): JsAny

    /**
     * The legacy Performance.timing read-only property returns a PerformanceTiming object containing latency-related
     * performance information.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/timing)
     */
    public open val timing: PerformanceTiming

    /**
     * The legacy Performance.navigation read-only property returns a PerformanceNavigation object representing the type
     * of navigation that occurs in the given browsing context, such as the number of redirections needed to fetch the
     * resource.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/navigation)
     */
    public open val navigation: PerformanceNavigation

    /**
     * The getEntries() method returns an array of all PerformanceEntry objects currently present in the performance
     * timeline.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/getEntries)
     */
    public open fun getEntries(): JsArray<PerformanceEntry>

    /**
     * The getEntriesByType() method returns an array of PerformanceEntry objects currently present in the performance
     * timeline for a given type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/getEntriesByType)
     */
    public open fun getEntriesByType(type: String): JsArray<PerformanceEntry>

    /**
     * The getEntriesByName() method returns an array of PerformanceEntry objects currently present in the performance
     * timeline with the given name and type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/getEntriesByName)
     */
    public open fun getEntriesByName(name: String, type: String = definedExternally): JsArray<PerformanceEntry>

    /**
     * The clearResourceTimings() method removes all performance entries with an entryType of "resource" from the
     * browser's performance timeline and sets the size of the performance resource data buffer to zero.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/clearResourceTimings)
     */
    public open fun clearResourceTimings()

    /**
     * The setResourceTimingBufferSize() method sets the desired size of the browser's resource timing buffer which
     * stores the "resource" performance entries.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/setResourceTimingBufferSize)
     */
    public open fun setResourceTimingBufferSize(maxSize: Int)

    /**
     * The resourcetimingbufferfull event is fired when the browser's resource timing buffer is full.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/resourcetimingbufferfull_event)
     */
    public open var onresourcetimingbufferfull: ((Event) -> Unit)?
}
