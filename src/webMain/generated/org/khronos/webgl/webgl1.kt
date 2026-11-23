/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'webgl1', DO NOT EDIT!

package org.khronos.webgl

import kotlin.js.*
import org.w3c.dom.*

public external interface TexImageSource : ImageBitmapSource

public external interface WebGLPowerPreference : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val WebGLPowerPreference.Companion.DEFAULT: WebGLPowerPreference get() = "default".toJsString().unsafeCast<WebGLPowerPreference>()
public inline val WebGLPowerPreference.Companion.LOW_POWER: WebGLPowerPreference get() = "low-power".toJsString().unsafeCast<WebGLPowerPreference>()
public inline val WebGLPowerPreference.Companion.HIGH_PERFORMANCE: WebGLPowerPreference get() = "high-performance".toJsString().unsafeCast<WebGLPowerPreference>()

public external interface WebGLContextAttributes : JsAny {
    var alpha: Boolean?
    var depth: Boolean?
    var stencil: Boolean?
    var antialias: Boolean?
    var premultipliedAlpha: Boolean?
    var preserveDrawingBuffer: Boolean?
    var powerPreference: WebGLPowerPreference?
    var failIfMajorPerformanceCaveat: Boolean?
    var desynchronized: Boolean?
}

public fun WebGLContextAttributes(alpha: Boolean? = null, depth: Boolean? = null, stencil: Boolean? = null, antialias: Boolean? = null, premultipliedAlpha: Boolean? = null, preserveDrawingBuffer: Boolean? = null, powerPreference: WebGLPowerPreference? = null, failIfMajorPerformanceCaveat: Boolean? = null, desynchronized: Boolean? = null): WebGLContextAttributes = newJsObject<WebGLContextAttributes>().apply {
    if (alpha != null) this.alpha = alpha
    if (depth != null) this.depth = depth
    if (stencil != null) this.stencil = stencil
    if (antialias != null) this.antialias = antialias
    if (premultipliedAlpha != null) this.premultipliedAlpha = premultipliedAlpha
    if (preserveDrawingBuffer != null) this.preserveDrawingBuffer = preserveDrawingBuffer
    if (powerPreference != null) this.powerPreference = powerPreference
    if (failIfMajorPerformanceCaveat != null) this.failIfMajorPerformanceCaveat = failIfMajorPerformanceCaveat
    if (desynchronized != null) this.desynchronized = desynchronized
}

public external abstract class WebGLObject : JsAny {
    open var label: String
}

public external abstract class WebGLBuffer : WebGLObject

public external abstract class WebGLFramebuffer : WebGLObject

public external abstract class WebGLProgram : WebGLObject

public external abstract class WebGLRenderbuffer : WebGLObject

public external abstract class WebGLShader : WebGLObject

public external abstract class WebGLTexture : WebGLObject

public external abstract class WebGLUniformLocation : JsAny

public external abstract class WebGLActiveInfo : JsAny {
    open val size: Int
    open val type: Int
    open val name: String
}

public external abstract class WebGLShaderPrecisionFormat : JsAny {
    open val rangeMin: Int
    open val rangeMax: Int
    open val precision: Int
}

public external interface WebGLRenderingContextBase : JsAny {
    val canvas: UnionHTMLCanvasElementOrOffscreenCanvas
    val drawingBufferWidth: Int
    val drawingBufferHeight: Int
    val drawingBufferFormat: Int
    var drawingBufferColorSpace: PredefinedColorSpace
    var unpackColorSpace: PredefinedColorSpace
    fun getContextAttributes(): WebGLContextAttributes?
    fun isContextLost(): Boolean
    fun getSupportedExtensions(): JsArray<JsString>?
    fun getExtension(name: String): JsAny?
    fun drawingBufferStorage(sizedFormat: Int, width: Int, height: Int)
    fun activeTexture(texture: Int)
    fun attachShader(program: WebGLProgram, shader: WebGLShader)
    fun bindAttribLocation(program: WebGLProgram, index: Int, name: String)
    fun bindBuffer(target: Int, buffer: WebGLBuffer?)
    fun bindFramebuffer(target: Int, framebuffer: WebGLFramebuffer?)
    fun bindRenderbuffer(target: Int, renderbuffer: WebGLRenderbuffer?)
    fun bindTexture(target: Int, texture: WebGLTexture?)
    fun blendColor(red: Float, green: Float, blue: Float, alpha: Float)
    fun blendEquation(mode: Int)
    fun blendEquationSeparate(modeRGB: Int, modeAlpha: Int)
    fun blendFunc(sfactor: Int, dfactor: Int)
    fun blendFuncSeparate(srcRGB: Int, dstRGB: Int, srcAlpha: Int, dstAlpha: Int)
    fun checkFramebufferStatus(target: Int): Int
    fun clear(mask: Int)
    fun clearColor(red: Float, green: Float, blue: Float, alpha: Float)
    fun clearDepth(depth: Float)
    fun clearStencil(s: Int)
    fun colorMask(red: Boolean, green: Boolean, blue: Boolean, alpha: Boolean)
    fun compileShader(shader: WebGLShader)
    fun copyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int)
    fun copyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int)
    fun createBuffer(): WebGLBuffer
    fun createFramebuffer(): WebGLFramebuffer
    fun createProgram(): WebGLProgram
    fun createRenderbuffer(): WebGLRenderbuffer
    fun createShader(type: Int): WebGLShader?
    fun createTexture(): WebGLTexture
    fun cullFace(mode: Int)
    fun deleteBuffer(buffer: WebGLBuffer?)
    fun deleteFramebuffer(framebuffer: WebGLFramebuffer?)
    fun deleteProgram(program: WebGLProgram?)
    fun deleteRenderbuffer(renderbuffer: WebGLRenderbuffer?)
    fun deleteShader(shader: WebGLShader?)
    fun deleteTexture(texture: WebGLTexture?)
    fun depthFunc(func: Int)
    fun depthMask(flag: Boolean)
    fun depthRange(zNear: Float, zFar: Float)
    fun detachShader(program: WebGLProgram, shader: WebGLShader)
    fun disable(cap: Int)
    fun disableVertexAttribArray(index: Int)
    fun drawArrays(mode: Int, first: Int, count: Int)
    fun drawElements(mode: Int, count: Int, type: Int, offset: Double)
    fun enable(cap: Int)
    fun enableVertexAttribArray(index: Int)
    fun finish()
    fun flush()
    fun framebufferRenderbuffer(target: Int, attachment: Int, renderbuffertarget: Int, renderbuffer: WebGLRenderbuffer?)
    fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: WebGLTexture?, level: Int)
    fun frontFace(mode: Int)
    fun generateMipmap(target: Int)
    fun getActiveAttrib(program: WebGLProgram, index: Int): WebGLActiveInfo?
    fun getActiveUniform(program: WebGLProgram, index: Int): WebGLActiveInfo?
    fun getAttachedShaders(program: WebGLProgram): JsArray<WebGLShader>?
    fun getAttribLocation(program: WebGLProgram, name: String): Int
    fun getBufferParameter(target: Int, pname: Int): JsAny?
    fun getParameter(pname: Int): JsAny?
    fun getError(): Int
    fun getFramebufferAttachmentParameter(target: Int, attachment: Int, pname: Int): JsAny?
    fun getProgramParameter(program: WebGLProgram, pname: Int): JsAny?
    fun getProgramInfoLog(program: WebGLProgram): String?
    fun getRenderbufferParameter(target: Int, pname: Int): JsAny?
    fun getShaderParameter(shader: WebGLShader, pname: Int): JsAny?
    fun getShaderPrecisionFormat(shadertype: Int, precisiontype: Int): WebGLShaderPrecisionFormat?
    fun getShaderInfoLog(shader: WebGLShader): String?
    fun getShaderSource(shader: WebGLShader): String?
    fun getTexParameter(target: Int, pname: Int): JsAny?
    fun getUniform(program: WebGLProgram, location: WebGLUniformLocation): JsAny?
    fun getUniformLocation(program: WebGLProgram, name: String): WebGLUniformLocation?
    fun getVertexAttrib(index: Int, pname: Int): JsAny?
    fun getVertexAttribOffset(index: Int, pname: Int): Double
    fun hint(target: Int, mode: Int)
    fun isBuffer(buffer: WebGLBuffer?): Boolean
    fun isEnabled(cap: Int): Boolean
    fun isFramebuffer(framebuffer: WebGLFramebuffer?): Boolean
    fun isProgram(program: WebGLProgram?): Boolean
    fun isRenderbuffer(renderbuffer: WebGLRenderbuffer?): Boolean
    fun isShader(shader: WebGLShader?): Boolean
    fun isTexture(texture: WebGLTexture?): Boolean
    fun lineWidth(width: Float)
    fun linkProgram(program: WebGLProgram)
    fun pixelStorei(pname: Int, param: Int)
    fun polygonOffset(factor: Float, units: Float)
    fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int)
    fun sampleCoverage(value: Float, invert: Boolean)
    fun scissor(x: Int, y: Int, width: Int, height: Int)
    fun shaderSource(shader: WebGLShader, source: String)
    fun stencilFunc(func: Int, ref: Int, mask: Int)
    fun stencilFuncSeparate(face: Int, func: Int, ref: Int, mask: Int)
    fun stencilMask(mask: Int)
    fun stencilMaskSeparate(face: Int, mask: Int)
    fun stencilOp(fail: Int, zfail: Int, zpass: Int)
    fun stencilOpSeparate(face: Int, fail: Int, zfail: Int, zpass: Int)
    fun texParameterf(target: Int, pname: Int, param: Float)
    fun texParameteri(target: Int, pname: Int, param: Int)
    fun uniform1f(location: WebGLUniformLocation?, x: Float)
    fun uniform2f(location: WebGLUniformLocation?, x: Float, y: Float)
    fun uniform3f(location: WebGLUniformLocation?, x: Float, y: Float, z: Float)
    fun uniform4f(location: WebGLUniformLocation?, x: Float, y: Float, z: Float, w: Float)
    fun uniform1i(location: WebGLUniformLocation?, x: Int)
    fun uniform2i(location: WebGLUniformLocation?, x: Int, y: Int)
    fun uniform3i(location: WebGLUniformLocation?, x: Int, y: Int, z: Int)
    fun uniform4i(location: WebGLUniformLocation?, x: Int, y: Int, z: Int, w: Int)
    fun useProgram(program: WebGLProgram?)
    fun validateProgram(program: WebGLProgram)
    fun vertexAttrib1f(index: Int, x: Float)
    fun vertexAttrib2f(index: Int, x: Float, y: Float)
    fun vertexAttrib3f(index: Int, x: Float, y: Float, z: Float)
    fun vertexAttrib4f(index: Int, x: Float, y: Float, z: Float, w: Float)
    fun vertexAttrib1fv(index: Int, values: Float32Array)
    fun vertexAttrib1fv(index: Int, values: JsArray<JsNumber>)
    fun vertexAttrib2fv(index: Int, values: Float32Array)
    fun vertexAttrib2fv(index: Int, values: JsArray<JsNumber>)
    fun vertexAttrib3fv(index: Int, values: Float32Array)
    fun vertexAttrib3fv(index: Int, values: JsArray<JsNumber>)
    fun vertexAttrib4fv(index: Int, values: Float32Array)
    fun vertexAttrib4fv(index: Int, values: JsArray<JsNumber>)
    fun vertexAttribPointer(index: Int, size: Int, type: Int, normalized: Boolean, stride: Int, offset: Double)
    fun viewport(x: Int, y: Int, width: Int, height: Int)

    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val WebGLRenderingContextBase.Companion.DEPTH_BUFFER_BIT: Int get() = 0x00000100
public inline val WebGLRenderingContextBase.Companion.STENCIL_BUFFER_BIT: Int get() = 0x00000400
public inline val WebGLRenderingContextBase.Companion.COLOR_BUFFER_BIT: Int get() = 0x00004000
public inline val WebGLRenderingContextBase.Companion.POINTS: Int get() = 0x0000
public inline val WebGLRenderingContextBase.Companion.LINES: Int get() = 0x0001
public inline val WebGLRenderingContextBase.Companion.LINE_LOOP: Int get() = 0x0002
public inline val WebGLRenderingContextBase.Companion.LINE_STRIP: Int get() = 0x0003
public inline val WebGLRenderingContextBase.Companion.TRIANGLES: Int get() = 0x0004
public inline val WebGLRenderingContextBase.Companion.TRIANGLE_STRIP: Int get() = 0x0005
public inline val WebGLRenderingContextBase.Companion.TRIANGLE_FAN: Int get() = 0x0006
public inline val WebGLRenderingContextBase.Companion.ZERO: Int get() = 0
public inline val WebGLRenderingContextBase.Companion.ONE: Int get() = 1
public inline val WebGLRenderingContextBase.Companion.SRC_COLOR: Int get() = 0x0300
public inline val WebGLRenderingContextBase.Companion.ONE_MINUS_SRC_COLOR: Int get() = 0x0301
public inline val WebGLRenderingContextBase.Companion.SRC_ALPHA: Int get() = 0x0302
public inline val WebGLRenderingContextBase.Companion.ONE_MINUS_SRC_ALPHA: Int get() = 0x0303
public inline val WebGLRenderingContextBase.Companion.DST_ALPHA: Int get() = 0x0304
public inline val WebGLRenderingContextBase.Companion.ONE_MINUS_DST_ALPHA: Int get() = 0x0305
public inline val WebGLRenderingContextBase.Companion.DST_COLOR: Int get() = 0x0306
public inline val WebGLRenderingContextBase.Companion.ONE_MINUS_DST_COLOR: Int get() = 0x0307
public inline val WebGLRenderingContextBase.Companion.SRC_ALPHA_SATURATE: Int get() = 0x0308
public inline val WebGLRenderingContextBase.Companion.FUNC_ADD: Int get() = 0x8006
public inline val WebGLRenderingContextBase.Companion.BLEND_EQUATION: Int get() = 0x8009
public inline val WebGLRenderingContextBase.Companion.BLEND_EQUATION_RGB: Int get() = 0x8009
public inline val WebGLRenderingContextBase.Companion.BLEND_EQUATION_ALPHA: Int get() = 0x883D
public inline val WebGLRenderingContextBase.Companion.FUNC_SUBTRACT: Int get() = 0x800A
public inline val WebGLRenderingContextBase.Companion.FUNC_REVERSE_SUBTRACT: Int get() = 0x800B
public inline val WebGLRenderingContextBase.Companion.BLEND_DST_RGB: Int get() = 0x80C8
public inline val WebGLRenderingContextBase.Companion.BLEND_SRC_RGB: Int get() = 0x80C9
public inline val WebGLRenderingContextBase.Companion.BLEND_DST_ALPHA: Int get() = 0x80CA
public inline val WebGLRenderingContextBase.Companion.BLEND_SRC_ALPHA: Int get() = 0x80CB
public inline val WebGLRenderingContextBase.Companion.CONSTANT_COLOR: Int get() = 0x8001
public inline val WebGLRenderingContextBase.Companion.ONE_MINUS_CONSTANT_COLOR: Int get() = 0x8002
public inline val WebGLRenderingContextBase.Companion.CONSTANT_ALPHA: Int get() = 0x8003
public inline val WebGLRenderingContextBase.Companion.ONE_MINUS_CONSTANT_ALPHA: Int get() = 0x8004
public inline val WebGLRenderingContextBase.Companion.BLEND_COLOR: Int get() = 0x8005
public inline val WebGLRenderingContextBase.Companion.ARRAY_BUFFER: Int get() = 0x8892
public inline val WebGLRenderingContextBase.Companion.ELEMENT_ARRAY_BUFFER: Int get() = 0x8893
public inline val WebGLRenderingContextBase.Companion.ARRAY_BUFFER_BINDING: Int get() = 0x8894
public inline val WebGLRenderingContextBase.Companion.ELEMENT_ARRAY_BUFFER_BINDING: Int get() = 0x8895
public inline val WebGLRenderingContextBase.Companion.STREAM_DRAW: Int get() = 0x88E0
public inline val WebGLRenderingContextBase.Companion.STATIC_DRAW: Int get() = 0x88E4
public inline val WebGLRenderingContextBase.Companion.DYNAMIC_DRAW: Int get() = 0x88E8
public inline val WebGLRenderingContextBase.Companion.BUFFER_SIZE: Int get() = 0x8764
public inline val WebGLRenderingContextBase.Companion.BUFFER_USAGE: Int get() = 0x8765
public inline val WebGLRenderingContextBase.Companion.CURRENT_VERTEX_ATTRIB: Int get() = 0x8626
public inline val WebGLRenderingContextBase.Companion.FRONT: Int get() = 0x0404
public inline val WebGLRenderingContextBase.Companion.BACK: Int get() = 0x0405
public inline val WebGLRenderingContextBase.Companion.FRONT_AND_BACK: Int get() = 0x0408
public inline val WebGLRenderingContextBase.Companion.CULL_FACE: Int get() = 0x0B44
public inline val WebGLRenderingContextBase.Companion.BLEND: Int get() = 0x0BE2
public inline val WebGLRenderingContextBase.Companion.DITHER: Int get() = 0x0BD0
public inline val WebGLRenderingContextBase.Companion.STENCIL_TEST: Int get() = 0x0B90
public inline val WebGLRenderingContextBase.Companion.DEPTH_TEST: Int get() = 0x0B71
public inline val WebGLRenderingContextBase.Companion.SCISSOR_TEST: Int get() = 0x0C11
public inline val WebGLRenderingContextBase.Companion.POLYGON_OFFSET_FILL: Int get() = 0x8037
public inline val WebGLRenderingContextBase.Companion.SAMPLE_ALPHA_TO_COVERAGE: Int get() = 0x809E
public inline val WebGLRenderingContextBase.Companion.SAMPLE_COVERAGE: Int get() = 0x80A0
public inline val WebGLRenderingContextBase.Companion.NO_ERROR: Int get() = 0
public inline val WebGLRenderingContextBase.Companion.INVALID_ENUM: Int get() = 0x0500
public inline val WebGLRenderingContextBase.Companion.INVALID_VALUE: Int get() = 0x0501
public inline val WebGLRenderingContextBase.Companion.INVALID_OPERATION: Int get() = 0x0502
public inline val WebGLRenderingContextBase.Companion.OUT_OF_MEMORY: Int get() = 0x0505
public inline val WebGLRenderingContextBase.Companion.CW: Int get() = 0x0900
public inline val WebGLRenderingContextBase.Companion.CCW: Int get() = 0x0901
public inline val WebGLRenderingContextBase.Companion.LINE_WIDTH: Int get() = 0x0B21
public inline val WebGLRenderingContextBase.Companion.ALIASED_POINT_SIZE_RANGE: Int get() = 0x846D
public inline val WebGLRenderingContextBase.Companion.ALIASED_LINE_WIDTH_RANGE: Int get() = 0x846E
public inline val WebGLRenderingContextBase.Companion.CULL_FACE_MODE: Int get() = 0x0B45
public inline val WebGLRenderingContextBase.Companion.FRONT_FACE: Int get() = 0x0B46
public inline val WebGLRenderingContextBase.Companion.DEPTH_RANGE: Int get() = 0x0B70
public inline val WebGLRenderingContextBase.Companion.DEPTH_WRITEMASK: Int get() = 0x0B72
public inline val WebGLRenderingContextBase.Companion.DEPTH_CLEAR_VALUE: Int get() = 0x0B73
public inline val WebGLRenderingContextBase.Companion.DEPTH_FUNC: Int get() = 0x0B74
public inline val WebGLRenderingContextBase.Companion.STENCIL_CLEAR_VALUE: Int get() = 0x0B91
public inline val WebGLRenderingContextBase.Companion.STENCIL_FUNC: Int get() = 0x0B92
public inline val WebGLRenderingContextBase.Companion.STENCIL_FAIL: Int get() = 0x0B94
public inline val WebGLRenderingContextBase.Companion.STENCIL_PASS_DEPTH_FAIL: Int get() = 0x0B95
public inline val WebGLRenderingContextBase.Companion.STENCIL_PASS_DEPTH_PASS: Int get() = 0x0B96
public inline val WebGLRenderingContextBase.Companion.STENCIL_REF: Int get() = 0x0B97
public inline val WebGLRenderingContextBase.Companion.STENCIL_VALUE_MASK: Int get() = 0x0B93
public inline val WebGLRenderingContextBase.Companion.STENCIL_WRITEMASK: Int get() = 0x0B98
public inline val WebGLRenderingContextBase.Companion.STENCIL_BACK_FUNC: Int get() = 0x8800
public inline val WebGLRenderingContextBase.Companion.STENCIL_BACK_FAIL: Int get() = 0x8801
public inline val WebGLRenderingContextBase.Companion.STENCIL_BACK_PASS_DEPTH_FAIL: Int get() = 0x8802
public inline val WebGLRenderingContextBase.Companion.STENCIL_BACK_PASS_DEPTH_PASS: Int get() = 0x8803
public inline val WebGLRenderingContextBase.Companion.STENCIL_BACK_REF: Int get() = 0x8CA3
public inline val WebGLRenderingContextBase.Companion.STENCIL_BACK_VALUE_MASK: Int get() = 0x8CA4
public inline val WebGLRenderingContextBase.Companion.STENCIL_BACK_WRITEMASK: Int get() = 0x8CA5
public inline val WebGLRenderingContextBase.Companion.VIEWPORT: Int get() = 0x0BA2
public inline val WebGLRenderingContextBase.Companion.SCISSOR_BOX: Int get() = 0x0C10
public inline val WebGLRenderingContextBase.Companion.COLOR_CLEAR_VALUE: Int get() = 0x0C22
public inline val WebGLRenderingContextBase.Companion.COLOR_WRITEMASK: Int get() = 0x0C23
public inline val WebGLRenderingContextBase.Companion.UNPACK_ALIGNMENT: Int get() = 0x0CF5
public inline val WebGLRenderingContextBase.Companion.PACK_ALIGNMENT: Int get() = 0x0D05
public inline val WebGLRenderingContextBase.Companion.MAX_TEXTURE_SIZE: Int get() = 0x0D33
public inline val WebGLRenderingContextBase.Companion.MAX_VIEWPORT_DIMS: Int get() = 0x0D3A
public inline val WebGLRenderingContextBase.Companion.SUBPIXEL_BITS: Int get() = 0x0D50
public inline val WebGLRenderingContextBase.Companion.RED_BITS: Int get() = 0x0D52
public inline val WebGLRenderingContextBase.Companion.GREEN_BITS: Int get() = 0x0D53
public inline val WebGLRenderingContextBase.Companion.BLUE_BITS: Int get() = 0x0D54
public inline val WebGLRenderingContextBase.Companion.ALPHA_BITS: Int get() = 0x0D55
public inline val WebGLRenderingContextBase.Companion.DEPTH_BITS: Int get() = 0x0D56
public inline val WebGLRenderingContextBase.Companion.STENCIL_BITS: Int get() = 0x0D57
public inline val WebGLRenderingContextBase.Companion.POLYGON_OFFSET_UNITS: Int get() = 0x2A00
public inline val WebGLRenderingContextBase.Companion.POLYGON_OFFSET_FACTOR: Int get() = 0x8038
public inline val WebGLRenderingContextBase.Companion.TEXTURE_BINDING_2D: Int get() = 0x8069
public inline val WebGLRenderingContextBase.Companion.SAMPLE_BUFFERS: Int get() = 0x80A8
public inline val WebGLRenderingContextBase.Companion.SAMPLES: Int get() = 0x80A9
public inline val WebGLRenderingContextBase.Companion.SAMPLE_COVERAGE_VALUE: Int get() = 0x80AA
public inline val WebGLRenderingContextBase.Companion.SAMPLE_COVERAGE_INVERT: Int get() = 0x80AB
public inline val WebGLRenderingContextBase.Companion.COMPRESSED_TEXTURE_FORMATS: Int get() = 0x86A3
public inline val WebGLRenderingContextBase.Companion.DONT_CARE: Int get() = 0x1100
public inline val WebGLRenderingContextBase.Companion.FASTEST: Int get() = 0x1101
public inline val WebGLRenderingContextBase.Companion.NICEST: Int get() = 0x1102
public inline val WebGLRenderingContextBase.Companion.GENERATE_MIPMAP_HINT: Int get() = 0x8192
public inline val WebGLRenderingContextBase.Companion.BYTE: Int get() = 0x1400
public inline val WebGLRenderingContextBase.Companion.UNSIGNED_BYTE: Int get() = 0x1401
public inline val WebGLRenderingContextBase.Companion.SHORT: Int get() = 0x1402
public inline val WebGLRenderingContextBase.Companion.UNSIGNED_SHORT: Int get() = 0x1403
public inline val WebGLRenderingContextBase.Companion.INT: Int get() = 0x1404
public inline val WebGLRenderingContextBase.Companion.UNSIGNED_INT: Int get() = 0x1405
public inline val WebGLRenderingContextBase.Companion.FLOAT: Int get() = 0x1406
public inline val WebGLRenderingContextBase.Companion.DEPTH_COMPONENT: Int get() = 0x1902
public inline val WebGLRenderingContextBase.Companion.ALPHA: Int get() = 0x1906
public inline val WebGLRenderingContextBase.Companion.RGB: Int get() = 0x1907
public inline val WebGLRenderingContextBase.Companion.RGBA: Int get() = 0x1908
public inline val WebGLRenderingContextBase.Companion.LUMINANCE: Int get() = 0x1909
public inline val WebGLRenderingContextBase.Companion.LUMINANCE_ALPHA: Int get() = 0x190A
public inline val WebGLRenderingContextBase.Companion.UNSIGNED_SHORT_4_4_4_4: Int get() = 0x8033
public inline val WebGLRenderingContextBase.Companion.UNSIGNED_SHORT_5_5_5_1: Int get() = 0x8034
public inline val WebGLRenderingContextBase.Companion.UNSIGNED_SHORT_5_6_5: Int get() = 0x8363
public inline val WebGLRenderingContextBase.Companion.FRAGMENT_SHADER: Int get() = 0x8B30
public inline val WebGLRenderingContextBase.Companion.VERTEX_SHADER: Int get() = 0x8B31
public inline val WebGLRenderingContextBase.Companion.MAX_VERTEX_ATTRIBS: Int get() = 0x8869
public inline val WebGLRenderingContextBase.Companion.MAX_VERTEX_UNIFORM_VECTORS: Int get() = 0x8DFB
public inline val WebGLRenderingContextBase.Companion.MAX_VARYING_VECTORS: Int get() = 0x8DFC
public inline val WebGLRenderingContextBase.Companion.MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int get() = 0x8B4D
public inline val WebGLRenderingContextBase.Companion.MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int get() = 0x8B4C
public inline val WebGLRenderingContextBase.Companion.MAX_TEXTURE_IMAGE_UNITS: Int get() = 0x8872
public inline val WebGLRenderingContextBase.Companion.MAX_FRAGMENT_UNIFORM_VECTORS: Int get() = 0x8DFD
public inline val WebGLRenderingContextBase.Companion.SHADER_TYPE: Int get() = 0x8B4F
public inline val WebGLRenderingContextBase.Companion.DELETE_STATUS: Int get() = 0x8B80
public inline val WebGLRenderingContextBase.Companion.LINK_STATUS: Int get() = 0x8B82
public inline val WebGLRenderingContextBase.Companion.VALIDATE_STATUS: Int get() = 0x8B83
public inline val WebGLRenderingContextBase.Companion.ATTACHED_SHADERS: Int get() = 0x8B85
public inline val WebGLRenderingContextBase.Companion.ACTIVE_UNIFORMS: Int get() = 0x8B86
public inline val WebGLRenderingContextBase.Companion.ACTIVE_ATTRIBUTES: Int get() = 0x8B89
public inline val WebGLRenderingContextBase.Companion.SHADING_LANGUAGE_VERSION: Int get() = 0x8B8C
public inline val WebGLRenderingContextBase.Companion.CURRENT_PROGRAM: Int get() = 0x8B8D
public inline val WebGLRenderingContextBase.Companion.NEVER: Int get() = 0x0200
public inline val WebGLRenderingContextBase.Companion.LESS: Int get() = 0x0201
public inline val WebGLRenderingContextBase.Companion.EQUAL: Int get() = 0x0202
public inline val WebGLRenderingContextBase.Companion.LEQUAL: Int get() = 0x0203
public inline val WebGLRenderingContextBase.Companion.GREATER: Int get() = 0x0204
public inline val WebGLRenderingContextBase.Companion.NOTEQUAL: Int get() = 0x0205
public inline val WebGLRenderingContextBase.Companion.GEQUAL: Int get() = 0x0206
public inline val WebGLRenderingContextBase.Companion.ALWAYS: Int get() = 0x0207
public inline val WebGLRenderingContextBase.Companion.KEEP: Int get() = 0x1E00
public inline val WebGLRenderingContextBase.Companion.REPLACE: Int get() = 0x1E01
public inline val WebGLRenderingContextBase.Companion.INCR: Int get() = 0x1E02
public inline val WebGLRenderingContextBase.Companion.DECR: Int get() = 0x1E03
public inline val WebGLRenderingContextBase.Companion.INVERT: Int get() = 0x150A
public inline val WebGLRenderingContextBase.Companion.INCR_WRAP: Int get() = 0x8507
public inline val WebGLRenderingContextBase.Companion.DECR_WRAP: Int get() = 0x8508
public inline val WebGLRenderingContextBase.Companion.VENDOR: Int get() = 0x1F00
public inline val WebGLRenderingContextBase.Companion.RENDERER: Int get() = 0x1F01
public inline val WebGLRenderingContextBase.Companion.VERSION: Int get() = 0x1F02
public inline val WebGLRenderingContextBase.Companion.NEAREST: Int get() = 0x2600
public inline val WebGLRenderingContextBase.Companion.LINEAR: Int get() = 0x2601
public inline val WebGLRenderingContextBase.Companion.NEAREST_MIPMAP_NEAREST: Int get() = 0x2700
public inline val WebGLRenderingContextBase.Companion.LINEAR_MIPMAP_NEAREST: Int get() = 0x2701
public inline val WebGLRenderingContextBase.Companion.NEAREST_MIPMAP_LINEAR: Int get() = 0x2702
public inline val WebGLRenderingContextBase.Companion.LINEAR_MIPMAP_LINEAR: Int get() = 0x2703
public inline val WebGLRenderingContextBase.Companion.TEXTURE_MAG_FILTER: Int get() = 0x2800
public inline val WebGLRenderingContextBase.Companion.TEXTURE_MIN_FILTER: Int get() = 0x2801
public inline val WebGLRenderingContextBase.Companion.TEXTURE_WRAP_S: Int get() = 0x2802
public inline val WebGLRenderingContextBase.Companion.TEXTURE_WRAP_T: Int get() = 0x2803
public inline val WebGLRenderingContextBase.Companion.TEXTURE_2D: Int get() = 0x0DE1
public inline val WebGLRenderingContextBase.Companion.TEXTURE: Int get() = 0x1702
public inline val WebGLRenderingContextBase.Companion.TEXTURE_CUBE_MAP: Int get() = 0x8513
public inline val WebGLRenderingContextBase.Companion.TEXTURE_BINDING_CUBE_MAP: Int get() = 0x8514
public inline val WebGLRenderingContextBase.Companion.TEXTURE_CUBE_MAP_POSITIVE_X: Int get() = 0x8515
public inline val WebGLRenderingContextBase.Companion.TEXTURE_CUBE_MAP_NEGATIVE_X: Int get() = 0x8516
public inline val WebGLRenderingContextBase.Companion.TEXTURE_CUBE_MAP_POSITIVE_Y: Int get() = 0x8517
public inline val WebGLRenderingContextBase.Companion.TEXTURE_CUBE_MAP_NEGATIVE_Y: Int get() = 0x8518
public inline val WebGLRenderingContextBase.Companion.TEXTURE_CUBE_MAP_POSITIVE_Z: Int get() = 0x8519
public inline val WebGLRenderingContextBase.Companion.TEXTURE_CUBE_MAP_NEGATIVE_Z: Int get() = 0x851A
public inline val WebGLRenderingContextBase.Companion.MAX_CUBE_MAP_TEXTURE_SIZE: Int get() = 0x851C
public inline val WebGLRenderingContextBase.Companion.TEXTURE0: Int get() = 0x84C0
public inline val WebGLRenderingContextBase.Companion.TEXTURE1: Int get() = 0x84C1
public inline val WebGLRenderingContextBase.Companion.TEXTURE2: Int get() = 0x84C2
public inline val WebGLRenderingContextBase.Companion.TEXTURE3: Int get() = 0x84C3
public inline val WebGLRenderingContextBase.Companion.TEXTURE4: Int get() = 0x84C4
public inline val WebGLRenderingContextBase.Companion.TEXTURE5: Int get() = 0x84C5
public inline val WebGLRenderingContextBase.Companion.TEXTURE6: Int get() = 0x84C6
public inline val WebGLRenderingContextBase.Companion.TEXTURE7: Int get() = 0x84C7
public inline val WebGLRenderingContextBase.Companion.TEXTURE8: Int get() = 0x84C8
public inline val WebGLRenderingContextBase.Companion.TEXTURE9: Int get() = 0x84C9
public inline val WebGLRenderingContextBase.Companion.TEXTURE10: Int get() = 0x84CA
public inline val WebGLRenderingContextBase.Companion.TEXTURE11: Int get() = 0x84CB
public inline val WebGLRenderingContextBase.Companion.TEXTURE12: Int get() = 0x84CC
public inline val WebGLRenderingContextBase.Companion.TEXTURE13: Int get() = 0x84CD
public inline val WebGLRenderingContextBase.Companion.TEXTURE14: Int get() = 0x84CE
public inline val WebGLRenderingContextBase.Companion.TEXTURE15: Int get() = 0x84CF
public inline val WebGLRenderingContextBase.Companion.TEXTURE16: Int get() = 0x84D0
public inline val WebGLRenderingContextBase.Companion.TEXTURE17: Int get() = 0x84D1
public inline val WebGLRenderingContextBase.Companion.TEXTURE18: Int get() = 0x84D2
public inline val WebGLRenderingContextBase.Companion.TEXTURE19: Int get() = 0x84D3
public inline val WebGLRenderingContextBase.Companion.TEXTURE20: Int get() = 0x84D4
public inline val WebGLRenderingContextBase.Companion.TEXTURE21: Int get() = 0x84D5
public inline val WebGLRenderingContextBase.Companion.TEXTURE22: Int get() = 0x84D6
public inline val WebGLRenderingContextBase.Companion.TEXTURE23: Int get() = 0x84D7
public inline val WebGLRenderingContextBase.Companion.TEXTURE24: Int get() = 0x84D8
public inline val WebGLRenderingContextBase.Companion.TEXTURE25: Int get() = 0x84D9
public inline val WebGLRenderingContextBase.Companion.TEXTURE26: Int get() = 0x84DA
public inline val WebGLRenderingContextBase.Companion.TEXTURE27: Int get() = 0x84DB
public inline val WebGLRenderingContextBase.Companion.TEXTURE28: Int get() = 0x84DC
public inline val WebGLRenderingContextBase.Companion.TEXTURE29: Int get() = 0x84DD
public inline val WebGLRenderingContextBase.Companion.TEXTURE30: Int get() = 0x84DE
public inline val WebGLRenderingContextBase.Companion.TEXTURE31: Int get() = 0x84DF
public inline val WebGLRenderingContextBase.Companion.ACTIVE_TEXTURE: Int get() = 0x84E0
public inline val WebGLRenderingContextBase.Companion.REPEAT: Int get() = 0x2901
public inline val WebGLRenderingContextBase.Companion.CLAMP_TO_EDGE: Int get() = 0x812F
public inline val WebGLRenderingContextBase.Companion.MIRRORED_REPEAT: Int get() = 0x8370
public inline val WebGLRenderingContextBase.Companion.FLOAT_VEC2: Int get() = 0x8B50
public inline val WebGLRenderingContextBase.Companion.FLOAT_VEC3: Int get() = 0x8B51
public inline val WebGLRenderingContextBase.Companion.FLOAT_VEC4: Int get() = 0x8B52
public inline val WebGLRenderingContextBase.Companion.INT_VEC2: Int get() = 0x8B53
public inline val WebGLRenderingContextBase.Companion.INT_VEC3: Int get() = 0x8B54
public inline val WebGLRenderingContextBase.Companion.INT_VEC4: Int get() = 0x8B55
public inline val WebGLRenderingContextBase.Companion.BOOL: Int get() = 0x8B56
public inline val WebGLRenderingContextBase.Companion.BOOL_VEC2: Int get() = 0x8B57
public inline val WebGLRenderingContextBase.Companion.BOOL_VEC3: Int get() = 0x8B58
public inline val WebGLRenderingContextBase.Companion.BOOL_VEC4: Int get() = 0x8B59
public inline val WebGLRenderingContextBase.Companion.FLOAT_MAT2: Int get() = 0x8B5A
public inline val WebGLRenderingContextBase.Companion.FLOAT_MAT3: Int get() = 0x8B5B
public inline val WebGLRenderingContextBase.Companion.FLOAT_MAT4: Int get() = 0x8B5C
public inline val WebGLRenderingContextBase.Companion.SAMPLER_2D: Int get() = 0x8B5E
public inline val WebGLRenderingContextBase.Companion.SAMPLER_CUBE: Int get() = 0x8B60
public inline val WebGLRenderingContextBase.Companion.VERTEX_ATTRIB_ARRAY_ENABLED: Int get() = 0x8622
public inline val WebGLRenderingContextBase.Companion.VERTEX_ATTRIB_ARRAY_SIZE: Int get() = 0x8623
public inline val WebGLRenderingContextBase.Companion.VERTEX_ATTRIB_ARRAY_STRIDE: Int get() = 0x8624
public inline val WebGLRenderingContextBase.Companion.VERTEX_ATTRIB_ARRAY_TYPE: Int get() = 0x8625
public inline val WebGLRenderingContextBase.Companion.VERTEX_ATTRIB_ARRAY_NORMALIZED: Int get() = 0x886A
public inline val WebGLRenderingContextBase.Companion.VERTEX_ATTRIB_ARRAY_POINTER: Int get() = 0x8645
public inline val WebGLRenderingContextBase.Companion.VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int get() = 0x889F
public inline val WebGLRenderingContextBase.Companion.IMPLEMENTATION_COLOR_READ_TYPE: Int get() = 0x8B9A
public inline val WebGLRenderingContextBase.Companion.IMPLEMENTATION_COLOR_READ_FORMAT: Int get() = 0x8B9B
public inline val WebGLRenderingContextBase.Companion.COMPILE_STATUS: Int get() = 0x8B81
public inline val WebGLRenderingContextBase.Companion.LOW_FLOAT: Int get() = 0x8DF0
public inline val WebGLRenderingContextBase.Companion.MEDIUM_FLOAT: Int get() = 0x8DF1
public inline val WebGLRenderingContextBase.Companion.HIGH_FLOAT: Int get() = 0x8DF2
public inline val WebGLRenderingContextBase.Companion.LOW_INT: Int get() = 0x8DF3
public inline val WebGLRenderingContextBase.Companion.MEDIUM_INT: Int get() = 0x8DF4
public inline val WebGLRenderingContextBase.Companion.HIGH_INT: Int get() = 0x8DF5
public inline val WebGLRenderingContextBase.Companion.FRAMEBUFFER: Int get() = 0x8D40
public inline val WebGLRenderingContextBase.Companion.RENDERBUFFER: Int get() = 0x8D41
public inline val WebGLRenderingContextBase.Companion.RGBA4: Int get() = 0x8056
public inline val WebGLRenderingContextBase.Companion.RGB5_A1: Int get() = 0x8057
public inline val WebGLRenderingContextBase.Companion.RGBA8: Int get() = 0x8058
public inline val WebGLRenderingContextBase.Companion.RGB565: Int get() = 0x8D62
public inline val WebGLRenderingContextBase.Companion.DEPTH_COMPONENT16: Int get() = 0x81A5
public inline val WebGLRenderingContextBase.Companion.STENCIL_INDEX8: Int get() = 0x8D48
public inline val WebGLRenderingContextBase.Companion.DEPTH_STENCIL: Int get() = 0x84F9
public inline val WebGLRenderingContextBase.Companion.RENDERBUFFER_WIDTH: Int get() = 0x8D42
public inline val WebGLRenderingContextBase.Companion.RENDERBUFFER_HEIGHT: Int get() = 0x8D43
public inline val WebGLRenderingContextBase.Companion.RENDERBUFFER_INTERNAL_FORMAT: Int get() = 0x8D44
public inline val WebGLRenderingContextBase.Companion.RENDERBUFFER_RED_SIZE: Int get() = 0x8D50
public inline val WebGLRenderingContextBase.Companion.RENDERBUFFER_GREEN_SIZE: Int get() = 0x8D51
public inline val WebGLRenderingContextBase.Companion.RENDERBUFFER_BLUE_SIZE: Int get() = 0x8D52
public inline val WebGLRenderingContextBase.Companion.RENDERBUFFER_ALPHA_SIZE: Int get() = 0x8D53
public inline val WebGLRenderingContextBase.Companion.RENDERBUFFER_DEPTH_SIZE: Int get() = 0x8D54
public inline val WebGLRenderingContextBase.Companion.RENDERBUFFER_STENCIL_SIZE: Int get() = 0x8D55
public inline val WebGLRenderingContextBase.Companion.FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int get() = 0x8CD0
public inline val WebGLRenderingContextBase.Companion.FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int get() = 0x8CD1
public inline val WebGLRenderingContextBase.Companion.FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int get() = 0x8CD2
public inline val WebGLRenderingContextBase.Companion.FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int get() = 0x8CD3
public inline val WebGLRenderingContextBase.Companion.COLOR_ATTACHMENT0: Int get() = 0x8CE0
public inline val WebGLRenderingContextBase.Companion.DEPTH_ATTACHMENT: Int get() = 0x8D00
public inline val WebGLRenderingContextBase.Companion.STENCIL_ATTACHMENT: Int get() = 0x8D20
public inline val WebGLRenderingContextBase.Companion.DEPTH_STENCIL_ATTACHMENT: Int get() = 0x821A
public inline val WebGLRenderingContextBase.Companion.NONE: Int get() = 0
public inline val WebGLRenderingContextBase.Companion.FRAMEBUFFER_COMPLETE: Int get() = 0x8CD5
public inline val WebGLRenderingContextBase.Companion.FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int get() = 0x8CD6
public inline val WebGLRenderingContextBase.Companion.FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int get() = 0x8CD7
public inline val WebGLRenderingContextBase.Companion.FRAMEBUFFER_INCOMPLETE_DIMENSIONS: Int get() = 0x8CD9
public inline val WebGLRenderingContextBase.Companion.FRAMEBUFFER_UNSUPPORTED: Int get() = 0x8CDD
public inline val WebGLRenderingContextBase.Companion.FRAMEBUFFER_BINDING: Int get() = 0x8CA6
public inline val WebGLRenderingContextBase.Companion.RENDERBUFFER_BINDING: Int get() = 0x8CA7
public inline val WebGLRenderingContextBase.Companion.MAX_RENDERBUFFER_SIZE: Int get() = 0x84E8
public inline val WebGLRenderingContextBase.Companion.INVALID_FRAMEBUFFER_OPERATION: Int get() = 0x0506
public inline val WebGLRenderingContextBase.Companion.UNPACK_FLIP_Y_WEBGL: Int get() = 0x9240
public inline val WebGLRenderingContextBase.Companion.UNPACK_PREMULTIPLY_ALPHA_WEBGL: Int get() = 0x9241
public inline val WebGLRenderingContextBase.Companion.CONTEXT_LOST_WEBGL: Int get() = 0x9242
public inline val WebGLRenderingContextBase.Companion.UNPACK_COLORSPACE_CONVERSION_WEBGL: Int get() = 0x9243
public inline val WebGLRenderingContextBase.Companion.BROWSER_DEFAULT_WEBGL: Int get() = 0x9244

public external interface WebGLRenderingContextOverloads : JsAny {
    fun bufferData(target: Int, size: Double, usage: Int)
    fun bufferData(target: Int, data: BufferDataSource?, usage: Int)
    fun bufferSubData(target: Int, offset: Double, data: BufferDataSource)
    fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, data: ArrayBufferView)
    fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, data: ArrayBufferView)
    fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?)
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: ArrayBufferView?)
    fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: TexImageSource)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: TexImageSource)
    fun uniform1fv(location: WebGLUniformLocation?, v: Float32Array)
    fun uniform1fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    fun uniform2fv(location: WebGLUniformLocation?, v: Float32Array)
    fun uniform2fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    fun uniform3fv(location: WebGLUniformLocation?, v: Float32Array)
    fun uniform3fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    fun uniform4fv(location: WebGLUniformLocation?, v: Float32Array)
    fun uniform4fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    fun uniform1iv(location: WebGLUniformLocation?, v: Int32Array)
    fun uniform1iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    fun uniform2iv(location: WebGLUniformLocation?, v: Int32Array)
    fun uniform2iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    fun uniform3iv(location: WebGLUniformLocation?, v: Int32Array)
    fun uniform3iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    fun uniform4iv(location: WebGLUniformLocation?, v: Int32Array)
    fun uniform4iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array)
    fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, value: JsArray<JsNumber>)
    fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array)
    fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, value: JsArray<JsNumber>)
    fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array)
    fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, value: JsArray<JsNumber>)
}

public external abstract class WebGLRenderingContext : WebGLRenderingContextBase, WebGLRenderingContextOverloads, RenderingContext, OffscreenRenderingContext {

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
    }
}

public external open class WebGLContextEvent : Event {
    constructor(type: String, eventInit: WebGLContextEventInit = definedExternally)
    open val statusMessage: String

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface WebGLContextEventInit : EventInit {
    var statusMessage: String?
}

public fun WebGLContextEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, statusMessage: String? = null): WebGLContextEventInit = newJsObject<WebGLContextEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (statusMessage != null) this.statusMessage = statusMessage
}
