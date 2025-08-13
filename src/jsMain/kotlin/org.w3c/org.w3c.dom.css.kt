/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
package org.w3c.dom.css

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*

actual external abstract class MediaList : ItemArrayLike<String> {
    actual open var mediaText: String
    actual fun appendMedium(medium: String)
    actual fun deleteMedium(medium: String)
    actual override fun item(index: Int): String?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun MediaList.get(index: Int): String? = asDynamic()[index]

/**
 * Exposes the JavaScript [StyleSheet](https://developer.mozilla.org/en/docs/Web/API/StyleSheet) to Kotlin
 */
actual external abstract class StyleSheet {
    actual open val type: String
    actual open val href: String?
    actual open val ownerNode: UnionElementOrProcessingInstruction?
    actual open val parentStyleSheet: StyleSheet?
    actual open val title: String?
    actual open val media: MediaList
    actual open var disabled: Boolean
}

/**
 * Exposes the JavaScript [CSSStyleSheet](https://developer.mozilla.org/en/docs/Web/API/CSSStyleSheet) to Kotlin
 */
actual external abstract class CSSStyleSheet : StyleSheet {
    actual open val ownerRule: CSSRule?
    actual open val cssRules: CSSRuleList
    actual fun insertRule(rule: String, index: Int): Int
    actual fun deleteRule(index: Int)
}

/**
 * Exposes the JavaScript [StyleSheetList](https://developer.mozilla.org/en/docs/Web/API/StyleSheetList) to Kotlin
 */
actual external abstract class StyleSheetList : ItemArrayLike<StyleSheet> {
    actual override fun item(index: Int): StyleSheet?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun StyleSheetList.get(index: Int): StyleSheet? = asDynamic()[index]

/**
 * Exposes the JavaScript [LinkStyle](https://developer.mozilla.org/en/docs/Web/API/LinkStyle) to Kotlin
 */
actual external interface LinkStyle {
    actual val sheet: StyleSheet?
        get() = definedExternally
}

/**
 * Exposes the JavaScript [CSSRuleList](https://developer.mozilla.org/en/docs/Web/API/CSSRuleList) to Kotlin
 */
actual external abstract class CSSRuleList : ItemArrayLike<CSSRule> {
    actual override fun item(index: Int): CSSRule?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun CSSRuleList.get(index: Int): CSSRule? = asDynamic()[index]

/**
 * Exposes the JavaScript [CSSRule](https://developer.mozilla.org/en/docs/Web/API/CSSRule) to Kotlin
 */
actual external abstract class CSSRule {
    actual open val type: Short
    actual open var cssText: String
    actual open val parentRule: CSSRule?
    actual open val parentStyleSheet: CSSStyleSheet?

    actual companion object {
        actual val STYLE_RULE: Short
        actual val CHARSET_RULE: Short
        actual val IMPORT_RULE: Short
        actual val MEDIA_RULE: Short
        actual val FONT_FACE_RULE: Short
        actual val PAGE_RULE: Short
        actual val MARGIN_RULE: Short
        actual val NAMESPACE_RULE: Short
    }
}

/**
 * Exposes the JavaScript [CSSStyleRule](https://developer.mozilla.org/en/docs/Web/API/CSSStyleRule) to Kotlin
 */
actual external abstract class CSSStyleRule : CSSRule {
    actual open var selectorText: String
    actual open val style: CSSStyleDeclaration

    actual companion object {
        actual val STYLE_RULE: Short
        actual val CHARSET_RULE: Short
        actual val IMPORT_RULE: Short
        actual val MEDIA_RULE: Short
        actual val FONT_FACE_RULE: Short
        actual val PAGE_RULE: Short
        actual val MARGIN_RULE: Short
        actual val NAMESPACE_RULE: Short
    }
}

actual external abstract class CSSImportRule : CSSRule {
    actual open val href: String
    actual open val media: MediaList
    actual open val styleSheet: CSSStyleSheet

    actual companion object {
        actual val STYLE_RULE: Short
        actual val CHARSET_RULE: Short
        actual val IMPORT_RULE: Short
        actual val MEDIA_RULE: Short
        actual val FONT_FACE_RULE: Short
        actual val PAGE_RULE: Short
        actual val MARGIN_RULE: Short
        actual val NAMESPACE_RULE: Short
    }
}

/**
 * Exposes the JavaScript [CSSGroupingRule](https://developer.mozilla.org/en/docs/Web/API/CSSGroupingRule) to Kotlin
 */
actual external abstract class CSSGroupingRule : CSSRule {
    actual open val cssRules: CSSRuleList
    actual fun insertRule(rule: String, index: Int): Int
    actual fun deleteRule(index: Int)

    actual companion object {
        actual val STYLE_RULE: Short
        actual val CHARSET_RULE: Short
        actual val IMPORT_RULE: Short
        actual val MEDIA_RULE: Short
        actual val FONT_FACE_RULE: Short
        actual val PAGE_RULE: Short
        actual val MARGIN_RULE: Short
        actual val NAMESPACE_RULE: Short
    }
}

/**
 * Exposes the JavaScript [CSSMediaRule](https://developer.mozilla.org/en/docs/Web/API/CSSMediaRule) to Kotlin
 */
actual external abstract class CSSMediaRule : CSSGroupingRule {
    actual open val media: MediaList

    actual companion object {
        actual val STYLE_RULE: Short
        actual val CHARSET_RULE: Short
        actual val IMPORT_RULE: Short
        actual val MEDIA_RULE: Short
        actual val FONT_FACE_RULE: Short
        actual val PAGE_RULE: Short
        actual val MARGIN_RULE: Short
        actual val NAMESPACE_RULE: Short
    }
}

/**
 * Exposes the JavaScript [CSSPageRule](https://developer.mozilla.org/en/docs/Web/API/CSSPageRule) to Kotlin
 */
actual external abstract class CSSPageRule : CSSGroupingRule {
    actual open var selectorText: String
    actual open val style: CSSStyleDeclaration

    actual companion object {
        actual val STYLE_RULE: Short
        actual val CHARSET_RULE: Short
        actual val IMPORT_RULE: Short
        actual val MEDIA_RULE: Short
        actual val FONT_FACE_RULE: Short
        actual val PAGE_RULE: Short
        actual val MARGIN_RULE: Short
        actual val NAMESPACE_RULE: Short
    }
}

actual external abstract class CSSMarginRule : CSSRule {
    actual open val name: String
    actual open val style: CSSStyleDeclaration

    actual companion object {
        actual val STYLE_RULE: Short
        actual val CHARSET_RULE: Short
        actual val IMPORT_RULE: Short
        actual val MEDIA_RULE: Short
        actual val FONT_FACE_RULE: Short
        actual val PAGE_RULE: Short
        actual val MARGIN_RULE: Short
        actual val NAMESPACE_RULE: Short
    }
}

/**
 * Exposes the JavaScript [CSSNamespaceRule](https://developer.mozilla.org/en/docs/Web/API/CSSNamespaceRule) to Kotlin
 */
actual external abstract class CSSNamespaceRule : CSSRule {
    actual open val namespaceURI: String
    actual open val prefix: String

    actual companion object {
        actual val STYLE_RULE: Short
        actual val CHARSET_RULE: Short
        actual val IMPORT_RULE: Short
        actual val MEDIA_RULE: Short
        actual val FONT_FACE_RULE: Short
        actual val PAGE_RULE: Short
        actual val MARGIN_RULE: Short
        actual val NAMESPACE_RULE: Short
    }
}

/**
 * Exposes the JavaScript [CSSStyleDeclaration](https://developer.mozilla.org/en/docs/Web/API/CSSStyleDeclaration) to Kotlin
 */
actual external abstract class CSSStyleDeclaration : ItemArrayLike<String> {
    actual open var cssText: String
    actual open val parentRule: CSSRule?
    actual open var cssFloat: String
    actual open var alignContent: String
    actual open var alignItems: String
    actual open var alignSelf: String
    actual open var animation: String
    actual open var animationDelay: String
    actual open var animationDirection: String
    actual open var animationDuration: String
    actual open var animationFillMode: String
    actual open var animationIterationCount: String
    actual open var animationName: String
    actual open var animationPlayState: String
    actual open var animationTimingFunction: String
    actual open var backfaceVisibility: String
    actual open var background: String
    actual open var backgroundAttachment: String
    actual open var backgroundClip: String
    actual open var backgroundColor: String
    actual open var backgroundImage: String
    actual open var backgroundOrigin: String
    actual open var backgroundPosition: String
    actual open var backgroundRepeat: String
    actual open var backgroundSize: String
    actual open var border: String
    actual open var borderBottom: String
    actual open var borderBottomColor: String
    actual open var borderBottomLeftRadius: String
    actual open var borderBottomRightRadius: String
    actual open var borderBottomStyle: String
    actual open var borderBottomWidth: String
    actual open var borderCollapse: String
    actual open var borderColor: String
    actual open var borderImage: String
    actual open var borderImageOutset: String
    actual open var borderImageRepeat: String
    actual open var borderImageSlice: String
    actual open var borderImageSource: String
    actual open var borderImageWidth: String
    actual open var borderLeft: String
    actual open var borderLeftColor: String
    actual open var borderLeftStyle: String
    actual open var borderLeftWidth: String
    actual open var borderRadius: String
    actual open var borderRight: String
    actual open var borderRightColor: String
    actual open var borderRightStyle: String
    actual open var borderRightWidth: String
    actual open var borderSpacing: String
    actual open var borderStyle: String
    actual open var borderTop: String
    actual open var borderTopColor: String
    actual open var borderTopLeftRadius: String
    actual open var borderTopRightRadius: String
    actual open var borderTopStyle: String
    actual open var borderTopWidth: String
    actual open var borderWidth: String
    actual open var bottom: String
    actual open var boxDecorationBreak: String
    actual open var boxShadow: String
    actual open var boxSizing: String
    actual open var breakAfter: String
    actual open var breakBefore: String
    actual open var breakInside: String
    actual open var captionSide: String
    actual open var clear: String
    actual open var clip: String
    actual open var color: String
    actual open var columnCount: String
    actual open var columnFill: String
    actual open var columnGap: String
    actual open var columnRule: String
    actual open var columnRuleColor: String
    actual open var columnRuleStyle: String
    actual open var columnRuleWidth: String
    actual open var columnSpan: String
    actual open var columnWidth: String
    actual open var columns: String
    actual open var content: String
    actual open var counterIncrement: String
    actual open var counterReset: String
    actual open var cursor: String
    actual open var direction: String
    actual open var display: String
    actual open var emptyCells: String
    actual open var filter: String
    actual open var flex: String
    actual open var flexBasis: String
    actual open var flexDirection: String
    actual open var flexFlow: String
    actual open var flexGrow: String
    actual open var flexShrink: String
    actual open var flexWrap: String
    actual open var font: String
    actual open var fontFamily: String
    actual open var fontFeatureSettings: String
    actual open var fontKerning: String
    actual open var fontLanguageOverride: String
    actual open var fontSize: String
    actual open var fontSizeAdjust: String
    actual open var fontStretch: String
    actual open var fontStyle: String
    actual open var fontSynthesis: String
    actual open var fontVariant: String
    actual open var fontVariantAlternates: String
    actual open var fontVariantCaps: String
    actual open var fontVariantEastAsian: String
    actual open var fontVariantLigatures: String
    actual open var fontVariantNumeric: String
    actual open var fontVariantPosition: String
    actual open var fontWeight: String
    actual open var hangingPunctuation: String
    actual open var height: String
    actual open var hyphens: String
    actual open var imageOrientation: String
    actual open var imageRendering: String
    actual open var imageResolution: String
    actual open var imeMode: String
    actual open var justifyContent: String
    actual open var left: String
    actual open var letterSpacing: String
    actual open var lineBreak: String
    actual open var lineHeight: String
    actual open var listStyle: String
    actual open var listStyleImage: String
    actual open var listStylePosition: String
    actual open var listStyleType: String
    actual open var margin: String
    actual open var marginBottom: String
    actual open var marginLeft: String
    actual open var marginRight: String
    actual open var marginTop: String
    actual open var mark: String
    actual open var markAfter: String
    actual open var markBefore: String
    actual open var marks: String
    actual open var marqueeDirection: String
    actual open var marqueePlayCount: String
    actual open var marqueeSpeed: String
    actual open var marqueeStyle: String
    actual open var mask: String
    actual open var maskType: String
    actual open var maxHeight: String
    actual open var maxWidth: String
    actual open var minHeight: String
    actual open var minWidth: String
    actual open var navDown: String
    actual open var navIndex: String
    actual open var navLeft: String
    actual open var navRight: String
    actual open var navUp: String
    actual open var objectFit: String
    actual open var objectPosition: String
    actual open var opacity: String
    actual open var order: String
    actual open var orphans: String
    actual open var outline: String
    actual open var outlineColor: String
    actual open var outlineOffset: String
    actual open var outlineStyle: String
    actual open var outlineWidth: String
    actual open var overflowWrap: String
    actual open var overflowX: String
    actual open var overflowY: String
    actual open var padding: String
    actual open var paddingBottom: String
    actual open var paddingLeft: String
    actual open var paddingRight: String
    actual open var paddingTop: String
    actual open var pageBreakAfter: String
    actual open var pageBreakBefore: String
    actual open var pageBreakInside: String
    actual open var perspective: String
    actual open var perspectiveOrigin: String
    actual open var phonemes: String
    actual open var position: String
    actual open var quotes: String
    actual open var resize: String
    actual open var rest: String
    actual open var restAfter: String
    actual open var restBefore: String
    actual open var right: String
    actual open var tabSize: String
    actual open var tableLayout: String
    actual open var textAlign: String
    actual open var textAlignLast: String
    actual open var textCombineUpright: String
    actual open var textDecoration: String
    actual open var textDecorationColor: String
    actual open var textDecorationLine: String
    actual open var textDecorationStyle: String
    actual open var textIndent: String
    actual open var textJustify: String
    actual open var textOrientation: String
    actual open var textOverflow: String
    actual open var textShadow: String
    actual open var textTransform: String
    actual open var textUnderlinePosition: String
    actual open var top: String
    actual open var transform: String
    actual open var transformOrigin: String
    actual open var transformStyle: String
    actual open var transition: String
    actual open var transitionDelay: String
    actual open var transitionDuration: String
    actual open var transitionProperty: String
    actual open var transitionTimingFunction: String
    actual open var unicodeBidi: String
    actual open var verticalAlign: String
    actual open var visibility: String
    actual open var voiceBalance: String
    actual open var voiceDuration: String
    actual open var voicePitch: String
    actual open var voicePitchRange: String
    actual open var voiceRate: String
    actual open var voiceStress: String
    actual open var voiceVolume: String
    actual open var whiteSpace: String
    actual open var widows: String
    actual open var width: String
    actual open var wordBreak: String
    actual open var wordSpacing: String
    actual open var wordWrap: String
    actual open var writingMode: String
    actual open var zIndex: String
    actual open var _dashed_attribute: String
    actual open var _camel_cased_attribute: String
    actual open var _webkit_cased_attribute: String
    actual fun getPropertyValue(property: String): String
    actual fun getPropertyPriority(property: String): String
    actual fun setProperty(property: String, value: String, priority: String)
    actual fun setPropertyValue(property: String, value: String)
    actual fun setPropertyPriority(property: String, priority: String)
    actual fun removeProperty(property: String): String
    actual override fun item(index: Int): String
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun CSSStyleDeclaration.get(index: Int): String? = asDynamic()[index]

actual external interface ElementCSSInlineStyle {
    actual val style: CSSStyleDeclaration
}

/**
 * Exposes the JavaScript [CSS](https://developer.mozilla.org/en/docs/Web/API/CSS) to Kotlin
 */
actual external abstract class CSS {
    actual companion object {
        actual fun escape(ident: String): String
    }
}

actual external interface UnionElementOrProcessingInstruction