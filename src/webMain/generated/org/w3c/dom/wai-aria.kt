/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'wai-aria', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.dom

import kotlin.js.*

public external interface ARIAMixin : JsAny {
    /**
     * The role property of the ElementInternals interface returns the WAI-ARIA role for the element. For example, a
     * checkbox might have role="checkbox". It reflects the role attribute; it does not return the element's implicit
     * ARIA role, if any, unless explicitly set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/role)
     */
    var role: String?

    /**
     * The ariaActiveDescendantElement property of the ElementInternals interface represents the current active element
     * when focus is on a composite widget, combobox, textbox, group, or application.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaActiveDescendantElement)
     */
    var ariaActiveDescendantElement: Element?

    /**
     * The ariaAtomic property of the ElementInternals interface reflects the value of the aria-atomic attribute, which
     * indicates whether assistive technologies will present all, or only parts of, the changed region based on the
     * change notifications defined by the aria-relevant attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaAtomic)
     */
    var ariaAtomic: String?

    /**
     * The ariaAutoComplete property of the ElementInternals interface reflects the value of the aria-autocomplete
     * attribute, which indicates whether inputting text could trigger display of one or more predictions of the user's
     * intended value for a combobox, searchbox, or textbox and specifies how predictions would be presented if they
     * were made.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaAutoComplete)
     */
    var ariaAutoComplete: String?

    /**
     * The ariaBrailleLabel property of the ElementInternals interface reflects the value of the aria-braillelabel
     * attribute, which defines the ARIA braille label of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaBrailleLabel)
     */
    var ariaBrailleLabel: String?

    /**
     * The ariaBrailleRoleDescription property of the ElementInternals interface reflects the value of the
     * aria-brailleroledescription attribute, which defines the ARIA braille role description of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaBrailleRoleDescription)
     */
    var ariaBrailleRoleDescription: String?

    /**
     * The ariaBusy property of the ElementInternals interface reflects the value of the aria-busy attribute, which
     * indicates whether an element is being modified, as assistive technologies may want to wait until the
     * modifications are complete before exposing them to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaBusy)
     */
    var ariaBusy: String?

    /**
     * The ariaChecked property of the ElementInternals interface reflects the value of the aria-checked attribute,
     * which indicates the current "checked" state of checkboxes, radio buttons, and other widgets that have a checked
     * state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaChecked)
     */
    var ariaChecked: String?

    /**
     * The ariaColCount property of the ElementInternals interface reflects the value of the aria-colcount attribute,
     * which defines the number of columns in a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColCount)
     */
    var ariaColCount: String?

    /**
     * The ariaColIndex property of the ElementInternals interface reflects the value of the aria-colindex attribute,
     * which defines an element's column index or position with respect to the total number of columns within a table,
     * grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColIndex)
     */
    var ariaColIndex: String?

    /**
     * The ariaColIndexText property of the ElementInternals interface reflects the value of the aria-colindextext
     * attribute, which defines a human-readable text alternative of aria-colindex.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColIndexText)
     */
    var ariaColIndexText: String?

    /**
     * The ariaColSpan property of the ElementInternals interface reflects the value of the aria-colspan attribute,
     * which defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColSpan)
     */
    var ariaColSpan: String?

    /**
     * The ariaControlsElements property of the ElementInternals interface is an array containing the element (or
     * elements) that are controlled by the element it is applied to. For example, this might be set on a combobox to
     * indicate the element that it pops up, or on a scrollbar to indicate the ID of the element it controls.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaControlsElements)
     */
    var ariaControlsElements: JsArray<Element>?

    /**
     * The ariaCurrent property of the ElementInternals interface reflects the value of the aria-current attribute,
     * which indicates the element that represents the current item within a container or set of related elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaCurrent)
     */
    var ariaCurrent: String?

    /**
     * The ariaDescribedByElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an accessible description for the element it is applied to. The accessible description is
     * similar to the accessible label (see ariaLabelledByElements), but provides more verbose information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDescribedByElements)
     */
    var ariaDescribedByElements: JsArray<Element>?

    /**
     * The ariaDescription property of the ElementInternals interface reflects the value of the aria-description
     * attribute, which defines a string value that describes or annotates the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDescription)
     */
    var ariaDescription: String?

    /**
     * The ariaDetailsElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an accessible details for the element it is applied to. The accessible details are similar
     * to the accessible description (see ariaDescribedByElements), but provides more verbose information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDetailsElements)
     */
    var ariaDetailsElements: JsArray<Element>?

    /**
     * The ariaDisabled property of the ElementInternals interface reflects the value of the aria-disabled attribute,
     * which indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDisabled)
     */
    var ariaDisabled: String?

    /**
     * The ariaErrorMessageElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an error message for the element it is applied to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaErrorMessageElements)
     */
    var ariaErrorMessageElements: JsArray<Element>?

    /**
     * The ariaExpanded property of the ElementInternals interface reflects the value of the aria-expanded attribute,
     * which indicates whether a grouping element owned or controlled by this element is expanded or collapsed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaExpanded)
     */
    var ariaExpanded: String?

    /**
     * The ariaFlowToElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an alternate reading order of content, overriding the general default reading order at the
     * user's discretion. If just one element is provided this is the next element in the reading order. If multiple
     * elements are provided, then each element represents a possible path that should be offered to the user for
     * selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaFlowToElements)
     */
    var ariaFlowToElements: JsArray<Element>?

    /**
     * The ariaHasPopup property of the ElementInternals interface reflects the value of the aria-haspopup attribute,
     * which indicates the availability and type of interactive popup element, such as menu or dialog, that can be
     * triggered by an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaHasPopup)
     */
    var ariaHasPopup: String?

    /**
     * The ariaHidden property of the ElementInternals interface reflects the value of the aria-hidden attribute, which
     * indicates whether the element is exposed to an accessibility API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaHidden)
     */
    var ariaHidden: String?

    /**
     * The ariaInvalid property of the ElementInternals interface reflects the value of the aria-invalid attribute.
     * Relevant for the application, checkbox, combobox, gridcell, listbox, radiogroup, slider, spinbutton, textbox, and
     * tree roles, it indicates to the accessibility API whether the entered value does not conform to the format
     * expected by the application.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaInvalid)
     */
    var ariaInvalid: String?

    /**
     * The ariaKeyShortcuts property of the ElementInternals interface reflects the value of the aria-keyshortcuts
     * attribute, which indicates keyboard shortcuts that an author has implemented to activate or give focus to an
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaKeyShortcuts)
     */
    var ariaKeyShortcuts: String?

    /**
     * The ariaLabel property of the ElementInternals interface reflects the value of the aria-label attribute, which
     * defines a string value that labels the current Element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLabel)
     */
    var ariaLabel: String?

    /**
     * The ariaLabelledByElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an accessible name for the element it is applied to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLabelledByElements)
     */
    var ariaLabelledByElements: JsArray<Element>?

    /**
     * The ariaLevel property of the ElementInternals interface reflects the value of the aria-level attribute, which
     * defines the hierarchical level of an element within a structure.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLevel)
     */
    var ariaLevel: String?

    /**
     * The ariaLive property of the ElementInternals interface reflects the value of the aria-live attribute, which
     * indicates that an element will be updated, and describes the types of updates the user agents, assistive
     * technologies, and user can expect from the live region.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLive)
     */
    var ariaLive: String?

    /**
     * The ariaModal property of the ElementInternals interface reflects the value of the aria-modal attribute, which
     * indicates whether an element is modal when displayed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaModal)
     */
    var ariaModal: String?

    /**
     * The ariaMultiLine property of the ElementInternals interface reflects the value of the aria-multiline attribute,
     * which indicates whether a text box accepts multiple lines of input or only a single line.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaMultiLine)
     */
    var ariaMultiLine: String?

    /**
     * The ariaMultiSelectable property of the ElementInternals interface reflects the value of the aria-multiselectable
     * attribute, which indicates that the user may select more than one item from the current selectable descendants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaMultiSelectable)
     */
    var ariaMultiSelectable: String?

    /**
     * The ariaOrientation property of the ElementInternals interface reflects the value of the aria-orientation
     * attribute, which indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaOrientation)
     */
    var ariaOrientation: String?

    /**
     * The ariaOwnsElements property of the ElementInternals interface is an array containing the element (or elements)
     * that define a visual, functional, or contextual relationship between a parent element that it is applied to, and
     * its child elements. This is used when the shadow DOM hierarchy cannot be used to represent the relationship, and
     * it would not otherwise be available to assistive technology,
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaOwnsElements)
     */
    var ariaOwnsElements: JsArray<Element>?

    /**
     * The ariaPlaceholder property of the ElementInternals interface reflects the value of the aria-placeholder
     * attribute, which defines a short hint intended to aid the user with data entry when the control has no value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaPlaceholder)
     */
    var ariaPlaceholder: String?

    /**
     * The ariaPosInSet property of the ElementInternals interface reflects the value of the aria-posinset attribute,
     * which defines an element's number or position in the current set of listitems or treeitems.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaPosInSet)
     */
    var ariaPosInSet: String?

    /**
     * The ariaPressed property of the ElementInternals interface reflects the value of the aria-pressed attribute,
     * which indicates the current "pressed" state of toggle buttons.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaPressed)
     */
    var ariaPressed: String?

    /**
     * The ariaReadOnly property of the ElementInternals interface reflects the value of the aria-readonly attribute,
     * which indicates that the element is not editable, but is otherwise operable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaReadOnly)
     */
    var ariaReadOnly: String?

    /**
     * The ariaRelevant property of the ElementInternals interface reflects the value of the aria-relevant attribute,
     * which indicates what notifications the user agent will trigger when the accessibility tree within a live region
     * is modified. This is used to describe what changes in an aria-live region are relevant and should be announced.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRelevant)
     */
    var ariaRelevant: String?

    /**
     * The ariaRequired property of the ElementInternals interface reflects the value of the aria-required attribute,
     * which indicates that user input is required on the element before a form may be submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRequired)
     */
    var ariaRequired: String?

    /**
     * The ariaRoleDescription property of the ElementInternals interface reflects the value of the aria-roledescription
     * attribute, which defines a human-readable, author-localized description for the role of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRoleDescription)
     */
    var ariaRoleDescription: String?

    /**
     * The ariaRowCount property of the ElementInternals interface reflects the value of the aria-rowcount attribute,
     * which defines the total number of rows in a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowCount)
     */
    var ariaRowCount: String?

    /**
     * The ariaRowIndex property of the ElementInternals interface reflects the value of the aria-rowindex attribute,
     * which defines an element's row index or position with respect to the total number of rows within a table, grid,
     * or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowIndex)
     */
    var ariaRowIndex: String?

    /**
     * The ariaRowIndexText property of the ElementInternals interface reflects the value of the aria-rowindextext
     * attribute, which defines a human-readable text alternative of aria-rowindex.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowIndexText)
     */
    var ariaRowIndexText: String?

    /**
     * The ariaRowSpan property of the ElementInternals interface reflects the value of the aria-rowspan attribute,
     * which defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowSpan)
     */
    var ariaRowSpan: String?

    /**
     * The ariaSelected property of the ElementInternals interface reflects the value of the aria-selected attribute,
     * which indicates the current "selected" state of elements that have a selected state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaSelected)
     */
    var ariaSelected: String?

    /**
     * The ariaSetSize property of the ElementInternals interface reflects the value of the aria-setsize attribute,
     * which defines the number of items in the current set of listitems or treeitems.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaSetSize)
     */
    var ariaSetSize: String?

    /**
     * The ariaSort property of the ElementInternals interface reflects the value of the aria-sort attribute, which
     * indicates if items in a table or grid are sorted in ascending or descending order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaSort)
     */
    var ariaSort: String?

    /**
     * The ariaValueMax property of the ElementInternals interface reflects the value of the aria-valuemax attribute,
     * which defines the maximum allowed value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueMax)
     */
    var ariaValueMax: String?

    /**
     * The ariaValueMin property of the ElementInternals interface reflects the value of the aria-valuemin attribute,
     * which defines the minimum allowed value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueMin)
     */
    var ariaValueMin: String?

    /**
     * The ariaValueNow property of the ElementInternals interface reflects the value of the aria-valuenow attribute,
     * which defines the current value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueNow)
     */
    var ariaValueNow: String?

    /**
     * The ariaValueText property of the ElementInternals interface reflects the value of the aria-valuetext attribute,
     * which defines the human-readable text alternative of aria-valuenow for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueText)
     */
    var ariaValueText: String?
}

public external interface AriaNotifyPriority : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val AriaNotifyPriority.Companion.NORMAL: AriaNotifyPriority get() = "normal".toJsString().unsafeCast<AriaNotifyPriority>()
public inline val AriaNotifyPriority.Companion.HIGH: AriaNotifyPriority get() = "high".toJsString().unsafeCast<AriaNotifyPriority>()

public external interface AriaNotificationOptions : JsAny {
    var priority: AriaNotifyPriority?
}

public fun AriaNotificationOptions(priority: AriaNotifyPriority? = null): AriaNotificationOptions = newJsObject<AriaNotificationOptions>().apply {
    if (priority != null) this.priority = priority
}

public external interface ARIANotifyMixin : JsAny {
    /**
     * The ariaNotify() method of the Element interface queues a string of text to be announced by a screen reader.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaNotify)
     */
    fun ariaNotify(announcement: String, options: AriaNotificationOptions = definedExternally)
}
