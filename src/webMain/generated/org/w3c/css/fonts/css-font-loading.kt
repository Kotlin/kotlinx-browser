/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'css-font-loading', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.css.fonts

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*

public external interface FontFaceDescriptors : JsAny {
    public var style: String?
    public var weight: String?
    public var stretch: String?
    public var unicodeRange: String?
    public var featureSettings: String?
    public var variationSettings: String?
    public var display: String?
    public var ascentOverride: String?
    public var descentOverride: String?
    public var lineGapOverride: String?
}

public fun FontFaceDescriptors(style: String? = null, weight: String? = null, stretch: String? = null, unicodeRange: String? = null, featureSettings: String? = null, variationSettings: String? = null, display: String? = null, ascentOverride: String? = null, descentOverride: String? = null, lineGapOverride: String? = null): FontFaceDescriptors {
    val dictionary = newJsObject<FontFaceDescriptors>()
    if (style != null) dictionary.style = style
    if (weight != null) dictionary.weight = weight
    if (stretch != null) dictionary.stretch = stretch
    if (unicodeRange != null) dictionary.unicodeRange = unicodeRange
    if (featureSettings != null) dictionary.featureSettings = featureSettings
    if (variationSettings != null) dictionary.variationSettings = variationSettings
    if (display != null) dictionary.display = display
    if (ascentOverride != null) dictionary.ascentOverride = ascentOverride
    if (descentOverride != null) dictionary.descentOverride = descentOverride
    if (lineGapOverride != null) dictionary.lineGapOverride = lineGapOverride
    return dictionary
}

public external interface FontFaceLoadStatus : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val FontFaceLoadStatus.Companion.UNLOADED: FontFaceLoadStatus get() = "unloaded".toJsString().unsafeCast<FontFaceLoadStatus>()
public inline val FontFaceLoadStatus.Companion.LOADING: FontFaceLoadStatus get() = "loading".toJsString().unsafeCast<FontFaceLoadStatus>()
public inline val FontFaceLoadStatus.Companion.LOADED: FontFaceLoadStatus get() = "loaded".toJsString().unsafeCast<FontFaceLoadStatus>()
public inline val FontFaceLoadStatus.Companion.ERROR: FontFaceLoadStatus get() = "error".toJsString().unsafeCast<FontFaceLoadStatus>()

/**
 * The FontFace interface of the CSS Font Loading API represents a single usable font face.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class FontFace : JsAny {
    /**
     * The FontFace() constructor creates a new FontFace object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/FontFace)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(family: String, source: String, descriptors: FontFaceDescriptors = definedExternally)

    /**
     * The FontFace() constructor creates a new FontFace object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/FontFace)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(family: String, source: BufferDataSource, descriptors: FontFaceDescriptors = definedExternally)

    /**
     * The FontFace.family property allows the author to get or set the font family of a FontFace object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/family)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var family: String

    /**
     * The style property of the FontFace interface retrieves or sets the font's style.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/style)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var style: String

    /**
     * The weight property of the FontFace interface retrieves or sets the weight of the font.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/weight)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var weight: String

    /**
     * The stretch property of the FontFace interface retrieves or sets how the font stretches.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/stretch)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var stretch: String

    /**
     * The unicodeRange property of the FontFace interface retrieves or sets the range of unicode code points
     * encompassing the font.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/unicodeRange)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var unicodeRange: String

    /**
     * The featureSettings property of the FontFace interface retrieves or sets infrequently used font features that are
     * not available from a font's variant properties.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/featureSettings)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var featureSettings: String

    /**
     * The variationSettings property of the FontFace interface retrieves or sets low-level OpenType or TrueType font
     * variations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/variationSettings)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var variationSettings: String

    /**
     * The display property of the FontFace interface determines how a font face is displayed based on whether and when
     * it is downloaded and ready to use. This property is equivalent to the CSS font-display descriptor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/display)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var display: String

    /**
     * The ascentOverride property of the FontFace interface returns and sets the ascent metric for the font, the height
     * above the baseline that CSS uses to lay out line boxes in an inline formatting context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/ascentOverride)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var ascentOverride: String

    /**
     * The descentOverride property of the FontFace interface returns and sets the value of the descent-override
     * descriptor. The possible values are normal, indicating that the metric used should be obtained from the font
     * file, or a percentage.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/descentOverride)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var descentOverride: String

    /**
     * The lineGapOverride property of the FontFace interface returns and sets the value of the line-gap-override
     * descriptor. The possible values are normal, indicating that the metric used should be obtained from the font
     * file, or a percentage.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/lineGapOverride)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var lineGapOverride: String

    /**
     * The status read-only property of the FontFace interface returns an enumerated value indicating the status of the
     * font, one of "unloaded", "loading", "loaded", or "error".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/status)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val status: FontFaceLoadStatus

    /**
     * The load() method of the FontFace interface requests and loads a font whose source was specified as a URL. It
     * returns a Promise that resolves with the current FontFace object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/load)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun load(): Promise<FontFace>

    /**
     * The loaded read-only property of the FontFace interface returns a Promise that resolves with the current FontFace
     * object when the font specified in the object's constructor is done loading or rejects with a SyntaxError.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFace/loaded)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val loaded: Promise<FontFace>
    public open val features: FontFaceFeatures
    public open val variations: FontFaceVariations
    public open val palettes: FontFacePalettes
}

public abstract external class FontFaceFeatures : JsAny

public abstract external class FontFaceVariationAxis : JsAny {
    public open val name: String
    public open val axisTag: String
    public open val minimumValue: Double
    public open val maximumValue: Double
    public open val defaultValue: Double
}

public abstract external class FontFaceVariations : JsAny {
    // not printed yet: setlike
}

public abstract external class FontFacePalette : JsAny {
    // not printed yet: iterable
    public open val length: Int
    public open val usableWithLightBackground: Boolean
    public open val usableWithDarkBackground: Boolean
}

public operator fun FontFacePalette.get(index: Int): String? = getStringProperty(this, index)

public abstract external class FontFacePalettes : JsAny {
    // not printed yet: iterable
    public open val length: Int
}

public operator fun FontFacePalettes.get(index: Int): FontFacePalette? = getProperty(this, index)

public external interface FontFaceSetLoadEventInit : EventInit {
    public var fontfaces: JsArray<FontFace>?
}

public fun FontFaceSetLoadEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, fontfaces: JsArray<FontFace>? = null): FontFaceSetLoadEventInit {
    val dictionary = newJsObject<FontFaceSetLoadEventInit>()
    if (bubbles != null) dictionary.bubbles = bubbles
    if (cancelable != null) dictionary.cancelable = cancelable
    if (composed != null) dictionary.composed = composed
    if (fontfaces != null) dictionary.fontfaces = fontfaces
    return dictionary
}

/**
 * The FontFaceSetLoadEvent interface of the CSS Font Loading API represents events fired at a FontFaceSet after it
 * starts loading font faces.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSetLoadEvent)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class FontFaceSetLoadEvent : Event {
    /**
     * The FontFaceSetLoadEvent() constructor creates a new FontFaceSetLoadEvent object which is fired whenever a
     * FontFaceSet loads.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSetLoadEvent/FontFaceSetLoadEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(type: String, eventInitDict: FontFaceSetLoadEventInit = definedExternally)

    /**
     * The fontfaces read-only property of the FontFaceSetLoadEvent interface returns an array of FontFace instances,
     * each of which represents a single usable font.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSetLoadEvent/fontfaces)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val fontfaces: JsArray<FontFace>

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface FontFaceSetLoadStatus : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val FontFaceSetLoadStatus.Companion.LOADING: FontFaceSetLoadStatus get() = "loading".toJsString().unsafeCast<FontFaceSetLoadStatus>()
public inline val FontFaceSetLoadStatus.Companion.LOADED: FontFaceSetLoadStatus get() = "loaded".toJsString().unsafeCast<FontFaceSetLoadStatus>()

/**
 * The FontFaceSet interface of the CSS Font Loading API manages the loading of font-faces and querying of their
 * download status.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class FontFaceSet : EventTarget {
    // not printed yet: setlike

    /**
     * The add() method of the FontFaceSet interface adds a new font to the set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/add)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun add(font: FontFace): FontFaceSet

    /**
     * The delete() method of the FontFaceSet interface removes a font from the set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/delete)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun delete(font: FontFace): Boolean

    /**
     * The clear() method of the FontFaceSet interface removes all fonts added via this interface. Fonts added with the
     * \@font-face rule are not removed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/clear)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun clear()

    /**
     * The loading event fires when the document begins loading fonts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loading_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onloading: ((FontFaceSetLoadEvent) -> Unit)?

    /**
     * The loadingdone event fires when the document has loaded all fonts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loadingdone_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onloadingdone: ((FontFaceSetLoadEvent) -> Unit)?

    /**
     * The loadingerror event fires when fonts have finished loading, but some or all fonts have failed to load.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loadingerror_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onloadingerror: ((FontFaceSetLoadEvent) -> Unit)?

    /**
     * The load() method of the FontFaceSet forces all the fonts given in parameters to be loaded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/load)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun load(font: String, text: String = definedExternally): Promise<JsArray<FontFace>>

    /**
     * The check() method of the FontFaceSet returns true if you can render some text using the given font specification
     * without attempting to use any fonts in this FontFaceSet that are not yet fully loaded. This means you can use the
     * font specification without causing a font swap.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/check)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun check(font: String, text: String = definedExternally): Boolean

    /**
     * The ready read-only property of the FontFaceSet interface returns a Promise that resolves to the given
     * FontFaceSet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/ready)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val ready: Promise<FontFaceSet>

    /**
     * The status read-only property of the FontFaceSet interface returns the loading state of the fonts in the set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/status)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val status: FontFaceSetLoadStatus
}

public external interface FontFaceSource : JsAny {
    /**
     * The fonts read-only property of the Document interface returns the FontFaceSet interface of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fonts)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public val fonts: FontFaceSet
}
