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
 * namespaces, union markers, dictionaries (with factory functions), enums, special getters and setters (as
 * `operator` extensions), and their attributes, operations, constructors, constants and statics, with `override` and
 * `open` from [LoweredIR.overrides]. `iterable`/`maplike`/`setlike` and deleters are not printed yet; each leaves a
 * `// not printed yet:` line, so the golden file shows what is missing.
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
        listOf(
            NEW_JS_OBJECT,
            "getProperty",
            "getStringProperty",
            "setProperty",
            "setStringProperty"
        ).forEach { helper ->
            put(helper, "org.w3c.dom")
        }
    }

    /** The Kotlin source of [spec]: its union markers, then its definitions in order. To be written to [path]. */
    fun file(spec: IdlSpec): String = SpecFile(this, spec).print()

    /** Where [file] of [spec] goes, relative to the source root: `org/w3c/dom/events/pointerevents.kt`. */
    fun path(spec: IdlSpec): String = spec.packageName.replace('.', '/') + "/" + spec.name + ".kt"

    /** The fields of [d] and of the dictionaries it inherits from, the least derived first. */
    fun fieldsWithInherited(d: IdlDictionary): List<IdlField> {
        val parent = d.inheritance
            ?.let { definitions[it] as? IdlDictionary ?: error("${d.name}: '$it' is not a dictionary") }

        return parent?.let(::fieldsWithInherited).orEmpty() + d.members
    }
}

/**
 * The Kotlin name of the enum value [value]: words split at non-alphanumerics and at camel-case humps, upper-cased
 * (`same-origin` → `SAME_ORIGIN`, `flipY` → `FLIP_Y`); `EMPTY` for `""`, and a `_` before a leading digit (`2d` →
 * `_2D`).
 */
internal fun enumValueName(value: String): String {
    val words = value
        .replace(Regex("([a-z])([A-Z])"), "$1_$2")
        .replace(Regex("[^A-Za-z0-9]+"), "_")
        .trim('_')
        .uppercase()
    return when {
        words.isEmpty() -> "EMPTY"
        words[0].isDigit() -> "_$words"
        else -> words
    }
}

/** A name as a Kotlin identifier: hard keywords are escaped with backticks. */
private fun name(name: String): String =
    if (name in KOTLIN_HARD_KEYWORDS) {
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

private val INDEXERS = setOf(IdlOperationSpecial.GETTER, IdlOperationSpecial.SETTER)

/**
 * Special operations that are specified as getters but are not ones in browsers; printed as plain members only.
 *
 * - `TouchEvent.getModifierState`: Touch Events declares `getter boolean getModifierState(DOMString keyArg)`, but no
 *   engine exposes modifier keys as named properties (`touchEvent["Shift"]` is `undefined`). `UIEvent`-style
 *   `getModifierState` elsewhere is a regular operation.
 */
internal val NOT_INDEXERS = setOf("TouchEvent.getModifierState")

/** `internal fun <T : JsAny> newJsObject(): T = js("({})")`, in `JsObjects.kt` next to [ITEM_ARRAY_LIKE]. */
private const val NEW_JS_OBJECT = "newJsObject"
private const val JS_ANY = "kotlin.js.JsAny"
private const val UNIT = "kotlin.Unit"
private const val STRING = "kotlin.String"
private val INDEXER_KEY_TYPES = setOf("kotlin.Int", STRING)

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
                    printIndexers(d)
                }

                is IdlNamespace -> printNamespace(d)
                is IdlDictionary -> printDictionary(d)
                is IdlEnum -> printEnum(d)
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
     * A dictionary: an `external interface` with a `var` per field, and a factory function of the same name taking
     * every field, inherited ones included. Required fields come first, without defaults. An optional field is
     * nullable, defaults to `null`, and is only set when it is not `null`: an absent member must stay absent, or JS
     * converts `null` instead of applying the member's default (`{cancelable: null}` is not `{}`).
     */
    private fun printDictionary(d: IdlDictionary) {
        block("public external interface ${d.name} : ${supertypes(listOfNotNull(d.inheritance))}") {
            for (f in d.members) {
                line("var ${name(f.name)}: ${fieldType(f)}")
            }
        }

        val fields = kotlinBackend.fieldsWithInherited(d).sortedBy { !it.required }
        val parameters = fields.joinToString(", ") { f ->
            "${name(f.name)}: ${fieldType(f)}" + if (f.required) "" else " = null"
        }
        val factory = "public fun ${d.name}($parameters): ${d.name} = ${reference(NEW_JS_OBJECT)}<${d.name}>()"
        if (fields.isEmpty()) {
            line(factory)
            line()
            return
        }
        block("$factory.apply") {
            for (f in fields) {
                val n = name(f.name)
                line(if (f.required) "this.$n = $n" else "if ($n != null) this.$n = $n")
            }
        }
    }

    private fun fieldType(f: IdlField): String {
        val kotlin = map(f.type, TypePosition.VALUE)
        return type(if (f.required) kotlin else kotlin.withNullable())
    }

    /**
     * An enum: an `external interface` whose values are `JsString`s, each an extension `val` on its companion
     * (`RequestMode.CORS`). The companion of an external interface needs `COMPANION_OBJECT_IN_EXTERNAL_INTERFACE`
     * suppressed (Key Decision 13).
     */
    private fun printEnum(e: IdlEnum) {
        block("public external interface ${e.name} : ${type(KotlinType.Named(JS_ANY))}") {
            line("@Suppress(\"COMPANION_OBJECT_IN_EXTERNAL_INTERFACE\")")
            line("companion object")
        }

        val byName = e.values.groupBy(::enumValueName)
        byName.values.firstOrNull { it.size > 1 }?.let { error("enum ${e.name}: values $it have the same Kotlin name") }
        for (entry in byName) {
            val n = entry.key
            val literal = entry.value.single().replace("\\", "\\\\").replace("\"", "\\\"").replace("$", "\\$")
            line("public inline val ${e.name}.Companion.$n: ${e.name} get() = \"$literal\".toJsString().unsafeCast<${e.name}>()")
        }
        line()
    }

    /**
     * Special getters and setters, named or anonymous, as `operator get`/`set` extensions (`nodeList[0]`,
     * `dataset["x"] = "y"`), because an external declaration cannot declare them: `obj[key]` is not a call. Each calls
     * a shared `js("…")` helper next to `ItemArrayLike` (`getProperty`, `getStringProperty`, `setProperty`,
     * `setStringProperty`), chosen by the Kotlin types at the boundary: on Wasm they decide the conversion. A getter
     * returns a nullable type: a missing index or name is `undefined`. Named ones keep their member too
     * (`item(index)`). An inherited one applies through the receiver type.
     */
    private fun printIndexers(i: IdlInterface) {
        val indexers = i.members
            .filterIsInstance<IdlOperation>()
            .filter { it.special in INDEXERS && "${i.name}.${it.name}" !in NOT_INDEXERS }
            .distinctBy { memberKey(it.copy(name = null)) }
        for (op in indexers) {
            val key = op.arguments[0]
            val keyName = name(key.name)
            val keyType = indexerKeyType(i, key)
            if (op.special == IdlOperationSpecial.GETTER) {
                val returnType = map(op.returnType!!, TypePosition.RETURN).withNullable()
                val helper = reference(if (isString(returnType, i)) "getStringProperty" else "getProperty")
                line("public operator fun ${i.name}.get($keyName: $keyType): ${type(returnType)} = $helper(this, $keyName)")
            } else {
                val value = op.arguments[1]
                val valueName = name(value.name)
                val valueType = map(value.type, TypePosition.VALUE)
                val helper = reference(if (isString(valueType, i)) "setStringProperty" else "setProperty")
                line("public operator fun ${i.name}.set($keyName: $keyType, $valueName: ${type(valueType)}) { $helper(this, $keyName, $valueName) }")
            }
            line()
        }
    }

    /** `Int` (an index) or `String` (a name): the key types the shared helpers take. */
    private fun indexerKeyType(i: IdlInterface, key: IdlArgument): String {
        val kotlin = map(key.type, TypePosition.VALUE)
        check(kotlin is KotlinType.Named && kotlin.fqName in INDEXER_KEY_TYPES && !kotlin.nullable) {
            "${i.name}: indexer key $kotlin has no helper"
        }
        return type(kotlin)
    }

    /**
     * Whether an indexer value is a `String`, which needs the string helper; otherwise it must be a `JsAny` (an
     * external type), which the generic one passes as is.
     */
    private fun isString(value: KotlinType, i: IdlInterface): Boolean = when {
        value is KotlinType.Named && value.fqName == STRING -> true
        value is KotlinType.Named && value.fqName == JS_ANY -> false
        value is KotlinType.Reference && kotlinBackend.definitions[value.idlName] !is IdlCallback -> false
        else -> error("${i.name}: indexer value $value has no helper")
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
                // Printed by printIndexers.
                member.name == null && member.special in INDEXERS -> {}
                // `stringifier;` is JS `toString()`, which Kotlin's `toString()` already calls.
                member.name == null && member.special == IdlOperationSpecial.STRINGIFIER -> {}
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

    private fun KotlinType.withNullable(): KotlinType = when (this) {
        is KotlinType.Named -> copy(nullable = true)
        is KotlinType.Reference -> copy(nullable = true)
        is KotlinType.Union -> copy(nullable = true)
    }

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