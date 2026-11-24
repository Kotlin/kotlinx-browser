/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.ir

/**
 * Renders the IR back as Web IDL text. Used for golden files and debugging: because the output is plain IDL, a
 * reviewer can compare it with the `@webref/idl` source by eye, and anything the front-end lost or invented stands out.
 * Formatting is canonical (one member per line, two-space indent), so diffs only show semantic changes.
 */
fun IdlIR.render(): String = buildString {
    for (spec in specs) {
        append("// spec: ").append(spec.name).append(" (").append(spec.packageName).append(")\n")
        for (definition in spec.definitions) append(definition.render()).append('\n')
    }
}

fun IdlDefinition.render(): String = buildString {
    append(extAttrs.renderPrefix(multiline = true))
    when (val d = this@render) {
        is IdlInterface -> {
            if (d.partial) append("partial ")
            append(
                when (d.kind) {
                    IdlInterfaceKind.INTERFACE -> "interface "
                    IdlInterfaceKind.MIXIN -> "interface mixin "
                    IdlInterfaceKind.CALLBACK_INTERFACE -> "callback interface "
                }
            )
            append(d.name)
            d.inheritance?.let { append(" : ").append(it) }
            appendBody(d.members.map { it.render() })
        }

        is IdlNamespace -> {
            if (d.partial) append("partial ")
            append("namespace ").append(d.name)
            appendBody(d.members.map { it.render() })
        }

        is IdlDictionary -> {
            if (d.partial) append("partial ")
            append("dictionary ").append(d.name)
            d.inheritance?.let { append(" : ").append(it) }
            appendBody(d.members.map { it.render() })
        }

        is IdlCallback -> append("callback ").append(d.name).append(" = ")
            .append(d.returnType.render()).append(" (").append(d.arguments.render()).append(");")

        is IdlEnum -> append("enum ").append(d.name).append(" { ")
            .append(d.values.joinToString(", ") { it.quote() }).append(" };")

        is IdlTypedef -> append("typedef ").append(d.type.render()).append(' ').append(d.name).append(';')
        is IdlIncludes -> append(d.target).append(" includes ").append(d.mixin).append(';')
    }
}

private fun StringBuilder.appendBody(lines: List<String>) {
    append(" {\n")
    lines.forEach { append("  ").append(it).append('\n') }
    append("};")
}

fun IdlMember.render(): String = extAttrs.renderPrefix() + when (this) {
    is IdlConstant -> "const ${type.render()} ${name.escape()} = ${value.render()};"
    is IdlAttribute -> buildString {
        when (special) {
            IdlAttributeSpecial.STATIC -> append("static ")
            IdlAttributeSpecial.STRINGIFIER -> append("stringifier ")
            IdlAttributeSpecial.INHERIT -> append("inherit ")
            null -> {}
        }
        if (readonly) append("readonly ")
        append("attribute ").append(type.render()).append(' ').append(name.escape()).append(';')
    }

    is IdlOperation -> buildString {
        if (returnType == null) {
            // bare `stringifier;`
            append(special?.name?.lowercase()).append(';')
            return@buildString
        }
        special?.let { append(it.name.lowercase()).append(' ') }
        append(returnType.render())
        append(' ')
        name?.let { append(it.escape()) }
        append('(').append(arguments.render()).append(");")
    }

    is IdlConstructor -> "constructor(${arguments.render()});"
    is IdlDeclarationMember -> buildString {
        if (readonly) append("readonly ")
        append(
            when (kind) {
                IdlDeclarationMemberKind.ITERABLE -> "iterable"
                IdlDeclarationMemberKind.ASYNC_ITERABLE -> "async_iterable" // current spelling of `async iterable`
                IdlDeclarationMemberKind.MAPLIKE -> "maplike"
                IdlDeclarationMemberKind.SETLIKE -> "setlike"
            }
        )
        append('<').append(typeArguments.joinToString(", ") { it.render() }).append('>')
        if (arguments.isNotEmpty()) append('(').append(arguments.render()).append(')')
        append(';')
    }
}

fun IdlField.render(): String = buildString {
    append(extAttrs.renderPrefix())
    if (required) append("required ")
    append(type.render()).append(' ').append(name.escape())
    default?.let { append(" = ").append(it.render()) }
    append(';')
}

private fun List<IdlArgument>.render(): String = joinToString(", ") { it.render() }

fun IdlArgument.render(): String = buildString {
    append(extAttrs.renderPrefix())
    if (optional) append("optional ")
    append(type.render())
    if (variadic) append("...")
    append(' ').append(if (name in ARGUMENT_NAME_KEYWORDS) name else name.escape())
    default?.let { append(" = ").append(it.render()) }
}

fun IdlType.render(): String {
    val core = when (this) {
        is IdlNamedType -> name
        is IdlGenericType -> "$generic<${arguments.joinToString(", ") { it.render() }}>"
        is IdlUnionType -> members.joinToString(" or ", "(", ")") { it.render() }
    }
    return extAttrs.renderPrefix() + core + if (nullable) "?" else ""
}

fun IdlValue.render(): String = when (this) {
    is IdlValue.Str -> value.quote()
    is IdlValue.Num -> literal
    is IdlValue.Bool -> value.toString()
    is IdlValue.Infinity -> if (negative) "-Infinity" else "Infinity"
    IdlValue.NaN -> "NaN"
    IdlValue.Null -> "null"
    IdlValue.EmptySequence -> "[]"
    IdlValue.EmptyDictionary -> "{}"
}

private fun List<IdlExtendedAttribute>.renderPrefix(multiline: Boolean = false): String =
    if (isEmpty()) "" else joinToString(", ", "[", "]") { it.render() } + if (multiline) "\n" else " "

fun IdlExtendedAttribute.render(): String = buildString {
    append(name)
    rhs?.let { append('=').append(it.render()) }
    if (arguments.isNotEmpty()) append('(').append(arguments.render()).append(')')
}

private fun IdlExtendedAttributeValue.render(): String = when (this) {
    is IdlExtendedAttributeValue.Identifier -> value
    is IdlExtendedAttributeValue.IdentifierList -> values.joinToString(", ", "(", ")")
    is IdlExtendedAttributeValue.StringValue -> value.quote()
    is IdlExtendedAttributeValue.StringList -> values.joinToString(", ", "(", ")") { it.quote() }
    is IdlExtendedAttributeValue.Integer -> literal
    is IdlExtendedAttributeValue.IntegerList -> literals.joinToString(", ", "(", ")")
    is IdlExtendedAttributeValue.Decimal -> literal
    is IdlExtendedAttributeValue.DecimalList -> literals.joinToString(", ", "(", ")")
    IdlExtendedAttributeValue.Wildcard -> "*"
}

private fun String.quote() = "\"$this\""

/**
 * Web IDL drops one leading underscore from identifiers, which is how keywords are used as names (`_any`).
 * webidl2 stores the unescaped name, so re-escape keywords and names that themselves start with `_`.
 */
private fun String.escape() = if (this in IDL_KEYWORDS || startsWith("_")) "_$this" else this

/** Keywords the Web IDL grammar accepts unescaped as argument names (`ArgumentNameKeyword`). */
private val ARGUMENT_NAME_KEYWORDS = setOf(
    "async", "attribute", "callback", "const", "constructor", "deleter", "dictionary", "enum", "getter", "includes",
    "inherit", "interface", "iterable", "maplike", "mixin", "namespace", "partial", "readonly", "required", "setlike",
    "setter", "static", "stringifier", "typedef", "unrestricted",
)

private val IDL_KEYWORDS = setOf(
    "any", "async", "attribute", "bigint", "boolean", "byte", "callback", "const", "constructor", "deleter",
    "dictionary", "double", "enum", "false", "float", "getter", "includes", "inherit", "interface", "iterable",
    "long", "maplike", "mixin", "namespace", "null", "object", "octet", "optional", "or", "partial", "readonly",
    "record", "required", "sequence", "setlike", "setter", "short", "static", "stringifier", "symbol", "true",
    "typedef", "undefined", "unrestricted", "unsigned",
)
