/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.performance

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.events.*

public external abstract class 

/**
 * Exposes the JavaScript [Performance](https://developer.mozilla.org/en/docs/Web/API/Performance) to Kotlin
 */
public external abstract class Performance : EventTarget {
    open val timeOrigin: dynamic
    open val timing: PerformanceTiming
    open val navigation: PerformanceNavigation
    fun now(): dynamic
    fun toJSON(): dynamic
}

/**
 * Exposes the JavaScript [PerformanceTiming](https://developer.mozilla.org/en/docs/Web/API/PerformanceTiming) to Kotlin
 */
public external abstract class PerformanceTiming {
    open val navigationStart: Number
    open val unloadEventStart: Number
    open val unloadEventEnd: Number
    open val redirectStart: Number
    open val redirectEnd: Number
    open val fetchStart: Number
    open val domainLookupStart: Number
    open val domainLookupEnd: Number
    open val connectStart: Number
    open val connectEnd: Number
    open val secureConnectionStart: Number
    open val requestStart: Number
    open val responseStart: Number
    open val responseEnd: Number
    open val domLoading: Number
    open val domInteractive: Number
    open val domContentLoadedEventStart: Number
    open val domContentLoadedEventEnd: Number
    open val domComplete: Number
    open val loadEventStart: Number
    open val loadEventEnd: Number
}

/**
 * Exposes the JavaScript [PerformanceNavigation](https://developer.mozilla.org/en/docs/Web/API/PerformanceNavigation) to Kotlin
 */
public external abstract class PerformanceNavigation {
    open val type: Short
    open val redirectCount: Short

    companion object {
        val TYPE_NAVIGATE: Short
        val TYPE_RELOAD: Short
        val TYPE_BACK_FORWARD: Short
        val TYPE_RESERVED: Short
    }
}