/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'fullscreen', DO NOT EDIT!

package org.w3c.fullscreen

import kotlin.js.*
import org.w3c.dom.*

public external interface FullscreenNavigationUI : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val FullscreenNavigationUI.Companion.AUTO: FullscreenNavigationUI get() = "auto".toJsString().unsafeCast<FullscreenNavigationUI>()
public inline val FullscreenNavigationUI.Companion.SHOW: FullscreenNavigationUI get() = "show".toJsString().unsafeCast<FullscreenNavigationUI>()
public inline val FullscreenNavigationUI.Companion.HIDE: FullscreenNavigationUI get() = "hide".toJsString().unsafeCast<FullscreenNavigationUI>()

public external interface FullscreenKeyboardLock : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val FullscreenKeyboardLock.Companion.BROWSER: FullscreenKeyboardLock get() = "browser".toJsString().unsafeCast<FullscreenKeyboardLock>()
public inline val FullscreenKeyboardLock.Companion.NONE: FullscreenKeyboardLock get() = "none".toJsString().unsafeCast<FullscreenKeyboardLock>()

public external interface FullscreenOptions : JsAny {
    var keyboardLock: FullscreenKeyboardLock?
    var navigationUI: FullscreenNavigationUI?
}

public fun FullscreenOptions(keyboardLock: FullscreenKeyboardLock? = null, navigationUI: FullscreenNavigationUI? = null): FullscreenOptions = newJsObject<FullscreenOptions>().apply {
    if (keyboardLock != null) this.keyboardLock = keyboardLock
    if (navigationUI != null) this.navigationUI = navigationUI
}
