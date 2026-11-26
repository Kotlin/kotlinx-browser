/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.backend

import org.jetbrains.kotlin.tools.idl.frontend.WebDoc
import org.jetbrains.kotlin.tools.idl.frontend.WebDocs
import org.jetbrains.kotlin.tools.idl.ir.*
import org.jetbrains.kotlin.tools.idl.lowering.isStatic

/**
 * Finds the [WebDoc] of a generated declaration. BCD and MDN document a member where scripts see it, so a member of a
 * mixin (`ParentNode.append`, `GlobalEventHandlers.onclick`) is documented on an interface that includes it
 * (`Document.append`) or on that interface's ancestors (`Element.click_event` for `HTMLElement`), in `includes`
 * order.
 */
internal class DocLookup(private val docs: WebDocs, ir: IdlIR) {
    private val hostsOf: Map<String, List<String>> = ir.definitions
        .filterIsInstance<IdlIncludes>()
        .groupBy({ it.mixin }, { it.target })

    private val parentOf: Map<String, String> = ir.definitions
        .filterIsInstance<IdlInterface>()
        .mapNotNull { i -> i.inheritance?.let { i.name to it } }
        .toMap()

    /** The interface, namespace, dictionary, … [name] itself. A mixin has no page of its own. */
    fun ofDefinition(name: String): WebDoc? = docs.ofInterface(name)

    /** [member] as declared on, or inherited by, [owner]. */
    fun ofMember(owner: String, member: IdlMember): WebDoc? {
        for (candidate in candidates(owner)) {
            for (key in keys(candidate, member)) {
                docs.ofMember(candidate, key)?.let { return it }
            }
        }
        return null
    }

    private fun candidates(owner: String): List<String> =
        (listOf(owner) + hostsOf[owner].orEmpty().flatMap { ancestry(it) }).distinct()

    private fun ancestry(name: String): List<String> = generateSequence(name) { parentOf[it] }.toList()

    /** The BCD keys of [member] on [owner], the most specific first. */
    private fun keys(owner: String, member: IdlMember): List<String> = when (member) {
        is IdlConstructor -> listOf(owner)
        is IdlAttribute, is IdlOperation -> {
            val name = (member as? IdlAttribute)?.name ?: (member as IdlOperation).name
            when {
                name == null -> emptyList()
                member.isStatic() -> listOf("${name}_static", name)
                // An event handler is documented with its event: `onclick` with `click_event`.
                member is IdlAttribute && name.startsWith("on") -> listOf(name, "${name.removePrefix("on")}_event")
                else -> listOf(name)
            }
        }

        is IdlConstant -> listOf(member.name)
        is IdlDeclarationMember -> emptyList()
    }
}

/** KDoc lines are wrapped to fit this width, indentation and ` * ` included. */
private const val KDOC_WIDTH = 120

/**
 * The lines of the KDoc of a declaration indented by [indent] (in columns), without the indentation: MDN's summary,
 * notes on deprecation and secure contexts, and the link to the MDN page. Empty when there is nothing to say.
 */
internal fun kdocLines(doc: WebDoc?, secureContext: Boolean, indent: Int): List<String> {
    val paragraphs = buildList {
        doc?.summary?.let(::summaryText)?.let { add(escapeKDoc(it)) }
        if (doc?.deprecated == true) add("Deprecated: MDN no longer recommends using this feature.")
        if (secureContext) add("Available only in secure contexts.")
        doc?.let { add("[MDN Reference](${it.mdnUrl})") }
        doc?.let { add("© Mozilla Contributors, licensed under CC BY-SA 2.5") }
    }
    if (paragraphs.isEmpty()) return emptyList()

    val width = KDOC_WIDTH - indent - " * ".length
    return buildList {
        add("/**")
        paragraphs.forEachIndexed { i, paragraph ->
            if (i > 0) add(" *")
            wrap(paragraph, width).forEach { add(" * $it") }
        }
        add(" */")
    }
}

/**
 * [summary] on one line, without a trailing sentence that introduces a list (`It can have the following values:`):
 * MDN's summary is the page's first paragraph, so the list is not in it. `null` if nothing is left.
 */
internal fun summaryText(summary: String): String? {
    val text = summary.trim().replace(Regex("\\s+"), " ")
    if (!text.endsWith(':')) return text
    val end = text.lastIndexOf(". ")
    return if (end < 0) null else text.substring(0, end + 1)
}

/**
 * MDN's plain text as KDoc text: `*` + `/` would end the comment, `[…]` would be a link (`[key, value]` pairs), `<…>`
 * an HTML tag (`<audio>`), and `@` at the start of a line a block tag.
 */
private fun escapeKDoc(text: String): String = text
    .replace("&", "&amp;")
    .replace("<", "&lt;")
    .replace(">", "&gt;")
    .replace("*/", "*&#47;")
    .replace("[", "\\[")
    .replace("]", "\\]")
    .replace(Regex("(^|\\s)@"), "$1\\\\@")

/** [text] in lines of at most [width] characters, broken between words; a longer word gets a line of its own. */
private fun wrap(text: String, width: Int): List<String> {
    val lines = mutableListOf<String>()
    val line = StringBuilder()
    for (word in text.split(' ')) {
        if (line.isNotEmpty() && line.length + 1 + word.length > width) {
            lines += line.toString()
            line.clear()
        }
        if (line.isNotEmpty()) line.append(' ')
        line.append(word)
    }
    if (line.isNotEmpty()) lines += line.toString()
    return lines
}
