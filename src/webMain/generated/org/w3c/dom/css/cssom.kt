/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'cssom', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.dom.css

import kotlin.js.*
import org.w3c.dom.*

public external interface UnionElementOrProcessingInstruction : JsAny

/**
 * The MediaList interface represents the media queries of a stylesheet, e.g., those set using a &lt;link&gt; element's
 * media attribute.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList)
 */
public abstract external class MediaList : ItemArrayLike<JsString> {
    /**
     * The mediaText property of the MediaList interface is a stringifier that returns a string representing the
     * MediaList as text, and also allows you to set a new MediaList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/mediaText)
     */
    public open var mediaText: String

    /**
     * The read-only length property of the MediaList interface returns the number of media queries in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/length)
     */
    override val length: Int

    /**
     * The item() method of the MediaList interface returns the media query at the specified index, or null if the
     * specified index doesn't exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/item)
     */
    override fun item(index: Int): JsString?

    /**
     * The appendMedium() method of the MediaList interface adds a media query to the list. If the media query is
     * already in the collection, this method does nothing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/appendMedium)
     */
    public open fun appendMedium(medium: String)

    /**
     * The deleteMedium() method of the MediaList interface removes from this MediaList the given media query.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/deleteMedium)
     */
    public open fun deleteMedium(medium: String)
}

public operator fun MediaList.get(index: Int): String? = getStringProperty(this, index)

/**
 * An object implementing the StyleSheet interface represents a single style sheet. CSS style sheets will further
 * implement the more specialized CSSStyleSheet interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet)
 */
public abstract external class StyleSheet : JsAny {
    /**
     * The type read-only property of the StyleSheet interface specifies the style sheet language for the given style
     * sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/type)
     */
    public open val type: String

    /**
     * The href property of the StyleSheet interface returns the location of the style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/href)
     */
    public open val href: String?

    /**
     * The ownerNode read-only property of the StyleSheet interface returns the node that associates this style sheet
     * with the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/ownerNode)
     */
    public open val ownerNode: UnionElementOrProcessingInstruction?

    /**
     * The parentStyleSheet read-only property of the StyleSheet interface returns the style sheet, if any, that is
     * including the given style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/parentStyleSheet)
     */
    public open val parentStyleSheet: CSSStyleSheet?

    /**
     * The title read-only property of the StyleSheet interface returns the advisory title of the current style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/title)
     */
    public open val title: String?

    /**
     * The read-only media property of the StyleSheet interface contains a MediaList object representing the intended
     * destination media for style information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/media)
     */
    public open val media: MediaList

    /**
     * The disabled property of the StyleSheet interface determines whether the style sheet is prevented from applying
     * to the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/disabled)
     */
    public open var disabled: Boolean
}

/**
 * The CSSStyleSheet interface represents a single CSS stylesheet, and lets you inspect and modify the list of rules
 * contained in the stylesheet. It inherits properties and methods from its parent, StyleSheet.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet)
 */
public open external class CSSStyleSheet : StyleSheet {
    /**
     * The CSSStyleSheet() constructor creates a new CSSStyleSheet object which represents a single Stylesheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/CSSStyleSheet)
     */
    public constructor(options: CSSStyleSheetInit = definedExternally)

    /**
     * The read-only CSSStyleSheet property ownerRule returns the CSSImportRule corresponding to the \@import at-rule
     * which imported the stylesheet into the document. If the stylesheet wasn't imported into the document using
     * \@import, the returned value is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/ownerRule)
     */
    public open val ownerRule: CSSRule?

    /**
     * The read-only CSSStyleSheet property cssRules returns a live CSSRuleList which provides a real-time, up-to-date
     * list of every CSS rule which comprises the stylesheet. Each item in the list is a CSSRule defining a single rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/cssRules)
     */
    public open val cssRules: CSSRuleList

    /**
     * The CSSStyleSheet.insertRule() method inserts a new CSS rule into the current style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/insertRule)
     */
    public open fun insertRule(rule: String, index: Int = definedExternally): Int

    /**
     * The CSSStyleSheet method deleteRule() removes a rule from the stylesheet object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/deleteRule)
     */
    public open fun deleteRule(index: Int)

    /**
     * The replace() method of the CSSStyleSheet interface asynchronously replaces the content of the stylesheet with
     * the content passed into it. The method returns a promise that resolves with the CSSStyleSheet object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/replace)
     */
    public open fun replace(text: String): Promise<CSSStyleSheet>

    /**
     * The replaceSync() method of the CSSStyleSheet interface synchronously replaces the content of the stylesheet with
     * the content passed into it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/replaceSync)
     */
    public open fun replaceSync(text: String)

    /**
     * The rules read-only property of the CSSStyleSheet interface is a deprecated legacy property. Functionally
     * identical to the preferred cssRules property, it provides access to a live-updating list of the CSS rules
     * comprising the stylesheet.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/rules)
     */
    public open val rules: CSSRuleList

    /**
     * The obsolete CSSStyleSheet interface's addRule() legacy method adds a new rule to the stylesheet. You should
     * avoid using this method, and should instead use the more standard insertRule() method.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/addRule)
     */
    public open fun addRule(selector: String = definedExternally, style: String = definedExternally, index: Int = definedExternally): Int

    /**
     * The obsolete CSSStyleSheet method removeRule() removes a rule from the stylesheet object. It is functionally
     * identical to the standard, preferred method deleteRule().
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/removeRule)
     */
    public open fun removeRule(index: Int = definedExternally)
}

public external interface CSSStyleSheetInit : JsAny {
    public var baseURL: String?
    public var media: JsAny?
    public var disabled: Boolean?
}

public fun CSSStyleSheetInit(baseURL: String? = null, media: JsAny? = null, disabled: Boolean? = null): CSSStyleSheetInit = newJsObject<CSSStyleSheetInit>().apply {
    if (baseURL != null) this.baseURL = baseURL
    if (media != null) this.media = media
    if (disabled != null) this.disabled = disabled
}

/**
 * The StyleSheetList interface represents a list of CSSStyleSheet objects. An instance of this object can be returned
 * by Document.styleSheets.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheetList)
 */
public abstract external class StyleSheetList : ItemArrayLike<CSSStyleSheet> {
    /**
     * The item() method of the StyleSheetList interface returns a single CSSStyleSheet object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheetList/item)
     */
    override fun item(index: Int): CSSStyleSheet?

    /**
     * The length read-only property of the StyleSheetList interface returns the number of CSSStyleSheet objects in the
     * collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheetList/length)
     */
    override val length: Int
}

public operator fun StyleSheetList.get(index: Int): CSSStyleSheet? = getProperty(this, index)

public external interface LinkStyle : JsAny {
    /**
     * The sheet read-only property of the HTMLLinkElement interface contains the stylesheet associated with that
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/sheet)
     */
    public val sheet: CSSStyleSheet?
}

/**
 * A CSSRuleList represents an ordered collection of read-only CSSRule objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRuleList)
 */
public abstract external class CSSRuleList : ItemArrayLike<CSSRule> {
    /**
     * The item() method of the CSSRuleList interface returns the CSSRule object at the specified index or null if the
     * specified index doesn't exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRuleList/item)
     */
    override fun item(index: Int): CSSRule?

    /**
     * The length property of the CSSRuleList interface returns the number of CSSRule objects in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRuleList/length)
     */
    override val length: Int
}

public operator fun CSSRuleList.get(index: Int): CSSRule? = getProperty(this, index)

/**
 * The CSSRule interface represents a single CSS rule. There are several types of rules which inherit properties from
 * CSSRule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule)
 */
public abstract external class CSSRule : JsAny {
    /**
     * The cssText property of the CSSRule interface returns the actual text of a CSSStyleSheet style-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/cssText)
     */
    public open var cssText: String

    /**
     * The parentRule read-only property of the CSSRule interface returns the containing rule of the current rule if
     * this exists, or otherwise returns null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/parentRule)
     */
    public open val parentRule: CSSRule?

    /**
     * The parentStyleSheet read-only property of the CSSRule interface returns the StyleSheet object in which the
     * current rule is defined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/parentStyleSheet)
     */
    public open val parentStyleSheet: CSSStyleSheet?

    /**
     * The read-only type property of the CSSRule interface is a deprecated property that returns an integer indicating
     * which type of rule the CSSRule represents.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/type)
     */
    public open val type: Short

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
 * The CSSStyleRule interface represents a single CSS style rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule)
 */
public abstract external class CSSStyleRule : CSSGroupingRule {
    /**
     * The selectorText property of the CSSStyleRule interface gets and sets the selectors associated with the
     * CSSStyleRule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/selectorText)
     */
    public open var selectorText: String

    /**
     * The read-only style property of the CSSStyleRule interface contains a CSSStyleProperties object representing the
     * properties list in this style rule's body.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/style)
     */
    public open val style: CSSStyleProperties

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
 * The CSSImportRule interface represents an \@import at-rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule)
 */
public abstract external class CSSImportRule : CSSRule {
    /**
     * The read-only href property of the CSSImportRule interface returns the URL specified by the \@import at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/href)
     */
    public open val href: String

    /**
     * The read-only media property of the CSSImportRule interface returns a MediaList object representing the media
     * query list of the \@import rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/media)
     */
    public open val media: MediaList

    /**
     * The read-only styleSheet property of the CSSImportRule interface returns the CSS Stylesheet specified by the
     * \@import at-rule. This will be in the form of a CSSStyleSheet object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/styleSheet)
     */
    public open val styleSheet: CSSStyleSheet?

    /**
     * The read-only layerName property of the CSSImportRule interface returns the name of the cascade layer created by
     * the \@import at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/layerName)
     */
    public open val layerName: String?

    /**
     * The read-only supportsText property of the CSSImportRule interface returns the supports condition specified by
     * the \@import at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/supportsText)
     */
    public open val supportsText: String?

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
 * The CSSGroupingRule interface of the CSS Object Model represents any CSS at-rule that contains other rules nested
 * within it.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule)
 */
public abstract external class CSSGroupingRule : CSSRule {
    /**
     * The cssRules property of the CSSGroupingRule interface returns a CSSRuleList containing a collection of CSSRule
     * objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/cssRules)
     */
    public open val cssRules: CSSRuleList

    /**
     * The insertRule() method of the CSSGroupingRule interface adds a new CSS rule to a list of CSS rules.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/insertRule)
     */
    public open fun insertRule(rule: String, index: Int = definedExternally): Int

    /**
     * The deleteRule() method of the CSSGroupingRule interface removes a CSS rule from a list of child CSS rules.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/deleteRule)
     */
    public open fun deleteRule(index: Int)

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
 * The CSSPageDescriptors interface represents a CSS declaration block for an \@page at-rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageDescriptors)
 */
public abstract external class CSSPageDescriptors : CSSStyleDeclaration {
    /**
     * The CSSPageDescriptors interface represents a CSS declaration block for an \@page at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageDescriptors#margin)
     */
    public open var margin: String

    /**
     * The CSSPageDescriptors interface represents a CSS declaration block for an \@page at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageDescriptors#margintop)
     */
    public open var marginTop: String

    /**
     * The CSSPageDescriptors interface represents a CSS declaration block for an \@page at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageDescriptors#marginright)
     */
    public open var marginRight: String

    /**
     * The CSSPageDescriptors interface represents a CSS declaration block for an \@page at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageDescriptors#marginbottom)
     */
    public open var marginBottom: String

    /**
     * The CSSPageDescriptors interface represents a CSS declaration block for an \@page at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageDescriptors#marginleft)
     */
    public open var marginLeft: String

    /**
     * The CSSPageDescriptors interface represents a CSS declaration block for an \@page at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageDescriptors#size)
     */
    public open var size: String

    /**
     * The CSSPageDescriptors interface represents a CSS declaration block for an \@page at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageDescriptors#pageorientation)
     */
    public open var pageOrientation: String
    public open var marks: String
    public open var bleed: String
}

/**
 * CSSPageRule represents a single CSS \@page rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageRule)
 */
public abstract external class CSSPageRule : CSSGroupingRule {
    /**
     * The selectorText property of the CSSPageRule interface gets and sets the selectors associated with the
     * CSSPageRule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageRule/selectorText)
     */
    public open var selectorText: String

    /**
     * The read-only style property of the CSSPageRule interface contains a CSSPageDescriptors object representing the
     * descriptors available in the \@page rule's body.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageRule/style)
     */
    public open val style: CSSPageDescriptors

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

public abstract external class CSSMarginRule : CSSRule {
    public open val name: String
    public open val style: CSSStyleDeclaration

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
 * The CSSNamespaceRule interface describes an object representing a single CSS \@namespace at-rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNamespaceRule)
 */
public abstract external class CSSNamespaceRule : CSSRule {
    /**
     * The read-only namespaceURI property of the CSSNamespaceRule returns a string containing the text of the URI of
     * the given namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNamespaceRule/namespaceURI)
     */
    public open val namespaceURI: String

    /**
     * The read-only prefix property of the CSSNamespaceRule returns a string with the name of the prefix associated to
     * this namespace. If there is no such prefix, it returns an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNamespaceRule/prefix)
     */
    public open val prefix: String

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
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration)
 */
public abstract external class CSSStyleDeclaration : ItemArrayLike<JsString> {
    /**
     * The cssText property of the CSSStyleDeclaration interface returns or sets the text of the element's inline style
     * declaration only.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/cssText)
     */
    public open var cssText: String

    /**
     * The read-only property returns an integer that represents the number of style declarations in this CSS
     * declaration block.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/length)
     */
    override val length: Int

    /**
     * The CSSStyleDeclaration.item() method interface returns a CSS property name from a CSSStyleDeclaration by index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/item)
     */
    override fun item(index: Int): JsString

    /**
     * The CSSStyleDeclaration.getPropertyValue() method interface returns a string containing the value of a specified
     * CSS property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/getPropertyValue)
     */
    public open fun getPropertyValue(property: String): String

    /**
     * The CSSStyleDeclaration.getPropertyPriority() method interface returns a string that provides all explicitly set
     * priorities on the CSS property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/getPropertyPriority)
     */
    public open fun getPropertyPriority(property: String): String

    /**
     * The CSSStyleDeclaration.setProperty() method interface sets a new value for a property on a CSS style declaration
     * object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/setProperty)
     */
    public open fun setProperty(property: String, value: String, priority: String = definedExternally)

    /**
     * The CSSStyleDeclaration.removeProperty() method interface removes a property from a CSS style declaration object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/removeProperty)
     */
    public open fun removeProperty(property: String): String

    /**
     * The CSSStyleDeclaration.parentRule read-only property returns a CSSRule that is the parent of this style block,
     * e.g., a CSSStyleRule representing the style for a CSS selector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/parentRule)
     */
    public open val parentRule: CSSRule?
}

public operator fun CSSStyleDeclaration.get(index: Int): String? = getStringProperty(this, index)

/**
 * The CSSStyleProperties interface of the CSS Object Model (CSSOM) represents inline or computed styles available on an
 * element, or the styles associated with a CSS style rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleProperties)
 */
public abstract external class CSSStyleProperties : CSSStyleDeclaration {
    /**
     * The cssFloat property of the CSSStyleProperties interface returns the CSS float property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleProperties/cssFloat)
     */
    public open var cssFloat: String
    public open var accentColor: String
    public open var alignContent: String
    public open var alignItems: String
    public open var alignSelf: String
    public open var alignmentBaseline: String
    public open var all: String
    public open var anchorName: String
    public open var anchorScope: String
    public open var animation: String
    public open var animationComposition: String
    public open var animationDelay: String
    public open var animationDelayEnd: String
    public open var animationDelayStart: String
    public open var animationDirection: String
    public open var animationDuration: String
    public open var animationFillMode: String
    public open var animationIterationCount: String
    public open var animationName: String
    public open var animationPlayState: String
    public open var animationRange: String
    public open var animationRangeCenter: String
    public open var animationRangeEnd: String
    public open var animationRangeStart: String
    public open var animationTimeline: String
    public open var animationTimingFunction: String
    public open var animationTrigger: String
    public open var appearance: String
    public open var aspectRatio: String
    public open var backdropFilter: String
    public open var backfaceVisibility: String
    public open var background: String
    public open var backgroundAttachment: String
    public open var backgroundBlendMode: String
    public open var backgroundClip: String
    public open var backgroundColor: String
    public open var backgroundImage: String
    public open var backgroundOrigin: String
    public open var backgroundPosition: String
    public open var backgroundPositionBlock: String
    public open var backgroundPositionInline: String
    public open var backgroundPositionX: String
    public open var backgroundPositionY: String
    public open var backgroundRepeat: String
    public open var backgroundRepeatBlock: String
    public open var backgroundRepeatInline: String
    public open var backgroundRepeatX: String
    public open var backgroundRepeatY: String
    public open var backgroundSize: String
    public open var backgroundTbd: String
    public open var baselineShift: String
    public open var baselineSource: String
    public open var blockEllipsis: String
    public open var blockSize: String
    public open var blockStep: String
    public open var blockStepAlign: String
    public open var blockStepInsert: String
    public open var blockStepRound: String
    public open var blockStepSize: String
    public open var bookmarkLabel: String
    public open var bookmarkLevel: String
    public open var bookmarkState: String
    public open var border: String
    public open var borderBlock: String
    public open var borderBlockClip: String
    public open var borderBlockColor: String
    public open var borderBlockEnd: String
    public open var borderBlockEndClip: String
    public open var borderBlockEndColor: String
    public open var borderBlockEndRadius: String
    public open var borderBlockEndStyle: String
    public open var borderBlockEndWidth: String
    public open var borderBlockStart: String
    public open var borderBlockStartClip: String
    public open var borderBlockStartColor: String
    public open var borderBlockStartRadius: String
    public open var borderBlockStartStyle: String
    public open var borderBlockStartWidth: String
    public open var borderBlockStyle: String
    public open var borderBlockWidth: String
    public open var borderBottom: String
    public open var borderBottomClip: String
    public open var borderBottomColor: String
    public open var borderBottomLeftRadius: String
    public open var borderBottomRadius: String
    public open var borderBottomRightRadius: String
    public open var borderBottomStyle: String
    public open var borderBottomWidth: String
    public open var borderBoundary: String
    public open var borderClip: String
    public open var borderCollapse: String
    public open var borderColor: String
    public open var borderEndEndRadius: String
    public open var borderEndStartRadius: String
    public open var borderImage: String
    public open var borderImageOutset: String
    public open var borderImageRepeat: String
    public open var borderImageSlice: String
    public open var borderImageSource: String
    public open var borderImageWidth: String
    public open var borderInline: String
    public open var borderInlineClip: String
    public open var borderInlineColor: String
    public open var borderInlineEnd: String
    public open var borderInlineEndClip: String
    public open var borderInlineEndColor: String
    public open var borderInlineEndRadius: String
    public open var borderInlineEndStyle: String
    public open var borderInlineEndWidth: String
    public open var borderInlineStart: String
    public open var borderInlineStartClip: String
    public open var borderInlineStartColor: String
    public open var borderInlineStartRadius: String
    public open var borderInlineStartStyle: String
    public open var borderInlineStartWidth: String
    public open var borderInlineStyle: String
    public open var borderInlineWidth: String
    public open var borderLeft: String
    public open var borderLeftClip: String
    public open var borderLeftColor: String
    public open var borderLeftRadius: String
    public open var borderLeftStyle: String
    public open var borderLeftWidth: String
    public open var borderLimit: String
    public open var borderRadius: String
    public open var borderRight: String
    public open var borderRightClip: String
    public open var borderRightColor: String
    public open var borderRightRadius: String
    public open var borderRightStyle: String
    public open var borderRightWidth: String
    public open var borderShape: String
    public open var borderSpacing: String
    public open var borderStartEndRadius: String
    public open var borderStartStartRadius: String
    public open var borderStyle: String
    public open var borderTop: String
    public open var borderTopClip: String
    public open var borderTopColor: String
    public open var borderTopLeftRadius: String
    public open var borderTopRadius: String
    public open var borderTopRightRadius: String
    public open var borderTopStyle: String
    public open var borderTopWidth: String
    public open var borderWidth: String
    public open var bottom: String
    public open var boxDecorationBreak: String
    public open var boxShadow: String
    public open var boxShadowBlur: String
    public open var boxShadowColor: String
    public open var boxShadowOffset: String
    public open var boxShadowPosition: String
    public open var boxShadowSpread: String
    public open var boxSizing: String
    public open var boxSnap: String
    public open var breakAfter: String
    public open var breakBefore: String
    public open var breakInside: String
    public open var captionSide: String
    public open var caret: String
    public open var caretAnimation: String
    public open var caretColor: String
    public open var caretShape: String
    public open var clear: String
    public open var clip: String
    public open var clipPath: String
    public open var clipRule: String
    public open var color: String
    public open var colorAdjust: String
    public open var colorInterpolation: String
    public open var colorInterpolationFilters: String
    public open var colorScheme: String
    public open var columnCount: String
    public open var columnFill: String
    public open var columnGap: String
    public open var columnHeight: String
    public open var columnRule: String
    public open var columnRuleBreak: String
    public open var columnRuleColor: String
    public open var columnRuleInset: String
    public open var columnRuleInsetCap: String
    public open var columnRuleInsetCapEnd: String
    public open var columnRuleInsetCapStart: String
    public open var columnRuleInsetEnd: String
    public open var columnRuleInsetJunction: String
    public open var columnRuleInsetJunctionEnd: String
    public open var columnRuleInsetJunctionStart: String
    public open var columnRuleInsetStart: String
    public open var columnRuleStyle: String
    public open var columnRuleVisibilityItems: String
    public open var columnRuleWidth: String
    public open var columnSpan: String
    public open var columnWidth: String
    public open var columnWrap: String
    public open var columns: String
    public open var contain: String
    public open var containIntrinsicBlockSize: String
    public open var containIntrinsicHeight: String
    public open var containIntrinsicInlineSize: String
    public open var containIntrinsicSize: String
    public open var containIntrinsicWidth: String
    public open var container: String
    public open var containerName: String
    public open var containerType: String
    public open var content: String
    public open var contentVisibility: String
    public open var `continue`: String
    public open var copyInto: String
    public open var corner: String
    public open var cornerBlockEnd: String
    public open var cornerBlockEndShape: String
    public open var cornerBlockStart: String
    public open var cornerBlockStartShape: String
    public open var cornerBottom: String
    public open var cornerBottomLeft: String
    public open var cornerBottomLeftShape: String
    public open var cornerBottomRight: String
    public open var cornerBottomRightShape: String
    public open var cornerBottomShape: String
    public open var cornerEndEnd: String
    public open var cornerEndEndShape: String
    public open var cornerEndStart: String
    public open var cornerEndStartShape: String
    public open var cornerInlineEnd: String
    public open var cornerInlineEndShape: String
    public open var cornerInlineStart: String
    public open var cornerInlineStartShape: String
    public open var cornerLeft: String
    public open var cornerLeftShape: String
    public open var cornerRight: String
    public open var cornerRightShape: String
    public open var cornerShape: String
    public open var cornerStartEnd: String
    public open var cornerStartEndShape: String
    public open var cornerStartStart: String
    public open var cornerStartStartShape: String
    public open var cornerTop: String
    public open var cornerTopLeft: String
    public open var cornerTopLeftShape: String
    public open var cornerTopRight: String
    public open var cornerTopRightShape: String
    public open var cornerTopShape: String
    public open var counterIncrement: String
    public open var counterReset: String
    public open var counterSet: String
    public open var cue: String
    public open var cueAfter: String
    public open var cueBefore: String
    public open var cursor: String
    public open var cx: String
    public open var cy: String
    public open var d: String
    public open var direction: String
    public open var display: String
    public open var dominantBaseline: String
    public open var dynamicRangeLimit: String
    public open var emptyCells: String
    public open var eventTrigger: String
    public open var eventTriggerName: String
    public open var eventTriggerSource: String
    public open var fieldSizing: String
    public open var fill: String
    public open var fillBreak: String
    public open var fillColor: String
    public open var fillImage: String
    public open var fillOpacity: String
    public open var fillOrigin: String
    public open var fillPosition: String
    public open var fillRepeat: String
    public open var fillRule: String
    public open var fillSize: String
    public open var filter: String
    public open var fitTolerance: String
    public open var flex: String
    public open var flexBasis: String
    public open var flexDirection: String
    public open var flexFlow: String
    public open var flexGrow: String
    public open var flexLineCount: String
    public open var flexShrink: String
    public open var flexWrap: String
    public open var float: String
    public open var floatDefer: String
    public open var floatOffset: String
    public open var floatReference: String
    public open var floodColor: String
    public open var floodOpacity: String
    public open var flowFrom: String
    public open var flowInto: String
    public open var font: String
    public open var fontFamily: String
    public open var fontFeatureSettings: String
    public open var fontKerning: String
    public open var fontLanguageOverride: String
    public open var fontOpticalSizing: String
    public open var fontPalette: String
    public open var fontSize: String
    public open var fontSizeAdjust: String
    public open var fontStretch: String
    public open var fontStyle: String
    public open var fontSynthesis: String
    public open var fontSynthesisPosition: String
    public open var fontSynthesisSmallCaps: String
    public open var fontSynthesisStyle: String
    public open var fontSynthesisWeight: String
    public open var fontVariant: String
    public open var fontVariantAlternates: String
    public open var fontVariantCaps: String
    public open var fontVariantEastAsian: String
    public open var fontVariantEmoji: String
    public open var fontVariantLigatures: String
    public open var fontVariantNumeric: String
    public open var fontVariantPosition: String
    public open var fontVariationSettings: String
    public open var fontWeight: String
    public open var fontWidth: String
    public open var footnoteDisplay: String
    public open var footnotePolicy: String
    public open var forcedColorAdjust: String
    public open var frameSizing: String
    public open var gap: String
    public open var glyphOrientationVertical: String
    public open var grid: String
    public open var gridArea: String
    public open var gridAutoColumns: String
    public open var gridAutoFlow: String
    public open var gridAutoRows: String
    public open var gridColumn: String
    public open var gridColumnEnd: String
    public open var gridColumnGap: String
    public open var gridColumnStart: String
    public open var gridGap: String
    public open var gridRow: String
    public open var gridRowEnd: String
    public open var gridRowGap: String
    public open var gridRowStart: String
    public open var gridTemplate: String
    public open var gridTemplateAreas: String
    public open var gridTemplateColumns: String
    public open var gridTemplateRows: String
    public open var hangingPunctuation: String
    public open var height: String
    public open var hyphenateCharacter: String
    public open var hyphenateLimitChars: String
    public open var hyphenateLimitLast: String
    public open var hyphenateLimitLines: String
    public open var hyphenateLimitZone: String
    public open var hyphens: String
    public open var imageAnimation: String
    public open var imageOrientation: String
    public open var imageRendering: String
    public open var imageResolution: String
    public open var initialLetter: String
    public open var initialLetterAlign: String
    public open var initialLetterWrap: String
    public open var inlineSize: String
    public open var inlineSizing: String
    public open var inputSecurity: String
    public open var inset: String
    public open var insetBlock: String
    public open var insetBlockEnd: String
    public open var insetBlockStart: String
    public open var insetInline: String
    public open var insetInlineEnd: String
    public open var insetInlineStart: String
    public open var interactivity: String
    public open var interestDelay: String
    public open var interestDelayEnd: String
    public open var interestDelayStart: String
    public open var interpolateSize: String
    public open var isolation: String
    public open var justifyContent: String
    public open var justifyItems: String
    public open var justifySelf: String
    public open var left: String
    public open var letterSpacing: String
    public open var lightingColor: String
    public open var lineBreak: String
    public open var lineClamp: String
    public open var lineFitEdge: String
    public open var lineGrid: String
    public open var lineHeight: String
    public open var lineHeightStep: String
    public open var linePadding: String
    public open var lineSnap: String
    public open var linkParameters: String
    public open var listStyle: String
    public open var listStyleImage: String
    public open var listStylePosition: String
    public open var listStyleType: String
    public open var margin: String
    public open var marginBlock: String
    public open var marginBlockEnd: String
    public open var marginBlockStart: String
    public open var marginBottom: String
    public open var marginBreak: String
    public open var marginInline: String
    public open var marginInlineEnd: String
    public open var marginInlineStart: String
    public open var marginLeft: String
    public open var marginRight: String
    public open var marginTop: String
    public open var marginTrim: String
    public open var marker: String
    public open var markerEnd: String
    public open var markerMid: String
    public open var markerSide: String
    public open var markerStart: String
    public open var mask: String
    public open var maskBorder: String
    public open var maskBorderMode: String
    public open var maskBorderOutset: String
    public open var maskBorderRepeat: String
    public open var maskBorderSlice: String
    public open var maskBorderSource: String
    public open var maskBorderWidth: String
    public open var maskClip: String
    public open var maskComposite: String
    public open var maskImage: String
    public open var maskMode: String
    public open var maskOrigin: String
    public open var maskPosition: String
    public open var maskRepeat: String
    public open var maskSize: String
    public open var maskType: String
    public open var mathDepth: String
    public open var mathShift: String
    public open var mathStyle: String
    public open var maxBlockSize: String
    public open var maxHeight: String
    public open var maxInlineSize: String
    public open var maxLines: String
    public open var maxSize: String
    public open var maxWidth: String
    public open var minBlockSize: String
    public open var minHeight: String
    public open var minInlineSize: String
    public open var minIntrinsicSizing: String
    public open var minSize: String
    public open var minWidth: String
    public open var mixBlendMode: String
    public open var navDown: String
    public open var navLeft: String
    public open var navRight: String
    public open var navUp: String
    public open var objectFit: String
    public open var objectPosition: String
    public open var objectViewBox: String
    public open var offset: String
    public open var offsetAnchor: String
    public open var offsetDistance: String
    public open var offsetPath: String
    public open var offsetPosition: String
    public open var offsetRotate: String
    public open var opacity: String
    public open var order: String
    public open var orphans: String
    public open var outline: String
    public open var outlineColor: String
    public open var outlineOffset: String
    public open var outlineStyle: String
    public open var outlineWidth: String
    public open var overflow: String
    public open var overflowAnchor: String
    public open var overflowBlock: String
    public open var overflowClipMargin: String
    public open var overflowClipMarginBlock: String
    public open var overflowClipMarginBlockEnd: String
    public open var overflowClipMarginBlockStart: String
    public open var overflowClipMarginBottom: String
    public open var overflowClipMarginInline: String
    public open var overflowClipMarginInlineEnd: String
    public open var overflowClipMarginInlineStart: String
    public open var overflowClipMarginLeft: String
    public open var overflowClipMarginRight: String
    public open var overflowClipMarginTop: String
    public open var overflowInline: String
    public open var overflowWrap: String
    public open var overflowX: String
    public open var overflowY: String
    public open var overlay: String
    public open var overscrollBehavior: String
    public open var overscrollBehaviorBlock: String
    public open var overscrollBehaviorInline: String
    public open var overscrollBehaviorX: String
    public open var overscrollBehaviorY: String
    public open var padding: String
    public open var paddingBlock: String
    public open var paddingBlockEnd: String
    public open var paddingBlockStart: String
    public open var paddingBottom: String
    public open var paddingInline: String
    public open var paddingInlineEnd: String
    public open var paddingInlineStart: String
    public open var paddingLeft: String
    public open var paddingRight: String
    public open var paddingTop: String
    public open var page: String
    public open var pageBreakAfter: String
    public open var pageBreakBefore: String
    public open var pageBreakInside: String
    public open var paintOrder: String
    public open var pathLength: String
    public open var pause: String
    public open var pauseAfter: String
    public open var pauseBefore: String
    public open var perspective: String
    public open var perspectiveOrigin: String
    public open var placeContent: String
    public open var placeItems: String
    public open var placeSelf: String
    public open var pointerEvents: String
    public open var pointerTimeline: String
    public open var pointerTimelineAxis: String
    public open var pointerTimelineName: String
    public open var position: String
    public open var positionAnchor: String
    public open var positionArea: String
    public open var positionTry: String
    public open var positionTryFallbacks: String
    public open var positionTryOrder: String
    public open var positionVisibility: String
    public open var printColorAdjust: String
    public open var quotes: String
    public open var r: String
    public open var readingFlow: String
    public open var readingOrder: String
    public open var regionFragment: String
    public open var resize: String
    public open var rest: String
    public open var restAfter: String
    public open var restBefore: String
    public open var right: String
    public open var rotate: String
    public open var rowGap: String
    public open var rowRule: String
    public open var rowRuleBreak: String
    public open var rowRuleColor: String
    public open var rowRuleInset: String
    public open var rowRuleInsetCap: String
    public open var rowRuleInsetCapEnd: String
    public open var rowRuleInsetCapStart: String
    public open var rowRuleInsetEnd: String
    public open var rowRuleInsetJunction: String
    public open var rowRuleInsetJunctionEnd: String
    public open var rowRuleInsetJunctionStart: String
    public open var rowRuleInsetStart: String
    public open var rowRuleStyle: String
    public open var rowRuleVisibilityItems: String
    public open var rowRuleWidth: String
    public open var rubyAlign: String
    public open var rubyMerge: String
    public open var rubyOverhang: String
    public open var rubyPosition: String
    public open var rule: String
    public open var ruleBreak: String
    public open var ruleColor: String
    public open var ruleInset: String
    public open var ruleInsetCap: String
    public open var ruleInsetEnd: String
    public open var ruleInsetJunction: String
    public open var ruleInsetStart: String
    public open var ruleOverlap: String
    public open var ruleStyle: String
    public open var ruleVisibilityItems: String
    public open var ruleWidth: String
    public open var rx: String
    public open var ry: String
    public open var scale: String
    public open var scrollAxisLock: String
    public open var scrollBehavior: String
    public open var scrollInitialTarget: String
    public open var scrollMargin: String
    public open var scrollMarginBlock: String
    public open var scrollMarginBlockEnd: String
    public open var scrollMarginBlockStart: String
    public open var scrollMarginBottom: String
    public open var scrollMarginInline: String
    public open var scrollMarginInlineEnd: String
    public open var scrollMarginInlineStart: String
    public open var scrollMarginLeft: String
    public open var scrollMarginRight: String
    public open var scrollMarginTop: String
    public open var scrollMarkerGroup: String
    public open var scrollPadding: String
    public open var scrollPaddingBlock: String
    public open var scrollPaddingBlockEnd: String
    public open var scrollPaddingBlockStart: String
    public open var scrollPaddingBottom: String
    public open var scrollPaddingInline: String
    public open var scrollPaddingInlineEnd: String
    public open var scrollPaddingInlineStart: String
    public open var scrollPaddingLeft: String
    public open var scrollPaddingRight: String
    public open var scrollPaddingTop: String
    public open var scrollSnapAlign: String
    public open var scrollSnapStop: String
    public open var scrollSnapType: String
    public open var scrollTargetGroup: String
    public open var scrollTimeline: String
    public open var scrollTimelineAxis: String
    public open var scrollTimelineName: String
    public open var scrollbarColor: String
    public open var scrollbarGutter: String
    public open var scrollbarWidth: String
    public open var shapeImageThreshold: String
    public open var shapeInside: String
    public open var shapeMargin: String
    public open var shapeOutside: String
    public open var shapePadding: String
    public open var shapeRendering: String
    public open var size: String
    public open var sliderOrientation: String
    public open var spatialNavigationAction: String
    public open var spatialNavigationContain: String
    public open var spatialNavigationFunction: String
    public open var speak: String
    public open var speakAs: String
    public open var stopColor: String
    public open var stopOpacity: String
    public open var stringSet: String
    public open var stroke: String
    public open var strokeAlign: String
    public open var strokeAlignment: String
    public open var strokeBreak: String
    public open var strokeColor: String
    public open var strokeDashCorner: String
    public open var strokeDashJustify: String
    public open var strokeDashadjust: String
    public open var strokeDasharray: String
    public open var strokeDashcorner: String
    public open var strokeDashoffset: String
    public open var strokeImage: String
    public open var strokeLinecap: String
    public open var strokeLinejoin: String
    public open var strokeMiterlimit: String
    public open var strokeOpacity: String
    public open var strokeOrigin: String
    public open var strokePosition: String
    public open var strokeRepeat: String
    public open var strokeSize: String
    public open var strokeWidth: String
    public open var tabSize: String
    public open var tableLayout: String
    public open var textAlign: String
    public open var textAlignAll: String
    public open var textAlignLast: String
    public open var textAnchor: String
    public open var textAutospace: String
    public open var textBox: String
    public open var textBoxEdge: String
    public open var textBoxTrim: String
    public open var textCombineUpright: String
    public open var textDecoration: String
    public open var textDecorationColor: String
    public open var textDecorationInset: String
    public open var textDecorationLine: String
    public open var textDecorationSkip: String
    public open var textDecorationSkipBox: String
    public open var textDecorationSkipInk: String
    public open var textDecorationSkipSelf: String
    public open var textDecorationSkipSpaces: String
    public open var textDecorationStyle: String
    public open var textDecorationThickness: String
    public open var textEmphasis: String
    public open var textEmphasisColor: String
    public open var textEmphasisPosition: String
    public open var textEmphasisSkip: String
    public open var textEmphasisStyle: String
    public open var textFit: String
    public open var textGroupAlign: String
    public open var textIndent: String
    public open var textJustify: String
    public open var textOrientation: String
    public open var textOverflow: String
    public open var textRendering: String
    public open var textShadow: String
    public open var textSizeAdjust: String
    public open var textSpacing: String
    public open var textSpacingTrim: String
    public open var textTransform: String
    public open var textUnderlineOffset: String
    public open var textUnderlinePosition: String
    public open var textWrap: String
    public open var textWrapMode: String
    public open var textWrapStyle: String
    public open var timelineScope: String
    public open var timelineTrigger: String
    public open var timelineTriggerActivationRange: String
    public open var timelineTriggerActivationRangeEnd: String
    public open var timelineTriggerActivationRangeStart: String
    public open var timelineTriggerActiveRange: String
    public open var timelineTriggerActiveRangeEnd: String
    public open var timelineTriggerActiveRangeStart: String
    public open var timelineTriggerName: String
    public open var timelineTriggerRange: String
    public open var timelineTriggerSource: String
    public open var top: String
    public open var touchAction: String
    public open var transform: String
    public open var transformBox: String
    public open var transformOrigin: String
    public open var transformStyle: String
    public open var transition: String
    public open var transitionBehavior: String
    public open var transitionDelay: String
    public open var transitionDuration: String
    public open var transitionProperty: String
    public open var transitionTimingFunction: String
    public open var translate: String
    public open var triggerScope: String
    public open var unicodeBidi: String
    public open var userSelect: String
    public open var vectorEffect: String
    public open var verticalAlign: String
    public open var viewTimeline: String
    public open var viewTimelineAxis: String
    public open var viewTimelineInset: String
    public open var viewTimelineName: String
    public open var viewTransitionClass: String
    public open var viewTransitionGroup: String
    public open var viewTransitionName: String
    public open var viewTransitionScope: String
    public open var visibility: String
    public open var voiceBalance: String
    public open var voiceDuration: String
    public open var voiceFamily: String
    public open var voicePitch: String
    public open var voiceRange: String
    public open var voiceRate: String
    public open var voiceStress: String
    public open var voiceVolume: String
    public open var webkitBoxAlign: String
    public open var webkitBoxFlex: String
    public open var webkitBoxOrdinalGroup: String
    public open var webkitBoxOrient: String
    public open var webkitBoxPack: String
    public open var webkitLineClamp: String
    public open var webkitTextFillColor: String
    public open var webkitTextStroke: String
    public open var webkitTextStrokeColor: String
    public open var webkitTextStrokeWidth: String
    public open var webkitUserSelect: String
    public open var whiteSpace: String
    public open var whiteSpaceCollapse: String
    public open var whiteSpaceTrim: String
    public open var widows: String
    public open var width: String
    public open var willChange: String
    public open var windowDrag: String
    public open var wordBreak: String
    public open var wordSpaceTransform: String
    public open var wordSpacing: String
    public open var wordWrap: String
    public open var wrapAfter: String
    public open var wrapBefore: String
    public open var wrapFlow: String
    public open var wrapInside: String
    public open var wrapThrough: String
    public open var writingMode: String
    public open var x: String
    public open var y: String
    public open var zIndex: String
    public open var zoom: String
}

public external interface ElementCSSInlineStyle : JsAny {
    /**
     * The read-only style property of the HTMLElement interface returns the inline style of an element in the form of a
     * live CSSStyleProperties object. This object can be used to get and set the inline styles of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/style)
     */
    public val style: CSSStyleProperties
}

/**
 * The CSS interface holds useful CSS-related methods. No objects with this interface are implemented: it contains only
 * static methods and is therefore a utilitarian interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSS)
 */
public external object CSS {
    public fun escape(ident: String): String
    public fun supports(property: String, value: String): Boolean
    public fun supports(conditionText: String): Boolean
}
