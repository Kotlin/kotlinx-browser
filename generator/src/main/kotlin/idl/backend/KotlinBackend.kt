/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.backend

import org.jetbrains.kotlin.tools.idl.ir.*
import org.jetbrains.kotlin.tools.idl.lowering.*
import org.jetbrains.kotlin.tools.idl.mapping.KotlinType
import org.jetbrains.kotlin.tools.idl.mapping.TypePosition
import org.jetbrains.kotlin.tools.idl.mapping.WasmTypeMapping

/**
 * The Kotlin backend: prints one `webMain` source file per spec from the [LoweredIR], with `external` declarations
 * only and no suppressions (Key Decision 3: one copy for both Kotlin/JS and Kotlin/Wasm).
 *
 * Every type goes through [WasmTypeMapping], unchanged; the backend only decides how a [KotlinType] is spelled.
 *
 * Printed so far: interfaces, mixins and callback interfaces (by [Shape]), `[LegacyFactoryFunction]` classes,
 * namespaces, union markers, and their attributes, operations, constructors, constants and statics, with `override`
 * and `open` from [LoweredIR.overrides]. Dictionaries, enums, `iterable`/`maplike`/`setlike` and anonymous special
 * operations are not printed yet; each leaves a `// not printed yet:` line, so the golden file shows what is missing.
 */
class KotlinBackend(internal val lowered: LoweredIR) {

    val definitions: Map<String, IdlNamedDefinition> = lowered.ir.definitions
        .filterIsInstance<IdlNamedDefinition>()
        .associateBy { it.name }

    /** The package of every name a type can refer to. */
    val packageOf: Map<String, String> = buildMap {
        for ((val packageName, val definitions) in lowered.ir.specs) {
            for (d in definitions) {
                if (d is IdlNamedDefinition) {
                    put(d.name, packageName)
                }
            }
        }

        val packageOfSpec = lowered.ir.specs
            .associate { (val name, val packageName) ->
                name to packageName
            }

        for ((val name, val spec) in lowered.unionMarkers.byName.values) {
            put(name, packageOfSpec.getValue(spec))
        }

        for ((val name, val host) in lowered.shapes.factoryClasses) {
            put(name, getValue(host))
        }

        put(ITEM_ARRAY_LIKE, "org.w3c.dom")
    }

    /** The Kotlin source of [spec]: its union markers, then its definitions in order. To be written to [path]. */
    fun file(spec: IdlSpec): String = SpecFile(this, spec).print()

    /** Where [file] of [spec] goes, relative to the source root: `org/w3c/dom/events/pointerevents.kt`. */
    fun path(spec: IdlSpec): String = spec.packageName.replace('.', '/') + "/" + spec.name + ".kt"

}

/** A name as a Kotlin identifier: hard keywords are escaped with backticks. */
private fun name(name: String): String = if (name in KOTLIN_HARD_KEYWORDS) {
    "`$name`"
} else name

private val KOTLIN_HARD_KEYWORDS = setOf(
    "as",
    "break",
    "class",
    "continue",
    "do",
    "else",
    "false",
    "for",
    "fun",
    "if",
    "in",
    "interface",
    "is",
    "null",
    "object",
    "package",
    "return",
    "super",
    "this",
    "throw",
    "true",
    "try",
    "typealias",
    "typeof",
    "val",
    "var",
    "when",
    "while",
)

/** Callbacks returning `any` that are only used as event handlers. */
private val EVENT_HANDLER_CALLBACKS = setOf("EventHandlerNonNull", "OnErrorEventHandlerNonNull")

private const val ITEM_ARRAY_LIKE = "ItemArrayLike"
private const val JS_ANY = "kotlin.js.JsAny"
private const val UNIT = "kotlin.Unit"

private val HEADER = """
    |/*
    | * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
    | * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
    | */
    |
    |// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF '{spec}', DO NOT EDIT!
    |
    |""".trimMargin()

private class SpecFile(
    private val kotlinBackend: KotlinBackend,
    private val spec: IdlSpec
) {
    private val imports = sortedSetOf<String>()
    private val out = StringBuilder()
    private var indent = 0

    fun print(): String {
        val markers = kotlinBackend.lowered.unionMarkers.byName.values
            .filter { it.spec == spec.name }
        for (marker in markers) {
            line("public external interface ${marker.name} : ${supertypes(marker.supertypes)}")
            line()
        }

        val factoriesByHost = kotlinBackend.lowered.shapes.factoryClasses.groupBy { it.host }
        for (d in spec.definitions) {
            when (d) {
                is IdlInterface -> {
                    printInterface(d)
                    factoriesByHost[d.name].orEmpty().forEach(::printFactory)
                }

                is IdlNamespace -> printNamespace(d)
                is IdlDictionary -> notPrinted("dictionary ${d.name}")
                is IdlEnum -> notPrinted("enum ${d.name}")
                // Printed as function types where used.
                is IdlCallback -> continue
                is IdlTypedef, is IdlIncludes -> continue
            }
        }

        return buildString {
            append(HEADER.replace("{spec}", spec.name))
            append("package ").append(spec.packageName).append("\n\n")
            imports.forEach { append("import ").append(it).append(".*\n") }
            if (imports.isNotEmpty()) append('\n')
            append(out.trimEnd()).append('\n')
        }
    }

    // -------------------------------------------------------------------------------------------------------------
    // Declarations

    private fun printInterface(i: IdlInterface) {
        val shape = kotlinBackend.lowered.shapes[i.name]
        val keyword = when (shape.kind) {
            ShapeKind.INTERFACE -> "interface"
            ShapeKind.ABSTRACT_CLASS -> "abstract class"
            ShapeKind.OPEN_CLASS -> "open class"
            ShapeKind.OBJECT -> error("${i.name} is an interface")
        }
        val overrides = kotlinBackend.lowered.overrides[i.name]
        val isClass = shape.kind != ShapeKind.INTERFACE

        block("public external $keyword ${i.name} : ${supertypes(shape)}") {
            if (shape.kind == ShapeKind.OPEN_CLASS) {
                i.members
                    .filterIsInstance<IdlConstructor>()
                    .filter { !it.extAttrs.has("HTMLConstructor") }
                    .forEach { line("constructor(${parameters(it.arguments, defaults = true)})") }
            }

            for (m in i.members) {
                if (m is IdlConstructor || m is IdlConstant || m.isStatic() || overrides.isDropped(m)) continue
                member(
                    InheritedMember(m, i.name),
                    modifier = when {
                        overrides.isOverride(m) -> "override "
                        isClass -> "open "
                        else -> ""
                    },
                    shape = shape,
                )
            }

            for (added in overrides.added) {
                member(added, modifier = "override ", shape = shape)
            }

            val constants = if (isClass) {
                shape.constants.map { it.constant }
            } else {
                kotlinBackend.lowered.shapes.constantsWithoutClassHome[i.name].orEmpty()
            }
            val statics = i.members.filter { it.isStatic() }.map { InheritedMember(it, i.name) } +
                    shape.inheritedStatics
            companion(constants, statics, suppress = !isClass)
        }
    }

    private fun printFactory(factory: FactoryClass) {
        val shape = kotlinBackend.lowered.shapes[factory.name]
        block("public external open class ${factory.name} : ${supertypes(shape)}") {
            line("constructor(${parameters(factory.arguments, defaults = true)})")
            for (added in kotlinBackend.lowered.overrides[factory.name].added) {
                member(added, modifier = "override ", shape = shape)
            }
            companion(shape.constants.map { it.constant }, shape.inheritedStatics, suppress = false)
        }
    }

    private fun printNamespace(n: IdlNamespace) {
        block("public external object ${n.name}") {
            for (m in n.members) {
                if (m is IdlConstant) {
                    constant(m)
                } else {
                    member(InheritedMember(m, n.name), modifier = "", shape = null)
                }
            }
        }
    }

    /**
     * The companion of a class: its constants and static members. On an interface (a callback interface with
     * constants, e.g. `NodeFilter`) it needs `COMPANION_OBJECT_IN_EXTERNAL_INTERFACE` suppressed (Key
     * Decision 13), on the companion only.
     */
    private fun companion(constants: List<IdlConstant>, statics: List<InheritedMember>, suppress: Boolean) {
        if (constants.isEmpty() && statics.isEmpty()) return
        line()
        if (suppress) line("@Suppress(\"COMPANION_OBJECT_IN_EXTERNAL_INTERFACE\")")
        block("companion object") {
            constants.forEach(::constant)
            statics.forEach { member(it, modifier = "", shape = null) }
        }
    }

    // -------------------------------------------------------------------------------------------------------------
    // Members

    /**
     * [m] as a member of the declaration being printed. An inherited member is printed as [m]'s declaring
     * interface prints it: its event handler type is the one narrowed for that interface.
     */
    private fun member(m: InheritedMember, modifier: String, shape: Shape?) {
        // CSS property attributes have a dashed twin of each camel-case name (`margin-top` of `marginTop`), which
        // is not a Kotlin identifier; the camel-case one is enough.
        if (m.member is IdlAttribute && '-' in m.member.name) return

        when (val member = m.member) {
            is IdlAttribute -> {
                val keyword = if (member.readonly) "val" else "var"
                line("$modifier$keyword ${name(member.name)}: ${attributeType(member, m.declaredIn)}")
            }

            is IdlOperation -> when {
                member.name == null -> notPrinted(memberKey(member))
                else -> {
                    val returnType = if (shape?.itemArrayLike != null && isItemGetter(member)) {
                        // Must match ItemArrayLike<T>.item(): T?, where T is a type argument (JsString, not String).
                        ": " + type(map(member.returnType!!, TypePosition.TYPE_ARGUMENT))
                    } else {
                        returnType(member.returnType!!)
                    }
                    val parameters = parameters(member.arguments, defaults = modifier != "override ")
                    line("${modifier}fun ${name(member.name)}($parameters)$returnType")
                }
            }

            is IdlDeclarationMember -> notPrinted(memberKey(member))
            is IdlConstant, is IdlConstructor -> error("printed elsewhere: ${memberKey(member)}")
        }
    }

    private fun constant(c: IdlConstant) {
        line("val ${name(c.name)}: ${type(map(c.type, TypePosition.VALUE))}")
    }

    private fun isItemGetter(op: IdlOperation) = op.special == IdlOperationSpecial.GETTER && op.name == "item"

    /**
     * Kotlin does not allow an overriding function to declare default values, so [defaults] is false for
     * `override`s; the overridden declaration has them.
     */
    private fun parameters(arguments: List<IdlArgument>, defaults: Boolean): String =
        arguments.joinToString(", ") { a ->
            buildString {
                if (a.variadic) append("vararg ")
                append(name(a.name)).append(": ").append(type(map(a.type, TypePosition.VALUE)))
                if (a.optional && !a.variadic && defaults) {
                    append(" = definedExternally")
                }
            }
        }

    private fun returnType(t: IdlType): String {
        val kotlin = map(t, TypePosition.RETURN)
        return if (kotlin is KotlinType.Named && kotlin.fqName == UNIT) "" else ": ${type(kotlin)}"
    }

    private fun attributeType(a: IdlAttribute, declaredIn: String): String {
        val eventType = kotlinBackend.lowered.eventHandlerTypes[declaredIn, a.name]
        val callback = (a.type as? IdlNamedType)?.let { kotlinBackend.definitions[it.name] as? IdlCallback }
        return if (eventType != null && callback != null) {
            functionType(callback, a.type.nullable, eventType)
        } else {
            type(map(a.type, TypePosition.VALUE))
        }
    }

    private fun notPrinted(what: String) {
        line("// not printed yet: $what")
    }

    // -------------------------------------------------------------------------------------------------------------
    // Types

    private fun map(t: IdlType, position: TypePosition): KotlinType =
        WasmTypeMapping.map(t, position) { kotlinBackend.lowered.unionMarkers[it]?.name }

    private fun supertypes(shape: Shape): String {
        val itemArrayLike = shape.itemArrayLike?.let {
            "${reference(ITEM_ARRAY_LIKE)}<${type(map(it, TypePosition.TYPE_ARGUMENT))}>"
        }
        return supertypes(shape.supertypes, listOfNotNull(itemArrayLike))
    }

    /** [names] (references), then [printed] (already spelled); `JsAny` if there are none. */
    private fun supertypes(names: List<String>, printed: List<String> = emptyList()): String {
        val all = names.map { reference(it) } + printed
        return if (all.isEmpty()) {
            type(KotlinType.Named(JS_ANY))
        } else {
            all.joinToString(", ")
        }
    }

    /**
     * [typeArgument]: [t] is a type argument, bounded by `JsAny?`. A function type is not a `JsAny`, so a callback
     * there is a `JsAny` (`Promise<CustomElementConstructor>` → `Promise<JsAny>`).
     */
    private fun type(t: KotlinType, typeArgument: Boolean = false): String = when (t) {
        is KotlinType.Named -> {
            val packageName = t.fqName.substringBeforeLast('.')
            if (packageName != "kotlin") use(packageName)
            val arguments = if (t.typeArguments.isEmpty()) {
                ""
            } else {
                t.typeArguments.joinToString(", ", "<", ">") { type(it, typeArgument = true) }
            }
            t.fqName.substringAfterLast('.') + arguments + nullability(t)
        }

        is KotlinType.Reference -> {
            val callback = kotlinBackend.definitions[t.idlName] as? IdlCallback
            when {
                callback == null -> reference(t.idlName) + nullability(t)
                typeArgument -> type(KotlinType.Named(JS_ANY, nullable = t.nullable))
                else -> functionType(callback, t.nullable, eventType = null)
            }
        }

        // A union without a marker outside an argument (an attribute, a return type): the overload expansion
        // does not apply, and JsAny is the closest common supertype.
        is KotlinType.Union -> type(KotlinType.Named(JS_ANY, nullable = t.nullable))
    }

    /**
     * A callback as a Kotlin function type. [eventType], for an event handler, replaces the type of its first
     * parameter. Event handler callbacks return `Unit` rather than `any`, as in the legacy API, so a Kotlin lambda
     * whose last expression is not a `JsAny?` can be assigned.
     */
    private fun functionType(callback: IdlCallback, nullable: Boolean, eventType: String?): String {
        val parameters = callback.arguments
            .mapIndexed { i, a ->
                if (i == 0 && eventType != null) {
                    reference(eventType)
                } else {
                    type(map(a.type, TypePosition.VALUE))
                }
            }

        val returnType = if (callback.name in EVENT_HANDLER_CALLBACKS) {
            "Unit"
        } else {
            type(
                map(
                    callback.returnType,
                    TypePosition.RETURN
                )
            )
        }

        val function = parameters.joinToString(", ", "(", ") -> $returnType")
        return if (nullable) "($function)?" else function
    }

    private fun reference(name: String): String {
        use(kotlinBackend.packageOf[name] ?: error("no package for '$name'"))
        return name
    }

    private fun nullability(t: KotlinType) = if (t.nullable) "?" else ""

    private fun use(packageName: String) {
        if (packageName != spec.packageName) imports += packageName
    }

    // -------------------------------------------------------------------------------------------------------------
    // Text

    private fun line(text: String = "") {
        if (text.isNotEmpty()) repeat(indent) { out.append("    ") }
        out.append(text).append('\n')
    }

    private fun block(header: String, body: () -> Unit) {
        val start = out.length
        line("$header {")
        val bodyStart = out.length
        indent++
        body()
        indent--
        if (out.length == bodyStart) {
            // Nothing inside: drop the braces.
            out.setLength(start)
            line(header)
        } else {
            // A nested block ends with an empty line; not before the closing brace.
            if (out.endsWith("\n\n")) out.setLength(out.length - 1)
            line("}")
        }
        line()
    }
}