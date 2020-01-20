/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.dom.css

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.css.masking.*
import org.w3c.dom.*
import org.w3c.dom.clipboard.*
import org.w3c.dom.events.*
import org.w3c.dom.mediacapture.*
import org.w3c.dom.parsing.*
import org.w3c.dom.pointerevents.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

public external abstract class MediaList : ItemArrayLike<String> {
    open var mediaText: String
    fun appendMedium(medium: String)
    fun deleteMedium(medium: String)
    override fun item(index: Int): String?
}

@kotlin.internal.InlineOnly
public inline operator fun MediaList.get(index: Int): String? = asDynamic()[index]

/**
 * Exposes the JavaScript [StyleSheet](https://developer.mozilla.org/en/docs/Web/API/StyleSheet) to Kotlin
 */
public external abstract class StyleSheet {
    open val type: String
    open val href: String?
    open val ownerNode: UnionElementOrProcessingInstruction?
    open val parentStyleSheet: StyleSheet?
    open val title: String?
    open val media: MediaList
    open var disabled: Boolean
}

/**
 * Exposes the JavaScript [CSSStyleSheet](https://developer.mozilla.org/en/docs/Web/API/CSSStyleSheet) to Kotlin
 */
public external abstract class CSSStyleSheet : StyleSheet {
    open val ownerRule: CSSRule?
    open val cssRules: CSSRuleList
    fun insertRule(rule: String, index: Int): Int
    fun deleteRule(index: Int)
}

/**
 * Exposes the JavaScript [StyleSheetList](https://developer.mozilla.org/en/docs/Web/API/StyleSheetList) to Kotlin
 */
public external abstract class StyleSheetList : ItemArrayLike<StyleSheet> {
    override fun item(index: Int): StyleSheet?
}

@kotlin.internal.InlineOnly
public inline operator fun StyleSheetList.get(index: Int): StyleSheet? = asDynamic()[index]

/**
 * Exposes the JavaScript [LinkStyle](https://developer.mozilla.org/en/docs/Web/API/LinkStyle) to Kotlin
 */
public external interface LinkStyle {
    val sheet: StyleSheet?
        get() = definedExternally
}

/**
 * Exposes the JavaScript [CSSRuleList](https://developer.mozilla.org/en/docs/Web/API/CSSRuleList) to Kotlin
 */
public external abstract class CSSRuleList : ItemArrayLike<CSSRule> {
    override fun item(index: Int): CSSRule?
}

@kotlin.internal.InlineOnly
public inline operator fun CSSRuleList.get(index: Int): CSSRule? = asDynamic()[index]

/**
 * Exposes the JavaScript [CSSRule](https://developer.mozilla.org/en/docs/Web/API/CSSRule) to Kotlin
 */
public external abstract class CSSRule {
    open val type: Short
    open var cssText: String
    open val parentRule: CSSRule?
    open val parentStyleSheet: CSSStyleSheet?

    companion object {
        val STYLE_RULE: Short
        val CHARSET_RULE: Short
        val IMPORT_RULE: Short
        val MEDIA_RULE: Short
        val FONT_FACE_RULE: Short
        val PAGE_RULE: Short
        val MARGIN_RULE: Short
        val NAMESPACE_RULE: Short
    }
}

/**
 * Exposes the JavaScript [CSSStyleRule](https://developer.mozilla.org/en/docs/Web/API/CSSStyleRule) to Kotlin
 */
public external abstract class CSSStyleRule : CSSRule {
    open var selectorText: String
    open val style: CSSStyleDeclaration

    companion object {
        val STYLE_RULE: Short
        val CHARSET_RULE: Short
        val IMPORT_RULE: Short
        val MEDIA_RULE: Short
        val FONT_FACE_RULE: Short
        val PAGE_RULE: Short
        val MARGIN_RULE: Short
        val NAMESPACE_RULE: Short
    }
}

public external abstract class CSSImportRule : CSSRule {
    open val href: String
    open val media: MediaList
    open val styleSheet: CSSStyleSheet

    companion object {
        val STYLE_RULE: Short
        val CHARSET_RULE: Short
        val IMPORT_RULE: Short
        val MEDIA_RULE: Short
        val FONT_FACE_RULE: Short
        val PAGE_RULE: Short
        val MARGIN_RULE: Short
        val NAMESPACE_RULE: Short
    }
}

/**
 * Exposes the JavaScript [CSSGroupingRule](https://developer.mozilla.org/en/docs/Web/API/CSSGroupingRule) to Kotlin
 */
public external abstract class CSSGroupingRule : CSSRule {
    open val cssRules: CSSRuleList
    fun insertRule(rule: String, index: Int): Int
    fun deleteRule(index: Int)

    companion object {
        val STYLE_RULE: Short
        val CHARSET_RULE: Short
        val IMPORT_RULE: Short
        val MEDIA_RULE: Short
        val FONT_FACE_RULE: Short
        val PAGE_RULE: Short
        val MARGIN_RULE: Short
        val NAMESPACE_RULE: Short
    }
}

/**
 * Exposes the JavaScript [CSSMediaRule](https://developer.mozilla.org/en/docs/Web/API/CSSMediaRule) to Kotlin
 */
public external abstract class CSSMediaRule : CSSGroupingRule {
    open val media: MediaList

    companion object {
        val STYLE_RULE: Short
        val CHARSET_RULE: Short
        val IMPORT_RULE: Short
        val MEDIA_RULE: Short
        val FONT_FACE_RULE: Short
        val PAGE_RULE: Short
        val MARGIN_RULE: Short
        val NAMESPACE_RULE: Short
    }
}

/**
 * Exposes the JavaScript [CSSPageRule](https://developer.mozilla.org/en/docs/Web/API/CSSPageRule) to Kotlin
 */
public external abstract class CSSPageRule : CSSGroupingRule {
    open var selectorText: String
    open val style: CSSStyleDeclaration

    companion object {
        val STYLE_RULE: Short
        val CHARSET_RULE: Short
        val IMPORT_RULE: Short
        val MEDIA_RULE: Short
        val FONT_FACE_RULE: Short
        val PAGE_RULE: Short
        val MARGIN_RULE: Short
        val NAMESPACE_RULE: Short
    }
}

public external abstract class CSSMarginRule : CSSRule {
    open val name: String
    open val style: CSSStyleDeclaration

    companion object {
        val STYLE_RULE: Short
        val CHARSET_RULE: Short
        val IMPORT_RULE: Short
        val MEDIA_RULE: Short
        val FONT_FACE_RULE: Short
        val PAGE_RULE: Short
        val MARGIN_RULE: Short
        val NAMESPACE_RULE: Short
    }
}

/**
 * Exposes the JavaScript [CSSNamespaceRule](https://developer.mozilla.org/en/docs/Web/API/CSSNamespaceRule) to Kotlin
 */
public external abstract class CSSNamespaceRule : CSSRule {
    open val namespaceURI: String
    open val prefix: String

    companion object {
        val STYLE_RULE: Short
        val CHARSET_RULE: Short
        val IMPORT_RULE: Short
        val MEDIA_RULE: Short
        val FONT_FACE_RULE: Short
        val PAGE_RULE: Short
        val MARGIN_RULE: Short
        val NAMESPACE_RULE: Short
    }
}

/**
 * Exposes the JavaScript [CSSStyleDeclaration](https://developer.mozilla.org/en/docs/Web/API/CSSStyleDeclaration) to Kotlin
 */
public external abstract class CSSStyleDeclaration : ItemArrayLike<String> {
    open var cssText: String
    open val parentRule: CSSRule?
    open var cssFloat: String
    open var alignContent: String
    open var alignItems: String
    open var alignSelf: String
    open var alignmentBaseline: String
    open var all: String
    open var animation: String
    open var animationDelay: String
    open var animationDirection: String
    open var animationDuration: String
    open var animationFillMode: String
    open var animationIterationCount: String
    open var animationName: String
    open var animationPlayState: String
    open var animationTimingFunction: String
    open var appearance: String
    open var azimuth: String
    open var background: String
    open var backgroundAttachment: String
    open var backgroundBlendMode: String
    open var backgroundClip: String
    open var backgroundColor: String
    open var backgroundImage: String
    open var backgroundOrigin: String
    open var backgroundPosition: String
    open var backgroundRepeat: String
    open var backgroundSize: String
    open var baselineShift: String
    open var baselineSource: String
    open var blockEllipsis: String
    open var blockOverflow: String
    open var blockSize: String
    open var blockStep: String
    open var blockStepAlign: String
    open var blockStepInsert: String
    open var blockStepRound: String
    open var blockStepSize: String
    open var bookmarkLabel: String
    open var bookmarkLevel: String
    open var bookmarkState: String
    open var border: String
    open var borderBlock: String
    open var borderBlockColor: String
    open var borderBlockEnd: String
    open var borderBlockEndColor: String
    open var borderBlockEndStyle: String
    open var borderBlockEndWidth: String
    open var borderBlockStart: String
    open var borderBlockStartColor: String
    open var borderBlockStartStyle: String
    open var borderBlockStartWidth: String
    open var borderBlockStyle: String
    open var borderBlockWidth: String
    open var borderBottom: String
    open var borderBottomColor: String
    open var borderBottomLeftRadius: String
    open var borderBottomRightRadius: String
    open var borderBottomStyle: String
    open var borderBottomWidth: String
    open var borderBoundary: String
    open var borderCollapse: String
    open var borderColor: String
    open var borderEndEndRadius: String
    open var borderEndStartRadius: String
    open var borderImage: String
    open var borderImageOutset: String
    open var borderImageRepeat: String
    open var borderImageSlice: String
    open var borderImageSource: String
    open var borderImageWidth: String
    open var borderInline: String
    open var borderInlineColor: String
    open var borderInlineEnd: String
    open var borderInlineEndColor: String
    open var borderInlineEndStyle: String
    open var borderInlineEndWidth: String
    open var borderInlineStart: String
    open var borderInlineStartColor: String
    open var borderInlineStartStyle: String
    open var borderInlineStartWidth: String
    open var borderInlineStyle: String
    open var borderInlineWidth: String
    open var borderLeft: String
    open var borderLeftColor: String
    open var borderLeftStyle: String
    open var borderLeftWidth: String
    open var borderRadius: String
    open var borderRight: String
    open var borderRightColor: String
    open var borderRightStyle: String
    open var borderRightWidth: String
    open var borderSpacing: String
    open var borderStartEndRadius: String
    open var borderStartStartRadius: String
    open var borderStyle: String
    open var borderTop: String
    open var borderTopColor: String
    open var borderTopLeftRadius: String
    open var borderTopRightRadius: String
    open var borderTopStyle: String
    open var borderTopWidth: String
    open var borderWidth: String
    open var bottom: String
    open var boxDecorationBreak: String
    open var boxShadow: String
    open var boxSizing: String
    open var boxSnap: String
    open var breakAfter: String
    open var breakBefore: String
    open var breakInside: String
    open var captionSide: String
    open var caret: String
    open var caretColor: String
    open var caretShape: String
    open var chains: String
    open var clear: String
    open var clip: String
    open var clipPath: String
    open var clipRule: String
    open var color: String
    open var colorAdjust: String
    open var colorInterpolationFilters: String
    open var colorScheme: String
    open var columnCount: String
    open var columnFill: String
    open var columnGap: String
    open var columnRule: String
    open var columnRuleColor: String
    open var columnRuleStyle: String
    open var columnRuleWidth: String
    open var columnSpan: String
    open var columnWidth: String
    open var columns: String
    open var contain: String
    open var content: String
    open var `continue`: String
    open var counterIncrement: String
    open var counterReset: String
    open var counterSet: String
    open var cue: String
    open var cueAfter: String
    open var cueBefore: String
    open var cursor: String
    open var direction: String
    open var display: String
    open var dominantBaseline: String
    open var elevation: String
    open var emptyCells: String
    open var fill: String
    open var fillBreak: String
    open var fillColor: String
    open var fillImage: String
    open var fillOpacity: String
    open var fillOrigin: String
    open var fillPosition: String
    open var fillRepeat: String
    open var fillRule: String
    open var fillSize: String
    open var filter: String
    open var flex: String
    open var flexBasis: String
    open var flexDirection: String
    open var flexFlow: String
    open var flexGrow: String
    open var flexShrink: String
    open var flexWrap: String
    open var floatDefer: String
    open var floatOffset: String
    open var floatReference: String
    open var floodColor: String
    open var floodOpacity: String
    open var flow: String
    open var flowFrom: String
    open var flowInto: String
    open var font: String
    open var fontFamily: String
    open var fontFeatureSettings: String
    open var fontKerning: String
    open var fontLanguageOverride: String
    open var fontOpticalSizing: String
    open var fontPalette: String
    open var fontSize: String
    open var fontSizeAdjust: String
    open var fontStretch: String
    open var fontStyle: String
    open var fontSynthesis: String
    open var fontSynthesisSmallCaps: String
    open var fontSynthesisStyle: String
    open var fontSynthesisWeight: String
    open var fontVariant: String
    open var fontVariantAlternates: String
    open var fontVariantCaps: String
    open var fontVariantEastAsian: String
    open var fontVariantEmoji: String
    open var fontVariantLigatures: String
    open var fontVariantNumeric: String
    open var fontVariantPosition: String
    open var fontVariationSettings: String
    open var fontWeight: String
    open var footnoteDisplay: String
    open var footnotePolicy: String
    open var forcedColorAdjust: String
    open var gap: String
    open var glyphOrientationVertical: String
    open var grid: String
    open var gridArea: String
    open var gridAutoColumns: String
    open var gridAutoFlow: String
    open var gridAutoRows: String
    open var gridColumn: String
    open var gridColumnEnd: String
    open var gridColumnStart: String
    open var gridRow: String
    open var gridRowEnd: String
    open var gridRowStart: String
    open var gridTemplate: String
    open var gridTemplateAreas: String
    open var gridTemplateColumns: String
    open var gridTemplateRows: String
    open var hangingPunctuation: String
    open var height: String
    open var hyphenateCharacter: String
    open var hyphenateLimitChars: String
    open var hyphenateLimitLast: String
    open var hyphenateLimitLines: String
    open var hyphenateLimitZone: String
    open var hyphens: String
    open var imageOrientation: String
    open var imageRendering: String
    open var imageResolution: String
    open var initialLetters: String
    open var initialLettersAlign: String
    open var initialLettersWrap: String
    open var inlineSize: String
    open var inlineSizing: String
    open var inset: String
    open var insetAfter: String
    open var insetBefore: String
    open var insetBlock: String
    open var insetBlockEnd: String
    open var insetBlockStart: String
    open var insetEnd: String
    open var insetInline: String
    open var insetInlineEnd: String
    open var insetInlineStart: String
    open var insetStart: String
    open var isolation: String
    open var justifyContent: String
    open var justifyItems: String
    open var justifySelf: String
    open var leadingTrim: String
    open var leadingTrimOver: String
    open var leadingTrimUnder: String
    open var left: String
    open var letterSpacing: String
    open var lightingColor: String
    open var lineBreak: String
    open var lineClamp: String
    open var lineGrid: String
    open var lineHeight: String
    open var lineHeightStep: String
    open var linePadding: String
    open var lineSizing: String
    open var lineSnap: String
    open var listStyle: String
    open var listStyleImage: String
    open var listStylePosition: String
    open var listStyleType: String
    open var margin: String
    open var marginBlock: String
    open var marginBlockEnd: String
    open var marginBlockStart: String
    open var marginBottom: String
    open var marginBreak: String
    open var marginInline: String
    open var marginInlineEnd: String
    open var marginInlineStart: String
    open var marginLeft: String
    open var marginRight: String
    open var marginTop: String
    open var marginTrim: String
    open var marker: String
    open var markerEnd: String
    open var markerKnockoutLeft: String
    open var markerKnockoutRight: String
    open var markerMid: String
    open var markerPattern: String
    open var markerSegment: String
    open var markerSide: String
    open var markerStart: String
    open var mask: String
    open var maskBorder: String
    open var maskBorderMode: String
    open var maskBorderOutset: String
    open var maskBorderRepeat: String
    open var maskBorderSlice: String
    open var maskBorderSource: String
    open var maskBorderWidth: String
    open var maskClip: String
    open var maskComposite: String
    open var maskImage: String
    open var maskMode: String
    open var maskOrigin: String
    open var maskPosition: String
    open var maskRepeat: String
    open var maskSize: String
    open var maskType: String
    open var maxBlockSize: String
    open var maxHeight: String
    open var maxInlineSize: String
    open var maxLines: String
    open var maxWidth: String
    open var minBlockSize: String
    open var minHeight: String
    open var minInlineSize: String
    open var minWidth: String
    open var mixBlendMode: String
    open var navDown: String
    open var navLeft: String
    open var navRight: String
    open var navUp: String
    open var objectFit: String
    open var objectPosition: String
    open var offset: String
    open var offsetAfter: String
    open var offsetAnchor: String
    open var offsetBefore: String
    open var offsetDistance: String
    open var offsetEnd: String
    open var offsetPath: String
    open var offsetPosition: String
    open var offsetRotate: String
    open var offsetStart: String
    open var opacity: String
    open var order: String
    open var orphans: String
    open var outline: String
    open var outlineColor: String
    open var outlineOffset: String
    open var outlineStyle: String
    open var outlineWidth: String
    open var overflow: String
    open var overflowBlock: String
    open var overflowInline: String
    open var overflowWrap: String
    open var overflowX: String
    open var overflowY: String
    open var overscrollBehavior: String
    open var overscrollBehaviorBlock: String
    open var overscrollBehaviorInline: String
    open var overscrollBehaviorX: String
    open var overscrollBehaviorY: String
    open var padding: String
    open var paddingBlock: String
    open var paddingBlockEnd: String
    open var paddingBlockStart: String
    open var paddingBottom: String
    open var paddingInline: String
    open var paddingInlineEnd: String
    open var paddingInlineStart: String
    open var paddingLeft: String
    open var paddingRight: String
    open var paddingTop: String
    open var page: String
    open var pageBreakAfter: String
    open var pageBreakBefore: String
    open var pageBreakInside: String
    open var pause: String
    open var pauseAfter: String
    open var pauseBefore: String
    open var pitch: String
    open var pitchRange: String
    open var placeContent: String
    open var placeItems: String
    open var placeSelf: String
    open var playDuring: String
    open var position: String
    open var quotes: String
    open var regionFragment: String
    open var resize: String
    open var richness: String
    open var right: String
    open var rowGap: String
    open var rubyAlign: String
    open var rubyMerge: String
    open var rubyPosition: String
    open var running: String
    open var scrollBehavior: String
    open var scrollMargin: String
    open var scrollMarginBlock: String
    open var scrollMarginBlockEnd: String
    open var scrollMarginBlockStart: String
    open var scrollMarginBottom: String
    open var scrollMarginInline: String
    open var scrollMarginInlineEnd: String
    open var scrollMarginInlineStart: String
    open var scrollMarginLeft: String
    open var scrollMarginRight: String
    open var scrollMarginTop: String
    open var scrollPadding: String
    open var scrollPaddingBlock: String
    open var scrollPaddingBlockEnd: String
    open var scrollPaddingBlockStart: String
    open var scrollPaddingBottom: String
    open var scrollPaddingInline: String
    open var scrollPaddingInlineEnd: String
    open var scrollPaddingInlineStart: String
    open var scrollPaddingLeft: String
    open var scrollPaddingRight: String
    open var scrollPaddingTop: String
    open var scrollSnapAlign: String
    open var scrollSnapStop: String
    open var scrollSnapType: String
    open var scrollbarColor: String
    open var scrollbarGutter: String
    open var scrollbarWidth: String
    open var shapeImageThreshold: String
    open var shapeInside: String
    open var shapeMargin: String
    open var shapeOutside: String
    open var spatialNavigationAction: String
    open var spatialNavigationContain: String
    open var spatialNavigationFunction: String
    open var speak: String
    open var speakHeader: String
    open var speakNumeral: String
    open var speakPunctuation: String
    open var speechRate: String
    open var stress: String
    open var stringSet: String
    open var stroke: String
    open var strokeAlign: String
    open var strokeAlignment: String
    open var strokeBreak: String
    open var strokeColor: String
    open var strokeDashCorner: String
    open var strokeDashJustify: String
    open var strokeDashadjust: String
    open var strokeDasharray: String
    open var strokeDashcorner: String
    open var strokeDashoffset: String
    open var strokeImage: String
    open var strokeLinecap: String
    open var strokeLinejoin: String
    open var strokeMiterlimit: String
    open var strokeOpacity: String
    open var strokeOrigin: String
    open var strokePosition: String
    open var strokeRepeat: String
    open var strokeSize: String
    open var strokeWidth: String
    open var tabSize: String
    open var tableLayout: String
    open var textAlign: String
    open var textAlignAll: String
    open var textAlignLast: String
    open var textCombineUpright: String
    open var textDecoration: String
    open var textDecorationColor: String
    open var textDecorationLine: String
    open var textDecorationSkip: String
    open var textDecorationSkipBox: String
    open var textDecorationSkipInk: String
    open var textDecorationSkipInset: String
    open var textDecorationSkipSelf: String
    open var textDecorationSkipSpaces: String
    open var textDecorationStyle: String
    open var textDecorationThickness: String
    open var textDecorationWidth: String
    open var textEmphasis: String
    open var textEmphasisColor: String
    open var textEmphasisPosition: String
    open var textEmphasisSkip: String
    open var textEmphasisStyle: String
    open var textGroupAlign: String
    open var textIndent: String
    open var textJustify: String
    open var textOrientation: String
    open var textOverflow: String
    open var textShadow: String
    open var textSpaceCollapse: String
    open var textSpaceTrim: String
    open var textSpacing: String
    open var textTransform: String
    open var textUnderlineOffset: String
    open var textUnderlinePosition: String
    open var textWrap: String
    open var top: String
    open var transform: String
    open var transformBox: String
    open var transformOrigin: String
    open var transition: String
    open var transitionDelay: String
    open var transitionDuration: String
    open var transitionProperty: String
    open var transitionTimingFunction: String
    open var unicodeBidi: String
    open var userSelect: String
    open var verticalAlign: String
    open var visibility: String
    open var voiceFamily: String
    open var volume: String
    open var whiteSpace: String
    open var widows: String
    open var width: String
    open var willChange: String
    open var wordBoundaryDetection: String
    open var wordBoundaryExpansion: String
    open var wordBreak: String
    open var wordSpacing: String
    open var wordWrap: String
    open var wrapAfter: String
    open var wrapBefore: String
    open var wrapFlow: String
    open var wrapInside: String
    open var wrapThrough: String
    open var writingMode: String
    open var zIndex: String
    open var pointerEvents: String
    open var _dashed_attribute: String
    open var _camel_cased_attribute: String
    open var _webkit_cased_attribute: String
    fun getPropertyValue(property: String): String
    fun getPropertyPriority(property: String): String
    fun setProperty(property: String, value: String, priority: String = definedExternally)
    fun setPropertyValue(property: String, value: String)
    fun setPropertyPriority(property: String, priority: String)
    fun removeProperty(property: String): String
    override fun item(index: Int): String
}

@kotlin.internal.InlineOnly
public inline operator fun CSSStyleDeclaration.get(index: Int): String? = asDynamic()[index]

public external interface ElementCSSInlineStyle {
    val style: CSSStyleDeclaration
}

/**
 * Exposes the JavaScript [CSS](https://developer.mozilla.org/en/docs/Web/API/CSS) to Kotlin
 */
public external abstract class CSS {
    companion object {
        fun escape(ident: String): String
    }
}

public external interface UnionElementOrProcessingInstruction