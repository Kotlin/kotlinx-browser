package dukat.util

import org.jetbrains.dukat.astCommon.IdentifierEntity
import org.jetbrains.dukat.astCommon.QualifierEntity
import org.jetbrains.dukat.astModel.AnnotationModel
import org.jetbrains.dukat.astModel.TypeValueModel
import org.jetbrains.dukat.stdlib.TSLIBROOT

fun primitiveType(name: String, dropQualifier: Boolean = false) =
    TypeValueModel(
        IdentifierEntity(name),
        metaDescription = null,
        nullable = false,
        params = emptyList(),
        fqName = if (!dropQualifier) QualifierEntity(TSLIBROOT, IdentifierEntity(name)) else null,
    )

fun suppress(vararg names: String, file: Boolean = false) =
    AnnotationModel(
        IdentifierEntity("${if (file) "file:" else ""}Suppress"),
        names.map(::IdentifierEntity)
    )
