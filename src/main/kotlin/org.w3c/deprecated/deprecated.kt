/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.w3c.dom

import org.w3c.dom.css.CSSStyleDeclaration

@Deprecated("Use UnionMessagePortOrWindowProxy instead.", ReplaceWith("UnionMessagePortOrWindowProxy"))
typealias UnionMessagePortOrWindow = UnionMessagePortOrWindowProxy

@Deprecated("Use `as` instead.", ReplaceWith("`as`"))
var HTMLLinkElement.as_
    get() = `as`
    set(value) {
        `as` = value
    }

@Deprecated("Use `is` instead.", ReplaceWith("`is`"))
var ElementCreationOptions.is_
    get() = `is`
    set(value) {
        `is` = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.backfaceVisibility
    get() = this.asDynamic().backfaceVisibility
    set(value) {
        this.asDynamic().backfaceVisibility = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.imeMode
    get() = this.asDynamic().imeMode
    set(value) {
        this.asDynamic().imeMode = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.mark
    get() = this.asDynamic().mark
    set(value) {
        this.asDynamic().mark = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.markAfter
    get() = this.asDynamic().markAfter
    set(value) {
        this.asDynamic().markAfter = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.markBefore
    get() = this.asDynamic().markBefore
    set(value) {
        this.asDynamic().markBefore = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.marks
    get() = this.asDynamic().marks
    set(value) {
        this.asDynamic().marks = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.marqueeDirection
    get() = this.asDynamic().marqueeDirection
    set(value) {
        this.asDynamic().marqueeDirection = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.marqueePlayCount
    get() = this.asDynamic().marqueePlayCount
    set(value) {
        this.asDynamic().marqueePlayCount = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.marqueeSpeed
    get() = this.asDynamic().marqueeSpeed
    set(value) {
        this.asDynamic().marqueeSpeed = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.marqueeStyle
    get() = this.asDynamic().marqueeStyle
    set(value) {
        this.asDynamic().marqueeStyle = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.navIndex
    get() = this.asDynamic().navIndex
    set(value) {
        this.asDynamic().navIndex = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.perspective
    get() = this.asDynamic().perspective
    set(value) {
        this.asDynamic().perspective = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.perspectiveOrigin
    get() = this.asDynamic().perspectiveOrigin
    set(value) {
        this.asDynamic().perspectiveOrigin = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.phonemes
    get() = this.asDynamic().phonemes
    set(value) {
        this.asDynamic().phonemes = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.rest
    get() = this.asDynamic().rest
    set(value) {
        this.asDynamic().rest = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.restAfter
    get() = this.asDynamic().restAfter
    set(value) {
        this.asDynamic().restAfter = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.restBefore
    get() = this.asDynamic().restBefore
    set(value) {
        this.asDynamic().restBefore = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.transformStyle
    get() = this.asDynamic().transformStyle
    set(value) {
        this.asDynamic().transformStyle = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.voiceBalance
    get() = this.asDynamic().voiceBalance
    set(value) {
        this.asDynamic().voiceBalance = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.voiceDuration
    get() = this.asDynamic().voiceDuration
    set(value) {
        this.asDynamic().voiceDuration = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.voicePitch
    get() = this.asDynamic().voicePitch
    set(value) {
        this.asDynamic().voicePitch = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.voicePitchRange
    get() = this.asDynamic().voicePitchRange
    set(value) {
        this.asDynamic().voicePitchRange = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.voiceRate
    get() = this.asDynamic().voiceRate
    set(value) {
        this.asDynamic().voiceRate = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.voiceStress
    get() = this.asDynamic().voiceStress
    set(value) {
        this.asDynamic().voiceStress = value
    }

@Deprecated("Obsolete CSS property")
var CSSStyleDeclaration.voiceVolume
    get() = this.asDynamic().voiceVolume
    set(value) {
        this.asDynamic().voiceVolume = value
    }
