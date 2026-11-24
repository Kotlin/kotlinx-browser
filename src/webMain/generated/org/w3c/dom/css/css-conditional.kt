/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'css-conditional', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.dom.css

/**
 * An object implementing the CSSConditionRule interface represents a single condition CSS at-rule, which consists of a
 * condition and a statement block.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSConditionRule)
 */
public abstract external class CSSConditionRule : CSSGroupingRule {
    /**
     * The read-only conditionText property of the CSSConditionRule interface returns or sets the text of the CSS rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSConditionRule/conditionText)
     */
    open val conditionText: String

    companion object {
        val STYLE_RULE: Short
        val CHARSET_RULE: Short
        val IMPORT_RULE: Short
        val MEDIA_RULE: Short
        val FONT_FACE_RULE: Short
        val PAGE_RULE: Short
        val MARGIN_RULE: Short
        val NAMESPACE_RULE: Short
        val SUPPORTS_RULE: Short
    }
}

/**
 * The CSSMediaRule interface represents a single CSS \@media rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMediaRule)
 */
public abstract external class CSSMediaRule : CSSConditionRule {
    /**
     * The read-only media property of the CSSMediaRule interface contains a MediaList object representing the media
     * query list of the \@media rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMediaRule/media)
     */
    open val media: MediaList
    open val matches: Boolean

    companion object {
        val STYLE_RULE: Short
        val CHARSET_RULE: Short
        val IMPORT_RULE: Short
        val MEDIA_RULE: Short
        val FONT_FACE_RULE: Short
        val PAGE_RULE: Short
        val MARGIN_RULE: Short
        val NAMESPACE_RULE: Short
        val SUPPORTS_RULE: Short
    }
}

/**
 * The CSSSupportsRule interface represents a single CSS \@supports at-rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSSupportsRule)
 */
public abstract external class CSSSupportsRule : CSSConditionRule {
    open val matches: Boolean

    companion object {
        val STYLE_RULE: Short
        val CHARSET_RULE: Short
        val IMPORT_RULE: Short
        val MEDIA_RULE: Short
        val FONT_FACE_RULE: Short
        val PAGE_RULE: Short
        val MARGIN_RULE: Short
        val NAMESPACE_RULE: Short
        val SUPPORTS_RULE: Short
    }
}
