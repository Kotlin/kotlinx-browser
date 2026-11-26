/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.backend

import org.jetbrains.kotlin.generators.helpers.generatedFileHeader
import org.jetbrains.kotlin.tools.idl.frontend.WebDoc
import org.jetbrains.kotlin.tools.idl.frontend.WebDocs
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
 * `operator` extensions), function-typed twins of operations taking callback interfaces, and their attributes, operations, constructors, constants and statics, with `override` and
 * `open` from [LoweredIR.overrides]. `iterable`/`maplike`/`setlike` and deleters are not printed yet; each leaves a
 * `// not printed yet:` line, so the golden file shows what is missing.
 */
class KotlinBackend(internal val lowered: LoweredIR, docs: WebDocs = WebDocs.EMPTY) {

    /** The KDoc of the declarations: MDN summaries and links (see [DocLookup]). */
    internal val docs = DocLookup(docs, lowered.ir)

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

/** Operations adding a listener, and the operation removing it: printed as extensions returning the removal. */
internal val LISTENER_REGISTRATIONS = mapOf(
    "EventTarget.addEventListener" to "removeEventListener",
    "MediaQueryList.addListener" to "removeListener",
)

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

private class SpecFile(
    private val kotlinBackend: KotlinBackend,
    private val spec: IdlSpec
) {
    private val imports = sortedSetOf<String>()
    /** Callback interfaces whose private lambda converter is already printed in this file. */
    private val converters = mutableSetOf<String>()
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
                    printListenerRegistrations(d)
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
            append(
                generatedFileHeader(
                    seeDetailsAt = "generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt",
                    generatedFrom = "THE WEB IDL OF '${spec.name}'",
                    mdnExcerpts = hasMdnDocs
                )
            )
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
            ShapeKind.ABSTRACT_CLASS, ShapeKind.OPEN_CLASS -> "class"
            ShapeKind.OBJECT -> error("${i.name} is an interface")
        }

        val modifier = when (shape.kind) {
            ShapeKind.INTERFACE -> ""
            ShapeKind.ABSTRACT_CLASS -> "abstract "
            ShapeKind.OPEN_CLASS -> "open "
        }

        val overrides = kotlinBackend.lowered.overrides[i.name]
        val isClass = shape.kind != ShapeKind.INTERFACE

        kdoc(docs.ofDefinition(i.name), i.extAttrs)
        block("public ${modifier}external $keyword ${i.name} : ${supertypes(shape)}") {
            if (shape.kind == ShapeKind.OPEN_CLASS) {
                i.members
                    .filterIsInstance<IdlConstructor>()
                    .filter { !it.extAttrs.has("HTMLConstructor") }
                    .forEach {
                        kdoc(docs.ofMember(i.name, it), it.extAttrs)
                        line("public constructor(${parameters(it.arguments, defaults = true)})")
                    }
            }

            for (m in i.members) {
                if (m is IdlConstructor || m is IdlConstant || m.isStatic() || overrides.isDropped(m)) continue
                member(
                    InheritedMember(m, i.name),
                    owner = i.name,
                    modifier = when {
                        overrides.isOverride(m) -> "override "
                        isClass -> "open "
                        else -> ""
                    },
                    shape = shape,
                )
            }

            for (added in overrides.added) {
                member(added, owner = i.name, modifier = "override ", shape = shape)
            }

            when {
                isClass -> {
                    val statics = i.members.filter { it.isStatic() }.map { InheritedMember(it, i.name) } +
                            shape.inheritedStatics
                    companion(i.name, shape.constants.map { it.constant }, statics)
                }

                i.members.any { it is IdlConstant } -> {
                    line()
                    line("@Suppress(\"COMPANION_OBJECT_IN_EXTERNAL_INTERFACE\")")
                    line("public companion object")
                }
            }
        }

        if (!isClass) printInterfaceConstants(i)
    }

    /**
     * The constants of an interface (a mixin such as `WebGLRenderingContextBase`, or a callback interface such as
     * `NodeFilter`), as `inline` extensions on its empty companion holding the IDL value:
     * `public inline val NodeFilter.Companion.FILTER_ACCEPT: Short get() = 1`.
     *
     * Not `external` companion members as on classes: on Wasm a member of an external interface's companion is not
     * read from JS at all (it is `0`), and on JS it is read from a global of the interface's name, which a mixin does
     * not have. The value is known from the IDL, so it needs no JS object.
     */
    private fun printInterfaceConstants(i: IdlInterface) {
        val constants = i.members.filterIsInstance<IdlConstant>()
        if (constants.isEmpty()) return
        for (c in constants) {
            kdoc(docs.ofMember(i.name, c), c.extAttrs)
            val type = map(c.type, TypePosition.VALUE)
            val literal = constantLiteral(c, type) ?: error("${i.name}.${c.name}: no Kotlin literal for ${c.value} as $type")
            line("public inline val ${i.name}.Companion.${name(c.name)}: ${type(type)} get() = $literal")
        }
        line()
    }

    /** The Kotlin expression of [c]'s value as [type]: `1`, `0x8D48`, `0xFFFFFFFF.toInt()` (above `Int.MAX_VALUE`), `-1.0`. */
    private fun constantLiteral(c: IdlConstant, type: KotlinType): String? {
        val literal = (c.value as? IdlValue.Num)?.literal ?: return null
        val integer = literal.removePrefix("-").let { digits ->
            when {
                digits.startsWith("0x") || digits.startsWith("0X") -> digits.drop(2).toBigIntegerOrNull(16)
                else -> digits.toBigIntegerOrNull()
            }
        }?.let { if (literal.startsWith("-")) it.negate() else it }
        fun fits(min: Long, max: Long) = integer != null && integer >= min.toBigInteger() && integer <= max.toBigInteger()
        return when ((type as? KotlinType.Named)?.fqName) {
            "kotlin.Int" -> when {
                fits(Int.MIN_VALUE.toLong(), Int.MAX_VALUE.toLong()) -> literal
                fits(0, 0xFFFFFFFFL) -> "$literal.toInt()"
                else -> null
            }
            "kotlin.Short" -> when {
                fits(Short.MIN_VALUE.toLong(), Short.MAX_VALUE.toLong()) -> literal
                fits(0, 0xFFFFL) -> "$literal.toShort()"
                else -> null
            }
            "kotlin.Double" -> integer?.let { "$it.0" } ?: literal
            else -> null
        }
    }

    private fun printFactory(factory: FactoryClass) {
        val shape = kotlinBackend.lowered.shapes[factory.name]
        block("public open external class ${factory.name} : ${supertypes(shape)}") {
            line("public constructor(${parameters(factory.arguments, defaults = true)})")
            for (added in kotlinBackend.lowered.overrides[factory.name].added) {
                member(added, owner = factory.name, modifier = "override ", shape = shape)
            }
            companion(factory.name, shape.constants.map { it.constant }, shape.inheritedStatics)
        }
    }

    private fun printNamespace(n: IdlNamespace) {
        kdoc(docs.ofDefinition(n.name), n.extAttrs)
        block("public external object ${n.name}") {
            for (m in n.members) {
                if (m is IdlConstant) {
                    constant(n.name, m)
                } else {
                    member(InheritedMember(m, n.name), owner = n.name, modifier = "", shape = null)
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
        kdoc(docs.ofDefinition(d.name), d.extAttrs)
        block("public external interface ${d.name} : ${supertypes(listOfNotNull(d.inheritance))}") {
            for (f in d.members) {
                line("public var ${name(f.name)}: ${fieldType(f)}")
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
        kdoc(docs.ofDefinition(e.name), e.extAttrs)
        block("public external interface ${e.name} : ${type(KotlinType.Named(JS_ANY))}") {
            line("@Suppress(\"COMPANION_OBJECT_IN_EXTERNAL_INTERFACE\")")
            line("public companion object")
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

    /**
     * The operations in [LISTENER_REGISTRATIONS] as extensions taking a Kotlin function and returning a function that
     * removes the listener again, one per overload:
     * ```
     * val remove = target.addEventListener("click") { event -> … }
     * remove()
     * ```
     * An external member cannot have a body, hence extensions; a member twin taking a function would shadow them.
     * The function is converted to the callback interface once, so the removal passes the same JS function. Removing
     * by the same Kotlin function (`removeEventListener(type, f)`) works too: its twin is a member.
     */
    private fun printListenerRegistrations(i: IdlInterface) {
        for (op in i.members.filterIsInstance<IdlOperation>()) {
            val remove = LISTENER_REGISTRATIONS["${i.name}.${op.name}"] ?: continue
            val callback = op.arguments.single { callbackInterface(it.type) != null }
            val callbackInterface = callbackInterface(callback.type)!!
            check(op.arguments.none { it.optional || it.variadic } && op.arguments.none { it.name == "listener" }) {
                "${i.name}.${op.name}: cannot print a listener registration for ${memberKey(op)}"
            }
            check(i.members.any { it is IdlOperation && it.name == remove && it.arguments.size == op.arguments.size }) {
                "${i.name}.${op.name}: no $remove(${op.arguments.size} arguments) to remove the listener"
            }

            val converter = "to${callbackInterface.name}"
            if (converters.add(callbackInterface.name)) {
                line("private fun $converter(callback: ${lambdaType(callbackInterface)}): ${reference(callbackInterface.name)} = js(\"callback\")")
                line()
            }

            val arguments = op.arguments.joinToString(", ") { if (it == callback) "listener" else name(it.name) }
            kdoc(docs.ofMember(i.name, op), op.extAttrs)
            block("public fun ${i.name}.${op.name}(${parameters(op.arguments, defaults = false, lambdas = true)}): () -> Unit") {
                line("val listener = $converter(${name(callback.name)})")
                line("${op.name}($arguments)")
                line("return { $remove($arguments) }")
            }
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

    /** The companion of a class: its constants and static members, read from the JS class. */
    private fun companion(owner: String, constants: List<IdlConstant>, statics: List<InheritedMember>) {
        if (constants.isEmpty() && statics.isEmpty()) return
        line()
        block("public companion object") {
            constants.forEach { constant(owner, it) }
            statics.forEach { member(it, owner = owner, modifier = "", shape = null) }
        }
    }

    // -------------------------------------------------------------------------------------------------------------
    // Members

    /**
     * [m] as a member of the declaration being printed. An inherited member is printed as [m]'s declaring
     * interface prints it: its event handler type is the one narrowed for that interface. Its KDoc is the one of
     * [owner], the declaration being printed, if MDN documents it there, else the one of the declaring interface.
     */
    private fun member(m: InheritedMember, owner: String, modifier: String, shape: Shape?) {
        // Explicit API mode: every member is `public`, except an override, which keeps the overridden visibility.
        val visibility = if (modifier == "override ") "" else "public "
        // CSS property attributes have a dashed twin of each camel-case name (`margin-top` of `marginTop`), which
        // is not a Kotlin identifier; the camel-case one is enough.
        if (m.member is IdlAttribute && '-' in m.member.name) return
        val doc = docs.ofMember(owner, m.member) ?: docs.ofMember(m.declaredIn, m.member)

        when (val member = m.member) {
            is IdlAttribute -> {
                val keyword = if (member.readonly) "val" else "var"
                kdoc(doc, member.extAttrs)
                line("$visibility$modifier$keyword ${name(member.name)}: ${attributeType(member, m.declaredIn)}")
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
                    val defaults = modifier != "override "
                    val signature = "$visibility${modifier}fun ${name(member.name)}"
                    kdoc(doc, member.extAttrs)
                    line("$signature(${parameters(member.arguments, defaults)})$returnType")
                    if (member.arguments.any { callbackInterface(it.type) != null } &&
                        "${m.declaredIn}.${member.name}" !in LISTENER_REGISTRATIONS
                    ) {
                        kdoc(doc, member.extAttrs)
                        line("$signature(${parameters(member.arguments, defaults, lambdas = true)})$returnType")
                    }
                }
            }

            is IdlDeclarationMember -> notPrinted(memberKey(member))
            is IdlConstant, is IdlConstructor -> error("printed elsewhere: ${memberKey(member)}")
        }
    }

    private fun constant(owner: String, c: IdlConstant) {
        kdoc(docs.ofMember(owner, c), c.extAttrs)
        line("public val ${name(c.name)}: ${type(map(c.type, TypePosition.VALUE))}")
    }

    private fun isItemGetter(op: IdlOperation) = op.special == IdlOperationSpecial.GETTER && op.name == "item"

    /**
     * Kotlin does not allow an overriding function to declare default values, so [defaults] is false for
     * `override`s; the overridden declaration has them.
     *
     * [lambdas]: the twin of an operation taking a callback interface, which takes a Kotlin function instead (a JS
     * function is a valid callback interface value). The function is required and not nullable, so a call that omits
     * it, or passes `null`, still resolves to the original (`createNodeIterator(root)`).
     */
    private fun parameters(arguments: List<IdlArgument>, defaults: Boolean, lambdas: Boolean = false): String =
        arguments.joinToString(", ") { a ->
            buildString {
                if (a.variadic) append("vararg ")
                val callbackInterface = callbackInterface(a.type).takeIf { lambdas }
                if (callbackInterface != null) {
                    append(name(a.name)).append(": ").append(lambdaType(callbackInterface))
                    return@buildString
                }
                append(name(a.name)).append(": ").append(type(map(a.type, TypePosition.VALUE)))
                if (a.optional && !a.variadic && defaults) {
                    append(" = definedExternally")
                }
            }
        }

    /** The callback interface [t] refers to, if any (`EventListener`, `NodeFilter`, `XPathNSResolver`). */
    private fun callbackInterface(t: IdlType): IdlInterface? =
        ((t as? IdlNamedType)?.let { kotlinBackend.definitions[it.name] } as? IdlInterface)
            ?.takeIf { it.kind == IdlInterfaceKind.CALLBACK_INTERFACE }

    /** The Kotlin function type of a callback interface: the signature of its single operation. */
    private fun lambdaType(i: IdlInterface): String {
        val op = i.members.filterIsInstance<IdlOperation>().singleOrNull { it.special == null }
            ?: error("${i.name}: a callback interface without exactly one operation")
        return functionType(IdlCallback(i.name, op.returnType!!, op.arguments, emptyList()), nullable = false, eventType = null)
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

    private val docs get() = kotlinBackend.docs

    /** Whether any KDoc in this file is from MDN, so the header must say it is licensed separately. */
    private var hasMdnDocs = false

    /** The KDoc of the next declaration, if there is anything to say: see [kdocLines]. */
    private fun kdoc(doc: WebDoc?, extAttrs: List<IdlExtendedAttribute>) {
        val lines = kdocLines(doc, secureContext = extAttrs.has("SecureContext"), indent = indent * 4)
        if (lines.isEmpty()) return
        if (doc != null) hasMdnDocs = true
        // A documented declaration is set apart from the one before it, unless it opens a block.
        if (!out.endsWith("{\n") && !out.endsWith("\n\n") && out.isNotEmpty()) line()
        lines.forEach(::line)
    }

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