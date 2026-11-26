/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'css-conditional', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.dom.css

/**
 * An object implementing the CSSConditionRule interface represents a single condition CSS at-rule, which consists of a
 * condition and a statement block.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSConditionRule)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class CSSConditionRule : CSSGroupingRule {
    /**
     * The read-only conditionText property of the CSSConditionRule interface returns or sets the text of the CSS rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSConditionRule/conditionText)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val conditionText: String

    public companion object {
        public val STYLE_RULE: Short
        public val CHARSET_RULE: Short
        public val IMPORT_RULE: Short
        public val MEDIA_RULE: Short
        public val FONT_FACE_RULE: Short
        public val PAGE_RULE: Short
        public val MARGIN_RULE: Short
        public val NAMESPACE_RULE: Short
        public val SUPPORTS_RULE: Short
    }
}

/**
 * The CSSMediaRule interface represents a single CSS \@media rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMediaRule)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class CSSMediaRule : CSSConditionRule {
    /**
     * The read-only media property of the CSSMediaRule interface contains a MediaList object representing the media
     * query list of the \@media rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMediaRule/media)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val media: MediaList
    public open val matches: Boolean

    public companion object {
        public val STYLE_RULE: Short
        public val CHARSET_RULE: Short
        public val IMPORT_RULE: Short
        public val MEDIA_RULE: Short
        public val FONT_FACE_RULE: Short
        public val PAGE_RULE: Short
        public val MARGIN_RULE: Short
        public val NAMESPACE_RULE: Short
        public val SUPPORTS_RULE: Short
    }
}

/**
 * The CSSSupportsRule interface represents a single CSS \@supports at-rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSSupportsRule)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class CSSSupportsRule : CSSConditionRule {
    public open val matches: Boolean

    public companion object {
        public val STYLE_RULE: Short
        public val CHARSET_RULE: Short
        public val IMPORT_RULE: Short
        public val MEDIA_RULE: Short
        public val FONT_FACE_RULE: Short
        public val PAGE_RULE: Short
        public val MARGIN_RULE: Short
        public val NAMESPACE_RULE: Short
        public val SUPPORTS_RULE: Short
    }
}
