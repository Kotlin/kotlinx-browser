/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'performance-timeline', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.performance

import kotlin.js.*
import org.w3c.dom.*

/**
 * The PerformanceEntry object encapsulates a single performance metric that is part of the browser's performance
 * timeline.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class PerformanceEntry : JsAny {
    public open val id: Double

    /**
     * The read-only name property of the PerformanceEntry interface is a string representing the name for a performance
     * entry. It acts as an identifier, but it does not have to be unique. The value depends on the subclass.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/name)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val name: String

    /**
     * The read-only entryType property returns a string representing the type of performance metric that this entry
     * represents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/entryType)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val entryType: String

    /**
     * The read-only startTime property returns the first timestamp recorded for this PerformanceEntry. The meaning of
     * this property depends on the value of this entry's entryType.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/startTime)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val startTime: Double

    /**
     * The read-only duration property returns a timestamp that is the duration of the performance entry. The meaning of
     * this property depends on the value of this entry's entryType.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/duration)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val duration: Double

    /**
     * The navigationId read-only property of the PerformanceEntry interface returns the ID of the navigation that this
     * paint happened under.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/navigationId)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val navigationId: Double

    /**
     * The toJSON() method of the PerformanceEntry interface returns a JSON-serializable plain object representing the
     * PerformanceEntry object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceEntry/toJSON)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun toJSON(): JsAny
}

/**
 * The PerformanceObserver interface is used to observe performance measurement events and be notified of new
 * performance entries as they are recorded in the browser's performance timeline.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class PerformanceObserver : JsAny {
    /**
     * The PerformanceObserver() constructor creates a new PerformanceObserver object with the given observer callback.
     * The observer callback is invoked when performance entry events are recorded for the entry types that have been
     * registered, via the observe() method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/PerformanceObserver)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(callback: (PerformanceObserverEntryList, PerformanceObserver, PerformanceObserverCallbackOptions) -> Unit)

    /**
     * The observe() method of the PerformanceObserver interface is used to specify the set of performance entry types
     * to observe.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/observe)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun observe(options: PerformanceObserverInit = definedExternally)

    /**
     * The disconnect() method of the PerformanceObserver interface is used to stop the performance observer from
     * receiving any performance entry events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/disconnect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun disconnect()

    /**
     * The takeRecords() method of the PerformanceObserver interface returns the current list of PerformanceEntry
     * objects stored in the performance observer, emptying it out.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/takeRecords)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun takeRecords(): JsArray<PerformanceEntry>

    public companion object {
        /**
         * The static supportedEntryTypes read-only property of the PerformanceObserver interface returns an array of
         * the entryType values supported by the user agent.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/supportedEntryTypes_static)
         *
         * © Mozilla Contributors, licensed under CC BY-SA 2.5
         */
        public val supportedEntryTypes: JsArray<JsString>
    }
}

public external interface PerformanceObserverCallbackOptions : JsAny {
    public var droppedEntriesCount: Double?
}

public fun PerformanceObserverCallbackOptions(droppedEntriesCount: Double? = null): PerformanceObserverCallbackOptions {
    val dictionary = newJsObject<PerformanceObserverCallbackOptions>()
    if (droppedEntriesCount != null) dictionary.droppedEntriesCount = droppedEntriesCount
    return dictionary
}

public external interface PerformanceObserverInit : JsAny {
    public var entryTypes: JsArray<JsString>?
    public var type: String?
    public var buffered: Boolean?
}

public fun PerformanceObserverInit(entryTypes: JsArray<JsString>? = null, type: String? = null, buffered: Boolean? = null): PerformanceObserverInit {
    val dictionary = newJsObject<PerformanceObserverInit>()
    if (entryTypes != null) dictionary.entryTypes = entryTypes
    if (type != null) dictionary.type = type
    if (buffered != null) dictionary.buffered = buffered
    return dictionary
}

/**
 * The PerformanceObserverEntryList interface is a list of performance events that were explicitly observed via the
 * observe() method.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class PerformanceObserverEntryList : JsAny {
    /**
     * The getEntries() method of the PerformanceObserverEntryList interface returns a list of explicitly observed
     * performance entry objects. The list's members are determined by the set of entry types specified in the call to
     * the observe() method. The list is available in the observer's callback function (as the first parameter in the
     * callback).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList/getEntries)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getEntries(): JsArray<PerformanceEntry>

    /**
     * The getEntriesByType() method of the PerformanceObserverEntryList returns a list of explicitly observed
     * performance entry objects for a given performance entry type. The list's members are determined by the set of
     * entry types specified in the call to the observe() method. The list is available in the observer's callback
     * function (as the first parameter in the callback).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList/getEntriesByType)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getEntriesByType(type: String): JsArray<PerformanceEntry>

    /**
     * The getEntriesByName() method of the PerformanceObserverEntryList interface returns a list of explicitly observed
     * PerformanceEntry objects for a given name and entryType. The list's members are determined by the set of entry
     * types specified in the call to the observe() method. The list is available in the observer's callback function
     * (as the first parameter in the callback).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList/getEntriesByName)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getEntriesByName(name: String, type: String = definedExternally): JsArray<PerformanceEntry>
}
