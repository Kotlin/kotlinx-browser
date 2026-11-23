/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'wai-aria', DO NOT EDIT!

package org.w3c.dom

import kotlin.js.*

public external interface ARIAMixin : JsAny {
    var role: String?
    var ariaActiveDescendantElement: Element?
    var ariaAtomic: String?
    var ariaAutoComplete: String?
    var ariaBrailleLabel: String?
    var ariaBrailleRoleDescription: String?
    var ariaBusy: String?
    var ariaChecked: String?
    var ariaColCount: String?
    var ariaColIndex: String?
    var ariaColIndexText: String?
    var ariaColSpan: String?
    var ariaControlsElements: JsArray<Element>?
    var ariaCurrent: String?
    var ariaDescribedByElements: JsArray<Element>?
    var ariaDescription: String?
    var ariaDetailsElements: JsArray<Element>?
    var ariaDisabled: String?
    var ariaErrorMessageElements: JsArray<Element>?
    var ariaExpanded: String?
    var ariaFlowToElements: JsArray<Element>?
    var ariaHasPopup: String?
    var ariaHidden: String?
    var ariaInvalid: String?
    var ariaKeyShortcuts: String?
    var ariaLabel: String?
    var ariaLabelledByElements: JsArray<Element>?
    var ariaLevel: String?
    var ariaLive: String?
    var ariaModal: String?
    var ariaMultiLine: String?
    var ariaMultiSelectable: String?
    var ariaOrientation: String?
    var ariaOwnsElements: JsArray<Element>?
    var ariaPlaceholder: String?
    var ariaPosInSet: String?
    var ariaPressed: String?
    var ariaReadOnly: String?
    var ariaRelevant: String?
    var ariaRequired: String?
    var ariaRoleDescription: String?
    var ariaRowCount: String?
    var ariaRowIndex: String?
    var ariaRowIndexText: String?
    var ariaRowSpan: String?
    var ariaSelected: String?
    var ariaSetSize: String?
    var ariaSort: String?
    var ariaValueMax: String?
    var ariaValueMin: String?
    var ariaValueNow: String?
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
    fun ariaNotify(announcement: String, options: AriaNotificationOptions = definedExternally)
}
