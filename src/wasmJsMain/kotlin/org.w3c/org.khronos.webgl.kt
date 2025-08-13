/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE", "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION", "JS_NAME_CLASH", "EXPECT_ACTUAL_IR_INCOMPATIBILITY", "EXPECT_ACTUAL_IR_MISMATCH", "AMBIGUOUS_ACTUALS", "WRONG_JS_INTEROP_TYPE")
package org.khronos.webgl

import kotlin.js.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.undefined

public actual external interface WebGLContextAttributes : JsAny {
    actual var alpha: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var depth: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var stencil: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var antialias: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var premultipliedAlpha: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var preserveDrawingBuffer: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var preferLowPowerToHighPerformance: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var failIfMajorPerformanceCaveat: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun WebGLContextAttributes(alpha: Boolean?, depth: Boolean?, stencil: Boolean?, antialias: Boolean?, premultipliedAlpha: Boolean?, preserveDrawingBuffer: Boolean?, preferLowPowerToHighPerformance: Boolean?, failIfMajorPerformanceCaveat: Boolean?): WebGLContextAttributes = js("({ alpha: alpha, depth: depth, stencil: stencil, antialias: antialias, premultipliedAlpha: premultipliedAlpha, preserveDrawingBuffer: preserveDrawingBuffer, preferLowPowerToHighPerformance: preferLowPowerToHighPerformance, failIfMajorPerformanceCaveat: failIfMajorPerformanceCaveat })")

public actual external abstract class WebGLObject : JsAny

/**
 * Exposes the JavaScript [WebGLBuffer](https://developer.mozilla.org/en/docs/Web/API/WebGLBuffer) to Kotlin
 */
public actual external abstract class WebGLBuffer : WebGLObject, JsAny

/**
 * Exposes the JavaScript [WebGLFramebuffer](https://developer.mozilla.org/en/docs/Web/API/WebGLFramebuffer) to Kotlin
 */
public actual external abstract class WebGLFramebuffer : WebGLObject, JsAny

/**
 * Exposes the JavaScript [WebGLProgram](https://developer.mozilla.org/en/docs/Web/API/WebGLProgram) to Kotlin
 */
public actual external abstract class WebGLProgram : WebGLObject, JsAny

/**
 * Exposes the JavaScript [WebGLRenderbuffer](https://developer.mozilla.org/en/docs/Web/API/WebGLRenderbuffer) to Kotlin
 */
public actual external abstract class WebGLRenderbuffer : WebGLObject, JsAny

/**
 * Exposes the JavaScript [WebGLShader](https://developer.mozilla.org/en/docs/Web/API/WebGLShader) to Kotlin
 */
public actual external abstract class WebGLShader : WebGLObject, JsAny

/**
 * Exposes the JavaScript [WebGLTexture](https://developer.mozilla.org/en/docs/Web/API/WebGLTexture) to Kotlin
 */
public actual external abstract class WebGLTexture : WebGLObject, JsAny

/**
 * Exposes the JavaScript [WebGLUniformLocation](https://developer.mozilla.org/en/docs/Web/API/WebGLUniformLocation) to Kotlin
 */
public actual external abstract class WebGLUniformLocation : JsAny

/**
 * Exposes the JavaScript [WebGLActiveInfo](https://developer.mozilla.org/en/docs/Web/API/WebGLActiveInfo) to Kotlin
 */
public actual external abstract class WebGLActiveInfo : JsAny {
    actual open val size: Int
    actual open val type: Int
    actual open val name: String
}

/**
 * Exposes the JavaScript [WebGLShaderPrecisionFormat](https://developer.mozilla.org/en/docs/Web/API/WebGLShaderPrecisionFormat) to Kotlin
 */
public actual external abstract class WebGLShaderPrecisionFormat : JsAny {
    actual open val rangeMin: Int
    actual open val rangeMax: Int
    actual open val precision: Int
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface WebGLRenderingContextBase : JsAny {
    actual val canvas: HTMLCanvasElement
    actual val drawingBufferWidth: Int
    actual val drawingBufferHeight: Int
    actual fun getContextAttributes(): WebGLContextAttributes?
    actual fun isContextLost(): Boolean
    actual fun getSupportedExtensions(): JsArray<JsString>?
    actual fun getExtension(name: String): JsAny?
    actual fun activeTexture(texture: Int)
    actual fun attachShader(program: WebGLProgram?, shader: WebGLShader?)
    actual fun bindAttribLocation(program: WebGLProgram?, index: Int, name: String)
    actual fun bindBuffer(target: Int, buffer: WebGLBuffer?)
    actual fun bindFramebuffer(target: Int, framebuffer: WebGLFramebuffer?)
    actual fun bindRenderbuffer(target: Int, renderbuffer: WebGLRenderbuffer?)
    actual fun bindTexture(target: Int, texture: WebGLTexture?)
    actual fun blendColor(red: Float, green: Float, blue: Float, alpha: Float)
    actual fun blendEquation(mode: Int)
    actual fun blendEquationSeparate(modeRGB: Int, modeAlpha: Int)
    actual fun blendFunc(sfactor: Int, dfactor: Int)
    actual fun blendFuncSeparate(srcRGB: Int, dstRGB: Int, srcAlpha: Int, dstAlpha: Int)
    actual fun bufferData(target: Int, size: Int, usage: Int)
    actual fun bufferData(target: Int, data: BufferDataSource?, usage: Int)
    actual fun bufferSubData(target: Int, offset: Int, data: BufferDataSource?)
    actual fun checkFramebufferStatus(target: Int): Int
    actual fun clear(mask: Int)
    actual fun clearColor(red: Float, green: Float, blue: Float, alpha: Float)
    actual fun clearDepth(depth: Float)
    actual fun clearStencil(s: Int)
    actual fun colorMask(red: Boolean, green: Boolean, blue: Boolean, alpha: Boolean)
    actual fun compileShader(shader: WebGLShader?)
    actual fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, data: ArrayBufferView)
    actual fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, data: ArrayBufferView)
    actual fun copyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int)
    actual fun copyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int)
    actual fun createBuffer(): WebGLBuffer?
    actual fun createFramebuffer(): WebGLFramebuffer?
    actual fun createProgram(): WebGLProgram?
    actual fun createRenderbuffer(): WebGLRenderbuffer?
    actual fun createShader(type: Int): WebGLShader?
    actual fun createTexture(): WebGLTexture?
    actual fun cullFace(mode: Int)
    actual fun deleteBuffer(buffer: WebGLBuffer?)
    actual fun deleteFramebuffer(framebuffer: WebGLFramebuffer?)
    actual fun deleteProgram(program: WebGLProgram?)
    actual fun deleteRenderbuffer(renderbuffer: WebGLRenderbuffer?)
    actual fun deleteShader(shader: WebGLShader?)
    actual fun deleteTexture(texture: WebGLTexture?)
    actual fun depthFunc(func: Int)
    actual fun depthMask(flag: Boolean)
    actual fun depthRange(zNear: Float, zFar: Float)
    actual fun detachShader(program: WebGLProgram?, shader: WebGLShader?)
    actual fun disable(cap: Int)
    actual fun disableVertexAttribArray(index: Int)
    actual fun drawArrays(mode: Int, first: Int, count: Int)
    actual fun drawElements(mode: Int, count: Int, type: Int, offset: Int)
    actual fun enable(cap: Int)
    actual fun enableVertexAttribArray(index: Int)
    actual fun finish()
    actual fun flush()
    actual fun framebufferRenderbuffer(target: Int, attachment: Int, renderbuffertarget: Int, renderbuffer: WebGLRenderbuffer?)
    actual fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: WebGLTexture?, level: Int)
    actual fun frontFace(mode: Int)
    actual fun generateMipmap(target: Int)
    actual fun getActiveAttrib(program: WebGLProgram?, index: Int): WebGLActiveInfo?
    actual fun getActiveUniform(program: WebGLProgram?, index: Int): WebGLActiveInfo?
    actual fun getAttachedShaders(program: WebGLProgram?): JsArray<WebGLShader>?
    actual fun getAttribLocation(program: WebGLProgram?, name: String): Int
    actual fun getBufferParameter(target: Int, pname: Int): JsAny?
    actual fun getParameter(pname: Int): JsAny?
    actual fun getError(): Int
    actual fun getFramebufferAttachmentParameter(target: Int, attachment: Int, pname: Int): JsAny?
    actual fun getProgramParameter(program: WebGLProgram?, pname: Int): JsAny?
    actual fun getProgramInfoLog(program: WebGLProgram?): String?
    actual fun getRenderbufferParameter(target: Int, pname: Int): JsAny?
    actual fun getShaderParameter(shader: WebGLShader?, pname: Int): JsAny?
    actual fun getShaderPrecisionFormat(shadertype: Int, precisiontype: Int): WebGLShaderPrecisionFormat?
    actual fun getShaderInfoLog(shader: WebGLShader?): String?
    actual fun getShaderSource(shader: WebGLShader?): String?
    actual fun getTexParameter(target: Int, pname: Int): JsAny?
    actual fun getUniform(program: WebGLProgram?, location: WebGLUniformLocation?): JsAny?
    actual fun getUniformLocation(program: WebGLProgram?, name: String): WebGLUniformLocation?
    actual fun getVertexAttrib(index: Int, pname: Int): JsAny?
    actual fun getVertexAttribOffset(index: Int, pname: Int): Int
    actual fun hint(target: Int, mode: Int)
    actual fun isBuffer(buffer: WebGLBuffer?): Boolean
    actual fun isEnabled(cap: Int): Boolean
    actual fun isFramebuffer(framebuffer: WebGLFramebuffer?): Boolean
    actual fun isProgram(program: WebGLProgram?): Boolean
    actual fun isRenderbuffer(renderbuffer: WebGLRenderbuffer?): Boolean
    actual fun isShader(shader: WebGLShader?): Boolean
    actual fun isTexture(texture: WebGLTexture?): Boolean
    actual fun lineWidth(width: Float)
    actual fun linkProgram(program: WebGLProgram?)
    actual fun pixelStorei(pname: Int, param: Int)
    actual fun polygonOffset(factor: Float, units: Float)
    actual fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?)
    actual fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int)
    actual fun sampleCoverage(value: Float, invert: Boolean)
    actual fun scissor(x: Int, y: Int, width: Int, height: Int)
    actual fun shaderSource(shader: WebGLShader?, source: String)
    actual fun stencilFunc(func: Int, ref: Int, mask: Int)
    actual fun stencilFuncSeparate(face: Int, func: Int, ref: Int, mask: Int)
    actual fun stencilMask(mask: Int)
    actual fun stencilMaskSeparate(face: Int, mask: Int)
    actual fun stencilOp(fail: Int, zfail: Int, zpass: Int)
    actual fun stencilOpSeparate(face: Int, fail: Int, zfail: Int, zpass: Int)
    actual fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: ArrayBufferView?)
    actual fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: TexImageSource?)
    actual fun texParameterf(target: Int, pname: Int, param: Float)
    actual fun texParameteri(target: Int, pname: Int, param: Int)
    actual fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?)
    actual fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: TexImageSource?)
    actual fun uniform1f(location: WebGLUniformLocation?, x: Float)
    actual fun uniform1fv(location: WebGLUniformLocation?, v: Float32Array)
    actual fun uniform1fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    actual fun uniform1i(location: WebGLUniformLocation?, x: Int)
    actual fun uniform1iv(location: WebGLUniformLocation?, v: Int32Array)
    actual fun uniform1iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    actual fun uniform2f(location: WebGLUniformLocation?, x: Float, y: Float)
    actual fun uniform2fv(location: WebGLUniformLocation?, v: Float32Array)
    actual fun uniform2fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    actual fun uniform2i(location: WebGLUniformLocation?, x: Int, y: Int)
    actual fun uniform2iv(location: WebGLUniformLocation?, v: Int32Array)
    actual fun uniform2iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    actual fun uniform3f(location: WebGLUniformLocation?, x: Float, y: Float, z: Float)
    actual fun uniform3fv(location: WebGLUniformLocation?, v: Float32Array)
    actual fun uniform3fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    actual fun uniform3i(location: WebGLUniformLocation?, x: Int, y: Int, z: Int)
    actual fun uniform3iv(location: WebGLUniformLocation?, v: Int32Array)
    actual fun uniform3iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    actual fun uniform4f(location: WebGLUniformLocation?, x: Float, y: Float, z: Float, w: Float)
    actual fun uniform4fv(location: WebGLUniformLocation?, v: Float32Array)
    actual fun uniform4fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    actual fun uniform4i(location: WebGLUniformLocation?, x: Int, y: Int, z: Int, w: Int)
    actual fun uniform4iv(location: WebGLUniformLocation?, v: Int32Array)
    actual fun uniform4iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    actual fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array)
    actual fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, value: JsArray<JsNumber>)
    actual fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array)
    actual fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, value: JsArray<JsNumber>)
    actual fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array)
    actual fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, value: JsArray<JsNumber>)
    actual fun useProgram(program: WebGLProgram?)
    actual fun validateProgram(program: WebGLProgram?)
    actual fun vertexAttrib1f(index: Int, x: Float)
    actual fun vertexAttrib1fv(index: Int, values: Float32Array)
    actual fun vertexAttrib1fv(index: Int, values: JsArray<JsNumber>)
    actual fun vertexAttrib2f(index: Int, x: Float, y: Float)
    actual fun vertexAttrib2fv(index: Int, values: Float32Array)
    actual fun vertexAttrib2fv(index: Int, values: JsArray<JsNumber>)
    actual fun vertexAttrib3f(index: Int, x: Float, y: Float, z: Float)
    actual fun vertexAttrib3fv(index: Int, values: Float32Array)
    actual fun vertexAttrib3fv(index: Int, values: JsArray<JsNumber>)
    actual fun vertexAttrib4f(index: Int, x: Float, y: Float, z: Float, w: Float)
    actual fun vertexAttrib4fv(index: Int, values: Float32Array)
    actual fun vertexAttrib4fv(index: Int, values: JsArray<JsNumber>)
    actual fun vertexAttribPointer(index: Int, size: Int, type: Int, normalized: Boolean, stride: Int, offset: Int)
    actual fun viewport(x: Int, y: Int, width: Int, height: Int)

    actual companion object {
        actual val DEPTH_BUFFER_BIT: Int
        actual val STENCIL_BUFFER_BIT: Int
        actual val COLOR_BUFFER_BIT: Int
        actual val POINTS: Int
        actual val LINES: Int
        actual val LINE_LOOP: Int
        actual val LINE_STRIP: Int
        actual val TRIANGLES: Int
        actual val TRIANGLE_STRIP: Int
        actual val TRIANGLE_FAN: Int
        actual val ZERO: Int
        actual val ONE: Int
        actual val SRC_COLOR: Int
        actual val ONE_MINUS_SRC_COLOR: Int
        actual val SRC_ALPHA: Int
        actual val ONE_MINUS_SRC_ALPHA: Int
        actual val DST_ALPHA: Int
        actual val ONE_MINUS_DST_ALPHA: Int
        actual val DST_COLOR: Int
        actual val ONE_MINUS_DST_COLOR: Int
        actual val SRC_ALPHA_SATURATE: Int
        actual val FUNC_ADD: Int
        actual val BLEND_EQUATION: Int
        actual val BLEND_EQUATION_RGB: Int
        actual val BLEND_EQUATION_ALPHA: Int
        actual val FUNC_SUBTRACT: Int
        actual val FUNC_REVERSE_SUBTRACT: Int
        actual val BLEND_DST_RGB: Int
        actual val BLEND_SRC_RGB: Int
        actual val BLEND_DST_ALPHA: Int
        actual val BLEND_SRC_ALPHA: Int
        actual val CONSTANT_COLOR: Int
        actual val ONE_MINUS_CONSTANT_COLOR: Int
        actual val CONSTANT_ALPHA: Int
        actual val ONE_MINUS_CONSTANT_ALPHA: Int
        actual val BLEND_COLOR: Int
        actual val ARRAY_BUFFER: Int
        actual val ELEMENT_ARRAY_BUFFER: Int
        actual val ARRAY_BUFFER_BINDING: Int
        actual val ELEMENT_ARRAY_BUFFER_BINDING: Int
        actual val STREAM_DRAW: Int
        actual val STATIC_DRAW: Int
        actual val DYNAMIC_DRAW: Int
        actual val BUFFER_SIZE: Int
        actual val BUFFER_USAGE: Int
        actual val CURRENT_VERTEX_ATTRIB: Int
        actual val FRONT: Int
        actual val BACK: Int
        actual val FRONT_AND_BACK: Int
        actual val CULL_FACE: Int
        actual val BLEND: Int
        actual val DITHER: Int
        actual val STENCIL_TEST: Int
        actual val DEPTH_TEST: Int
        actual val SCISSOR_TEST: Int
        actual val POLYGON_OFFSET_FILL: Int
        actual val SAMPLE_ALPHA_TO_COVERAGE: Int
        actual val SAMPLE_COVERAGE: Int
        actual val NO_ERROR: Int
        actual val INVALID_ENUM: Int
        actual val INVALID_VALUE: Int
        actual val INVALID_OPERATION: Int
        actual val OUT_OF_MEMORY: Int
        actual val CW: Int
        actual val CCW: Int
        actual val LINE_WIDTH: Int
        actual val ALIASED_POINT_SIZE_RANGE: Int
        actual val ALIASED_LINE_WIDTH_RANGE: Int
        actual val CULL_FACE_MODE: Int
        actual val FRONT_FACE: Int
        actual val DEPTH_RANGE: Int
        actual val DEPTH_WRITEMASK: Int
        actual val DEPTH_CLEAR_VALUE: Int
        actual val DEPTH_FUNC: Int
        actual val STENCIL_CLEAR_VALUE: Int
        actual val STENCIL_FUNC: Int
        actual val STENCIL_FAIL: Int
        actual val STENCIL_PASS_DEPTH_FAIL: Int
        actual val STENCIL_PASS_DEPTH_PASS: Int
        actual val STENCIL_REF: Int
        actual val STENCIL_VALUE_MASK: Int
        actual val STENCIL_WRITEMASK: Int
        actual val STENCIL_BACK_FUNC: Int
        actual val STENCIL_BACK_FAIL: Int
        actual val STENCIL_BACK_PASS_DEPTH_FAIL: Int
        actual val STENCIL_BACK_PASS_DEPTH_PASS: Int
        actual val STENCIL_BACK_REF: Int
        actual val STENCIL_BACK_VALUE_MASK: Int
        actual val STENCIL_BACK_WRITEMASK: Int
        actual val VIEWPORT: Int
        actual val SCISSOR_BOX: Int
        actual val COLOR_CLEAR_VALUE: Int
        actual val COLOR_WRITEMASK: Int
        actual val UNPACK_ALIGNMENT: Int
        actual val PACK_ALIGNMENT: Int
        actual val MAX_TEXTURE_SIZE: Int
        actual val MAX_VIEWPORT_DIMS: Int
        actual val SUBPIXEL_BITS: Int
        actual val RED_BITS: Int
        actual val GREEN_BITS: Int
        actual val BLUE_BITS: Int
        actual val ALPHA_BITS: Int
        actual val DEPTH_BITS: Int
        actual val STENCIL_BITS: Int
        actual val POLYGON_OFFSET_UNITS: Int
        actual val POLYGON_OFFSET_FACTOR: Int
        actual val TEXTURE_BINDING_2D: Int
        actual val SAMPLE_BUFFERS: Int
        actual val SAMPLES: Int
        actual val SAMPLE_COVERAGE_VALUE: Int
        actual val SAMPLE_COVERAGE_INVERT: Int
        actual val COMPRESSED_TEXTURE_FORMATS: Int
        actual val DONT_CARE: Int
        actual val FASTEST: Int
        actual val NICEST: Int
        actual val GENERATE_MIPMAP_HINT: Int
        actual val BYTE: Int
        actual val UNSIGNED_BYTE: Int
        actual val SHORT: Int
        actual val UNSIGNED_SHORT: Int
        actual val INT: Int
        actual val UNSIGNED_INT: Int
        actual val FLOAT: Int
        actual val DEPTH_COMPONENT: Int
        actual val ALPHA: Int
        actual val RGB: Int
        actual val RGBA: Int
        actual val LUMINANCE: Int
        actual val LUMINANCE_ALPHA: Int
        actual val UNSIGNED_SHORT_4_4_4_4: Int
        actual val UNSIGNED_SHORT_5_5_5_1: Int
        actual val UNSIGNED_SHORT_5_6_5: Int
        actual val FRAGMENT_SHADER: Int
        actual val VERTEX_SHADER: Int
        actual val MAX_VERTEX_ATTRIBS: Int
        actual val MAX_VERTEX_UNIFORM_VECTORS: Int
        actual val MAX_VARYING_VECTORS: Int
        actual val MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int
        actual val MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int
        actual val MAX_TEXTURE_IMAGE_UNITS: Int
        actual val MAX_FRAGMENT_UNIFORM_VECTORS: Int
        actual val SHADER_TYPE: Int
        actual val DELETE_STATUS: Int
        actual val LINK_STATUS: Int
        actual val VALIDATE_STATUS: Int
        actual val ATTACHED_SHADERS: Int
        actual val ACTIVE_UNIFORMS: Int
        actual val ACTIVE_ATTRIBUTES: Int
        actual val SHADING_LANGUAGE_VERSION: Int
        actual val CURRENT_PROGRAM: Int
        actual val NEVER: Int
        actual val LESS: Int
        actual val EQUAL: Int
        actual val LEQUAL: Int
        actual val GREATER: Int
        actual val NOTEQUAL: Int
        actual val GEQUAL: Int
        actual val ALWAYS: Int
        actual val KEEP: Int
        actual val REPLACE: Int
        actual val INCR: Int
        actual val DECR: Int
        actual val INVERT: Int
        actual val INCR_WRAP: Int
        actual val DECR_WRAP: Int
        actual val VENDOR: Int
        actual val RENDERER: Int
        actual val VERSION: Int
        actual val NEAREST: Int
        actual val LINEAR: Int
        actual val NEAREST_MIPMAP_NEAREST: Int
        actual val LINEAR_MIPMAP_NEAREST: Int
        actual val NEAREST_MIPMAP_LINEAR: Int
        actual val LINEAR_MIPMAP_LINEAR: Int
        actual val TEXTURE_MAG_FILTER: Int
        actual val TEXTURE_MIN_FILTER: Int
        actual val TEXTURE_WRAP_S: Int
        actual val TEXTURE_WRAP_T: Int
        actual val TEXTURE_2D: Int
        actual val TEXTURE: Int
        actual val TEXTURE_CUBE_MAP: Int
        actual val TEXTURE_BINDING_CUBE_MAP: Int
        actual val TEXTURE_CUBE_MAP_POSITIVE_X: Int
        actual val TEXTURE_CUBE_MAP_NEGATIVE_X: Int
        actual val TEXTURE_CUBE_MAP_POSITIVE_Y: Int
        actual val TEXTURE_CUBE_MAP_NEGATIVE_Y: Int
        actual val TEXTURE_CUBE_MAP_POSITIVE_Z: Int
        actual val TEXTURE_CUBE_MAP_NEGATIVE_Z: Int
        actual val MAX_CUBE_MAP_TEXTURE_SIZE: Int
        actual val TEXTURE0: Int
        actual val TEXTURE1: Int
        actual val TEXTURE2: Int
        actual val TEXTURE3: Int
        actual val TEXTURE4: Int
        actual val TEXTURE5: Int
        actual val TEXTURE6: Int
        actual val TEXTURE7: Int
        actual val TEXTURE8: Int
        actual val TEXTURE9: Int
        actual val TEXTURE10: Int
        actual val TEXTURE11: Int
        actual val TEXTURE12: Int
        actual val TEXTURE13: Int
        actual val TEXTURE14: Int
        actual val TEXTURE15: Int
        actual val TEXTURE16: Int
        actual val TEXTURE17: Int
        actual val TEXTURE18: Int
        actual val TEXTURE19: Int
        actual val TEXTURE20: Int
        actual val TEXTURE21: Int
        actual val TEXTURE22: Int
        actual val TEXTURE23: Int
        actual val TEXTURE24: Int
        actual val TEXTURE25: Int
        actual val TEXTURE26: Int
        actual val TEXTURE27: Int
        actual val TEXTURE28: Int
        actual val TEXTURE29: Int
        actual val TEXTURE30: Int
        actual val TEXTURE31: Int
        actual val ACTIVE_TEXTURE: Int
        actual val REPEAT: Int
        actual val CLAMP_TO_EDGE: Int
        actual val MIRRORED_REPEAT: Int
        actual val FLOAT_VEC2: Int
        actual val FLOAT_VEC3: Int
        actual val FLOAT_VEC4: Int
        actual val INT_VEC2: Int
        actual val INT_VEC3: Int
        actual val INT_VEC4: Int
        actual val BOOL: Int
        actual val BOOL_VEC2: Int
        actual val BOOL_VEC3: Int
        actual val BOOL_VEC4: Int
        actual val FLOAT_MAT2: Int
        actual val FLOAT_MAT3: Int
        actual val FLOAT_MAT4: Int
        actual val SAMPLER_2D: Int
        actual val SAMPLER_CUBE: Int
        actual val VERTEX_ATTRIB_ARRAY_ENABLED: Int
        actual val VERTEX_ATTRIB_ARRAY_SIZE: Int
        actual val VERTEX_ATTRIB_ARRAY_STRIDE: Int
        actual val VERTEX_ATTRIB_ARRAY_TYPE: Int
        actual val VERTEX_ATTRIB_ARRAY_NORMALIZED: Int
        actual val VERTEX_ATTRIB_ARRAY_POINTER: Int
        actual val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int
        actual val IMPLEMENTATION_COLOR_READ_TYPE: Int
        actual val IMPLEMENTATION_COLOR_READ_FORMAT: Int
        actual val COMPILE_STATUS: Int
        actual val LOW_FLOAT: Int
        actual val MEDIUM_FLOAT: Int
        actual val HIGH_FLOAT: Int
        actual val LOW_INT: Int
        actual val MEDIUM_INT: Int
        actual val HIGH_INT: Int
        actual val FRAMEBUFFER: Int
        actual val RENDERBUFFER: Int
        actual val RGBA4: Int
        actual val RGB5_A1: Int
        actual val RGB565: Int
        actual val DEPTH_COMPONENT16: Int
        actual val STENCIL_INDEX: Int
        actual val STENCIL_INDEX8: Int
        actual val DEPTH_STENCIL: Int
        actual val RENDERBUFFER_WIDTH: Int
        actual val RENDERBUFFER_HEIGHT: Int
        actual val RENDERBUFFER_INTERNAL_FORMAT: Int
        actual val RENDERBUFFER_RED_SIZE: Int
        actual val RENDERBUFFER_GREEN_SIZE: Int
        actual val RENDERBUFFER_BLUE_SIZE: Int
        actual val RENDERBUFFER_ALPHA_SIZE: Int
        actual val RENDERBUFFER_DEPTH_SIZE: Int
        actual val RENDERBUFFER_STENCIL_SIZE: Int
        actual val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int
        actual val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int
        actual val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int
        actual val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int
        actual val COLOR_ATTACHMENT0: Int
        actual val DEPTH_ATTACHMENT: Int
        actual val STENCIL_ATTACHMENT: Int
        actual val DEPTH_STENCIL_ATTACHMENT: Int
        actual val NONE: Int
        actual val FRAMEBUFFER_COMPLETE: Int
        actual val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int
        actual val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int
        actual val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: Int
        actual val FRAMEBUFFER_UNSUPPORTED: Int
        actual val FRAMEBUFFER_BINDING: Int
        actual val RENDERBUFFER_BINDING: Int
        actual val MAX_RENDERBUFFER_SIZE: Int
        actual val INVALID_FRAMEBUFFER_OPERATION: Int
        actual val UNPACK_FLIP_Y_WEBGL: Int
        actual val UNPACK_PREMULTIPLY_ALPHA_WEBGL: Int
        actual val CONTEXT_LOST_WEBGL: Int
        actual val UNPACK_COLORSPACE_CONVERSION_WEBGL: Int
        actual val BROWSER_DEFAULT_WEBGL: Int
    }
}

/**
 * Exposes the JavaScript [WebGLRenderingContext](https://developer.mozilla.org/en/docs/Web/API/WebGLRenderingContext) to Kotlin
 */
public actual external abstract class WebGLRenderingContext : WebGLRenderingContextBase, RenderingContext, JsAny {
    actual companion object {
        actual val DEPTH_BUFFER_BIT: Int
        actual val STENCIL_BUFFER_BIT: Int
        actual val COLOR_BUFFER_BIT: Int
        actual val POINTS: Int
        actual val LINES: Int
        actual val LINE_LOOP: Int
        actual val LINE_STRIP: Int
        actual val TRIANGLES: Int
        actual val TRIANGLE_STRIP: Int
        actual val TRIANGLE_FAN: Int
        actual val ZERO: Int
        actual val ONE: Int
        actual val SRC_COLOR: Int
        actual val ONE_MINUS_SRC_COLOR: Int
        actual val SRC_ALPHA: Int
        actual val ONE_MINUS_SRC_ALPHA: Int
        actual val DST_ALPHA: Int
        actual val ONE_MINUS_DST_ALPHA: Int
        actual val DST_COLOR: Int
        actual val ONE_MINUS_DST_COLOR: Int
        actual val SRC_ALPHA_SATURATE: Int
        actual val FUNC_ADD: Int
        actual val BLEND_EQUATION: Int
        actual val BLEND_EQUATION_RGB: Int
        actual val BLEND_EQUATION_ALPHA: Int
        actual val FUNC_SUBTRACT: Int
        actual val FUNC_REVERSE_SUBTRACT: Int
        actual val BLEND_DST_RGB: Int
        actual val BLEND_SRC_RGB: Int
        actual val BLEND_DST_ALPHA: Int
        actual val BLEND_SRC_ALPHA: Int
        actual val CONSTANT_COLOR: Int
        actual val ONE_MINUS_CONSTANT_COLOR: Int
        actual val CONSTANT_ALPHA: Int
        actual val ONE_MINUS_CONSTANT_ALPHA: Int
        actual val BLEND_COLOR: Int
        actual val ARRAY_BUFFER: Int
        actual val ELEMENT_ARRAY_BUFFER: Int
        actual val ARRAY_BUFFER_BINDING: Int
        actual val ELEMENT_ARRAY_BUFFER_BINDING: Int
        actual val STREAM_DRAW: Int
        actual val STATIC_DRAW: Int
        actual val DYNAMIC_DRAW: Int
        actual val BUFFER_SIZE: Int
        actual val BUFFER_USAGE: Int
        actual val CURRENT_VERTEX_ATTRIB: Int
        actual val FRONT: Int
        actual val BACK: Int
        actual val FRONT_AND_BACK: Int
        actual val CULL_FACE: Int
        actual val BLEND: Int
        actual val DITHER: Int
        actual val STENCIL_TEST: Int
        actual val DEPTH_TEST: Int
        actual val SCISSOR_TEST: Int
        actual val POLYGON_OFFSET_FILL: Int
        actual val SAMPLE_ALPHA_TO_COVERAGE: Int
        actual val SAMPLE_COVERAGE: Int
        actual val NO_ERROR: Int
        actual val INVALID_ENUM: Int
        actual val INVALID_VALUE: Int
        actual val INVALID_OPERATION: Int
        actual val OUT_OF_MEMORY: Int
        actual val CW: Int
        actual val CCW: Int
        actual val LINE_WIDTH: Int
        actual val ALIASED_POINT_SIZE_RANGE: Int
        actual val ALIASED_LINE_WIDTH_RANGE: Int
        actual val CULL_FACE_MODE: Int
        actual val FRONT_FACE: Int
        actual val DEPTH_RANGE: Int
        actual val DEPTH_WRITEMASK: Int
        actual val DEPTH_CLEAR_VALUE: Int
        actual val DEPTH_FUNC: Int
        actual val STENCIL_CLEAR_VALUE: Int
        actual val STENCIL_FUNC: Int
        actual val STENCIL_FAIL: Int
        actual val STENCIL_PASS_DEPTH_FAIL: Int
        actual val STENCIL_PASS_DEPTH_PASS: Int
        actual val STENCIL_REF: Int
        actual val STENCIL_VALUE_MASK: Int
        actual val STENCIL_WRITEMASK: Int
        actual val STENCIL_BACK_FUNC: Int
        actual val STENCIL_BACK_FAIL: Int
        actual val STENCIL_BACK_PASS_DEPTH_FAIL: Int
        actual val STENCIL_BACK_PASS_DEPTH_PASS: Int
        actual val STENCIL_BACK_REF: Int
        actual val STENCIL_BACK_VALUE_MASK: Int
        actual val STENCIL_BACK_WRITEMASK: Int
        actual val VIEWPORT: Int
        actual val SCISSOR_BOX: Int
        actual val COLOR_CLEAR_VALUE: Int
        actual val COLOR_WRITEMASK: Int
        actual val UNPACK_ALIGNMENT: Int
        actual val PACK_ALIGNMENT: Int
        actual val MAX_TEXTURE_SIZE: Int
        actual val MAX_VIEWPORT_DIMS: Int
        actual val SUBPIXEL_BITS: Int
        actual val RED_BITS: Int
        actual val GREEN_BITS: Int
        actual val BLUE_BITS: Int
        actual val ALPHA_BITS: Int
        actual val DEPTH_BITS: Int
        actual val STENCIL_BITS: Int
        actual val POLYGON_OFFSET_UNITS: Int
        actual val POLYGON_OFFSET_FACTOR: Int
        actual val TEXTURE_BINDING_2D: Int
        actual val SAMPLE_BUFFERS: Int
        actual val SAMPLES: Int
        actual val SAMPLE_COVERAGE_VALUE: Int
        actual val SAMPLE_COVERAGE_INVERT: Int
        actual val COMPRESSED_TEXTURE_FORMATS: Int
        actual val DONT_CARE: Int
        actual val FASTEST: Int
        actual val NICEST: Int
        actual val GENERATE_MIPMAP_HINT: Int
        actual val BYTE: Int
        actual val UNSIGNED_BYTE: Int
        actual val SHORT: Int
        actual val UNSIGNED_SHORT: Int
        actual val INT: Int
        actual val UNSIGNED_INT: Int
        actual val FLOAT: Int
        actual val DEPTH_COMPONENT: Int
        actual val ALPHA: Int
        actual val RGB: Int
        actual val RGBA: Int
        actual val LUMINANCE: Int
        actual val LUMINANCE_ALPHA: Int
        actual val UNSIGNED_SHORT_4_4_4_4: Int
        actual val UNSIGNED_SHORT_5_5_5_1: Int
        actual val UNSIGNED_SHORT_5_6_5: Int
        actual val FRAGMENT_SHADER: Int
        actual val VERTEX_SHADER: Int
        actual val MAX_VERTEX_ATTRIBS: Int
        actual val MAX_VERTEX_UNIFORM_VECTORS: Int
        actual val MAX_VARYING_VECTORS: Int
        actual val MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int
        actual val MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int
        actual val MAX_TEXTURE_IMAGE_UNITS: Int
        actual val MAX_FRAGMENT_UNIFORM_VECTORS: Int
        actual val SHADER_TYPE: Int
        actual val DELETE_STATUS: Int
        actual val LINK_STATUS: Int
        actual val VALIDATE_STATUS: Int
        actual val ATTACHED_SHADERS: Int
        actual val ACTIVE_UNIFORMS: Int
        actual val ACTIVE_ATTRIBUTES: Int
        actual val SHADING_LANGUAGE_VERSION: Int
        actual val CURRENT_PROGRAM: Int
        actual val NEVER: Int
        actual val LESS: Int
        actual val EQUAL: Int
        actual val LEQUAL: Int
        actual val GREATER: Int
        actual val NOTEQUAL: Int
        actual val GEQUAL: Int
        actual val ALWAYS: Int
        actual val KEEP: Int
        actual val REPLACE: Int
        actual val INCR: Int
        actual val DECR: Int
        actual val INVERT: Int
        actual val INCR_WRAP: Int
        actual val DECR_WRAP: Int
        actual val VENDOR: Int
        actual val RENDERER: Int
        actual val VERSION: Int
        actual val NEAREST: Int
        actual val LINEAR: Int
        actual val NEAREST_MIPMAP_NEAREST: Int
        actual val LINEAR_MIPMAP_NEAREST: Int
        actual val NEAREST_MIPMAP_LINEAR: Int
        actual val LINEAR_MIPMAP_LINEAR: Int
        actual val TEXTURE_MAG_FILTER: Int
        actual val TEXTURE_MIN_FILTER: Int
        actual val TEXTURE_WRAP_S: Int
        actual val TEXTURE_WRAP_T: Int
        actual val TEXTURE_2D: Int
        actual val TEXTURE: Int
        actual val TEXTURE_CUBE_MAP: Int
        actual val TEXTURE_BINDING_CUBE_MAP: Int
        actual val TEXTURE_CUBE_MAP_POSITIVE_X: Int
        actual val TEXTURE_CUBE_MAP_NEGATIVE_X: Int
        actual val TEXTURE_CUBE_MAP_POSITIVE_Y: Int
        actual val TEXTURE_CUBE_MAP_NEGATIVE_Y: Int
        actual val TEXTURE_CUBE_MAP_POSITIVE_Z: Int
        actual val TEXTURE_CUBE_MAP_NEGATIVE_Z: Int
        actual val MAX_CUBE_MAP_TEXTURE_SIZE: Int
        actual val TEXTURE0: Int
        actual val TEXTURE1: Int
        actual val TEXTURE2: Int
        actual val TEXTURE3: Int
        actual val TEXTURE4: Int
        actual val TEXTURE5: Int
        actual val TEXTURE6: Int
        actual val TEXTURE7: Int
        actual val TEXTURE8: Int
        actual val TEXTURE9: Int
        actual val TEXTURE10: Int
        actual val TEXTURE11: Int
        actual val TEXTURE12: Int
        actual val TEXTURE13: Int
        actual val TEXTURE14: Int
        actual val TEXTURE15: Int
        actual val TEXTURE16: Int
        actual val TEXTURE17: Int
        actual val TEXTURE18: Int
        actual val TEXTURE19: Int
        actual val TEXTURE20: Int
        actual val TEXTURE21: Int
        actual val TEXTURE22: Int
        actual val TEXTURE23: Int
        actual val TEXTURE24: Int
        actual val TEXTURE25: Int
        actual val TEXTURE26: Int
        actual val TEXTURE27: Int
        actual val TEXTURE28: Int
        actual val TEXTURE29: Int
        actual val TEXTURE30: Int
        actual val TEXTURE31: Int
        actual val ACTIVE_TEXTURE: Int
        actual val REPEAT: Int
        actual val CLAMP_TO_EDGE: Int
        actual val MIRRORED_REPEAT: Int
        actual val FLOAT_VEC2: Int
        actual val FLOAT_VEC3: Int
        actual val FLOAT_VEC4: Int
        actual val INT_VEC2: Int
        actual val INT_VEC3: Int
        actual val INT_VEC4: Int
        actual val BOOL: Int
        actual val BOOL_VEC2: Int
        actual val BOOL_VEC3: Int
        actual val BOOL_VEC4: Int
        actual val FLOAT_MAT2: Int
        actual val FLOAT_MAT3: Int
        actual val FLOAT_MAT4: Int
        actual val SAMPLER_2D: Int
        actual val SAMPLER_CUBE: Int
        actual val VERTEX_ATTRIB_ARRAY_ENABLED: Int
        actual val VERTEX_ATTRIB_ARRAY_SIZE: Int
        actual val VERTEX_ATTRIB_ARRAY_STRIDE: Int
        actual val VERTEX_ATTRIB_ARRAY_TYPE: Int
        actual val VERTEX_ATTRIB_ARRAY_NORMALIZED: Int
        actual val VERTEX_ATTRIB_ARRAY_POINTER: Int
        actual val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int
        actual val IMPLEMENTATION_COLOR_READ_TYPE: Int
        actual val IMPLEMENTATION_COLOR_READ_FORMAT: Int
        actual val COMPILE_STATUS: Int
        actual val LOW_FLOAT: Int
        actual val MEDIUM_FLOAT: Int
        actual val HIGH_FLOAT: Int
        actual val LOW_INT: Int
        actual val MEDIUM_INT: Int
        actual val HIGH_INT: Int
        actual val FRAMEBUFFER: Int
        actual val RENDERBUFFER: Int
        actual val RGBA4: Int
        actual val RGB5_A1: Int
        actual val RGB565: Int
        actual val DEPTH_COMPONENT16: Int
        actual val STENCIL_INDEX: Int
        actual val STENCIL_INDEX8: Int
        actual val DEPTH_STENCIL: Int
        actual val RENDERBUFFER_WIDTH: Int
        actual val RENDERBUFFER_HEIGHT: Int
        actual val RENDERBUFFER_INTERNAL_FORMAT: Int
        actual val RENDERBUFFER_RED_SIZE: Int
        actual val RENDERBUFFER_GREEN_SIZE: Int
        actual val RENDERBUFFER_BLUE_SIZE: Int
        actual val RENDERBUFFER_ALPHA_SIZE: Int
        actual val RENDERBUFFER_DEPTH_SIZE: Int
        actual val RENDERBUFFER_STENCIL_SIZE: Int
        actual val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int
        actual val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int
        actual val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int
        actual val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int
        actual val COLOR_ATTACHMENT0: Int
        actual val DEPTH_ATTACHMENT: Int
        actual val STENCIL_ATTACHMENT: Int
        actual val DEPTH_STENCIL_ATTACHMENT: Int
        actual val NONE: Int
        actual val FRAMEBUFFER_COMPLETE: Int
        actual val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int
        actual val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int
        actual val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: Int
        actual val FRAMEBUFFER_UNSUPPORTED: Int
        actual val FRAMEBUFFER_BINDING: Int
        actual val RENDERBUFFER_BINDING: Int
        actual val MAX_RENDERBUFFER_SIZE: Int
        actual val INVALID_FRAMEBUFFER_OPERATION: Int
        actual val UNPACK_FLIP_Y_WEBGL: Int
        actual val UNPACK_PREMULTIPLY_ALPHA_WEBGL: Int
        actual val CONTEXT_LOST_WEBGL: Int
        actual val UNPACK_COLORSPACE_CONVERSION_WEBGL: Int
        actual val BROWSER_DEFAULT_WEBGL: Int
    }
}

/**
 * Exposes the JavaScript [WebGLContextEvent](https://developer.mozilla.org/en/docs/Web/API/WebGLContextEvent) to Kotlin
 */
public actual external open class WebGLContextEvent actual constructor(type: String, eventInit: WebGLContextEventInit) : Event, JsAny {
    actual open val statusMessage: String

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface WebGLContextEventInit : EventInit, JsAny {
    actual var statusMessage: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun WebGLContextEventInit(statusMessage: String?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): WebGLContextEventInit = js("({ statusMessage: statusMessage, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [ArrayBuffer](https://developer.mozilla.org/en/docs/Web/API/ArrayBuffer) to Kotlin
 */
public actual external open class ArrayBuffer actual constructor(length: Int) : BufferDataSource, JsAny {
    actual open val byteLength: Int
    actual fun slice(begin: Int, end: Int): ArrayBuffer

    actual companion object {
        actual fun isView(value: JsAny?): Boolean
    }
}

/**
 * Exposes the JavaScript [ArrayBufferView](https://developer.mozilla.org/en/docs/Web/API/ArrayBufferView) to Kotlin
 */
public actual external interface ArrayBufferView : BufferDataSource, JsAny {
    actual val buffer: ArrayBuffer
    actual val byteOffset: Int
    actual val byteLength: Int
}

/**
 * Exposes the JavaScript [Int8Array](https://developer.mozilla.org/en/docs/Web/API/Int8Array) to Kotlin
 */
public actual external open class Int8Array : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Int8Array)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Int8Array, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Int8Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForInt8Array(obj: Int8Array, index: Int): Byte = js("obj[index]")

public actual operator fun Int8Array.get(index: Int): Byte = getMethodImplForInt8Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForInt8Array(obj: Int8Array, index: Int, value: Byte) { js("obj[index] = value;") }

public actual operator fun Int8Array.set(index: Int, value: Byte) = setMethodImplForInt8Array(this, index, value)

/**
 * Exposes the JavaScript [Uint8Array](https://developer.mozilla.org/en/docs/Web/API/Uint8Array) to Kotlin
 */
public actual external open class Uint8Array : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Uint8Array)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Uint8Array, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Uint8Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForUint8Array(obj: Uint8Array, index: Int): Byte = js("obj[index]")

public actual operator fun Uint8Array.get(index: Int): Byte = getMethodImplForUint8Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForUint8Array(obj: Uint8Array, index: Int, value: Byte) { js("obj[index] = value;") }

public actual operator fun Uint8Array.set(index: Int, value: Byte) = setMethodImplForUint8Array(this, index, value)

/**
 * Exposes the JavaScript [Uint8ClampedArray](https://developer.mozilla.org/en/docs/Web/API/Uint8ClampedArray) to Kotlin
 */
public actual external open class Uint8ClampedArray : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Uint8ClampedArray)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Uint8ClampedArray, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Uint8ClampedArray

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForUint8ClampedArray(obj: Uint8ClampedArray, index: Int): Byte = js("obj[index]")

public actual operator fun Uint8ClampedArray.get(index: Int): Byte = getMethodImplForUint8ClampedArray(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForUint8ClampedArray(obj: Uint8ClampedArray, index: Int, value: Byte) { js("obj[index] = value;") }

public actual operator fun Uint8ClampedArray.set(index: Int, value: Byte) = setMethodImplForUint8ClampedArray(this, index, value)

/**
 * Exposes the JavaScript [Int16Array](https://developer.mozilla.org/en/docs/Web/API/Int16Array) to Kotlin
 */
public actual external open class Int16Array : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Int16Array)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Int16Array, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Int16Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForInt16Array(obj: Int16Array, index: Int): Short = js("obj[index]")

public actual operator fun Int16Array.get(index: Int): Short = getMethodImplForInt16Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForInt16Array(obj: Int16Array, index: Int, value: Short) { js("obj[index] = value;") }

public actual operator fun Int16Array.set(index: Int, value: Short) = setMethodImplForInt16Array(this, index, value)

/**
 * Exposes the JavaScript [Uint16Array](https://developer.mozilla.org/en/docs/Web/API/Uint16Array) to Kotlin
 */
public actual external open class Uint16Array : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Uint16Array)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Uint16Array, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Uint16Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForUint16Array(obj: Uint16Array, index: Int): Short = js("obj[index]")

public actual operator fun Uint16Array.get(index: Int): Short = getMethodImplForUint16Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForUint16Array(obj: Uint16Array, index: Int, value: Short) { js("obj[index] = value;") }

public actual operator fun Uint16Array.set(index: Int, value: Short) = setMethodImplForUint16Array(this, index, value)

/**
 * Exposes the JavaScript [Int32Array](https://developer.mozilla.org/en/docs/Web/API/Int32Array) to Kotlin
 */
public actual external open class Int32Array : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Int32Array)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Int32Array, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Int32Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForInt32Array(obj: Int32Array, index: Int): Int = js("obj[index]")

public actual operator fun Int32Array.get(index: Int): Int = getMethodImplForInt32Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForInt32Array(obj: Int32Array, index: Int, value: Int) { js("obj[index] = value;") }

public actual operator fun Int32Array.set(index: Int, value: Int) = setMethodImplForInt32Array(this, index, value)

/**
 * Exposes the JavaScript [Uint32Array](https://developer.mozilla.org/en/docs/Web/API/Uint32Array) to Kotlin
 */
public actual external open class Uint32Array : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Uint32Array)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Uint32Array, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Uint32Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForUint32Array(obj: Uint32Array, index: Int): Int = js("obj[index]")

public actual operator fun Uint32Array.get(index: Int): Int = getMethodImplForUint32Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForUint32Array(obj: Uint32Array, index: Int, value: Int) { js("obj[index] = value;") }

public actual operator fun Uint32Array.set(index: Int, value: Int) = setMethodImplForUint32Array(this, index, value)

/**
 * Exposes the JavaScript [Float32Array](https://developer.mozilla.org/en/docs/Web/API/Float32Array) to Kotlin
 */
public actual external open class Float32Array : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Float32Array)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Float32Array, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Float32Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForFloat32Array(obj: Float32Array, index: Int): Float = js("obj[index]")

public actual operator fun Float32Array.get(index: Int): Float = getMethodImplForFloat32Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForFloat32Array(obj: Float32Array, index: Int, value: Float) { js("obj[index] = value;") }

public actual operator fun Float32Array.set(index: Int, value: Float) = setMethodImplForFloat32Array(this, index, value)

/**
 * Exposes the JavaScript [Float64Array](https://developer.mozilla.org/en/docs/Web/API/Float64Array) to Kotlin
 */
public actual external open class Float64Array : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Float64Array)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Float64Array, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Float64Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForFloat64Array(obj: Float64Array, index: Int): Double = js("obj[index]")

public actual operator fun Float64Array.get(index: Int): Double = getMethodImplForFloat64Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForFloat64Array(obj: Float64Array, index: Int, value: Double) { js("obj[index] = value;") }

public actual operator fun Float64Array.set(index: Int, value: Double) = setMethodImplForFloat64Array(this, index, value)

/**
 * Exposes the JavaScript [DataView](https://developer.mozilla.org/en/docs/Web/API/DataView) to Kotlin
 */
public actual external open class DataView actual constructor(buffer: ArrayBuffer, byteOffset: Int, byteLength: Int) : ArrayBufferView, JsAny {
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun getInt8(byteOffset: Int): Byte
    actual fun getUint8(byteOffset: Int): Byte
    actual fun getInt16(byteOffset: Int, littleEndian: Boolean): Short
    actual fun getUint16(byteOffset: Int, littleEndian: Boolean): Short
    actual fun getInt32(byteOffset: Int, littleEndian: Boolean): Int
    actual fun getUint32(byteOffset: Int, littleEndian: Boolean): Int
    actual fun getFloat32(byteOffset: Int, littleEndian: Boolean): Float
    actual fun getFloat64(byteOffset: Int, littleEndian: Boolean): Double
    actual fun setInt8(byteOffset: Int, value: Byte)
    actual fun setUint8(byteOffset: Int, value: Byte)
    actual fun setInt16(byteOffset: Int, value: Short, littleEndian: Boolean)
    actual fun setUint16(byteOffset: Int, value: Short, littleEndian: Boolean)
    actual fun setInt32(byteOffset: Int, value: Int, littleEndian: Boolean)
    actual fun setUint32(byteOffset: Int, value: Int, littleEndian: Boolean)
    actual fun setFloat32(byteOffset: Int, value: Float, littleEndian: Boolean)
    actual fun setFloat64(byteOffset: Int, value: Double, littleEndian: Boolean)
}

public actual external interface BufferDataSource

public actual external interface TexImageSource