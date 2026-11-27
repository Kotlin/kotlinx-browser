/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'webgl1', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.khronos.webgl

import kotlin.js.*
import kotlinx.browser.typedarrays.*
import org.w3c.dom.*

public external interface TexImageSource : ImageBitmapSource

public external interface WebGLPowerPreference : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val WebGLPowerPreference.Companion.DEFAULT: WebGLPowerPreference get() = "default".toJsString().unsafeCast<WebGLPowerPreference>()
public inline val WebGLPowerPreference.Companion.LOW_POWER: WebGLPowerPreference get() = "low-power".toJsString().unsafeCast<WebGLPowerPreference>()
public inline val WebGLPowerPreference.Companion.HIGH_PERFORMANCE: WebGLPowerPreference get() = "high-performance".toJsString().unsafeCast<WebGLPowerPreference>()

public external interface WebGLContextAttributes : JsAny {
    public var alpha: Boolean?
    public var depth: Boolean?
    public var stencil: Boolean?
    public var antialias: Boolean?
    public var premultipliedAlpha: Boolean?
    public var preserveDrawingBuffer: Boolean?
    public var powerPreference: WebGLPowerPreference?
    public var failIfMajorPerformanceCaveat: Boolean?
    public var desynchronized: Boolean?
}

public fun WebGLContextAttributes(alpha: Boolean? = null, depth: Boolean? = null, stencil: Boolean? = null, antialias: Boolean? = null, premultipliedAlpha: Boolean? = null, preserveDrawingBuffer: Boolean? = null, powerPreference: WebGLPowerPreference? = null, failIfMajorPerformanceCaveat: Boolean? = null, desynchronized: Boolean? = null): WebGLContextAttributes {
    val dictionary = newJsObject<WebGLContextAttributes>()
    if (alpha != null) dictionary.alpha = alpha
    if (depth != null) dictionary.depth = depth
    if (stencil != null) dictionary.stencil = stencil
    if (antialias != null) dictionary.antialias = antialias
    if (premultipliedAlpha != null) dictionary.premultipliedAlpha = premultipliedAlpha
    if (preserveDrawingBuffer != null) dictionary.preserveDrawingBuffer = preserveDrawingBuffer
    if (powerPreference != null) dictionary.powerPreference = powerPreference
    if (failIfMajorPerformanceCaveat != null) dictionary.failIfMajorPerformanceCaveat = failIfMajorPerformanceCaveat
    if (desynchronized != null) dictionary.desynchronized = desynchronized
    return dictionary
}

/**
 * The WebGLObject is part of the WebGL API and is the parent interface for all WebGL objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLObject)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class WebGLObject : JsAny {
    public open var label: String
}

/**
 * The WebGLBuffer interface is part of the WebGL API and represents an opaque buffer object storing data such as
 * vertices or colors.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLBuffer)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class WebGLBuffer : WebGLObject

/**
 * The WebGLFramebuffer interface is part of the WebGL API and represents a collection of buffers that serve as a
 * rendering destination.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLFramebuffer)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class WebGLFramebuffer : WebGLObject

/**
 * The WebGLProgram is part of the WebGL API and is a combination of two compiled WebGLShaders consisting of a vertex
 * shader and a fragment shader (both written in GLSL).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLProgram)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class WebGLProgram : WebGLObject

/**
 * The WebGLRenderbuffer interface is part of the WebGL API and represents a buffer that can contain an image, or that
 * can be a source or target of a rendering operation.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderbuffer)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class WebGLRenderbuffer : WebGLObject

/**
 * The WebGLShader is part of the WebGL API and can either be a vertex or a fragment shader. A WebGLProgram requires
 * both types of shaders.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLShader)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class WebGLShader : WebGLObject

/**
 * The WebGLTexture interface is part of the WebGL API and represents an opaque texture object providing storage and
 * state for texturing operations.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLTexture)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class WebGLTexture : WebGLObject

/**
 * The WebGLUniformLocation interface is part of the WebGL API and represents the location of a uniform variable in a
 * shader program.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLUniformLocation)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class WebGLUniformLocation : JsAny

/**
 * The WebGLActiveInfo interface is part of the WebGL API and represents the information returned by calling the
 * WebGLRenderingContext.getActiveAttrib() and WebGLRenderingContext.getActiveUniform() methods.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLActiveInfo)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class WebGLActiveInfo : JsAny {
    /**
     * The read-only WebGLActiveInfo.size property is a Number representing the size of the requested data returned by
     * calling the getActiveAttrib() or getActiveUniform() methods.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLActiveInfo/size)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val size: Int

    /**
     * The read-only WebGLActiveInfo.type property represents the type of the requested data returned by calling the
     * getActiveAttrib() or getActiveUniform() methods.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLActiveInfo/type)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val type: Int

    /**
     * The read-only WebGLActiveInfo.name property represents the name of the requested data returned by calling the
     * getActiveAttrib() or getActiveUniform() methods.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLActiveInfo/name)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val name: String
}

/**
 * The WebGLShaderPrecisionFormat interface is part of the WebGL API and represents the information returned by calling
 * the WebGLRenderingContext.getShaderPrecisionFormat() method.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLShaderPrecisionFormat)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class WebGLShaderPrecisionFormat : JsAny {
    /**
     * The read-only WebGLShaderPrecisionFormat.rangeMin property returns the base 2 log of the absolute value of the
     * minimum value that can be represented.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLShaderPrecisionFormat/rangeMin)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val rangeMin: Int

    /**
     * The read-only WebGLShaderPrecisionFormat.rangeMax property returns the base 2 log of the absolute value of the
     * maximum value that can be represented.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLShaderPrecisionFormat/rangeMax)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val rangeMax: Int

    /**
     * The read-only WebGLShaderPrecisionFormat.precision property returns the number of bits of precision that can be
     * represented.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLShaderPrecisionFormat/precision)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val precision: Int
}

public external interface WebGLRenderingContextBase : JsAny {
    /**
     * The WebGLRenderingContext.canvas property is a read-only reference to the HTMLCanvasElement or OffscreenCanvas
     * object that is associated with the context. It might be null if it is not associated with a &lt;canvas&gt;
     * element or an OffscreenCanvas object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/canvas)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public val canvas: UnionHTMLCanvasElementOrOffscreenCanvas

    /**
     * The read-only WebGLRenderingContext.drawingBufferWidth property represents the actual width of the current
     * drawing buffer. It should match the width attribute of the &lt;canvas&gt; element associated with this context,
     * but might differ if the implementation is not able to provide the requested width.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawingBufferWidth)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public val drawingBufferWidth: Int

    /**
     * The read-only WebGLRenderingContext.drawingBufferHeight property represents the actual height of the current
     * drawing buffer. It should match the height attribute of the &lt;canvas&gt; element associated with this context,
     * but might differ if the implementation is not able to provide the requested height.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawingBufferHeight)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public val drawingBufferHeight: Int
    public val drawingBufferFormat: Int

    /**
     * The WebGLRenderingContext.drawingBufferColorSpace property specifies the color space of the WebGL drawing buffer.
     * Along with the default (srgb), the display-p3 color space can be used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawingBufferColorSpace)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var drawingBufferColorSpace: PredefinedColorSpace

    /**
     * The WebGLRenderingContext.unpackColorSpace property specifies the color space to convert to when importing
     * textures. Along with the default (srgb), the display-p3 color space can be used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/unpackColorSpace)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var unpackColorSpace: PredefinedColorSpace

    /**
     * The WebGLRenderingContext.getContextAttributes() method returns a WebGLContextAttributes object that contains the
     * actual context parameters. Might return null, if the context is lost.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getContextAttributes)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getContextAttributes(): WebGLContextAttributes?

    /**
     * The WebGLRenderingContext.isContextLost() method returns a boolean value indicating whether or not the WebGL
     * context has been lost and must be re-established before rendering can resume.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isContextLost)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun isContextLost(): Boolean

    /**
     * The WebGLRenderingContext.getSupportedExtensions() method returns a list of all the supported WebGL extensions.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getSupportedExtensions)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getSupportedExtensions(): JsArray<JsString>?

    /**
     * The WebGLRenderingContext.getExtension() method enables a WebGL extension.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getExtension)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getExtension(name: String): JsAny?
    public fun drawingBufferStorage(sizedFormat: Int, width: Int, height: Int)

    /**
     * The WebGLRenderingContext.activeTexture() method of the WebGL API specifies which texture unit to make active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/activeTexture)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun activeTexture(texture: Int)

    /**
     * The WebGLRenderingContext.attachShader() method of the WebGL API attaches either a fragment or vertex WebGLShader
     * to a WebGLProgram.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/attachShader)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun attachShader(program: WebGLProgram, shader: WebGLShader)

    /**
     * The WebGLRenderingContext.bindAttribLocation() method of the WebGL API binds a generic vertex index to an
     * attribute variable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindAttribLocation)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun bindAttribLocation(program: WebGLProgram, index: Int, name: String)

    /**
     * The WebGLRenderingContext.bindBuffer() method of the WebGL API binds a given WebGLBuffer to a target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindBuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun bindBuffer(target: Int, buffer: WebGLBuffer?)

    /**
     * The WebGLRenderingContext.bindFramebuffer() method of the WebGL API binds to the specified target the provided
     * WebGLFramebuffer, or, if the framebuffer argument is null, the default WebGLFramebuffer, which is associated with
     * the canvas rendering context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindFramebuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun bindFramebuffer(target: Int, framebuffer: WebGLFramebuffer?)

    /**
     * The WebGLRenderingContext.bindRenderbuffer() method of the WebGL API binds a given WebGLRenderbuffer to a target,
     * which must be gl.RENDERBUFFER.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindRenderbuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun bindRenderbuffer(target: Int, renderbuffer: WebGLRenderbuffer?)

    /**
     * The WebGLRenderingContext.bindTexture() method of the WebGL API binds a given WebGLTexture to a target (binding
     * point).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindTexture)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun bindTexture(target: Int, texture: WebGLTexture?)

    /**
     * The WebGLRenderingContext.blendColor() method of the WebGL API is used to set the source and destination blending
     * factors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendColor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun blendColor(red: Float, green: Float, blue: Float, alpha: Float)

    /**
     * The WebGLRenderingContext.blendEquation() method of the WebGL API is used to set both the RGB blend equation and
     * alpha blend equation to a single equation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendEquation)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun blendEquation(mode: Int)

    /**
     * The WebGLRenderingContext.blendEquationSeparate() method of the WebGL API is used to set the RGB blend equation
     * and alpha blend equation separately.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendEquationSeparate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun blendEquationSeparate(modeRGB: Int, modeAlpha: Int)

    /**
     * The WebGLRenderingContext.blendFunc() method of the WebGL API defines which function is used for blending pixel
     * arithmetic.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendFunc)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun blendFunc(sfactor: Int, dfactor: Int)

    /**
     * The WebGLRenderingContext.blendFuncSeparate() method of the WebGL API defines which function is used for blending
     * pixel arithmetic for RGB and alpha components separately.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendFuncSeparate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun blendFuncSeparate(srcRGB: Int, dstRGB: Int, srcAlpha: Int, dstAlpha: Int)

    /**
     * The WebGLRenderingContext.checkFramebufferStatus() method of the WebGL API returns the completeness status of the
     * WebGLFramebuffer object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/checkFramebufferStatus)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun checkFramebufferStatus(target: Int): Int

    /**
     * The WebGLRenderingContext.clear() method of the WebGL API clears buffers to preset values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/clear)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun clear(mask: Int)

    /**
     * The WebGLRenderingContext.clearColor() method of the WebGL API specifies the color values used when clearing
     * color buffers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/clearColor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun clearColor(red: Float, green: Float, blue: Float, alpha: Float)

    /**
     * The WebGLRenderingContext.clearDepth() method of the WebGL API specifies the clear value for the depth buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/clearDepth)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun clearDepth(depth: Float)

    /**
     * The WebGLRenderingContext.clearStencil() method of the WebGL API specifies the clear value for the stencil
     * buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/clearStencil)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun clearStencil(s: Int)

    /**
     * The WebGLRenderingContext.colorMask() method of the WebGL API sets which color components to enable or to disable
     * when drawing or rendering to a WebGLFramebuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/colorMask)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun colorMask(red: Boolean, green: Boolean, blue: Boolean, alpha: Boolean)

    /**
     * The WebGLRenderingContext.compileShader() method of the WebGL API compiles a GLSL shader into binary data so that
     * it can be used by a WebGLProgram.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/compileShader)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun compileShader(shader: WebGLShader)

    /**
     * The copyTexImage2D() method of the WebGLRenderingContext interface of the WebGL API copies pixels from the
     * current WebGLFramebuffer into a 2D texture image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/copyTexImage2D)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun copyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int)

    /**
     * The copyTexSubImage2D() method of the WebGLRenderingContext interface of the WebGL API copies pixels from the
     * current WebGLFramebuffer into a 2D texture sub-image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/copyTexSubImage2D)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun copyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int)

    /**
     * The WebGLRenderingContext.createBuffer() method of the WebGL API creates and initializes a WebGLBuffer storing
     * data such as vertices or colors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createBuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun createBuffer(): WebGLBuffer

    /**
     * The WebGLRenderingContext.createFramebuffer() method of the WebGL API creates and initializes a WebGLFramebuffer
     * object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createFramebuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun createFramebuffer(): WebGLFramebuffer

    /**
     * The WebGLRenderingContext.createProgram() method of the WebGL API creates and initializes a WebGLProgram object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createProgram)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun createProgram(): WebGLProgram

    /**
     * The WebGLRenderingContext.createRenderbuffer() method of the WebGL API creates and initializes a
     * WebGLRenderbuffer object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createRenderbuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun createRenderbuffer(): WebGLRenderbuffer

    /**
     * The WebGLRenderingContext method createShader() of the WebGL API creates a WebGLShader that can then be
     * configured further using WebGLRenderingContext.shaderSource() and WebGLRenderingContext.compileShader().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createShader)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun createShader(type: Int): WebGLShader?

    /**
     * The WebGLRenderingContext.createTexture() method of the WebGL API creates and initializes a WebGLTexture object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createTexture)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun createTexture(): WebGLTexture

    /**
     * The WebGLRenderingContext.cullFace() method of the WebGL API specifies whether or not front- and/or back-facing
     * polygons can be culled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/cullFace)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun cullFace(mode: Int)

    /**
     * The WebGLRenderingContext.deleteBuffer() method of the WebGL API deletes a given WebGLBuffer. This method has no
     * effect if the buffer has already been deleted. Normally you don't need to call this method yourself, when the
     * buffer object is dereferenced it will be marked as free.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteBuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun deleteBuffer(buffer: WebGLBuffer?)

    /**
     * The WebGLRenderingContext.deleteFramebuffer() method of the WebGL API deletes a given WebGLFramebuffer object.
     * This method has no effect if the frame buffer has already been deleted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteFramebuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun deleteFramebuffer(framebuffer: WebGLFramebuffer?)

    /**
     * The WebGLRenderingContext.deleteProgram() method of the WebGL API deletes a given WebGLProgram object. This
     * method has no effect if the program has already been deleted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteProgram)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun deleteProgram(program: WebGLProgram?)

    /**
     * The WebGLRenderingContext.deleteRenderbuffer() method of the WebGL API deletes a given WebGLRenderbuffer object.
     * This method has no effect if the render buffer has already been deleted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteRenderbuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun deleteRenderbuffer(renderbuffer: WebGLRenderbuffer?)

    /**
     * The WebGLRenderingContext.deleteShader() method of the WebGL API marks a given WebGLShader object for deletion.
     * It will then be deleted whenever the shader is no longer in use. This method has no effect if the shader has
     * already been deleted, and the WebGLShader is automatically marked for deletion when it is destroyed by the
     * garbage collector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteShader)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun deleteShader(shader: WebGLShader?)

    /**
     * The WebGLRenderingContext.deleteTexture() method of the WebGL API deletes a given WebGLTexture object. This
     * method has no effect if the texture has already been deleted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteTexture)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun deleteTexture(texture: WebGLTexture?)

    /**
     * The WebGLRenderingContext.depthFunc() method of the WebGL API specifies a function that compares incoming pixel
     * depth to the current depth buffer value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/depthFunc)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun depthFunc(func: Int)

    /**
     * The WebGLRenderingContext.depthMask() method of the WebGL API sets whether writing into the depth buffer is
     * enabled or disabled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/depthMask)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun depthMask(flag: Boolean)

    /**
     * The WebGLRenderingContext.depthRange() method of the WebGL API specifies the depth range mapping from normalized
     * device coordinates to window or viewport coordinates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/depthRange)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun depthRange(zNear: Float, zFar: Float)

    /**
     * The WebGLRenderingContext.detachShader() method of the WebGL API detaches a previously attached WebGLShader from
     * a WebGLProgram.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/detachShader)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun detachShader(program: WebGLProgram, shader: WebGLShader)

    /**
     * The WebGLRenderingContext.disable() method of the WebGL API disables specific WebGL capabilities for this
     * context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/disable)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun disable(cap: Int)

    /**
     * The WebGLRenderingContext.disableVertexAttribArray() method of the WebGL API turns the generic vertex attribute
     * array off at a given index position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/disableVertexAttribArray)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun disableVertexAttribArray(index: Int)

    /**
     * The WebGLRenderingContext.drawArrays() method of the WebGL API renders primitives from array data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawArrays)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun drawArrays(mode: Int, first: Int, count: Int)

    /**
     * The WebGLRenderingContext.drawElements() method of the WebGL API renders primitives from array data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawElements)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun drawElements(mode: Int, count: Int, type: Int, offset: Double)

    /**
     * The WebGLRenderingContext.enable() method of the WebGL API enables specific WebGL capabilities for this context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/enable)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun enable(cap: Int)

    /**
     * The WebGLRenderingContext method enableVertexAttribArray(), part of the WebGL API, turns on the generic vertex
     * attribute array at the specified index into the list of attribute arrays.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/enableVertexAttribArray)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun enableVertexAttribArray(index: Int)

    /**
     * The WebGLRenderingContext.finish() method of the WebGL API blocks execution until all previously called commands
     * are finished.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/finish)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun finish()

    /**
     * The WebGLRenderingContext.flush() method of the WebGL API empties different buffer commands, causing all commands
     * to be executed as quickly as possible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/flush)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun flush()

    /**
     * The WebGLRenderingContext.framebufferRenderbuffer() method of the WebGL API attaches a WebGLRenderbuffer object
     * to a WebGLFramebuffer object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/framebufferRenderbuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun framebufferRenderbuffer(target: Int, attachment: Int, renderbuffertarget: Int, renderbuffer: WebGLRenderbuffer?)

    /**
     * The WebGLRenderingContext.framebufferTexture2D() method of the WebGL API attaches a texture to a
     * WebGLFramebuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/framebufferTexture2D)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: WebGLTexture?, level: Int)

    /**
     * The WebGLRenderingContext.frontFace() method of the WebGL API specifies whether polygons are front- or
     * back-facing by setting a winding orientation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/frontFace)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun frontFace(mode: Int)

    /**
     * The WebGLRenderingContext.generateMipmap() method of the WebGL API generates a set of mipmaps for a WebGLTexture
     * object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/generateMipmap)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun generateMipmap(target: Int)

    /**
     * The WebGLRenderingContext.getActiveAttrib() method of the WebGL API returns a WebGLActiveInfo object containing
     * size, type, and name of a vertex attribute. It is generally used when querying unknown attributes either for
     * debugging or generic library creation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getActiveAttrib)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getActiveAttrib(program: WebGLProgram, index: Int): WebGLActiveInfo?

    /**
     * The WebGLRenderingContext.getActiveUniform() method of the WebGL API returns a WebGLActiveInfo object containing
     * size, type, and name of a uniform attribute. It is generally used when querying unknown uniforms either for
     * debugging or generic library creation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getActiveUniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getActiveUniform(program: WebGLProgram, index: Int): WebGLActiveInfo?

    /**
     * The WebGLRenderingContext.getAttachedShaders() method of the WebGL API returns a list of WebGLShader objects
     * attached to a WebGLProgram.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getAttachedShaders)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getAttachedShaders(program: WebGLProgram): JsArray<WebGLShader>?

    /**
     * The WebGLRenderingContext.getAttribLocation() method of the WebGL API returns the location of an attribute
     * variable in a given WebGLProgram.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getAttribLocation)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getAttribLocation(program: WebGLProgram, name: String): Int

    /**
     * The WebGLRenderingContext.getBufferParameter() method of the WebGL API returns information about the buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getBufferParameter)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getBufferParameter(target: Int, pname: Int): JsAny?

    /**
     * The WebGLRenderingContext.getParameter() method of the WebGL API returns a value for the passed parameter name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getParameter)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getParameter(pname: Int): JsAny?

    /**
     * The WebGLRenderingContext.getError() method of the WebGL API returns error information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getError)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getError(): Int

    /**
     * The WebGLRenderingContext.getFramebufferAttachmentParameter() method of the WebGL API returns information about a
     * framebuffer's attachment.
     *
     * [MDN
     * Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getFramebufferAttachmentParameter)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getFramebufferAttachmentParameter(target: Int, attachment: Int, pname: Int): JsAny?

    /**
     * The WebGLRenderingContext.getProgramParameter() method of the WebGL API returns information about the given
     * program.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getProgramParameter)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getProgramParameter(program: WebGLProgram, pname: Int): JsAny?

    /**
     * The WebGLRenderingContext.getProgramInfoLog returns the information log for the specified WebGLProgram object. It
     * contains errors that occurred during failed linking or validation of WebGLProgram objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getProgramInfoLog)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getProgramInfoLog(program: WebGLProgram): String?

    /**
     * The WebGLRenderingContext.getRenderbufferParameter() method of the WebGL API returns information about the
     * renderbuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getRenderbufferParameter)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getRenderbufferParameter(target: Int, pname: Int): JsAny?

    /**
     * The WebGLRenderingContext.getShaderParameter() method of the WebGL API returns information about the given
     * shader.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getShaderParameter)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getShaderParameter(shader: WebGLShader, pname: Int): JsAny?

    /**
     * The WebGLRenderingContext.getShaderPrecisionFormat() method of the WebGL API returns a new
     * WebGLShaderPrecisionFormat object describing the range and precision for the specified shader numeric format.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getShaderPrecisionFormat)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getShaderPrecisionFormat(shadertype: Int, precisiontype: Int): WebGLShaderPrecisionFormat?

    /**
     * The WebGLRenderingContext.getShaderInfoLog returns the information log for the specified WebGLShader object. It
     * contains warnings, debugging and compile information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getShaderInfoLog)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getShaderInfoLog(shader: WebGLShader): String?

    /**
     * The WebGLRenderingContext.getShaderSource() method of the WebGL API returns the source code of a WebGLShader as a
     * string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getShaderSource)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getShaderSource(shader: WebGLShader): String?

    /**
     * The WebGLRenderingContext.getTexParameter() method of the WebGL API returns information about the given texture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getTexParameter)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getTexParameter(target: Int, pname: Int): JsAny?

    /**
     * The WebGLRenderingContext.getUniform() method of the WebGL API returns the value of a uniform variable at a given
     * location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getUniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getUniform(program: WebGLProgram, location: WebGLUniformLocation): JsAny?

    /**
     * Part of the WebGL API, the WebGLRenderingContext method getUniformLocation() returns the location of a specific
     * uniform variable which is part of a given WebGLProgram.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getUniformLocation)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getUniformLocation(program: WebGLProgram, name: String): WebGLUniformLocation?

    /**
     * The WebGLRenderingContext.getVertexAttrib() method of the WebGL API returns information about a vertex attribute
     * at a given position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getVertexAttrib)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getVertexAttrib(index: Int, pname: Int): JsAny?

    /**
     * The WebGLRenderingContext.getVertexAttribOffset() method of the WebGL API returns the address of a specified
     * vertex attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getVertexAttribOffset)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getVertexAttribOffset(index: Int, pname: Int): Double

    /**
     * The WebGLRenderingContext.hint() method of the WebGL API specifies hints for certain behaviors. The
     * interpretation of these hints depend on the implementation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/hint)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun hint(target: Int, mode: Int)

    /**
     * The WebGLRenderingContext.isBuffer() method of the WebGL API returns true if the passed WebGLBuffer is valid and
     * false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isBuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun isBuffer(buffer: WebGLBuffer?): Boolean

    /**
     * The WebGLRenderingContext.isEnabled() method of the WebGL API tests whether a specific WebGL capability is
     * enabled or not for this context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isEnabled)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun isEnabled(cap: Int): Boolean

    /**
     * The WebGLRenderingContext.isFramebuffer() method of the WebGL API returns true if the passed WebGLFramebuffer is
     * valid and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isFramebuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun isFramebuffer(framebuffer: WebGLFramebuffer?): Boolean

    /**
     * The WebGLRenderingContext.isProgram() method of the WebGL API returns true if the passed WebGLProgram is valid,
     * false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isProgram)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun isProgram(program: WebGLProgram?): Boolean

    /**
     * The WebGLRenderingContext.isRenderbuffer() method of the WebGL API returns true if the passed WebGLRenderbuffer
     * is valid and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isRenderbuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun isRenderbuffer(renderbuffer: WebGLRenderbuffer?): Boolean

    /**
     * The WebGLRenderingContext.isShader() method of the WebGL API returns true if the passed WebGLShader is valid,
     * false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isShader)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun isShader(shader: WebGLShader?): Boolean

    /**
     * The WebGLRenderingContext.isTexture() method of the WebGL API returns true if the passed WebGLTexture is valid
     * and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isTexture)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun isTexture(texture: WebGLTexture?): Boolean

    /**
     * The WebGLRenderingContext.lineWidth() method of the WebGL API sets the line width of rasterized lines.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/lineWidth)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun lineWidth(width: Float)

    /**
     * The WebGLRenderingContext interface's linkProgram() method links a given WebGLProgram, completing the process of
     * preparing the GPU code for the program's fragment and vertex shaders.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/linkProgram)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun linkProgram(program: WebGLProgram)

    /**
     * The WebGLRenderingContext.pixelStorei() method of the WebGL API specifies the pixel storage modes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/pixelStorei)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun pixelStorei(pname: Int, param: Int)

    /**
     * The WebGLRenderingContext.polygonOffset() method of the WebGL API specifies the scale factors and units to
     * calculate depth values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/polygonOffset)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun polygonOffset(factor: Float, units: Float)

    /**
     * The WebGLRenderingContext.renderbufferStorage() method of the WebGL API creates and initializes a renderbuffer
     * object's data store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/renderbufferStorage)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int)

    /**
     * The WebGLRenderingContext.sampleCoverage() method of the WebGL API specifies multi-sample coverage parameters for
     * anti-aliasing effects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/sampleCoverage)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun sampleCoverage(value: Float, invert: Boolean)

    /**
     * The WebGLRenderingContext.scissor() method of the WebGL API sets a scissor box, which limits the drawing to a
     * specified rectangle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/scissor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun scissor(x: Int, y: Int, width: Int, height: Int)

    /**
     * The WebGLRenderingContext.shaderSource() method of the WebGL API sets the source code of a WebGLShader.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/shaderSource)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun shaderSource(shader: WebGLShader, source: String)

    /**
     * The WebGLRenderingContext.stencilFunc() method of the WebGL API sets the front and back function and reference
     * value for stencil testing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilFunc)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun stencilFunc(func: Int, ref: Int, mask: Int)

    /**
     * The WebGLRenderingContext.stencilFuncSeparate() method of the WebGL API sets the front and/or back function and
     * reference value for stencil testing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilFuncSeparate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun stencilFuncSeparate(face: Int, func: Int, ref: Int, mask: Int)

    /**
     * The WebGLRenderingContext.stencilMask() method of the WebGL API controls enabling and disabling of both the front
     * and back writing of individual bits in the stencil planes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilMask)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun stencilMask(mask: Int)

    /**
     * The WebGLRenderingContext.stencilMaskSeparate() method of the WebGL API controls enabling and disabling of front
     * and/or back writing of individual bits in the stencil planes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilMaskSeparate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun stencilMaskSeparate(face: Int, mask: Int)

    /**
     * The WebGLRenderingContext.stencilOp() method of the WebGL API sets both the front and back-facing stencil test
     * actions.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilOp)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun stencilOp(fail: Int, zfail: Int, zpass: Int)

    /**
     * The WebGLRenderingContext.stencilOpSeparate() method of the WebGL API sets the front and/or back-facing stencil
     * test actions.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilOpSeparate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun stencilOpSeparate(face: Int, fail: Int, zfail: Int, zpass: Int)

    /**
     * The WebGLRenderingContext.texParameter\[fi\]() methods of the WebGL API set texture parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texParameter)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun texParameterf(target: Int, pname: Int, param: Float)

    /**
     * The WebGLRenderingContext.texParameter\[fi\]() methods of the WebGL API set texture parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texParameter)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun texParameteri(target: Int, pname: Int, param: Int)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform1f(location: WebGLUniformLocation?, x: Float)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform2f(location: WebGLUniformLocation?, x: Float, y: Float)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform3f(location: WebGLUniformLocation?, x: Float, y: Float, z: Float)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform4f(location: WebGLUniformLocation?, x: Float, y: Float, z: Float, w: Float)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform1i(location: WebGLUniformLocation?, x: Int)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform2i(location: WebGLUniformLocation?, x: Int, y: Int)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform3i(location: WebGLUniformLocation?, x: Int, y: Int, z: Int)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform4i(location: WebGLUniformLocation?, x: Int, y: Int, z: Int, w: Int)

    /**
     * The WebGLRenderingContext.useProgram() method of the WebGL API sets the specified WebGLProgram as part of the
     * current rendering state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/useProgram)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun useProgram(program: WebGLProgram?)

    /**
     * The WebGLRenderingContext.validateProgram() method of the WebGL API validates a WebGLProgram. It checks if it is
     * successfully linked and if it can be used in the current WebGL state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/validateProgram)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun validateProgram(program: WebGLProgram)

    /**
     * The WebGLRenderingContext.vertexAttrib\[1234\]f\[v\]() methods of the WebGL API specify constant values for
     * generic vertex attributes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun vertexAttrib1f(index: Int, x: Float)

    /**
     * The WebGLRenderingContext.vertexAttrib\[1234\]f\[v\]() methods of the WebGL API specify constant values for
     * generic vertex attributes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun vertexAttrib2f(index: Int, x: Float, y: Float)

    /**
     * The WebGLRenderingContext.vertexAttrib\[1234\]f\[v\]() methods of the WebGL API specify constant values for
     * generic vertex attributes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun vertexAttrib3f(index: Int, x: Float, y: Float, z: Float)

    /**
     * The WebGLRenderingContext.vertexAttrib\[1234\]f\[v\]() methods of the WebGL API specify constant values for
     * generic vertex attributes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun vertexAttrib4f(index: Int, x: Float, y: Float, z: Float, w: Float)

    /**
     * The WebGLRenderingContext.vertexAttrib\[1234\]f\[v\]() methods of the WebGL API specify constant values for
     * generic vertex attributes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun vertexAttrib1fv(index: Int, values: Float32Array)

    /**
     * The WebGLRenderingContext.vertexAttrib\[1234\]f\[v\]() methods of the WebGL API specify constant values for
     * generic vertex attributes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun vertexAttrib1fv(index: Int, values: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.vertexAttrib\[1234\]f\[v\]() methods of the WebGL API specify constant values for
     * generic vertex attributes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun vertexAttrib2fv(index: Int, values: Float32Array)

    /**
     * The WebGLRenderingContext.vertexAttrib\[1234\]f\[v\]() methods of the WebGL API specify constant values for
     * generic vertex attributes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun vertexAttrib2fv(index: Int, values: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.vertexAttrib\[1234\]f\[v\]() methods of the WebGL API specify constant values for
     * generic vertex attributes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun vertexAttrib3fv(index: Int, values: Float32Array)

    /**
     * The WebGLRenderingContext.vertexAttrib\[1234\]f\[v\]() methods of the WebGL API specify constant values for
     * generic vertex attributes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun vertexAttrib3fv(index: Int, values: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.vertexAttrib\[1234\]f\[v\]() methods of the WebGL API specify constant values for
     * generic vertex attributes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun vertexAttrib4fv(index: Int, values: Float32Array)

    /**
     * The WebGLRenderingContext.vertexAttrib\[1234\]f\[v\]() methods of the WebGL API specify constant values for
     * generic vertex attributes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun vertexAttrib4fv(index: Int, values: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.vertexAttribPointer() method of the WebGL API binds the buffer currently bound to
     * gl.ARRAY_BUFFER to a generic vertex attribute of the current vertex buffer object and specifies its layout.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttribPointer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun vertexAttribPointer(index: Int, size: Int, type: Int, normalized: Boolean, stride: Int, offset: Double)

    /**
     * The WebGLRenderingContext.viewport() method of the WebGL API sets the viewport, which specifies the affine
     * transformation of x and y from normalized device coordinates to window coordinates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/viewport)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun viewport(x: Int, y: Int, width: Int, height: Int)

    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
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
    /**
     * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data
     * store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bufferData)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun bufferData(target: Int, size: Double, usage: Int)

    /**
     * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data
     * store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bufferData)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun bufferData(target: Int, data: BufferDataSource?, usage: Int)

    /**
     * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data
     * store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bufferSubData)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun bufferSubData(target: Int, offset: Double, data: BufferDataSource)

    /**
     * The compressedTexImage2D() method of the WebGLRenderingContext interface of the WebGL API specifies a
     * two-dimensional texture image in a compressed format.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/compressedTexImage2D)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, data: ArrayBufferView)

    /**
     * The compressedTexSubImage2D() method of the WebGLRenderingContext interface of the WebGL API specifies a
     * two-dimensional sub-rectangle for a texture image in a compressed format.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, data: ArrayBufferView)

    /**
     * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle
     * of the current color framebuffer into a TypedArray or a DataView object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/readPixels)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?)

    /**
     * The texImage2D() method of the WebGLRenderingContext interface of the WebGL API specifies a two-dimensional
     * texture image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texImage2D)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: ArrayBufferView?)

    /**
     * The texImage2D() method of the WebGLRenderingContext interface of the WebGL API specifies a two-dimensional
     * texture image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texImage2D)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: TexImageSource)

    /**
     * The texSubImage2D() method of the WebGLRenderingContext interface of the WebGL API specifies a two-dimensional
     * sub-rectangle for a texture image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texSubImage2D)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?)

    /**
     * The texSubImage2D() method of the WebGLRenderingContext interface of the WebGL API specifies a two-dimensional
     * sub-rectangle for a texture image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texSubImage2D)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: TexImageSource)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform1fv(location: WebGLUniformLocation?, v: Float32Array)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform1fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform2fv(location: WebGLUniformLocation?, v: Float32Array)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform2fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform3fv(location: WebGLUniformLocation?, v: Float32Array)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform3fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform4fv(location: WebGLUniformLocation?, v: Float32Array)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform4fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform1iv(location: WebGLUniformLocation?, v: Int32Array)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform1iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform2iv(location: WebGLUniformLocation?, v: Int32Array)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform2iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform3iv(location: WebGLUniformLocation?, v: Int32Array)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform3iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform4iv(location: WebGLUniformLocation?, v: Int32Array)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform4iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniformMatrix\[234\]fv() methods of the WebGL API specify matrix values for uniform
     * variables.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array)

    /**
     * The WebGLRenderingContext.uniformMatrix\[234\]fv() methods of the WebGL API specify matrix values for uniform
     * variables.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, value: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniformMatrix\[234\]fv() methods of the WebGL API specify matrix values for uniform
     * variables.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array)

    /**
     * The WebGLRenderingContext.uniformMatrix\[234\]fv() methods of the WebGL API specify matrix values for uniform
     * variables.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, value: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniformMatrix\[234\]fv() methods of the WebGL API specify matrix values for uniform
     * variables.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array)

    /**
     * The WebGLRenderingContext.uniformMatrix\[234\]fv() methods of the WebGL API specify matrix values for uniform
     * variables.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, value: JsArray<JsNumber>)
}

/**
 * The WebGLRenderingContext interface provides an interface to the OpenGL ES 2.0 graphics rendering context for the
 * drawing surface of an HTML &lt;canvas&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class WebGLRenderingContext : WebGLRenderingContextBase, WebGLRenderingContextOverloads, RenderingContext, OffscreenRenderingContext {

    public companion object {
        public val DEPTH_BUFFER_BIT: Int
        public val STENCIL_BUFFER_BIT: Int
        public val COLOR_BUFFER_BIT: Int
        public val POINTS: Int
        public val LINES: Int
        public val LINE_LOOP: Int
        public val LINE_STRIP: Int
        public val TRIANGLES: Int
        public val TRIANGLE_STRIP: Int
        public val TRIANGLE_FAN: Int
        public val ZERO: Int
        public val ONE: Int
        public val SRC_COLOR: Int
        public val ONE_MINUS_SRC_COLOR: Int
        public val SRC_ALPHA: Int
        public val ONE_MINUS_SRC_ALPHA: Int
        public val DST_ALPHA: Int
        public val ONE_MINUS_DST_ALPHA: Int
        public val DST_COLOR: Int
        public val ONE_MINUS_DST_COLOR: Int
        public val SRC_ALPHA_SATURATE: Int
        public val FUNC_ADD: Int
        public val BLEND_EQUATION: Int
        public val BLEND_EQUATION_RGB: Int
        public val BLEND_EQUATION_ALPHA: Int
        public val FUNC_SUBTRACT: Int
        public val FUNC_REVERSE_SUBTRACT: Int
        public val BLEND_DST_RGB: Int
        public val BLEND_SRC_RGB: Int
        public val BLEND_DST_ALPHA: Int
        public val BLEND_SRC_ALPHA: Int
        public val CONSTANT_COLOR: Int
        public val ONE_MINUS_CONSTANT_COLOR: Int
        public val CONSTANT_ALPHA: Int
        public val ONE_MINUS_CONSTANT_ALPHA: Int
        public val BLEND_COLOR: Int
        public val ARRAY_BUFFER: Int
        public val ELEMENT_ARRAY_BUFFER: Int
        public val ARRAY_BUFFER_BINDING: Int
        public val ELEMENT_ARRAY_BUFFER_BINDING: Int
        public val STREAM_DRAW: Int
        public val STATIC_DRAW: Int
        public val DYNAMIC_DRAW: Int
        public val BUFFER_SIZE: Int
        public val BUFFER_USAGE: Int
        public val CURRENT_VERTEX_ATTRIB: Int
        public val FRONT: Int
        public val BACK: Int
        public val FRONT_AND_BACK: Int
        public val CULL_FACE: Int
        public val BLEND: Int
        public val DITHER: Int
        public val STENCIL_TEST: Int
        public val DEPTH_TEST: Int
        public val SCISSOR_TEST: Int
        public val POLYGON_OFFSET_FILL: Int
        public val SAMPLE_ALPHA_TO_COVERAGE: Int
        public val SAMPLE_COVERAGE: Int
        public val NO_ERROR: Int
        public val INVALID_ENUM: Int
        public val INVALID_VALUE: Int
        public val INVALID_OPERATION: Int
        public val OUT_OF_MEMORY: Int
        public val CW: Int
        public val CCW: Int
        public val LINE_WIDTH: Int
        public val ALIASED_POINT_SIZE_RANGE: Int
        public val ALIASED_LINE_WIDTH_RANGE: Int
        public val CULL_FACE_MODE: Int
        public val FRONT_FACE: Int
        public val DEPTH_RANGE: Int
        public val DEPTH_WRITEMASK: Int
        public val DEPTH_CLEAR_VALUE: Int
        public val DEPTH_FUNC: Int
        public val STENCIL_CLEAR_VALUE: Int
        public val STENCIL_FUNC: Int
        public val STENCIL_FAIL: Int
        public val STENCIL_PASS_DEPTH_FAIL: Int
        public val STENCIL_PASS_DEPTH_PASS: Int
        public val STENCIL_REF: Int
        public val STENCIL_VALUE_MASK: Int
        public val STENCIL_WRITEMASK: Int
        public val STENCIL_BACK_FUNC: Int
        public val STENCIL_BACK_FAIL: Int
        public val STENCIL_BACK_PASS_DEPTH_FAIL: Int
        public val STENCIL_BACK_PASS_DEPTH_PASS: Int
        public val STENCIL_BACK_REF: Int
        public val STENCIL_BACK_VALUE_MASK: Int
        public val STENCIL_BACK_WRITEMASK: Int
        public val VIEWPORT: Int
        public val SCISSOR_BOX: Int
        public val COLOR_CLEAR_VALUE: Int
        public val COLOR_WRITEMASK: Int
        public val UNPACK_ALIGNMENT: Int
        public val PACK_ALIGNMENT: Int
        public val MAX_TEXTURE_SIZE: Int
        public val MAX_VIEWPORT_DIMS: Int
        public val SUBPIXEL_BITS: Int
        public val RED_BITS: Int
        public val GREEN_BITS: Int
        public val BLUE_BITS: Int
        public val ALPHA_BITS: Int
        public val DEPTH_BITS: Int
        public val STENCIL_BITS: Int
        public val POLYGON_OFFSET_UNITS: Int
        public val POLYGON_OFFSET_FACTOR: Int
        public val TEXTURE_BINDING_2D: Int
        public val SAMPLE_BUFFERS: Int
        public val SAMPLES: Int
        public val SAMPLE_COVERAGE_VALUE: Int
        public val SAMPLE_COVERAGE_INVERT: Int
        public val COMPRESSED_TEXTURE_FORMATS: Int
        public val DONT_CARE: Int
        public val FASTEST: Int
        public val NICEST: Int
        public val GENERATE_MIPMAP_HINT: Int
        public val BYTE: Int
        public val UNSIGNED_BYTE: Int
        public val SHORT: Int
        public val UNSIGNED_SHORT: Int
        public val INT: Int
        public val UNSIGNED_INT: Int
        public val FLOAT: Int
        public val DEPTH_COMPONENT: Int
        public val ALPHA: Int
        public val RGB: Int
        public val RGBA: Int
        public val LUMINANCE: Int
        public val LUMINANCE_ALPHA: Int
        public val UNSIGNED_SHORT_4_4_4_4: Int
        public val UNSIGNED_SHORT_5_5_5_1: Int
        public val UNSIGNED_SHORT_5_6_5: Int
        public val FRAGMENT_SHADER: Int
        public val VERTEX_SHADER: Int
        public val MAX_VERTEX_ATTRIBS: Int
        public val MAX_VERTEX_UNIFORM_VECTORS: Int
        public val MAX_VARYING_VECTORS: Int
        public val MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int
        public val MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int
        public val MAX_TEXTURE_IMAGE_UNITS: Int
        public val MAX_FRAGMENT_UNIFORM_VECTORS: Int
        public val SHADER_TYPE: Int
        public val DELETE_STATUS: Int
        public val LINK_STATUS: Int
        public val VALIDATE_STATUS: Int
        public val ATTACHED_SHADERS: Int
        public val ACTIVE_UNIFORMS: Int
        public val ACTIVE_ATTRIBUTES: Int
        public val SHADING_LANGUAGE_VERSION: Int
        public val CURRENT_PROGRAM: Int
        public val NEVER: Int
        public val LESS: Int
        public val EQUAL: Int
        public val LEQUAL: Int
        public val GREATER: Int
        public val NOTEQUAL: Int
        public val GEQUAL: Int
        public val ALWAYS: Int
        public val KEEP: Int
        public val REPLACE: Int
        public val INCR: Int
        public val DECR: Int
        public val INVERT: Int
        public val INCR_WRAP: Int
        public val DECR_WRAP: Int
        public val VENDOR: Int
        public val RENDERER: Int
        public val VERSION: Int
        public val NEAREST: Int
        public val LINEAR: Int
        public val NEAREST_MIPMAP_NEAREST: Int
        public val LINEAR_MIPMAP_NEAREST: Int
        public val NEAREST_MIPMAP_LINEAR: Int
        public val LINEAR_MIPMAP_LINEAR: Int
        public val TEXTURE_MAG_FILTER: Int
        public val TEXTURE_MIN_FILTER: Int
        public val TEXTURE_WRAP_S: Int
        public val TEXTURE_WRAP_T: Int
        public val TEXTURE_2D: Int
        public val TEXTURE: Int
        public val TEXTURE_CUBE_MAP: Int
        public val TEXTURE_BINDING_CUBE_MAP: Int
        public val TEXTURE_CUBE_MAP_POSITIVE_X: Int
        public val TEXTURE_CUBE_MAP_NEGATIVE_X: Int
        public val TEXTURE_CUBE_MAP_POSITIVE_Y: Int
        public val TEXTURE_CUBE_MAP_NEGATIVE_Y: Int
        public val TEXTURE_CUBE_MAP_POSITIVE_Z: Int
        public val TEXTURE_CUBE_MAP_NEGATIVE_Z: Int
        public val MAX_CUBE_MAP_TEXTURE_SIZE: Int
        public val TEXTURE0: Int
        public val TEXTURE1: Int
        public val TEXTURE2: Int
        public val TEXTURE3: Int
        public val TEXTURE4: Int
        public val TEXTURE5: Int
        public val TEXTURE6: Int
        public val TEXTURE7: Int
        public val TEXTURE8: Int
        public val TEXTURE9: Int
        public val TEXTURE10: Int
        public val TEXTURE11: Int
        public val TEXTURE12: Int
        public val TEXTURE13: Int
        public val TEXTURE14: Int
        public val TEXTURE15: Int
        public val TEXTURE16: Int
        public val TEXTURE17: Int
        public val TEXTURE18: Int
        public val TEXTURE19: Int
        public val TEXTURE20: Int
        public val TEXTURE21: Int
        public val TEXTURE22: Int
        public val TEXTURE23: Int
        public val TEXTURE24: Int
        public val TEXTURE25: Int
        public val TEXTURE26: Int
        public val TEXTURE27: Int
        public val TEXTURE28: Int
        public val TEXTURE29: Int
        public val TEXTURE30: Int
        public val TEXTURE31: Int
        public val ACTIVE_TEXTURE: Int
        public val REPEAT: Int
        public val CLAMP_TO_EDGE: Int
        public val MIRRORED_REPEAT: Int
        public val FLOAT_VEC2: Int
        public val FLOAT_VEC3: Int
        public val FLOAT_VEC4: Int
        public val INT_VEC2: Int
        public val INT_VEC3: Int
        public val INT_VEC4: Int
        public val BOOL: Int
        public val BOOL_VEC2: Int
        public val BOOL_VEC3: Int
        public val BOOL_VEC4: Int
        public val FLOAT_MAT2: Int
        public val FLOAT_MAT3: Int
        public val FLOAT_MAT4: Int
        public val SAMPLER_2D: Int
        public val SAMPLER_CUBE: Int
        public val VERTEX_ATTRIB_ARRAY_ENABLED: Int
        public val VERTEX_ATTRIB_ARRAY_SIZE: Int
        public val VERTEX_ATTRIB_ARRAY_STRIDE: Int
        public val VERTEX_ATTRIB_ARRAY_TYPE: Int
        public val VERTEX_ATTRIB_ARRAY_NORMALIZED: Int
        public val VERTEX_ATTRIB_ARRAY_POINTER: Int
        public val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int
        public val IMPLEMENTATION_COLOR_READ_TYPE: Int
        public val IMPLEMENTATION_COLOR_READ_FORMAT: Int
        public val COMPILE_STATUS: Int
        public val LOW_FLOAT: Int
        public val MEDIUM_FLOAT: Int
        public val HIGH_FLOAT: Int
        public val LOW_INT: Int
        public val MEDIUM_INT: Int
        public val HIGH_INT: Int
        public val FRAMEBUFFER: Int
        public val RENDERBUFFER: Int
        public val RGBA4: Int
        public val RGB5_A1: Int
        public val RGBA8: Int
        public val RGB565: Int
        public val DEPTH_COMPONENT16: Int
        public val STENCIL_INDEX8: Int
        public val DEPTH_STENCIL: Int
        public val RENDERBUFFER_WIDTH: Int
        public val RENDERBUFFER_HEIGHT: Int
        public val RENDERBUFFER_INTERNAL_FORMAT: Int
        public val RENDERBUFFER_RED_SIZE: Int
        public val RENDERBUFFER_GREEN_SIZE: Int
        public val RENDERBUFFER_BLUE_SIZE: Int
        public val RENDERBUFFER_ALPHA_SIZE: Int
        public val RENDERBUFFER_DEPTH_SIZE: Int
        public val RENDERBUFFER_STENCIL_SIZE: Int
        public val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int
        public val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int
        public val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int
        public val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int
        public val COLOR_ATTACHMENT0: Int
        public val DEPTH_ATTACHMENT: Int
        public val STENCIL_ATTACHMENT: Int
        public val DEPTH_STENCIL_ATTACHMENT: Int
        public val NONE: Int
        public val FRAMEBUFFER_COMPLETE: Int
        public val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int
        public val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int
        public val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: Int
        public val FRAMEBUFFER_UNSUPPORTED: Int
        public val FRAMEBUFFER_BINDING: Int
        public val RENDERBUFFER_BINDING: Int
        public val MAX_RENDERBUFFER_SIZE: Int
        public val INVALID_FRAMEBUFFER_OPERATION: Int
        public val UNPACK_FLIP_Y_WEBGL: Int
        public val UNPACK_PREMULTIPLY_ALPHA_WEBGL: Int
        public val CONTEXT_LOST_WEBGL: Int
        public val UNPACK_COLORSPACE_CONVERSION_WEBGL: Int
        public val BROWSER_DEFAULT_WEBGL: Int
    }
}

/**
 * The WebGLContextEvent interface is part of the WebGL API and is an interface for an event that is generated in
 * response to a status change to the WebGL rendering context.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLContextEvent)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class WebGLContextEvent : Event {
    /**
     * The WebGLContextEvent() constructor creates a new WebGLContextEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLContextEvent/WebGLContextEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(type: String, eventInit: WebGLContextEventInit = definedExternally)

    /**
     * The read-only WebGLContextEvent.statusMessage property contains additional event status information, or is an
     * empty string if no additional information is available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLContextEvent/statusMessage)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val statusMessage: String

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface WebGLContextEventInit : EventInit {
    public var statusMessage: String?
}

public fun WebGLContextEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, statusMessage: String? = null): WebGLContextEventInit {
    val dictionary = newJsObject<WebGLContextEventInit>()
    if (bubbles != null) dictionary.bubbles = bubbles
    if (cancelable != null) dictionary.cancelable = cancelable
    if (composed != null) dictionary.composed = composed
    if (statusMessage != null) dictionary.statusMessage = statusMessage
    return dictionary
}
