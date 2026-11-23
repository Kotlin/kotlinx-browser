/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'cssom', DO NOT EDIT!

package org.w3c.dom.css

import kotlin.js.*
import org.w3c.dom.*

public external interface UnionElementOrProcessingInstruction : JsAny

public external abstract class MediaList : ItemArrayLike<JsString> {
    open var mediaText: String
    override val length: Int
    override fun item(index: Int): JsString?
    open fun appendMedium(medium: String)
    open fun deleteMedium(medium: String)
}

public operator fun MediaList.get(index: Int): String? = getStringProperty(this, index)

public external abstract class StyleSheet : JsAny {
    open val type: String
    open val href: String?
    open val ownerNode: UnionElementOrProcessingInstruction?
    open val parentStyleSheet: CSSStyleSheet?
    open val title: String?
    open val media: MediaList
    open var disabled: Boolean
}

public external open class CSSStyleSheet : StyleSheet {
    constructor(options: CSSStyleSheetInit = definedExternally)
    open val ownerRule: CSSRule?
    open val cssRules: CSSRuleList
    open fun insertRule(rule: String, index: Int = definedExternally): Int
    open fun deleteRule(index: Int)
    open fun replace(text: String): Promise<CSSStyleSheet>
    open fun replaceSync(text: String)
    open val rules: CSSRuleList
    open fun addRule(selector: String = definedExternally, style: String = definedExternally, index: Int = definedExternally): Int
    open fun removeRule(index: Int = definedExternally)
}

public external interface CSSStyleSheetInit : JsAny {
    var baseURL: String?
    var media: JsAny?
    var disabled: Boolean?
}

public fun CSSStyleSheetInit(baseURL: String? = null, media: JsAny? = null, disabled: Boolean? = null): CSSStyleSheetInit = newJsObject<CSSStyleSheetInit>().apply {
    if (baseURL != null) this.baseURL = baseURL
    if (media != null) this.media = media
    if (disabled != null) this.disabled = disabled
}

public external abstract class StyleSheetList : ItemArrayLike<CSSStyleSheet> {
    override fun item(index: Int): CSSStyleSheet?
    override val length: Int
}

public operator fun StyleSheetList.get(index: Int): CSSStyleSheet? = getProperty(this, index)

public external interface LinkStyle : JsAny {
    val sheet: CSSStyleSheet?
}

public external abstract class CSSRuleList : ItemArrayLike<CSSRule> {
    override fun item(index: Int): CSSRule?
    override val length: Int
}

public operator fun CSSRuleList.get(index: Int): CSSRule? = getProperty(this, index)

public external abstract class CSSRule : JsAny {
    open var cssText: String
    open val parentRule: CSSRule?
    open val parentStyleSheet: CSSStyleSheet?
    open val type: Short

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

public external abstract class CSSStyleRule : CSSGroupingRule {
    open var selectorText: String
    open val style: CSSStyleProperties

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

public external abstract class CSSImportRule : CSSRule {
    open val href: String
    open val media: MediaList
    open val styleSheet: CSSStyleSheet?
    open val layerName: String?
    open val supportsText: String?

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

public external abstract class CSSGroupingRule : CSSRule {
    open val cssRules: CSSRuleList
    open fun insertRule(rule: String, index: Int = definedExternally): Int
    open fun deleteRule(index: Int)

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

public external abstract class CSSPageDescriptors : CSSStyleDeclaration {
    open var margin: String
    open var marginTop: String
    open var marginRight: String
    open var marginBottom: String
    open var marginLeft: String
    open var size: String
    open var pageOrientation: String
    open var marks: String
    open var bleed: String
}

public external abstract class CSSPageRule : CSSGroupingRule {
    open var selectorText: String
    open val style: CSSPageDescriptors

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
        val SUPPORTS_RULE: Short
    }
}

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
        val SUPPORTS_RULE: Short
    }
}

public external abstract class CSSStyleDeclaration : ItemArrayLike<JsString> {
    open var cssText: String
    override val length: Int
    override fun item(index: Int): JsString
    open fun getPropertyValue(property: String): String
    open fun getPropertyPriority(property: String): String
    open fun setProperty(property: String, value: String, priority: String = definedExternally)
    open fun removeProperty(property: String): String
    open val parentRule: CSSRule?
}

public operator fun CSSStyleDeclaration.get(index: Int): String? = getStringProperty(this, index)

public external abstract class CSSStyleProperties : CSSStyleDeclaration {
    open var cssFloat: String
}

public external interface ElementCSSInlineStyle : JsAny {
    val style: CSSStyleProperties
}

public external object CSS {
    fun escape(ident: String): String
    fun supports(property: String, value: String): Boolean
    fun supports(conditionText: String): Boolean
}
