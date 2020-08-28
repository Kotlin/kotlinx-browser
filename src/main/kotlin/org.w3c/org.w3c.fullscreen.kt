/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.fullscreen

import kotlin.js.*
import org.khronos.webgl.*

public external interface FullscreenOptions {
    var navigationUI: FullscreenNavigationUI? /* = FullscreenNavigationUI.AUTO */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun FullscreenOptions(navigationUI: FullscreenNavigationUI? = FullscreenNavigationUI.AUTO): FullscreenOptions {
    val o = js("({})")
    o["navigationUI"] = navigationUI
    return o
}

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface FullscreenNavigationUI {
    companion object
}

public inline val FullscreenNavigationUI.Companion.AUTO: FullscreenNavigationUI get() = "auto".asDynamic().unsafeCast<FullscreenNavigationUI>()

public inline val FullscreenNavigationUI.Companion.SHOW: FullscreenNavigationUI get() = "show".asDynamic().unsafeCast<FullscreenNavigationUI>()

public inline val FullscreenNavigationUI.Companion.HIDE: FullscreenNavigationUI get() = "hide".asDynamic().unsafeCast<FullscreenNavigationUI>()