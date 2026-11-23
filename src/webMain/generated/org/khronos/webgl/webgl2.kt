/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'webgl2', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.khronos.webgl

import kotlin.js.*
import org.w3c.dom.*

public external abstract class WebGLQuery : WebGLObject

public external abstract class WebGLSampler : WebGLObject

public external abstract class WebGLSync : WebGLObject

public external abstract class WebGLTransformFeedback : WebGLObject

public external abstract class WebGLVertexArrayObject : WebGLObject

public external interface WebGL2RenderingContextBase : JsAny {
    fun copyBufferSubData(readTarget: Int, writeTarget: Int, readOffset: Double, writeOffset: Double, size: Double)
    fun getBufferSubData(target: Int, srcByteOffset: Double, dstBuffer: ArrayBufferView, dstOffset: Double = definedExternally, length: Int = definedExternally)
    fun blitFramebuffer(srcX0: Int, srcY0: Int, srcX1: Int, srcY1: Int, dstX0: Int, dstY0: Int, dstX1: Int, dstY1: Int, mask: Int, filter: Int)
    fun framebufferTextureLayer(target: Int, attachment: Int, texture: WebGLTexture?, level: Int, layer: Int)
    fun invalidateFramebuffer(target: Int, attachments: JsArray<JsNumber>)
    fun invalidateSubFramebuffer(target: Int, attachments: JsArray<JsNumber>, x: Int, y: Int, width: Int, height: Int)
    fun readBuffer(src: Int)
    fun getInternalformatParameter(target: Int, internalformat: Int, pname: Int): JsAny?
    fun renderbufferStorageMultisample(target: Int, samples: Int, internalformat: Int, width: Int, height: Int)
    fun texStorage2D(target: Int, levels: Int, internalformat: Int, width: Int, height: Int)
    fun texStorage3D(target: Int, levels: Int, internalformat: Int, width: Int, height: Int, depth: Int)
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, pboOffset: Double)
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, source: TexImageSource)
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, srcData: ArrayBufferView?)
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, srcData: ArrayBufferView, srcOffset: Double)
    fun texSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, type: Int, pboOffset: Double)
    fun texSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, type: Int, source: TexImageSource)
    fun texSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, type: Int, srcData: ArrayBufferView?, srcOffset: Double = definedExternally)
    fun copyTexSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, x: Int, y: Int, width: Int, height: Int)
    fun compressedTexImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, imageSize: Int, offset: Double)
    fun compressedTexImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, srcData: ArrayBufferView, srcOffset: Double = definedExternally, srcLengthOverride: Int = definedExternally)
    fun compressedTexSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, imageSize: Int, offset: Double)
    fun compressedTexSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, srcData: ArrayBufferView, srcOffset: Double = definedExternally, srcLengthOverride: Int = definedExternally)
    fun getFragDataLocation(program: WebGLProgram, name: String): Int
    fun uniform1ui(location: WebGLUniformLocation?, v0: Int)
    fun uniform2ui(location: WebGLUniformLocation?, v0: Int, v1: Int)
    fun uniform3ui(location: WebGLUniformLocation?, v0: Int, v1: Int, v2: Int)
    fun uniform4ui(location: WebGLUniformLocation?, v0: Int, v1: Int, v2: Int, v3: Int)
    fun uniform1uiv(location: WebGLUniformLocation?, data: Uint32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform1uiv(location: WebGLUniformLocation?, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform2uiv(location: WebGLUniformLocation?, data: Uint32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform2uiv(location: WebGLUniformLocation?, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform3uiv(location: WebGLUniformLocation?, data: Uint32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform3uiv(location: WebGLUniformLocation?, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform4uiv(location: WebGLUniformLocation?, data: Uint32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform4uiv(location: WebGLUniformLocation?, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix3x2fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix3x2fv(location: WebGLUniformLocation?, transpose: Boolean, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix4x2fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix4x2fv(location: WebGLUniformLocation?, transpose: Boolean, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix2x3fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix2x3fv(location: WebGLUniformLocation?, transpose: Boolean, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix4x3fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix4x3fv(location: WebGLUniformLocation?, transpose: Boolean, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix2x4fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix2x4fv(location: WebGLUniformLocation?, transpose: Boolean, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix3x4fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix3x4fv(location: WebGLUniformLocation?, transpose: Boolean, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun vertexAttribI4i(index: Int, x: Int, y: Int, z: Int, w: Int)
    fun vertexAttribI4iv(index: Int, values: Int32Array)
    fun vertexAttribI4iv(index: Int, values: JsArray<JsNumber>)
    fun vertexAttribI4ui(index: Int, x: Int, y: Int, z: Int, w: Int)
    fun vertexAttribI4uiv(index: Int, values: Uint32Array)
    fun vertexAttribI4uiv(index: Int, values: JsArray<JsNumber>)
    fun vertexAttribIPointer(index: Int, size: Int, type: Int, stride: Int, offset: Double)
    fun vertexAttribDivisor(index: Int, divisor: Int)
    fun drawArraysInstanced(mode: Int, first: Int, count: Int, instanceCount: Int)
    fun drawElementsInstanced(mode: Int, count: Int, type: Int, offset: Double, instanceCount: Int)
    fun drawRangeElements(mode: Int, start: Int, end: Int, count: Int, type: Int, offset: Double)
    fun drawBuffers(buffers: JsArray<JsNumber>)
    fun clearBufferfv(buffer: Int, drawbuffer: Int, values: Float32Array, srcOffset: Double = definedExternally)
    fun clearBufferfv(buffer: Int, drawbuffer: Int, values: JsArray<JsNumber>, srcOffset: Double = definedExternally)
    fun clearBufferiv(buffer: Int, drawbuffer: Int, values: Int32Array, srcOffset: Double = definedExternally)
    fun clearBufferiv(buffer: Int, drawbuffer: Int, values: JsArray<JsNumber>, srcOffset: Double = definedExternally)
    fun clearBufferuiv(buffer: Int, drawbuffer: Int, values: Uint32Array, srcOffset: Double = definedExternally)
    fun clearBufferuiv(buffer: Int, drawbuffer: Int, values: JsArray<JsNumber>, srcOffset: Double = definedExternally)
    fun clearBufferfi(buffer: Int, drawbuffer: Int, depth: Float, stencil: Int)
    fun createQuery(): WebGLQuery
    fun deleteQuery(query: WebGLQuery?)
    fun isQuery(query: WebGLQuery?): Boolean
    fun beginQuery(target: Int, query: WebGLQuery)
    fun endQuery(target: Int)
    fun getQuery(target: Int, pname: Int): WebGLQuery?
    fun getQueryParameter(query: WebGLQuery, pname: Int): JsAny?
    fun createSampler(): WebGLSampler
    fun deleteSampler(sampler: WebGLSampler?)
    fun isSampler(sampler: WebGLSampler?): Boolean
    fun bindSampler(unit: Int, sampler: WebGLSampler?)
    fun samplerParameteri(sampler: WebGLSampler, pname: Int, param: Int)
    fun samplerParameterf(sampler: WebGLSampler, pname: Int, param: Float)
    fun getSamplerParameter(sampler: WebGLSampler, pname: Int): JsAny?
    fun fenceSync(condition: Int, flags: Int): WebGLSync?
    fun isSync(sync: WebGLSync?): Boolean
    fun deleteSync(sync: WebGLSync?)
    fun clientWaitSync(sync: WebGLSync, flags: Int, timeout: Double): Int
    fun waitSync(sync: WebGLSync, flags: Int, timeout: Double)
    fun getSyncParameter(sync: WebGLSync, pname: Int): JsAny?
    fun createTransformFeedback(): WebGLTransformFeedback
    fun deleteTransformFeedback(tf: WebGLTransformFeedback?)
    fun isTransformFeedback(tf: WebGLTransformFeedback?): Boolean
    fun bindTransformFeedback(target: Int, tf: WebGLTransformFeedback?)
    fun beginTransformFeedback(primitiveMode: Int)
    fun endTransformFeedback()
    fun transformFeedbackVaryings(program: WebGLProgram, varyings: JsArray<JsString>, bufferMode: Int)
    fun getTransformFeedbackVarying(program: WebGLProgram, index: Int): WebGLActiveInfo?
    fun pauseTransformFeedback()
    fun resumeTransformFeedback()
    fun bindBufferBase(target: Int, index: Int, buffer: WebGLBuffer?)
    fun bindBufferRange(target: Int, index: Int, buffer: WebGLBuffer?, offset: Double, size: Double)
    fun getIndexedParameter(target: Int, index: Int): JsAny?
    fun getUniformIndices(program: WebGLProgram, uniformNames: JsArray<JsString>): JsArray<JsNumber>?
    fun getActiveUniforms(program: WebGLProgram, uniformIndices: JsArray<JsNumber>, pname: Int): JsAny?
    fun getUniformBlockIndex(program: WebGLProgram, uniformBlockName: String): Int
    fun getActiveUniformBlockParameter(program: WebGLProgram, uniformBlockIndex: Int, pname: Int): JsAny?
    fun getActiveUniformBlockName(program: WebGLProgram, uniformBlockIndex: Int): String?
    fun uniformBlockBinding(program: WebGLProgram, uniformBlockIndex: Int, uniformBlockBinding: Int)
    fun createVertexArray(): WebGLVertexArrayObject
    fun deleteVertexArray(vertexArray: WebGLVertexArrayObject?)
    fun isVertexArray(vertexArray: WebGLVertexArrayObject?): Boolean
    fun bindVertexArray(array: WebGLVertexArrayObject?)

    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val WebGL2RenderingContextBase.Companion.READ_BUFFER: Int get() = 0x0C02
public inline val WebGL2RenderingContextBase.Companion.UNPACK_ROW_LENGTH: Int get() = 0x0CF2
public inline val WebGL2RenderingContextBase.Companion.UNPACK_SKIP_ROWS: Int get() = 0x0CF3
public inline val WebGL2RenderingContextBase.Companion.UNPACK_SKIP_PIXELS: Int get() = 0x0CF4
public inline val WebGL2RenderingContextBase.Companion.PACK_ROW_LENGTH: Int get() = 0x0D02
public inline val WebGL2RenderingContextBase.Companion.PACK_SKIP_ROWS: Int get() = 0x0D03
public inline val WebGL2RenderingContextBase.Companion.PACK_SKIP_PIXELS: Int get() = 0x0D04
public inline val WebGL2RenderingContextBase.Companion.COLOR: Int get() = 0x1800
public inline val WebGL2RenderingContextBase.Companion.DEPTH: Int get() = 0x1801
public inline val WebGL2RenderingContextBase.Companion.STENCIL: Int get() = 0x1802
public inline val WebGL2RenderingContextBase.Companion.RED: Int get() = 0x1903
public inline val WebGL2RenderingContextBase.Companion.RGB8: Int get() = 0x8051
public inline val WebGL2RenderingContextBase.Companion.RGB10_A2: Int get() = 0x8059
public inline val WebGL2RenderingContextBase.Companion.TEXTURE_BINDING_3D: Int get() = 0x806A
public inline val WebGL2RenderingContextBase.Companion.UNPACK_SKIP_IMAGES: Int get() = 0x806D
public inline val WebGL2RenderingContextBase.Companion.UNPACK_IMAGE_HEIGHT: Int get() = 0x806E
public inline val WebGL2RenderingContextBase.Companion.TEXTURE_3D: Int get() = 0x806F
public inline val WebGL2RenderingContextBase.Companion.TEXTURE_WRAP_R: Int get() = 0x8072
public inline val WebGL2RenderingContextBase.Companion.MAX_3D_TEXTURE_SIZE: Int get() = 0x8073
public inline val WebGL2RenderingContextBase.Companion.UNSIGNED_INT_2_10_10_10_REV: Int get() = 0x8368
public inline val WebGL2RenderingContextBase.Companion.MAX_ELEMENTS_VERTICES: Int get() = 0x80E8
public inline val WebGL2RenderingContextBase.Companion.MAX_ELEMENTS_INDICES: Int get() = 0x80E9
public inline val WebGL2RenderingContextBase.Companion.TEXTURE_MIN_LOD: Int get() = 0x813A
public inline val WebGL2RenderingContextBase.Companion.TEXTURE_MAX_LOD: Int get() = 0x813B
public inline val WebGL2RenderingContextBase.Companion.TEXTURE_BASE_LEVEL: Int get() = 0x813C
public inline val WebGL2RenderingContextBase.Companion.TEXTURE_MAX_LEVEL: Int get() = 0x813D
public inline val WebGL2RenderingContextBase.Companion.MIN: Int get() = 0x8007
public inline val WebGL2RenderingContextBase.Companion.MAX: Int get() = 0x8008
public inline val WebGL2RenderingContextBase.Companion.DEPTH_COMPONENT24: Int get() = 0x81A6
public inline val WebGL2RenderingContextBase.Companion.MAX_TEXTURE_LOD_BIAS: Int get() = 0x84FD
public inline val WebGL2RenderingContextBase.Companion.TEXTURE_COMPARE_MODE: Int get() = 0x884C
public inline val WebGL2RenderingContextBase.Companion.TEXTURE_COMPARE_FUNC: Int get() = 0x884D
public inline val WebGL2RenderingContextBase.Companion.CURRENT_QUERY: Int get() = 0x8865
public inline val WebGL2RenderingContextBase.Companion.QUERY_RESULT: Int get() = 0x8866
public inline val WebGL2RenderingContextBase.Companion.QUERY_RESULT_AVAILABLE: Int get() = 0x8867
public inline val WebGL2RenderingContextBase.Companion.STREAM_READ: Int get() = 0x88E1
public inline val WebGL2RenderingContextBase.Companion.STREAM_COPY: Int get() = 0x88E2
public inline val WebGL2RenderingContextBase.Companion.STATIC_READ: Int get() = 0x88E5
public inline val WebGL2RenderingContextBase.Companion.STATIC_COPY: Int get() = 0x88E6
public inline val WebGL2RenderingContextBase.Companion.DYNAMIC_READ: Int get() = 0x88E9
public inline val WebGL2RenderingContextBase.Companion.DYNAMIC_COPY: Int get() = 0x88EA
public inline val WebGL2RenderingContextBase.Companion.MAX_DRAW_BUFFERS: Int get() = 0x8824
public inline val WebGL2RenderingContextBase.Companion.DRAW_BUFFER0: Int get() = 0x8825
public inline val WebGL2RenderingContextBase.Companion.DRAW_BUFFER1: Int get() = 0x8826
public inline val WebGL2RenderingContextBase.Companion.DRAW_BUFFER2: Int get() = 0x8827
public inline val WebGL2RenderingContextBase.Companion.DRAW_BUFFER3: Int get() = 0x8828
public inline val WebGL2RenderingContextBase.Companion.DRAW_BUFFER4: Int get() = 0x8829
public inline val WebGL2RenderingContextBase.Companion.DRAW_BUFFER5: Int get() = 0x882A
public inline val WebGL2RenderingContextBase.Companion.DRAW_BUFFER6: Int get() = 0x882B
public inline val WebGL2RenderingContextBase.Companion.DRAW_BUFFER7: Int get() = 0x882C
public inline val WebGL2RenderingContextBase.Companion.DRAW_BUFFER8: Int get() = 0x882D
public inline val WebGL2RenderingContextBase.Companion.DRAW_BUFFER9: Int get() = 0x882E
public inline val WebGL2RenderingContextBase.Companion.DRAW_BUFFER10: Int get() = 0x882F
public inline val WebGL2RenderingContextBase.Companion.DRAW_BUFFER11: Int get() = 0x8830
public inline val WebGL2RenderingContextBase.Companion.DRAW_BUFFER12: Int get() = 0x8831
public inline val WebGL2RenderingContextBase.Companion.DRAW_BUFFER13: Int get() = 0x8832
public inline val WebGL2RenderingContextBase.Companion.DRAW_BUFFER14: Int get() = 0x8833
public inline val WebGL2RenderingContextBase.Companion.DRAW_BUFFER15: Int get() = 0x8834
public inline val WebGL2RenderingContextBase.Companion.MAX_FRAGMENT_UNIFORM_COMPONENTS: Int get() = 0x8B49
public inline val WebGL2RenderingContextBase.Companion.MAX_VERTEX_UNIFORM_COMPONENTS: Int get() = 0x8B4A
public inline val WebGL2RenderingContextBase.Companion.SAMPLER_3D: Int get() = 0x8B5F
public inline val WebGL2RenderingContextBase.Companion.SAMPLER_2D_SHADOW: Int get() = 0x8B62
public inline val WebGL2RenderingContextBase.Companion.FRAGMENT_SHADER_DERIVATIVE_HINT: Int get() = 0x8B8B
public inline val WebGL2RenderingContextBase.Companion.PIXEL_PACK_BUFFER: Int get() = 0x88EB
public inline val WebGL2RenderingContextBase.Companion.PIXEL_UNPACK_BUFFER: Int get() = 0x88EC
public inline val WebGL2RenderingContextBase.Companion.PIXEL_PACK_BUFFER_BINDING: Int get() = 0x88ED
public inline val WebGL2RenderingContextBase.Companion.PIXEL_UNPACK_BUFFER_BINDING: Int get() = 0x88EF
public inline val WebGL2RenderingContextBase.Companion.FLOAT_MAT2x3: Int get() = 0x8B65
public inline val WebGL2RenderingContextBase.Companion.FLOAT_MAT2x4: Int get() = 0x8B66
public inline val WebGL2RenderingContextBase.Companion.FLOAT_MAT3x2: Int get() = 0x8B67
public inline val WebGL2RenderingContextBase.Companion.FLOAT_MAT3x4: Int get() = 0x8B68
public inline val WebGL2RenderingContextBase.Companion.FLOAT_MAT4x2: Int get() = 0x8B69
public inline val WebGL2RenderingContextBase.Companion.FLOAT_MAT4x3: Int get() = 0x8B6A
public inline val WebGL2RenderingContextBase.Companion.SRGB: Int get() = 0x8C40
public inline val WebGL2RenderingContextBase.Companion.SRGB8: Int get() = 0x8C41
public inline val WebGL2RenderingContextBase.Companion.SRGB8_ALPHA8: Int get() = 0x8C43
public inline val WebGL2RenderingContextBase.Companion.COMPARE_REF_TO_TEXTURE: Int get() = 0x884E
public inline val WebGL2RenderingContextBase.Companion.RGBA32F: Int get() = 0x8814
public inline val WebGL2RenderingContextBase.Companion.RGB32F: Int get() = 0x8815
public inline val WebGL2RenderingContextBase.Companion.RGBA16F: Int get() = 0x881A
public inline val WebGL2RenderingContextBase.Companion.RGB16F: Int get() = 0x881B
public inline val WebGL2RenderingContextBase.Companion.VERTEX_ATTRIB_ARRAY_INTEGER: Int get() = 0x88FD
public inline val WebGL2RenderingContextBase.Companion.MAX_ARRAY_TEXTURE_LAYERS: Int get() = 0x88FF
public inline val WebGL2RenderingContextBase.Companion.MIN_PROGRAM_TEXEL_OFFSET: Int get() = 0x8904
public inline val WebGL2RenderingContextBase.Companion.MAX_PROGRAM_TEXEL_OFFSET: Int get() = 0x8905
public inline val WebGL2RenderingContextBase.Companion.MAX_VARYING_COMPONENTS: Int get() = 0x8B4B
public inline val WebGL2RenderingContextBase.Companion.TEXTURE_2D_ARRAY: Int get() = 0x8C1A
public inline val WebGL2RenderingContextBase.Companion.TEXTURE_BINDING_2D_ARRAY: Int get() = 0x8C1D
public inline val WebGL2RenderingContextBase.Companion.R11F_G11F_B10F: Int get() = 0x8C3A
public inline val WebGL2RenderingContextBase.Companion.UNSIGNED_INT_10F_11F_11F_REV: Int get() = 0x8C3B
public inline val WebGL2RenderingContextBase.Companion.RGB9_E5: Int get() = 0x8C3D
public inline val WebGL2RenderingContextBase.Companion.UNSIGNED_INT_5_9_9_9_REV: Int get() = 0x8C3E
public inline val WebGL2RenderingContextBase.Companion.TRANSFORM_FEEDBACK_BUFFER_MODE: Int get() = 0x8C7F
public inline val WebGL2RenderingContextBase.Companion.MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: Int get() = 0x8C80
public inline val WebGL2RenderingContextBase.Companion.TRANSFORM_FEEDBACK_VARYINGS: Int get() = 0x8C83
public inline val WebGL2RenderingContextBase.Companion.TRANSFORM_FEEDBACK_BUFFER_START: Int get() = 0x8C84
public inline val WebGL2RenderingContextBase.Companion.TRANSFORM_FEEDBACK_BUFFER_SIZE: Int get() = 0x8C85
public inline val WebGL2RenderingContextBase.Companion.TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: Int get() = 0x8C88
public inline val WebGL2RenderingContextBase.Companion.RASTERIZER_DISCARD: Int get() = 0x8C89
public inline val WebGL2RenderingContextBase.Companion.MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: Int get() = 0x8C8A
public inline val WebGL2RenderingContextBase.Companion.MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: Int get() = 0x8C8B
public inline val WebGL2RenderingContextBase.Companion.INTERLEAVED_ATTRIBS: Int get() = 0x8C8C
public inline val WebGL2RenderingContextBase.Companion.SEPARATE_ATTRIBS: Int get() = 0x8C8D
public inline val WebGL2RenderingContextBase.Companion.TRANSFORM_FEEDBACK_BUFFER: Int get() = 0x8C8E
public inline val WebGL2RenderingContextBase.Companion.TRANSFORM_FEEDBACK_BUFFER_BINDING: Int get() = 0x8C8F
public inline val WebGL2RenderingContextBase.Companion.RGBA32UI: Int get() = 0x8D70
public inline val WebGL2RenderingContextBase.Companion.RGB32UI: Int get() = 0x8D71
public inline val WebGL2RenderingContextBase.Companion.RGBA16UI: Int get() = 0x8D76
public inline val WebGL2RenderingContextBase.Companion.RGB16UI: Int get() = 0x8D77
public inline val WebGL2RenderingContextBase.Companion.RGBA8UI: Int get() = 0x8D7C
public inline val WebGL2RenderingContextBase.Companion.RGB8UI: Int get() = 0x8D7D
public inline val WebGL2RenderingContextBase.Companion.RGBA32I: Int get() = 0x8D82
public inline val WebGL2RenderingContextBase.Companion.RGB32I: Int get() = 0x8D83
public inline val WebGL2RenderingContextBase.Companion.RGBA16I: Int get() = 0x8D88
public inline val WebGL2RenderingContextBase.Companion.RGB16I: Int get() = 0x8D89
public inline val WebGL2RenderingContextBase.Companion.RGBA8I: Int get() = 0x8D8E
public inline val WebGL2RenderingContextBase.Companion.RGB8I: Int get() = 0x8D8F
public inline val WebGL2RenderingContextBase.Companion.RED_INTEGER: Int get() = 0x8D94
public inline val WebGL2RenderingContextBase.Companion.RGB_INTEGER: Int get() = 0x8D98
public inline val WebGL2RenderingContextBase.Companion.RGBA_INTEGER: Int get() = 0x8D99
public inline val WebGL2RenderingContextBase.Companion.SAMPLER_2D_ARRAY: Int get() = 0x8DC1
public inline val WebGL2RenderingContextBase.Companion.SAMPLER_2D_ARRAY_SHADOW: Int get() = 0x8DC4
public inline val WebGL2RenderingContextBase.Companion.SAMPLER_CUBE_SHADOW: Int get() = 0x8DC5
public inline val WebGL2RenderingContextBase.Companion.UNSIGNED_INT_VEC2: Int get() = 0x8DC6
public inline val WebGL2RenderingContextBase.Companion.UNSIGNED_INT_VEC3: Int get() = 0x8DC7
public inline val WebGL2RenderingContextBase.Companion.UNSIGNED_INT_VEC4: Int get() = 0x8DC8
public inline val WebGL2RenderingContextBase.Companion.INT_SAMPLER_2D: Int get() = 0x8DCA
public inline val WebGL2RenderingContextBase.Companion.INT_SAMPLER_3D: Int get() = 0x8DCB
public inline val WebGL2RenderingContextBase.Companion.INT_SAMPLER_CUBE: Int get() = 0x8DCC
public inline val WebGL2RenderingContextBase.Companion.INT_SAMPLER_2D_ARRAY: Int get() = 0x8DCF
public inline val WebGL2RenderingContextBase.Companion.UNSIGNED_INT_SAMPLER_2D: Int get() = 0x8DD2
public inline val WebGL2RenderingContextBase.Companion.UNSIGNED_INT_SAMPLER_3D: Int get() = 0x8DD3
public inline val WebGL2RenderingContextBase.Companion.UNSIGNED_INT_SAMPLER_CUBE: Int get() = 0x8DD4
public inline val WebGL2RenderingContextBase.Companion.UNSIGNED_INT_SAMPLER_2D_ARRAY: Int get() = 0x8DD7
public inline val WebGL2RenderingContextBase.Companion.DEPTH_COMPONENT32F: Int get() = 0x8CAC
public inline val WebGL2RenderingContextBase.Companion.DEPTH32F_STENCIL8: Int get() = 0x8CAD
public inline val WebGL2RenderingContextBase.Companion.FLOAT_32_UNSIGNED_INT_24_8_REV: Int get() = 0x8DAD
public inline val WebGL2RenderingContextBase.Companion.FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: Int get() = 0x8210
public inline val WebGL2RenderingContextBase.Companion.FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: Int get() = 0x8211
public inline val WebGL2RenderingContextBase.Companion.FRAMEBUFFER_ATTACHMENT_RED_SIZE: Int get() = 0x8212
public inline val WebGL2RenderingContextBase.Companion.FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: Int get() = 0x8213
public inline val WebGL2RenderingContextBase.Companion.FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: Int get() = 0x8214
public inline val WebGL2RenderingContextBase.Companion.FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: Int get() = 0x8215
public inline val WebGL2RenderingContextBase.Companion.FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: Int get() = 0x8216
public inline val WebGL2RenderingContextBase.Companion.FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: Int get() = 0x8217
public inline val WebGL2RenderingContextBase.Companion.FRAMEBUFFER_DEFAULT: Int get() = 0x8218
public inline val WebGL2RenderingContextBase.Companion.UNSIGNED_INT_24_8: Int get() = 0x84FA
public inline val WebGL2RenderingContextBase.Companion.DEPTH24_STENCIL8: Int get() = 0x88F0
public inline val WebGL2RenderingContextBase.Companion.UNSIGNED_NORMALIZED: Int get() = 0x8C17
public inline val WebGL2RenderingContextBase.Companion.DRAW_FRAMEBUFFER_BINDING: Int get() = 0x8CA6
public inline val WebGL2RenderingContextBase.Companion.READ_FRAMEBUFFER: Int get() = 0x8CA8
public inline val WebGL2RenderingContextBase.Companion.DRAW_FRAMEBUFFER: Int get() = 0x8CA9
public inline val WebGL2RenderingContextBase.Companion.READ_FRAMEBUFFER_BINDING: Int get() = 0x8CAA
public inline val WebGL2RenderingContextBase.Companion.RENDERBUFFER_SAMPLES: Int get() = 0x8CAB
public inline val WebGL2RenderingContextBase.Companion.FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: Int get() = 0x8CD4
public inline val WebGL2RenderingContextBase.Companion.MAX_COLOR_ATTACHMENTS: Int get() = 0x8CDF
public inline val WebGL2RenderingContextBase.Companion.COLOR_ATTACHMENT1: Int get() = 0x8CE1
public inline val WebGL2RenderingContextBase.Companion.COLOR_ATTACHMENT2: Int get() = 0x8CE2
public inline val WebGL2RenderingContextBase.Companion.COLOR_ATTACHMENT3: Int get() = 0x8CE3
public inline val WebGL2RenderingContextBase.Companion.COLOR_ATTACHMENT4: Int get() = 0x8CE4
public inline val WebGL2RenderingContextBase.Companion.COLOR_ATTACHMENT5: Int get() = 0x8CE5
public inline val WebGL2RenderingContextBase.Companion.COLOR_ATTACHMENT6: Int get() = 0x8CE6
public inline val WebGL2RenderingContextBase.Companion.COLOR_ATTACHMENT7: Int get() = 0x8CE7
public inline val WebGL2RenderingContextBase.Companion.COLOR_ATTACHMENT8: Int get() = 0x8CE8
public inline val WebGL2RenderingContextBase.Companion.COLOR_ATTACHMENT9: Int get() = 0x8CE9
public inline val WebGL2RenderingContextBase.Companion.COLOR_ATTACHMENT10: Int get() = 0x8CEA
public inline val WebGL2RenderingContextBase.Companion.COLOR_ATTACHMENT11: Int get() = 0x8CEB
public inline val WebGL2RenderingContextBase.Companion.COLOR_ATTACHMENT12: Int get() = 0x8CEC
public inline val WebGL2RenderingContextBase.Companion.COLOR_ATTACHMENT13: Int get() = 0x8CED
public inline val WebGL2RenderingContextBase.Companion.COLOR_ATTACHMENT14: Int get() = 0x8CEE
public inline val WebGL2RenderingContextBase.Companion.COLOR_ATTACHMENT15: Int get() = 0x8CEF
public inline val WebGL2RenderingContextBase.Companion.FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: Int get() = 0x8D56
public inline val WebGL2RenderingContextBase.Companion.MAX_SAMPLES: Int get() = 0x8D57
public inline val WebGL2RenderingContextBase.Companion.HALF_FLOAT: Int get() = 0x140B
public inline val WebGL2RenderingContextBase.Companion.RG: Int get() = 0x8227
public inline val WebGL2RenderingContextBase.Companion.RG_INTEGER: Int get() = 0x8228
public inline val WebGL2RenderingContextBase.Companion.R8: Int get() = 0x8229
public inline val WebGL2RenderingContextBase.Companion.RG8: Int get() = 0x822B
public inline val WebGL2RenderingContextBase.Companion.R16F: Int get() = 0x822D
public inline val WebGL2RenderingContextBase.Companion.R32F: Int get() = 0x822E
public inline val WebGL2RenderingContextBase.Companion.RG16F: Int get() = 0x822F
public inline val WebGL2RenderingContextBase.Companion.RG32F: Int get() = 0x8230
public inline val WebGL2RenderingContextBase.Companion.R8I: Int get() = 0x8231
public inline val WebGL2RenderingContextBase.Companion.R8UI: Int get() = 0x8232
public inline val WebGL2RenderingContextBase.Companion.R16I: Int get() = 0x8233
public inline val WebGL2RenderingContextBase.Companion.R16UI: Int get() = 0x8234
public inline val WebGL2RenderingContextBase.Companion.R32I: Int get() = 0x8235
public inline val WebGL2RenderingContextBase.Companion.R32UI: Int get() = 0x8236
public inline val WebGL2RenderingContextBase.Companion.RG8I: Int get() = 0x8237
public inline val WebGL2RenderingContextBase.Companion.RG8UI: Int get() = 0x8238
public inline val WebGL2RenderingContextBase.Companion.RG16I: Int get() = 0x8239
public inline val WebGL2RenderingContextBase.Companion.RG16UI: Int get() = 0x823A
public inline val WebGL2RenderingContextBase.Companion.RG32I: Int get() = 0x823B
public inline val WebGL2RenderingContextBase.Companion.RG32UI: Int get() = 0x823C
public inline val WebGL2RenderingContextBase.Companion.VERTEX_ARRAY_BINDING: Int get() = 0x85B5
public inline val WebGL2RenderingContextBase.Companion.R8_SNORM: Int get() = 0x8F94
public inline val WebGL2RenderingContextBase.Companion.RG8_SNORM: Int get() = 0x8F95
public inline val WebGL2RenderingContextBase.Companion.RGB8_SNORM: Int get() = 0x8F96
public inline val WebGL2RenderingContextBase.Companion.RGBA8_SNORM: Int get() = 0x8F97
public inline val WebGL2RenderingContextBase.Companion.SIGNED_NORMALIZED: Int get() = 0x8F9C
public inline val WebGL2RenderingContextBase.Companion.COPY_READ_BUFFER: Int get() = 0x8F36
public inline val WebGL2RenderingContextBase.Companion.COPY_WRITE_BUFFER: Int get() = 0x8F37
public inline val WebGL2RenderingContextBase.Companion.COPY_READ_BUFFER_BINDING: Int get() = 0x8F36
public inline val WebGL2RenderingContextBase.Companion.COPY_WRITE_BUFFER_BINDING: Int get() = 0x8F37
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_BUFFER: Int get() = 0x8A11
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_BUFFER_BINDING: Int get() = 0x8A28
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_BUFFER_START: Int get() = 0x8A29
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_BUFFER_SIZE: Int get() = 0x8A2A
public inline val WebGL2RenderingContextBase.Companion.MAX_VERTEX_UNIFORM_BLOCKS: Int get() = 0x8A2B
public inline val WebGL2RenderingContextBase.Companion.MAX_FRAGMENT_UNIFORM_BLOCKS: Int get() = 0x8A2D
public inline val WebGL2RenderingContextBase.Companion.MAX_COMBINED_UNIFORM_BLOCKS: Int get() = 0x8A2E
public inline val WebGL2RenderingContextBase.Companion.MAX_UNIFORM_BUFFER_BINDINGS: Int get() = 0x8A2F
public inline val WebGL2RenderingContextBase.Companion.MAX_UNIFORM_BLOCK_SIZE: Int get() = 0x8A30
public inline val WebGL2RenderingContextBase.Companion.MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: Int get() = 0x8A31
public inline val WebGL2RenderingContextBase.Companion.MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: Int get() = 0x8A33
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_BUFFER_OFFSET_ALIGNMENT: Int get() = 0x8A34
public inline val WebGL2RenderingContextBase.Companion.ACTIVE_UNIFORM_BLOCKS: Int get() = 0x8A36
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_TYPE: Int get() = 0x8A37
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_SIZE: Int get() = 0x8A38
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_BLOCK_INDEX: Int get() = 0x8A3A
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_OFFSET: Int get() = 0x8A3B
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_ARRAY_STRIDE: Int get() = 0x8A3C
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_MATRIX_STRIDE: Int get() = 0x8A3D
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_IS_ROW_MAJOR: Int get() = 0x8A3E
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_BLOCK_BINDING: Int get() = 0x8A3F
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_BLOCK_DATA_SIZE: Int get() = 0x8A40
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_BLOCK_ACTIVE_UNIFORMS: Int get() = 0x8A42
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: Int get() = 0x8A43
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: Int get() = 0x8A44
public inline val WebGL2RenderingContextBase.Companion.UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: Int get() = 0x8A46
public inline val WebGL2RenderingContextBase.Companion.INVALID_INDEX: Int get() = 0xFFFFFFFF.toInt()
public inline val WebGL2RenderingContextBase.Companion.MAX_VERTEX_OUTPUT_COMPONENTS: Int get() = 0x9122
public inline val WebGL2RenderingContextBase.Companion.MAX_FRAGMENT_INPUT_COMPONENTS: Int get() = 0x9125
public inline val WebGL2RenderingContextBase.Companion.MAX_SERVER_WAIT_TIMEOUT: Int get() = 0x9111
public inline val WebGL2RenderingContextBase.Companion.OBJECT_TYPE: Int get() = 0x9112
public inline val WebGL2RenderingContextBase.Companion.SYNC_CONDITION: Int get() = 0x9113
public inline val WebGL2RenderingContextBase.Companion.SYNC_STATUS: Int get() = 0x9114
public inline val WebGL2RenderingContextBase.Companion.SYNC_FLAGS: Int get() = 0x9115
public inline val WebGL2RenderingContextBase.Companion.SYNC_FENCE: Int get() = 0x9116
public inline val WebGL2RenderingContextBase.Companion.SYNC_GPU_COMMANDS_COMPLETE: Int get() = 0x9117
public inline val WebGL2RenderingContextBase.Companion.UNSIGNALED: Int get() = 0x9118
public inline val WebGL2RenderingContextBase.Companion.SIGNALED: Int get() = 0x9119
public inline val WebGL2RenderingContextBase.Companion.ALREADY_SIGNALED: Int get() = 0x911A
public inline val WebGL2RenderingContextBase.Companion.TIMEOUT_EXPIRED: Int get() = 0x911B
public inline val WebGL2RenderingContextBase.Companion.CONDITION_SATISFIED: Int get() = 0x911C
public inline val WebGL2RenderingContextBase.Companion.WAIT_FAILED: Int get() = 0x911D
public inline val WebGL2RenderingContextBase.Companion.SYNC_FLUSH_COMMANDS_BIT: Int get() = 0x00000001
public inline val WebGL2RenderingContextBase.Companion.VERTEX_ATTRIB_ARRAY_DIVISOR: Int get() = 0x88FE
public inline val WebGL2RenderingContextBase.Companion.ANY_SAMPLES_PASSED: Int get() = 0x8C2F
public inline val WebGL2RenderingContextBase.Companion.ANY_SAMPLES_PASSED_CONSERVATIVE: Int get() = 0x8D6A
public inline val WebGL2RenderingContextBase.Companion.SAMPLER_BINDING: Int get() = 0x8919
public inline val WebGL2RenderingContextBase.Companion.RGB10_A2UI: Int get() = 0x906F
public inline val WebGL2RenderingContextBase.Companion.INT_2_10_10_10_REV: Int get() = 0x8D9F
public inline val WebGL2RenderingContextBase.Companion.TRANSFORM_FEEDBACK: Int get() = 0x8E22
public inline val WebGL2RenderingContextBase.Companion.TRANSFORM_FEEDBACK_PAUSED: Int get() = 0x8E23
public inline val WebGL2RenderingContextBase.Companion.TRANSFORM_FEEDBACK_ACTIVE: Int get() = 0x8E24
public inline val WebGL2RenderingContextBase.Companion.TRANSFORM_FEEDBACK_BINDING: Int get() = 0x8E25
public inline val WebGL2RenderingContextBase.Companion.TEXTURE_IMMUTABLE_FORMAT: Int get() = 0x912F
public inline val WebGL2RenderingContextBase.Companion.MAX_ELEMENT_INDEX: Int get() = 0x8D6B
public inline val WebGL2RenderingContextBase.Companion.TEXTURE_IMMUTABLE_LEVELS: Int get() = 0x82DF
public inline val WebGL2RenderingContextBase.Companion.TIMEOUT_IGNORED: Double get() = -1.0
public inline val WebGL2RenderingContextBase.Companion.MAX_CLIENT_WAIT_TIMEOUT_WEBGL: Int get() = 0x9247

public external interface WebGL2RenderingContextOverloads : JsAny {
    fun bufferData(target: Int, size: Double, usage: Int)
    fun bufferData(target: Int, srcData: BufferDataSource?, usage: Int)
    fun bufferSubData(target: Int, dstByteOffset: Double, srcData: BufferDataSource)
    fun bufferData(target: Int, srcData: ArrayBufferView, usage: Int, srcOffset: Double, length: Int = definedExternally)
    fun bufferSubData(target: Int, dstByteOffset: Double, srcData: ArrayBufferView, srcOffset: Double, length: Int = definedExternally)
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: ArrayBufferView?)
    fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: TexImageSource)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: TexImageSource)
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pboOffset: Double)
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, source: TexImageSource)
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, srcData: ArrayBufferView, srcOffset: Double)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pboOffset: Double)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, source: TexImageSource)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, srcData: ArrayBufferView, srcOffset: Double)
    fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, imageSize: Int, offset: Double)
    fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, srcData: ArrayBufferView, srcOffset: Double = definedExternally, srcLengthOverride: Int = definedExternally)
    fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, imageSize: Int, offset: Double)
    fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, srcData: ArrayBufferView, srcOffset: Double = definedExternally, srcLengthOverride: Int = definedExternally)
    fun uniform1fv(location: WebGLUniformLocation?, data: Float32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform1fv(location: WebGLUniformLocation?, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform2fv(location: WebGLUniformLocation?, data: Float32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform2fv(location: WebGLUniformLocation?, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform3fv(location: WebGLUniformLocation?, data: Float32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform3fv(location: WebGLUniformLocation?, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform4fv(location: WebGLUniformLocation?, data: Float32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform4fv(location: WebGLUniformLocation?, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform1iv(location: WebGLUniformLocation?, data: Int32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform1iv(location: WebGLUniformLocation?, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform2iv(location: WebGLUniformLocation?, data: Int32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform2iv(location: WebGLUniformLocation?, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform3iv(location: WebGLUniformLocation?, data: Int32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform3iv(location: WebGLUniformLocation?, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform4iv(location: WebGLUniformLocation?, data: Int32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniform4iv(location: WebGLUniformLocation?, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, data: Float32Array, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, data: JsArray<JsNumber>, srcOffset: Double = definedExternally, srcLength: Int = definedExternally)
    fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, dstData: ArrayBufferView?)
    fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, offset: Double)
    fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, dstData: ArrayBufferView, dstOffset: Double)
}

public external abstract class WebGL2RenderingContext : WebGLRenderingContextBase, WebGL2RenderingContextBase, WebGL2RenderingContextOverloads, RenderingContext, OffscreenRenderingContext {

    companion object {
        val DEPTH_BUFFER_BIT: Int
        val STENCIL_BUFFER_BIT: Int
        val COLOR_BUFFER_BIT: Int
        val POINTS: Int
        val LINES: Int
        val LINE_LOOP: Int
        val LINE_STRIP: Int
        val TRIANGLES: Int
        val TRIANGLE_STRIP: Int
        val TRIANGLE_FAN: Int
        val ZERO: Int
        val ONE: Int
        val SRC_COLOR: Int
        val ONE_MINUS_SRC_COLOR: Int
        val SRC_ALPHA: Int
        val ONE_MINUS_SRC_ALPHA: Int
        val DST_ALPHA: Int
        val ONE_MINUS_DST_ALPHA: Int
        val DST_COLOR: Int
        val ONE_MINUS_DST_COLOR: Int
        val SRC_ALPHA_SATURATE: Int
        val FUNC_ADD: Int
        val BLEND_EQUATION: Int
        val BLEND_EQUATION_RGB: Int
        val BLEND_EQUATION_ALPHA: Int
        val FUNC_SUBTRACT: Int
        val FUNC_REVERSE_SUBTRACT: Int
        val BLEND_DST_RGB: Int
        val BLEND_SRC_RGB: Int
        val BLEND_DST_ALPHA: Int
        val BLEND_SRC_ALPHA: Int
        val CONSTANT_COLOR: Int
        val ONE_MINUS_CONSTANT_COLOR: Int
        val CONSTANT_ALPHA: Int
        val ONE_MINUS_CONSTANT_ALPHA: Int
        val BLEND_COLOR: Int
        val ARRAY_BUFFER: Int
        val ELEMENT_ARRAY_BUFFER: Int
        val ARRAY_BUFFER_BINDING: Int
        val ELEMENT_ARRAY_BUFFER_BINDING: Int
        val STREAM_DRAW: Int
        val STATIC_DRAW: Int
        val DYNAMIC_DRAW: Int
        val BUFFER_SIZE: Int
        val BUFFER_USAGE: Int
        val CURRENT_VERTEX_ATTRIB: Int
        val FRONT: Int
        val BACK: Int
        val FRONT_AND_BACK: Int
        val CULL_FACE: Int
        val BLEND: Int
        val DITHER: Int
        val STENCIL_TEST: Int
        val DEPTH_TEST: Int
        val SCISSOR_TEST: Int
        val POLYGON_OFFSET_FILL: Int
        val SAMPLE_ALPHA_TO_COVERAGE: Int
        val SAMPLE_COVERAGE: Int
        val NO_ERROR: Int
        val INVALID_ENUM: Int
        val INVALID_VALUE: Int
        val INVALID_OPERATION: Int
        val OUT_OF_MEMORY: Int
        val CW: Int
        val CCW: Int
        val LINE_WIDTH: Int
        val ALIASED_POINT_SIZE_RANGE: Int
        val ALIASED_LINE_WIDTH_RANGE: Int
        val CULL_FACE_MODE: Int
        val FRONT_FACE: Int
        val DEPTH_RANGE: Int
        val DEPTH_WRITEMASK: Int
        val DEPTH_CLEAR_VALUE: Int
        val DEPTH_FUNC: Int
        val STENCIL_CLEAR_VALUE: Int
        val STENCIL_FUNC: Int
        val STENCIL_FAIL: Int
        val STENCIL_PASS_DEPTH_FAIL: Int
        val STENCIL_PASS_DEPTH_PASS: Int
        val STENCIL_REF: Int
        val STENCIL_VALUE_MASK: Int
        val STENCIL_WRITEMASK: Int
        val STENCIL_BACK_FUNC: Int
        val STENCIL_BACK_FAIL: Int
        val STENCIL_BACK_PASS_DEPTH_FAIL: Int
        val STENCIL_BACK_PASS_DEPTH_PASS: Int
        val STENCIL_BACK_REF: Int
        val STENCIL_BACK_VALUE_MASK: Int
        val STENCIL_BACK_WRITEMASK: Int
        val VIEWPORT: Int
        val SCISSOR_BOX: Int
        val COLOR_CLEAR_VALUE: Int
        val COLOR_WRITEMASK: Int
        val UNPACK_ALIGNMENT: Int
        val PACK_ALIGNMENT: Int
        val MAX_TEXTURE_SIZE: Int
        val MAX_VIEWPORT_DIMS: Int
        val SUBPIXEL_BITS: Int
        val RED_BITS: Int
        val GREEN_BITS: Int
        val BLUE_BITS: Int
        val ALPHA_BITS: Int
        val DEPTH_BITS: Int
        val STENCIL_BITS: Int
        val POLYGON_OFFSET_UNITS: Int
        val POLYGON_OFFSET_FACTOR: Int
        val TEXTURE_BINDING_2D: Int
        val SAMPLE_BUFFERS: Int
        val SAMPLES: Int
        val SAMPLE_COVERAGE_VALUE: Int
        val SAMPLE_COVERAGE_INVERT: Int
        val COMPRESSED_TEXTURE_FORMATS: Int
        val DONT_CARE: Int
        val FASTEST: Int
        val NICEST: Int
        val GENERATE_MIPMAP_HINT: Int
        val BYTE: Int
        val UNSIGNED_BYTE: Int
        val SHORT: Int
        val UNSIGNED_SHORT: Int
        val INT: Int
        val UNSIGNED_INT: Int
        val FLOAT: Int
        val DEPTH_COMPONENT: Int
        val ALPHA: Int
        val RGB: Int
        val RGBA: Int
        val LUMINANCE: Int
        val LUMINANCE_ALPHA: Int
        val UNSIGNED_SHORT_4_4_4_4: Int
        val UNSIGNED_SHORT_5_5_5_1: Int
        val UNSIGNED_SHORT_5_6_5: Int
        val FRAGMENT_SHADER: Int
        val VERTEX_SHADER: Int
        val MAX_VERTEX_ATTRIBS: Int
        val MAX_VERTEX_UNIFORM_VECTORS: Int
        val MAX_VARYING_VECTORS: Int
        val MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int
        val MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int
        val MAX_TEXTURE_IMAGE_UNITS: Int
        val MAX_FRAGMENT_UNIFORM_VECTORS: Int
        val SHADER_TYPE: Int
        val DELETE_STATUS: Int
        val LINK_STATUS: Int
        val VALIDATE_STATUS: Int
        val ATTACHED_SHADERS: Int
        val ACTIVE_UNIFORMS: Int
        val ACTIVE_ATTRIBUTES: Int
        val SHADING_LANGUAGE_VERSION: Int
        val CURRENT_PROGRAM: Int
        val NEVER: Int
        val LESS: Int
        val EQUAL: Int
        val LEQUAL: Int
        val GREATER: Int
        val NOTEQUAL: Int
        val GEQUAL: Int
        val ALWAYS: Int
        val KEEP: Int
        val REPLACE: Int
        val INCR: Int
        val DECR: Int
        val INVERT: Int
        val INCR_WRAP: Int
        val DECR_WRAP: Int
        val VENDOR: Int
        val RENDERER: Int
        val VERSION: Int
        val NEAREST: Int
        val LINEAR: Int
        val NEAREST_MIPMAP_NEAREST: Int
        val LINEAR_MIPMAP_NEAREST: Int
        val NEAREST_MIPMAP_LINEAR: Int
        val LINEAR_MIPMAP_LINEAR: Int
        val TEXTURE_MAG_FILTER: Int
        val TEXTURE_MIN_FILTER: Int
        val TEXTURE_WRAP_S: Int
        val TEXTURE_WRAP_T: Int
        val TEXTURE_2D: Int
        val TEXTURE: Int
        val TEXTURE_CUBE_MAP: Int
        val TEXTURE_BINDING_CUBE_MAP: Int
        val TEXTURE_CUBE_MAP_POSITIVE_X: Int
        val TEXTURE_CUBE_MAP_NEGATIVE_X: Int
        val TEXTURE_CUBE_MAP_POSITIVE_Y: Int
        val TEXTURE_CUBE_MAP_NEGATIVE_Y: Int
        val TEXTURE_CUBE_MAP_POSITIVE_Z: Int
        val TEXTURE_CUBE_MAP_NEGATIVE_Z: Int
        val MAX_CUBE_MAP_TEXTURE_SIZE: Int
        val TEXTURE0: Int
        val TEXTURE1: Int
        val TEXTURE2: Int
        val TEXTURE3: Int
        val TEXTURE4: Int
        val TEXTURE5: Int
        val TEXTURE6: Int
        val TEXTURE7: Int
        val TEXTURE8: Int
        val TEXTURE9: Int
        val TEXTURE10: Int
        val TEXTURE11: Int
        val TEXTURE12: Int
        val TEXTURE13: Int
        val TEXTURE14: Int
        val TEXTURE15: Int
        val TEXTURE16: Int
        val TEXTURE17: Int
        val TEXTURE18: Int
        val TEXTURE19: Int
        val TEXTURE20: Int
        val TEXTURE21: Int
        val TEXTURE22: Int
        val TEXTURE23: Int
        val TEXTURE24: Int
        val TEXTURE25: Int
        val TEXTURE26: Int
        val TEXTURE27: Int
        val TEXTURE28: Int
        val TEXTURE29: Int
        val TEXTURE30: Int
        val TEXTURE31: Int
        val ACTIVE_TEXTURE: Int
        val REPEAT: Int
        val CLAMP_TO_EDGE: Int
        val MIRRORED_REPEAT: Int
        val FLOAT_VEC2: Int
        val FLOAT_VEC3: Int
        val FLOAT_VEC4: Int
        val INT_VEC2: Int
        val INT_VEC3: Int
        val INT_VEC4: Int
        val BOOL: Int
        val BOOL_VEC2: Int
        val BOOL_VEC3: Int
        val BOOL_VEC4: Int
        val FLOAT_MAT2: Int
        val FLOAT_MAT3: Int
        val FLOAT_MAT4: Int
        val SAMPLER_2D: Int
        val SAMPLER_CUBE: Int
        val VERTEX_ATTRIB_ARRAY_ENABLED: Int
        val VERTEX_ATTRIB_ARRAY_SIZE: Int
        val VERTEX_ATTRIB_ARRAY_STRIDE: Int
        val VERTEX_ATTRIB_ARRAY_TYPE: Int
        val VERTEX_ATTRIB_ARRAY_NORMALIZED: Int
        val VERTEX_ATTRIB_ARRAY_POINTER: Int
        val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int
        val IMPLEMENTATION_COLOR_READ_TYPE: Int
        val IMPLEMENTATION_COLOR_READ_FORMAT: Int
        val COMPILE_STATUS: Int
        val LOW_FLOAT: Int
        val MEDIUM_FLOAT: Int
        val HIGH_FLOAT: Int
        val LOW_INT: Int
        val MEDIUM_INT: Int
        val HIGH_INT: Int
        val FRAMEBUFFER: Int
        val RENDERBUFFER: Int
        val RGBA4: Int
        val RGB5_A1: Int
        val RGBA8: Int
        val RGB565: Int
        val DEPTH_COMPONENT16: Int
        val STENCIL_INDEX8: Int
        val DEPTH_STENCIL: Int
        val RENDERBUFFER_WIDTH: Int
        val RENDERBUFFER_HEIGHT: Int
        val RENDERBUFFER_INTERNAL_FORMAT: Int
        val RENDERBUFFER_RED_SIZE: Int
        val RENDERBUFFER_GREEN_SIZE: Int
        val RENDERBUFFER_BLUE_SIZE: Int
        val RENDERBUFFER_ALPHA_SIZE: Int
        val RENDERBUFFER_DEPTH_SIZE: Int
        val RENDERBUFFER_STENCIL_SIZE: Int
        val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int
        val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int
        val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int
        val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int
        val COLOR_ATTACHMENT0: Int
        val DEPTH_ATTACHMENT: Int
        val STENCIL_ATTACHMENT: Int
        val DEPTH_STENCIL_ATTACHMENT: Int
        val NONE: Int
        val FRAMEBUFFER_COMPLETE: Int
        val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int
        val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int
        val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: Int
        val FRAMEBUFFER_UNSUPPORTED: Int
        val FRAMEBUFFER_BINDING: Int
        val RENDERBUFFER_BINDING: Int
        val MAX_RENDERBUFFER_SIZE: Int
        val INVALID_FRAMEBUFFER_OPERATION: Int
        val UNPACK_FLIP_Y_WEBGL: Int
        val UNPACK_PREMULTIPLY_ALPHA_WEBGL: Int
        val CONTEXT_LOST_WEBGL: Int
        val UNPACK_COLORSPACE_CONVERSION_WEBGL: Int
        val BROWSER_DEFAULT_WEBGL: Int
        val READ_BUFFER: Int
        val UNPACK_ROW_LENGTH: Int
        val UNPACK_SKIP_ROWS: Int
        val UNPACK_SKIP_PIXELS: Int
        val PACK_ROW_LENGTH: Int
        val PACK_SKIP_ROWS: Int
        val PACK_SKIP_PIXELS: Int
        val COLOR: Int
        val DEPTH: Int
        val STENCIL: Int
        val RED: Int
        val RGB8: Int
        val RGB10_A2: Int
        val TEXTURE_BINDING_3D: Int
        val UNPACK_SKIP_IMAGES: Int
        val UNPACK_IMAGE_HEIGHT: Int
        val TEXTURE_3D: Int
        val TEXTURE_WRAP_R: Int
        val MAX_3D_TEXTURE_SIZE: Int
        val UNSIGNED_INT_2_10_10_10_REV: Int
        val MAX_ELEMENTS_VERTICES: Int
        val MAX_ELEMENTS_INDICES: Int
        val TEXTURE_MIN_LOD: Int
        val TEXTURE_MAX_LOD: Int
        val TEXTURE_BASE_LEVEL: Int
        val TEXTURE_MAX_LEVEL: Int
        val MIN: Int
        val MAX: Int
        val DEPTH_COMPONENT24: Int
        val MAX_TEXTURE_LOD_BIAS: Int
        val TEXTURE_COMPARE_MODE: Int
        val TEXTURE_COMPARE_FUNC: Int
        val CURRENT_QUERY: Int
        val QUERY_RESULT: Int
        val QUERY_RESULT_AVAILABLE: Int
        val STREAM_READ: Int
        val STREAM_COPY: Int
        val STATIC_READ: Int
        val STATIC_COPY: Int
        val DYNAMIC_READ: Int
        val DYNAMIC_COPY: Int
        val MAX_DRAW_BUFFERS: Int
        val DRAW_BUFFER0: Int
        val DRAW_BUFFER1: Int
        val DRAW_BUFFER2: Int
        val DRAW_BUFFER3: Int
        val DRAW_BUFFER4: Int
        val DRAW_BUFFER5: Int
        val DRAW_BUFFER6: Int
        val DRAW_BUFFER7: Int
        val DRAW_BUFFER8: Int
        val DRAW_BUFFER9: Int
        val DRAW_BUFFER10: Int
        val DRAW_BUFFER11: Int
        val DRAW_BUFFER12: Int
        val DRAW_BUFFER13: Int
        val DRAW_BUFFER14: Int
        val DRAW_BUFFER15: Int
        val MAX_FRAGMENT_UNIFORM_COMPONENTS: Int
        val MAX_VERTEX_UNIFORM_COMPONENTS: Int
        val SAMPLER_3D: Int
        val SAMPLER_2D_SHADOW: Int
        val FRAGMENT_SHADER_DERIVATIVE_HINT: Int
        val PIXEL_PACK_BUFFER: Int
        val PIXEL_UNPACK_BUFFER: Int
        val PIXEL_PACK_BUFFER_BINDING: Int
        val PIXEL_UNPACK_BUFFER_BINDING: Int
        val FLOAT_MAT2x3: Int
        val FLOAT_MAT2x4: Int
        val FLOAT_MAT3x2: Int
        val FLOAT_MAT3x4: Int
        val FLOAT_MAT4x2: Int
        val FLOAT_MAT4x3: Int
        val SRGB: Int
        val SRGB8: Int
        val SRGB8_ALPHA8: Int
        val COMPARE_REF_TO_TEXTURE: Int
        val RGBA32F: Int
        val RGB32F: Int
        val RGBA16F: Int
        val RGB16F: Int
        val VERTEX_ATTRIB_ARRAY_INTEGER: Int
        val MAX_ARRAY_TEXTURE_LAYERS: Int
        val MIN_PROGRAM_TEXEL_OFFSET: Int
        val MAX_PROGRAM_TEXEL_OFFSET: Int
        val MAX_VARYING_COMPONENTS: Int
        val TEXTURE_2D_ARRAY: Int
        val TEXTURE_BINDING_2D_ARRAY: Int
        val R11F_G11F_B10F: Int
        val UNSIGNED_INT_10F_11F_11F_REV: Int
        val RGB9_E5: Int
        val UNSIGNED_INT_5_9_9_9_REV: Int
        val TRANSFORM_FEEDBACK_BUFFER_MODE: Int
        val MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: Int
        val TRANSFORM_FEEDBACK_VARYINGS: Int
        val TRANSFORM_FEEDBACK_BUFFER_START: Int
        val TRANSFORM_FEEDBACK_BUFFER_SIZE: Int
        val TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: Int
        val RASTERIZER_DISCARD: Int
        val MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: Int
        val MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: Int
        val INTERLEAVED_ATTRIBS: Int
        val SEPARATE_ATTRIBS: Int
        val TRANSFORM_FEEDBACK_BUFFER: Int
        val TRANSFORM_FEEDBACK_BUFFER_BINDING: Int
        val RGBA32UI: Int
        val RGB32UI: Int
        val RGBA16UI: Int
        val RGB16UI: Int
        val RGBA8UI: Int
        val RGB8UI: Int
        val RGBA32I: Int
        val RGB32I: Int
        val RGBA16I: Int
        val RGB16I: Int
        val RGBA8I: Int
        val RGB8I: Int
        val RED_INTEGER: Int
        val RGB_INTEGER: Int
        val RGBA_INTEGER: Int
        val SAMPLER_2D_ARRAY: Int
        val SAMPLER_2D_ARRAY_SHADOW: Int
        val SAMPLER_CUBE_SHADOW: Int
        val UNSIGNED_INT_VEC2: Int
        val UNSIGNED_INT_VEC3: Int
        val UNSIGNED_INT_VEC4: Int
        val INT_SAMPLER_2D: Int
        val INT_SAMPLER_3D: Int
        val INT_SAMPLER_CUBE: Int
        val INT_SAMPLER_2D_ARRAY: Int
        val UNSIGNED_INT_SAMPLER_2D: Int
        val UNSIGNED_INT_SAMPLER_3D: Int
        val UNSIGNED_INT_SAMPLER_CUBE: Int
        val UNSIGNED_INT_SAMPLER_2D_ARRAY: Int
        val DEPTH_COMPONENT32F: Int
        val DEPTH32F_STENCIL8: Int
        val FLOAT_32_UNSIGNED_INT_24_8_REV: Int
        val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: Int
        val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: Int
        val FRAMEBUFFER_ATTACHMENT_RED_SIZE: Int
        val FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: Int
        val FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: Int
        val FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: Int
        val FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: Int
        val FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: Int
        val FRAMEBUFFER_DEFAULT: Int
        val UNSIGNED_INT_24_8: Int
        val DEPTH24_STENCIL8: Int
        val UNSIGNED_NORMALIZED: Int
        val DRAW_FRAMEBUFFER_BINDING: Int
        val READ_FRAMEBUFFER: Int
        val DRAW_FRAMEBUFFER: Int
        val READ_FRAMEBUFFER_BINDING: Int
        val RENDERBUFFER_SAMPLES: Int
        val FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: Int
        val MAX_COLOR_ATTACHMENTS: Int
        val COLOR_ATTACHMENT1: Int
        val COLOR_ATTACHMENT2: Int
        val COLOR_ATTACHMENT3: Int
        val COLOR_ATTACHMENT4: Int
        val COLOR_ATTACHMENT5: Int
        val COLOR_ATTACHMENT6: Int
        val COLOR_ATTACHMENT7: Int
        val COLOR_ATTACHMENT8: Int
        val COLOR_ATTACHMENT9: Int
        val COLOR_ATTACHMENT10: Int
        val COLOR_ATTACHMENT11: Int
        val COLOR_ATTACHMENT12: Int
        val COLOR_ATTACHMENT13: Int
        val COLOR_ATTACHMENT14: Int
        val COLOR_ATTACHMENT15: Int
        val FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: Int
        val MAX_SAMPLES: Int
        val HALF_FLOAT: Int
        val RG: Int
        val RG_INTEGER: Int
        val R8: Int
        val RG8: Int
        val R16F: Int
        val R32F: Int
        val RG16F: Int
        val RG32F: Int
        val R8I: Int
        val R8UI: Int
        val R16I: Int
        val R16UI: Int
        val R32I: Int
        val R32UI: Int
        val RG8I: Int
        val RG8UI: Int
        val RG16I: Int
        val RG16UI: Int
        val RG32I: Int
        val RG32UI: Int
        val VERTEX_ARRAY_BINDING: Int
        val R8_SNORM: Int
        val RG8_SNORM: Int
        val RGB8_SNORM: Int
        val RGBA8_SNORM: Int
        val SIGNED_NORMALIZED: Int
        val COPY_READ_BUFFER: Int
        val COPY_WRITE_BUFFER: Int
        val COPY_READ_BUFFER_BINDING: Int
        val COPY_WRITE_BUFFER_BINDING: Int
        val UNIFORM_BUFFER: Int
        val UNIFORM_BUFFER_BINDING: Int
        val UNIFORM_BUFFER_START: Int
        val UNIFORM_BUFFER_SIZE: Int
        val MAX_VERTEX_UNIFORM_BLOCKS: Int
        val MAX_FRAGMENT_UNIFORM_BLOCKS: Int
        val MAX_COMBINED_UNIFORM_BLOCKS: Int
        val MAX_UNIFORM_BUFFER_BINDINGS: Int
        val MAX_UNIFORM_BLOCK_SIZE: Int
        val MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: Int
        val MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: Int
        val UNIFORM_BUFFER_OFFSET_ALIGNMENT: Int
        val ACTIVE_UNIFORM_BLOCKS: Int
        val UNIFORM_TYPE: Int
        val UNIFORM_SIZE: Int
        val UNIFORM_BLOCK_INDEX: Int
        val UNIFORM_OFFSET: Int
        val UNIFORM_ARRAY_STRIDE: Int
        val UNIFORM_MATRIX_STRIDE: Int
        val UNIFORM_IS_ROW_MAJOR: Int
        val UNIFORM_BLOCK_BINDING: Int
        val UNIFORM_BLOCK_DATA_SIZE: Int
        val UNIFORM_BLOCK_ACTIVE_UNIFORMS: Int
        val UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: Int
        val UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: Int
        val UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: Int
        val INVALID_INDEX: Int
        val MAX_VERTEX_OUTPUT_COMPONENTS: Int
        val MAX_FRAGMENT_INPUT_COMPONENTS: Int
        val MAX_SERVER_WAIT_TIMEOUT: Int
        val OBJECT_TYPE: Int
        val SYNC_CONDITION: Int
        val SYNC_STATUS: Int
        val SYNC_FLAGS: Int
        val SYNC_FENCE: Int
        val SYNC_GPU_COMMANDS_COMPLETE: Int
        val UNSIGNALED: Int
        val SIGNALED: Int
        val ALREADY_SIGNALED: Int
        val TIMEOUT_EXPIRED: Int
        val CONDITION_SATISFIED: Int
        val WAIT_FAILED: Int
        val SYNC_FLUSH_COMMANDS_BIT: Int
        val VERTEX_ATTRIB_ARRAY_DIVISOR: Int
        val ANY_SAMPLES_PASSED: Int
        val ANY_SAMPLES_PASSED_CONSERVATIVE: Int
        val SAMPLER_BINDING: Int
        val RGB10_A2UI: Int
        val INT_2_10_10_10_REV: Int
        val TRANSFORM_FEEDBACK: Int
        val TRANSFORM_FEEDBACK_PAUSED: Int
        val TRANSFORM_FEEDBACK_ACTIVE: Int
        val TRANSFORM_FEEDBACK_BINDING: Int
        val TEXTURE_IMMUTABLE_FORMAT: Int
        val MAX_ELEMENT_INDEX: Int
        val TEXTURE_IMMUTABLE_LEVELS: Int
        val TIMEOUT_IGNORED: Double
        val MAX_CLIENT_WAIT_TIMEOUT_WEBGL: Int
    }
}
