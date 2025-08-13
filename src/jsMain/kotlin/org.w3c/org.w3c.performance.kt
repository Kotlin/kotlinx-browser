/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
package org.w3c.performance

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.events.*

/**
 * Exposes the JavaScript [Performance](https://developer.mozilla.org/en/docs/Web/API/Performance) to Kotlin
 */
actual external abstract class Performance : EventTarget {
    actual open val timing: PerformanceTiming
    actual open val navigation: PerformanceNavigation
    actual fun now(): Double
}

actual external interface GlobalPerformance {
    actual val performance: Performance
}

/**
 * Exposes the JavaScript [PerformanceTiming](https://developer.mozilla.org/en/docs/Web/API/PerformanceTiming) to Kotlin
 */
actual external abstract class PerformanceTiming {
    actual open val navigationStart: Number
    actual open val unloadEventStart: Number
    actual open val unloadEventEnd: Number
    actual open val redirectStart: Number
    actual open val redirectEnd: Number
    actual open val fetchStart: Number
    actual open val domainLookupStart: Number
    actual open val domainLookupEnd: Number
    actual open val connectStart: Number
    actual open val connectEnd: Number
    actual open val secureConnectionStart: Number
    actual open val requestStart: Number
    actual open val responseStart: Number
    actual open val responseEnd: Number
    actual open val domLoading: Number
    actual open val domInteractive: Number
    actual open val domContentLoadedEventStart: Number
    actual open val domContentLoadedEventEnd: Number
    actual open val domComplete: Number
    actual open val loadEventStart: Number
    actual open val loadEventEnd: Number
}

/**
 * Exposes the JavaScript [PerformanceNavigation](https://developer.mozilla.org/en/docs/Web/API/PerformanceNavigation) to Kotlin
 */
actual external abstract class PerformanceNavigation {
    actual open val type: Short
    actual open val redirectCount: Short

    actual companion object {
        actual val TYPE_NAVIGATE: Short
        actual val TYPE_RELOAD: Short
        actual val TYPE_BACK_FORWARD: Short
        actual val TYPE_RESERVED: Short
    }
}