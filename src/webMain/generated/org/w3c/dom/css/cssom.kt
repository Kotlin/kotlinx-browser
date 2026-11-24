/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'cssom', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

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
public external abstract class MediaList : ItemArrayLike<JsString> {
    /**
     * The mediaText property of the MediaList interface is a stringifier that returns a string representing the
     * MediaList as text, and also allows you to set a new MediaList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/mediaText)
     */
    open var mediaText: String

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
    open fun appendMedium(medium: String)

    /**
     * The deleteMedium() method of the MediaList interface removes from this MediaList the given media query.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaList/deleteMedium)
     */
    open fun deleteMedium(medium: String)
}

public operator fun MediaList.get(index: Int): String? = getStringProperty(this, index)

/**
 * An object implementing the StyleSheet interface represents a single style sheet. CSS style sheets will further
 * implement the more specialized CSSStyleSheet interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet)
 */
public external abstract class StyleSheet : JsAny {
    /**
     * The type read-only property of the StyleSheet interface specifies the style sheet language for the given style
     * sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/type)
     */
    open val type: String

    /**
     * The href property of the StyleSheet interface returns the location of the style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/href)
     */
    open val href: String?

    /**
     * The ownerNode read-only property of the StyleSheet interface returns the node that associates this style sheet
     * with the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/ownerNode)
     */
    open val ownerNode: UnionElementOrProcessingInstruction?

    /**
     * The parentStyleSheet read-only property of the StyleSheet interface returns the style sheet, if any, that is
     * including the given style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/parentStyleSheet)
     */
    open val parentStyleSheet: CSSStyleSheet?

    /**
     * The title read-only property of the StyleSheet interface returns the advisory title of the current style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/title)
     */
    open val title: String?

    /**
     * The read-only media property of the StyleSheet interface contains a MediaList object representing the intended
     * destination media for style information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/media)
     */
    open val media: MediaList

    /**
     * The disabled property of the StyleSheet interface determines whether the style sheet is prevented from applying
     * to the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/disabled)
     */
    open var disabled: Boolean
}

/**
 * The CSSStyleSheet interface represents a single CSS stylesheet, and lets you inspect and modify the list of rules
 * contained in the stylesheet. It inherits properties and methods from its parent, StyleSheet.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet)
 */
public external open class CSSStyleSheet : StyleSheet {
    /**
     * The CSSStyleSheet() constructor creates a new CSSStyleSheet object which represents a single Stylesheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/CSSStyleSheet)
     */
    constructor(options: CSSStyleSheetInit = definedExternally)

    /**
     * The read-only CSSStyleSheet property ownerRule returns the CSSImportRule corresponding to the \@import at-rule
     * which imported the stylesheet into the document. If the stylesheet wasn't imported into the document using
     * \@import, the returned value is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/ownerRule)
     */
    open val ownerRule: CSSRule?

    /**
     * The read-only CSSStyleSheet property cssRules returns a live CSSRuleList which provides a real-time, up-to-date
     * list of every CSS rule which comprises the stylesheet. Each item in the list is a CSSRule defining a single rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/cssRules)
     */
    open val cssRules: CSSRuleList

    /**
     * The CSSStyleSheet.insertRule() method inserts a new CSS rule into the current style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/insertRule)
     */
    open fun insertRule(rule: String, index: Int = definedExternally): Int

    /**
     * The CSSStyleSheet method deleteRule() removes a rule from the stylesheet object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/deleteRule)
     */
    open fun deleteRule(index: Int)

    /**
     * The replace() method of the CSSStyleSheet interface asynchronously replaces the content of the stylesheet with
     * the content passed into it. The method returns a promise that resolves with the CSSStyleSheet object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/replace)
     */
    open fun replace(text: String): Promise<CSSStyleSheet>

    /**
     * The replaceSync() method of the CSSStyleSheet interface synchronously replaces the content of the stylesheet with
     * the content passed into it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/replaceSync)
     */
    open fun replaceSync(text: String)

    /**
     * The rules read-only property of the CSSStyleSheet interface is a deprecated legacy property. Functionally
     * identical to the preferred cssRules property, it provides access to a live-updating list of the CSS rules
     * comprising the stylesheet.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/rules)
     */
    open val rules: CSSRuleList

    /**
     * The obsolete CSSStyleSheet interface's addRule() legacy method adds a new rule to the stylesheet. You should
     * avoid using this method, and should instead use the more standard insertRule() method.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/addRule)
     */
    open fun addRule(selector: String = definedExternally, style: String = definedExternally, index: Int = definedExternally): Int

    /**
     * The obsolete CSSStyleSheet method removeRule() removes a rule from the stylesheet object. It is functionally
     * identical to the standard, preferred method deleteRule().
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleSheet/removeRule)
     */
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

/**
 * The StyleSheetList interface represents a list of CSSStyleSheet objects. An instance of this object can be returned
 * by Document.styleSheets.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheetList)
 */
public external abstract class StyleSheetList : ItemArrayLike<CSSStyleSheet> {
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
    val sheet: CSSStyleSheet?
}

/**
 * A CSSRuleList represents an ordered collection of read-only CSSRule objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRuleList)
 */
public external abstract class CSSRuleList : ItemArrayLike<CSSRule> {
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
public external abstract class CSSRule : JsAny {
    /**
     * The cssText property of the CSSRule interface returns the actual text of a CSSStyleSheet style-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/cssText)
     */
    open var cssText: String

    /**
     * The parentRule read-only property of the CSSRule interface returns the containing rule of the current rule if
     * this exists, or otherwise returns null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/parentRule)
     */
    open val parentRule: CSSRule?

    /**
     * The parentStyleSheet read-only property of the CSSRule interface returns the StyleSheet object in which the
     * current rule is defined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/parentStyleSheet)
     */
    open val parentStyleSheet: CSSStyleSheet?

    /**
     * The read-only type property of the CSSRule interface is a deprecated property that returns an integer indicating
     * which type of rule the CSSRule represents.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/type)
     */
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

/**
 * The CSSStyleRule interface represents a single CSS style rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule)
 */
public external abstract class CSSStyleRule : CSSGroupingRule {
    /**
     * The selectorText property of the CSSStyleRule interface gets and sets the selectors associated with the
     * CSSStyleRule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/selectorText)
     */
    open var selectorText: String

    /**
     * The read-only style property of the CSSStyleRule interface contains a CSSStyleProperties object representing the
     * properties list in this style rule's body.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/style)
     */
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

/**
 * The CSSImportRule interface represents an \@import at-rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule)
 */
public external abstract class CSSImportRule : CSSRule {
    /**
     * The read-only href property of the CSSImportRule interface returns the URL specified by the \@import at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/href)
     */
    open val href: String

    /**
     * The read-only media property of the CSSImportRule interface returns a MediaList object representing the media
     * query list of the \@import rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/media)
     */
    open val media: MediaList

    /**
     * The read-only styleSheet property of the CSSImportRule interface returns the CSS Stylesheet specified by the
     * \@import at-rule. This will be in the form of a CSSStyleSheet object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/styleSheet)
     */
    open val styleSheet: CSSStyleSheet?

    /**
     * The read-only layerName property of the CSSImportRule interface returns the name of the cascade layer created by
     * the \@import at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/layerName)
     */
    open val layerName: String?

    /**
     * The read-only supportsText property of the CSSImportRule interface returns the supports condition specified by
     * the \@import at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/supportsText)
     */
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

/**
 * The CSSGroupingRule interface of the CSS Object Model represents any CSS at-rule that contains other rules nested
 * within it.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule)
 */
public external abstract class CSSGroupingRule : CSSRule {
    /**
     * The cssRules property of the CSSGroupingRule interface returns a CSSRuleList containing a collection of CSSRule
     * objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/cssRules)
     */
    open val cssRules: CSSRuleList

    /**
     * The insertRule() method of the CSSGroupingRule interface adds a new CSS rule to a list of CSS rules.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/insertRule)
     */
    open fun insertRule(rule: String, index: Int = definedExternally): Int

    /**
     * The deleteRule() method of the CSSGroupingRule interface removes a CSS rule from a list of child CSS rules.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/deleteRule)
     */
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

/**
 * The CSSPageDescriptors interface represents a CSS declaration block for an \@page at-rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageDescriptors)
 */
public external abstract class CSSPageDescriptors : CSSStyleDeclaration {
    /**
     * The CSSPageDescriptors interface represents a CSS declaration block for an \@page at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageDescriptors#margin)
     */
    open var margin: String

    /**
     * The CSSPageDescriptors interface represents a CSS declaration block for an \@page at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageDescriptors#margintop)
     */
    open var marginTop: String

    /**
     * The CSSPageDescriptors interface represents a CSS declaration block for an \@page at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageDescriptors#marginright)
     */
    open var marginRight: String

    /**
     * The CSSPageDescriptors interface represents a CSS declaration block for an \@page at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageDescriptors#marginbottom)
     */
    open var marginBottom: String

    /**
     * The CSSPageDescriptors interface represents a CSS declaration block for an \@page at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageDescriptors#marginleft)
     */
    open var marginLeft: String

    /**
     * The CSSPageDescriptors interface represents a CSS declaration block for an \@page at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageDescriptors#size)
     */
    open var size: String

    /**
     * The CSSPageDescriptors interface represents a CSS declaration block for an \@page at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageDescriptors#pageorientation)
     */
    open var pageOrientation: String
    open var marks: String
    open var bleed: String
}

/**
 * CSSPageRule represents a single CSS \@page rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageRule)
 */
public external abstract class CSSPageRule : CSSGroupingRule {
    /**
     * The selectorText property of the CSSPageRule interface gets and sets the selectors associated with the
     * CSSPageRule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageRule/selectorText)
     */
    open var selectorText: String

    /**
     * The read-only style property of the CSSPageRule interface contains a CSSPageDescriptors object representing the
     * descriptors available in the \@page rule's body.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageRule/style)
     */
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

/**
 * The CSSNamespaceRule interface describes an object representing a single CSS \@namespace at-rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNamespaceRule)
 */
public external abstract class CSSNamespaceRule : CSSRule {
    /**
     * The read-only namespaceURI property of the CSSNamespaceRule returns a string containing the text of the URI of
     * the given namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNamespaceRule/namespaceURI)
     */
    open val namespaceURI: String

    /**
     * The read-only prefix property of the CSSNamespaceRule returns a string with the name of the prefix associated to
     * this namespace. If there is no such prefix, it returns an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNamespaceRule/prefix)
     */
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

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration)
 */
public external abstract class CSSStyleDeclaration : ItemArrayLike<JsString> {
    /**
     * The cssText property of the CSSStyleDeclaration interface returns or sets the text of the element's inline style
     * declaration only.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/cssText)
     */
    open var cssText: String

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
    open fun getPropertyValue(property: String): String

    /**
     * The CSSStyleDeclaration.getPropertyPriority() method interface returns a string that provides all explicitly set
     * priorities on the CSS property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/getPropertyPriority)
     */
    open fun getPropertyPriority(property: String): String

    /**
     * The CSSStyleDeclaration.setProperty() method interface sets a new value for a property on a CSS style declaration
     * object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/setProperty)
     */
    open fun setProperty(property: String, value: String, priority: String = definedExternally)

    /**
     * The CSSStyleDeclaration.removeProperty() method interface removes a property from a CSS style declaration object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/removeProperty)
     */
    open fun removeProperty(property: String): String

    /**
     * The CSSStyleDeclaration.parentRule read-only property returns a CSSRule that is the parent of this style block,
     * e.g., a CSSStyleRule representing the style for a CSS selector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleDeclaration/parentRule)
     */
    open val parentRule: CSSRule?
}

public operator fun CSSStyleDeclaration.get(index: Int): String? = getStringProperty(this, index)

/**
 * The CSSStyleProperties interface of the CSS Object Model (CSSOM) represents inline or computed styles available on an
 * element, or the styles associated with a CSS style rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleProperties)
 */
public external abstract class CSSStyleProperties : CSSStyleDeclaration {
    /**
     * The cssFloat property of the CSSStyleProperties interface returns the CSS float property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleProperties/cssFloat)
     */
    open var cssFloat: String
    open var accentColor: String
    open var alignContent: String
    open var alignItems: String
    open var alignSelf: String
    open var alignmentBaseline: String
    open var all: String
    open var anchorName: String
    open var anchorScope: String
    open var animation: String
    open var animationComposition: String
    open var animationDelay: String
    open var animationDelayEnd: String
    open var animationDelayStart: String
    open var animationDirection: String
    open var animationDuration: String
    open var animationFillMode: String
    open var animationIterationCount: String
    open var animationName: String
    open var animationPlayState: String
    open var animationRange: String
    open var animationRangeCenter: String
    open var animationRangeEnd: String
    open var animationRangeStart: String
    open var animationTimeline: String
    open var animationTimingFunction: String
    open var animationTrigger: String
    open var appearance: String
    open var aspectRatio: String
    open var backdropFilter: String
    open var backfaceVisibility: String
    open var background: String
    open var backgroundAttachment: String
    open var backgroundBlendMode: String
    open var backgroundClip: String
    open var backgroundColor: String
    open var backgroundImage: String
    open var backgroundOrigin: String
    open var backgroundPosition: String
    open var backgroundPositionBlock: String
    open var backgroundPositionInline: String
    open var backgroundPositionX: String
    open var backgroundPositionY: String
    open var backgroundRepeat: String
    open var backgroundRepeatBlock: String
    open var backgroundRepeatInline: String
    open var backgroundRepeatX: String
    open var backgroundRepeatY: String
    open var backgroundSize: String
    open var backgroundTbd: String
    open var baselineShift: String
    open var baselineSource: String
    open var blockEllipsis: String
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
    open var borderBlockClip: String
    open var borderBlockColor: String
    open var borderBlockEnd: String
    open var borderBlockEndClip: String
    open var borderBlockEndColor: String
    open var borderBlockEndRadius: String
    open var borderBlockEndStyle: String
    open var borderBlockEndWidth: String
    open var borderBlockStart: String
    open var borderBlockStartClip: String
    open var borderBlockStartColor: String
    open var borderBlockStartRadius: String
    open var borderBlockStartStyle: String
    open var borderBlockStartWidth: String
    open var borderBlockStyle: String
    open var borderBlockWidth: String
    open var borderBottom: String
    open var borderBottomClip: String
    open var borderBottomColor: String
    open var borderBottomLeftRadius: String
    open var borderBottomRadius: String
    open var borderBottomRightRadius: String
    open var borderBottomStyle: String
    open var borderBottomWidth: String
    open var borderBoundary: String
    open var borderClip: String
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
    open var borderInlineClip: String
    open var borderInlineColor: String
    open var borderInlineEnd: String
    open var borderInlineEndClip: String
    open var borderInlineEndColor: String
    open var borderInlineEndRadius: String
    open var borderInlineEndStyle: String
    open var borderInlineEndWidth: String
    open var borderInlineStart: String
    open var borderInlineStartClip: String
    open var borderInlineStartColor: String
    open var borderInlineStartRadius: String
    open var borderInlineStartStyle: String
    open var borderInlineStartWidth: String
    open var borderInlineStyle: String
    open var borderInlineWidth: String
    open var borderLeft: String
    open var borderLeftClip: String
    open var borderLeftColor: String
    open var borderLeftRadius: String
    open var borderLeftStyle: String
    open var borderLeftWidth: String
    open var borderLimit: String
    open var borderRadius: String
    open var borderRight: String
    open var borderRightClip: String
    open var borderRightColor: String
    open var borderRightRadius: String
    open var borderRightStyle: String
    open var borderRightWidth: String
    open var borderShape: String
    open var borderSpacing: String
    open var borderStartEndRadius: String
    open var borderStartStartRadius: String
    open var borderStyle: String
    open var borderTop: String
    open var borderTopClip: String
    open var borderTopColor: String
    open var borderTopLeftRadius: String
    open var borderTopRadius: String
    open var borderTopRightRadius: String
    open var borderTopStyle: String
    open var borderTopWidth: String
    open var borderWidth: String
    open var bottom: String
    open var boxDecorationBreak: String
    open var boxShadow: String
    open var boxShadowBlur: String
    open var boxShadowColor: String
    open var boxShadowOffset: String
    open var boxShadowPosition: String
    open var boxShadowSpread: String
    open var boxSizing: String
    open var boxSnap: String
    open var breakAfter: String
    open var breakBefore: String
    open var breakInside: String
    open var captionSide: String
    open var caret: String
    open var caretAnimation: String
    open var caretColor: String
    open var caretShape: String
    open var clear: String
    open var clip: String
    open var clipPath: String
    open var clipRule: String
    open var color: String
    open var colorAdjust: String
    open var colorInterpolation: String
    open var colorInterpolationFilters: String
    open var colorScheme: String
    open var columnCount: String
    open var columnFill: String
    open var columnGap: String
    open var columnHeight: String
    open var columnRule: String
    open var columnRuleBreak: String
    open var columnRuleColor: String
    open var columnRuleInset: String
    open var columnRuleInsetCap: String
    open var columnRuleInsetCapEnd: String
    open var columnRuleInsetCapStart: String
    open var columnRuleInsetEnd: String
    open var columnRuleInsetJunction: String
    open var columnRuleInsetJunctionEnd: String
    open var columnRuleInsetJunctionStart: String
    open var columnRuleInsetStart: String
    open var columnRuleStyle: String
    open var columnRuleVisibilityItems: String
    open var columnRuleWidth: String
    open var columnSpan: String
    open var columnWidth: String
    open var columnWrap: String
    open var columns: String
    open var contain: String
    open var containIntrinsicBlockSize: String
    open var containIntrinsicHeight: String
    open var containIntrinsicInlineSize: String
    open var containIntrinsicSize: String
    open var containIntrinsicWidth: String
    open var container: String
    open var containerName: String
    open var containerType: String
    open var content: String
    open var contentVisibility: String
    open var `continue`: String
    open var copyInto: String
    open var corner: String
    open var cornerBlockEnd: String
    open var cornerBlockEndShape: String
    open var cornerBlockStart: String
    open var cornerBlockStartShape: String
    open var cornerBottom: String
    open var cornerBottomLeft: String
    open var cornerBottomLeftShape: String
    open var cornerBottomRight: String
    open var cornerBottomRightShape: String
    open var cornerBottomShape: String
    open var cornerEndEnd: String
    open var cornerEndEndShape: String
    open var cornerEndStart: String
    open var cornerEndStartShape: String
    open var cornerInlineEnd: String
    open var cornerInlineEndShape: String
    open var cornerInlineStart: String
    open var cornerInlineStartShape: String
    open var cornerLeft: String
    open var cornerLeftShape: String
    open var cornerRight: String
    open var cornerRightShape: String
    open var cornerShape: String
    open var cornerStartEnd: String
    open var cornerStartEndShape: String
    open var cornerStartStart: String
    open var cornerStartStartShape: String
    open var cornerTop: String
    open var cornerTopLeft: String
    open var cornerTopLeftShape: String
    open var cornerTopRight: String
    open var cornerTopRightShape: String
    open var cornerTopShape: String
    open var counterIncrement: String
    open var counterReset: String
    open var counterSet: String
    open var cue: String
    open var cueAfter: String
    open var cueBefore: String
    open var cursor: String
    open var cx: String
    open var cy: String
    open var d: String
    open var direction: String
    open var display: String
    open var dominantBaseline: String
    open var dynamicRangeLimit: String
    open var emptyCells: String
    open var eventTrigger: String
    open var eventTriggerName: String
    open var eventTriggerSource: String
    open var fieldSizing: String
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
    open var fitTolerance: String
    open var flex: String
    open var flexBasis: String
    open var flexDirection: String
    open var flexFlow: String
    open var flexGrow: String
    open var flexLineCount: String
    open var flexShrink: String
    open var flexWrap: String
    open var float: String
    open var floatDefer: String
    open var floatOffset: String
    open var floatReference: String
    open var floodColor: String
    open var floodOpacity: String
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
    open var fontSynthesisPosition: String
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
    open var fontWidth: String
    open var footnoteDisplay: String
    open var footnotePolicy: String
    open var forcedColorAdjust: String
    open var frameSizing: String
    open var gap: String
    open var glyphOrientationVertical: String
    open var grid: String
    open var gridArea: String
    open var gridAutoColumns: String
    open var gridAutoFlow: String
    open var gridAutoRows: String
    open var gridColumn: String
    open var gridColumnEnd: String
    open var gridColumnGap: String
    open var gridColumnStart: String
    open var gridGap: String
    open var gridRow: String
    open var gridRowEnd: String
    open var gridRowGap: String
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
    open var imageAnimation: String
    open var imageOrientation: String
    open var imageRendering: String
    open var imageResolution: String
    open var initialLetter: String
    open var initialLetterAlign: String
    open var initialLetterWrap: String
    open var inlineSize: String
    open var inlineSizing: String
    open var inputSecurity: String
    open var inset: String
    open var insetBlock: String
    open var insetBlockEnd: String
    open var insetBlockStart: String
    open var insetInline: String
    open var insetInlineEnd: String
    open var insetInlineStart: String
    open var interactivity: String
    open var interestDelay: String
    open var interestDelayEnd: String
    open var interestDelayStart: String
    open var interpolateSize: String
    open var isolation: String
    open var justifyContent: String
    open var justifyItems: String
    open var justifySelf: String
    open var left: String
    open var letterSpacing: String
    open var lightingColor: String
    open var lineBreak: String
    open var lineClamp: String
    open var lineFitEdge: String
    open var lineGrid: String
    open var lineHeight: String
    open var lineHeightStep: String
    open var linePadding: String
    open var lineSnap: String
    open var linkParameters: String
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
    open var markerMid: String
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
    open var mathDepth: String
    open var mathShift: String
    open var mathStyle: String
    open var maxBlockSize: String
    open var maxHeight: String
    open var maxInlineSize: String
    open var maxLines: String
    open var maxSize: String
    open var maxWidth: String
    open var minBlockSize: String
    open var minHeight: String
    open var minInlineSize: String
    open var minIntrinsicSizing: String
    open var minSize: String
    open var minWidth: String
    open var mixBlendMode: String
    open var navDown: String
    open var navLeft: String
    open var navRight: String
    open var navUp: String
    open var objectFit: String
    open var objectPosition: String
    open var objectViewBox: String
    open var offset: String
    open var offsetAnchor: String
    open var offsetDistance: String
    open var offsetPath: String
    open var offsetPosition: String
    open var offsetRotate: String
    open var opacity: String
    open var order: String
    open var orphans: String
    open var outline: String
    open var outlineColor: String
    open var outlineOffset: String
    open var outlineStyle: String
    open var outlineWidth: String
    open var overflow: String
    open var overflowAnchor: String
    open var overflowBlock: String
    open var overflowClipMargin: String
    open var overflowClipMarginBlock: String
    open var overflowClipMarginBlockEnd: String
    open var overflowClipMarginBlockStart: String
    open var overflowClipMarginBottom: String
    open var overflowClipMarginInline: String
    open var overflowClipMarginInlineEnd: String
    open var overflowClipMarginInlineStart: String
    open var overflowClipMarginLeft: String
    open var overflowClipMarginRight: String
    open var overflowClipMarginTop: String
    open var overflowInline: String
    open var overflowWrap: String
    open var overflowX: String
    open var overflowY: String
    open var overlay: String
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
    open var paintOrder: String
    open var pathLength: String
    open var pause: String
    open var pauseAfter: String
    open var pauseBefore: String
    open var perspective: String
    open var perspectiveOrigin: String
    open var placeContent: String
    open var placeItems: String
    open var placeSelf: String
    open var pointerEvents: String
    open var pointerTimeline: String
    open var pointerTimelineAxis: String
    open var pointerTimelineName: String
    open var position: String
    open var positionAnchor: String
    open var positionArea: String
    open var positionTry: String
    open var positionTryFallbacks: String
    open var positionTryOrder: String
    open var positionVisibility: String
    open var printColorAdjust: String
    open var quotes: String
    open var r: String
    open var readingFlow: String
    open var readingOrder: String
    open var regionFragment: String
    open var resize: String
    open var rest: String
    open var restAfter: String
    open var restBefore: String
    open var right: String
    open var rotate: String
    open var rowGap: String
    open var rowRule: String
    open var rowRuleBreak: String
    open var rowRuleColor: String
    open var rowRuleInset: String
    open var rowRuleInsetCap: String
    open var rowRuleInsetCapEnd: String
    open var rowRuleInsetCapStart: String
    open var rowRuleInsetEnd: String
    open var rowRuleInsetJunction: String
    open var rowRuleInsetJunctionEnd: String
    open var rowRuleInsetJunctionStart: String
    open var rowRuleInsetStart: String
    open var rowRuleStyle: String
    open var rowRuleVisibilityItems: String
    open var rowRuleWidth: String
    open var rubyAlign: String
    open var rubyMerge: String
    open var rubyOverhang: String
    open var rubyPosition: String
    open var rule: String
    open var ruleBreak: String
    open var ruleColor: String
    open var ruleInset: String
    open var ruleInsetCap: String
    open var ruleInsetEnd: String
    open var ruleInsetJunction: String
    open var ruleInsetStart: String
    open var ruleOverlap: String
    open var ruleStyle: String
    open var ruleVisibilityItems: String
    open var ruleWidth: String
    open var rx: String
    open var ry: String
    open var scale: String
    open var scrollAxisLock: String
    open var scrollBehavior: String
    open var scrollInitialTarget: String
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
    open var scrollMarkerGroup: String
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
    open var scrollTargetGroup: String
    open var scrollTimeline: String
    open var scrollTimelineAxis: String
    open var scrollTimelineName: String
    open var scrollbarColor: String
    open var scrollbarGutter: String
    open var scrollbarWidth: String
    open var shapeImageThreshold: String
    open var shapeInside: String
    open var shapeMargin: String
    open var shapeOutside: String
    open var shapePadding: String
    open var shapeRendering: String
    open var size: String
    open var sliderOrientation: String
    open var spatialNavigationAction: String
    open var spatialNavigationContain: String
    open var spatialNavigationFunction: String
    open var speak: String
    open var speakAs: String
    open var stopColor: String
    open var stopOpacity: String
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
    open var textAnchor: String
    open var textAutospace: String
    open var textBox: String
    open var textBoxEdge: String
    open var textBoxTrim: String
    open var textCombineUpright: String
    open var textDecoration: String
    open var textDecorationColor: String
    open var textDecorationInset: String
    open var textDecorationLine: String
    open var textDecorationSkip: String
    open var textDecorationSkipBox: String
    open var textDecorationSkipInk: String
    open var textDecorationSkipSelf: String
    open var textDecorationSkipSpaces: String
    open var textDecorationStyle: String
    open var textDecorationThickness: String
    open var textEmphasis: String
    open var textEmphasisColor: String
    open var textEmphasisPosition: String
    open var textEmphasisSkip: String
    open var textEmphasisStyle: String
    open var textFit: String
    open var textGroupAlign: String
    open var textIndent: String
    open var textJustify: String
    open var textOrientation: String
    open var textOverflow: String
    open var textRendering: String
    open var textShadow: String
    open var textSizeAdjust: String
    open var textSpacing: String
    open var textSpacingTrim: String
    open var textTransform: String
    open var textUnderlineOffset: String
    open var textUnderlinePosition: String
    open var textWrap: String
    open var textWrapMode: String
    open var textWrapStyle: String
    open var timelineScope: String
    open var timelineTrigger: String
    open var timelineTriggerActivationRange: String
    open var timelineTriggerActivationRangeEnd: String
    open var timelineTriggerActivationRangeStart: String
    open var timelineTriggerActiveRange: String
    open var timelineTriggerActiveRangeEnd: String
    open var timelineTriggerActiveRangeStart: String
    open var timelineTriggerName: String
    open var timelineTriggerRange: String
    open var timelineTriggerSource: String
    open var top: String
    open var touchAction: String
    open var transform: String
    open var transformBox: String
    open var transformOrigin: String
    open var transformStyle: String
    open var transition: String
    open var transitionBehavior: String
    open var transitionDelay: String
    open var transitionDuration: String
    open var transitionProperty: String
    open var transitionTimingFunction: String
    open var translate: String
    open var triggerScope: String
    open var unicodeBidi: String
    open var userSelect: String
    open var vectorEffect: String
    open var verticalAlign: String
    open var viewTimeline: String
    open var viewTimelineAxis: String
    open var viewTimelineInset: String
    open var viewTimelineName: String
    open var viewTransitionClass: String
    open var viewTransitionGroup: String
    open var viewTransitionName: String
    open var viewTransitionScope: String
    open var visibility: String
    open var voiceBalance: String
    open var voiceDuration: String
    open var voiceFamily: String
    open var voicePitch: String
    open var voiceRange: String
    open var voiceRate: String
    open var voiceStress: String
    open var voiceVolume: String
    open var webkitBoxAlign: String
    open var webkitBoxFlex: String
    open var webkitBoxOrdinalGroup: String
    open var webkitBoxOrient: String
    open var webkitBoxPack: String
    open var webkitLineClamp: String
    open var webkitTextFillColor: String
    open var webkitTextStroke: String
    open var webkitTextStrokeColor: String
    open var webkitTextStrokeWidth: String
    open var webkitUserSelect: String
    open var whiteSpace: String
    open var whiteSpaceCollapse: String
    open var whiteSpaceTrim: String
    open var widows: String
    open var width: String
    open var willChange: String
    open var windowDrag: String
    open var wordBreak: String
    open var wordSpaceTransform: String
    open var wordSpacing: String
    open var wordWrap: String
    open var wrapAfter: String
    open var wrapBefore: String
    open var wrapFlow: String
    open var wrapInside: String
    open var wrapThrough: String
    open var writingMode: String
    open var x: String
    open var y: String
    open var zIndex: String
    open var zoom: String
}

public external interface ElementCSSInlineStyle : JsAny {
    /**
     * The read-only style property of the HTMLElement interface returns the inline style of an element in the form of a
     * live CSSStyleProperties object. This object can be used to get and set the inline styles of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/style)
     */
    val style: CSSStyleProperties
}

/**
 * The CSS interface holds useful CSS-related methods. No objects with this interface are implemented: it contains only
 * static methods and is therefore a utilitarian interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSS)
 */
public external object CSS {
    fun escape(ident: String): String
    fun supports(property: String, value: String): Boolean
    fun supports(conditionText: String): Boolean
}
