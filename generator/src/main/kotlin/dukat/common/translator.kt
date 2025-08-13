package dukat.common

import org.jetbrains.dukat.astModel.SourceSetModel
import org.jetbrains.dukat.astModel.modifiers.ExpectActualModifier
import org.jetbrains.dukat.idlLowerings.addConstructors
import org.jetbrains.dukat.idlLowerings.addImportsForUsedPackages
import org.jetbrains.dukat.idlLowerings.addItemArrayLike
import org.jetbrains.dukat.idlLowerings.addKDocs
import org.jetbrains.dukat.idlLowerings.addMissingMembers
import org.jetbrains.dukat.idlLowerings.addOverloadsForCallbacks
import org.jetbrains.dukat.idlLowerings.markAbstractOrOpen
import org.jetbrains.dukat.idlLowerings.omitStdLib
import org.jetbrains.dukat.idlLowerings.relocateDeclarations
import org.jetbrains.dukat.idlLowerings.resolveImplementsStatements
import org.jetbrains.dukat.idlLowerings.resolveMixins
import org.jetbrains.dukat.idlLowerings.resolvePartials
import org.jetbrains.dukat.idlLowerings.resolveTypedefs
import org.jetbrains.dukat.idlLowerings.specifyDefaultValues
import org.jetbrains.dukat.idlLowerings.specifyEventHandlerTypes
import org.jetbrains.dukat.idlParser.parseIDL
import org.jetbrains.dukat.idlReferenceResolver.DirectoryReferencesResolver
import org.jetbrains.dukat.model.commonLowerings.EscapeIdentificators
import org.jetbrains.dukat.model.commonLowerings.LowerOverrides
import org.jetbrains.dukat.model.commonLowerings.ModelContextAwareLowering
import org.jetbrains.dukat.model.commonLowerings.TranslationContext
import org.jetbrains.dukat.model.commonLowerings.lower
import org.jetbrains.kotlin.tools.dukat.wasm.WasmPostProcessingHacks
import org.jetbrains.kotlin.tools.dukat.wasm.addOverloadsForUnions
import org.jetbrains.kotlin.tools.dukat.wasm.convertToWasmModel
import org.jetbrains.kotlin.tools.dukat.wasm.resolveTypesKeepingUnions
import org.jetbrains.kotlin.tools.dukat.wasm.voidifyEventHandlerReturnType

fun translateIdlToCommonSourceSet(fileName: String): SourceSetModel {
    val translationContext = TranslationContext()
    return parseIDL(fileName, DirectoryReferencesResolver())
        .voidifyEventHandlerReturnType()
        .resolvePartials()
        .addConstructors()
        .resolveTypedefs()
        .specifyEventHandlerTypes()
        .specifyDefaultValues()
        .resolveImplementsStatements()
        .resolveMixins()
        .addItemArrayLike()
        .resolveTypesKeepingUnions()
        .addOverloadsForUnions()
        .markAbstractOrOpen()
        .addMissingMembers()
        .addOverloadsForCallbacks()
        .convertToWasmModel(dontCreateTopLevelInternalAccessors = true)
        .lower(
            ModelContextAwareLowering(translationContext),
            LowerOverrides(translationContext),
            EscapeIdentificators(),
        )
        .lower(PutExpectActualToDeclarations(ExpectActualModifier.EXPECT))
        .addKDocs()
        .relocateDeclarations()
        .addImportsForUsedPackages()
        .omitStdLib()
        .lower(WasmPostProcessingHacks())
}