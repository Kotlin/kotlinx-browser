/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'webaudio', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.webaudio

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.mediacapture.*

public external interface AudioContextState : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val AudioContextState.Companion.SUSPENDED: AudioContextState get() = "suspended".toJsString().unsafeCast<AudioContextState>()
public inline val AudioContextState.Companion.RUNNING: AudioContextState get() = "running".toJsString().unsafeCast<AudioContextState>()
public inline val AudioContextState.Companion.CLOSED: AudioContextState get() = "closed".toJsString().unsafeCast<AudioContextState>()
public inline val AudioContextState.Companion.INTERRUPTED: AudioContextState get() = "interrupted".toJsString().unsafeCast<AudioContextState>()

public external interface AudioContextRenderSizeCategory : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val AudioContextRenderSizeCategory.Companion.DEFAULT: AudioContextRenderSizeCategory get() = "default".toJsString().unsafeCast<AudioContextRenderSizeCategory>()
public inline val AudioContextRenderSizeCategory.Companion.HARDWARE: AudioContextRenderSizeCategory get() = "hardware".toJsString().unsafeCast<AudioContextRenderSizeCategory>()

/**
 * The BaseAudioContext interface of the Web Audio API acts as a base definition for online and offline audio-processing
 * graphs, as represented by AudioContext and OfflineAudioContext respectively. You wouldn't use BaseAudioContext
 * directly — you'd use its features via one of these two inheriting interfaces.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class BaseAudioContext : EventTarget {
    /**
     * The destination read-only property of the BaseAudioContext interface returns an AudioDestinationNode representing
     * the final destination of all audio in the context. It often represents an actual audio-rendering device such as
     * your device's speakers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/destination)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val destination: AudioDestinationNode

    /**
     * The sampleRate read-only property of the BaseAudioContext interface returns a floating point number representing
     * the sample rate, in samples per second, used by all nodes in this audio context. This limitation means that
     * sample-rate converters are not supported.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/sampleRate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val sampleRate: Float

    /**
     * The currentTime read-only property of the BaseAudioContext interface returns a double representing the elapsed
     * time in the context's audio timeline in seconds that can be used for scheduling audio playback, visualizing
     * timelines, etc. It starts at 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/currentTime)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val currentTime: Double

    /**
     * The listener read-only property of the BaseAudioContext interface returns an AudioListener object that can then
     * be used for implementing 3D audio spatialization.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/listener)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val listener: AudioListener

    /**
     * The state read-only property of the BaseAudioContext interface returns the current state of the AudioContext.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/state)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val state: AudioContextState

    /**
     * The renderQuantumSize read-only property of the BaseAudioContext interface returns an integer representing the
     * render quantum size of the audio graph, which is the number of audio sample frames processed in each processing
     * iteration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/renderQuantumSize)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val renderQuantumSize: Int

    /**
     * The audioWorklet read-only property of the BaseAudioContext interface returns an instance of AudioWorklet that
     * can be used for adding AudioWorkletProcessor-derived classes which implement custom audio processing.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/audioWorklet)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val audioWorklet: AudioWorklet

    /**
     * A statechange event is fired at a BaseAudioContext object when its state member changes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/statechange_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onstatechange: ((Event) -> Unit)?

    /**
     * The createAnalyser() method of the BaseAudioContext interface creates an AnalyserNode, which can be used to
     * expose audio time and frequency data and create data visualizations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createAnalyser)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createAnalyser(): AnalyserNode

    /**
     * The createBiquadFilter() method of the BaseAudioContext interface creates a BiquadFilterNode, which represents a
     * second order filter configurable as several different common filter types.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createBiquadFilter)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createBiquadFilter(): BiquadFilterNode

    /**
     * The createBuffer() method of the BaseAudioContext Interface is used to create a new, empty AudioBuffer object,
     * which can then be populated by data, and played via an AudioBufferSourceNode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createBuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createBuffer(numberOfChannels: Int, length: Int, sampleRate: Float): AudioBuffer

    /**
     * The createBufferSource() method of the BaseAudioContext Interface is used to create a new AudioBufferSourceNode,
     * which can be used to play audio data contained within an AudioBuffer object. AudioBuffers are created using
     * BaseAudioContext.createBuffer or returned by BaseAudioContext.decodeAudioData when it successfully decodes an
     * audio track.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createBufferSource)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createBufferSource(): AudioBufferSourceNode

    /**
     * The createChannelMerger() method of the BaseAudioContext interface creates a ChannelMergerNode, which combines
     * channels from multiple audio streams into a single audio stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createChannelMerger)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createChannelMerger(numberOfInputs: Int = definedExternally): ChannelMergerNode

    /**
     * The createChannelSplitter() method of the BaseAudioContext Interface is used to create a ChannelSplitterNode,
     * which is used to access the individual channels of an audio stream and process them separately.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createChannelSplitter)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createChannelSplitter(numberOfOutputs: Int = definedExternally): ChannelSplitterNode

    /**
     * The createConstantSource() property of the BaseAudioContext interface creates a ConstantSourceNode object, which
     * is an audio source that continuously outputs a monaural (one-channel) sound signal whose samples all have the
     * same value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createConstantSource)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createConstantSource(): ConstantSourceNode

    /**
     * The createConvolver() method of the BaseAudioContext interface creates a ConvolverNode, which is commonly used to
     * apply reverb effects to your audio. See the spec definition of Convolution for more information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createConvolver)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createConvolver(): ConvolverNode

    /**
     * The createDelay() method of the BaseAudioContext Interface is used to create a DelayNode, which is used to delay
     * the incoming audio signal by a certain amount of time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createDelay)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createDelay(maxDelayTime: Double = definedExternally): DelayNode

    /**
     * The createDynamicsCompressor() method of the BaseAudioContext Interface is used to create a
     * DynamicsCompressorNode, which can be used to apply compression to an audio signal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createDynamicsCompressor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createDynamicsCompressor(): DynamicsCompressorNode

    /**
     * The createGain() method of the BaseAudioContext interface creates a GainNode, which can be used to control the
     * overall gain (or volume) of the audio graph.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createGain)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createGain(): GainNode

    /**
     * The createIIRFilter() method of the BaseAudioContext interface creates an IIRFilterNode, which represents a
     * general infinite impulse response (IIR) filter which can be configured to serve as various types of filter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createIIRFilter)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createIIRFilter(feedforward: JsArray<JsNumber>, feedback: JsArray<JsNumber>): IIRFilterNode

    /**
     * The createOscillator() method of the BaseAudioContext interface creates an OscillatorNode, a source representing
     * a periodic waveform. It basically generates a constant tone.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createOscillator)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createOscillator(): OscillatorNode

    /**
     * The createPanner() method of the BaseAudioContext Interface is used to create a new PannerNode, which is used to
     * spatialize an incoming audio stream in 3D space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createPanner)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createPanner(): PannerNode

    /**
     * The createPeriodicWave() method of the BaseAudioContext interface is used to create a PeriodicWave. This wave is
     * used to define a periodic waveform that can be used to shape the output of an OscillatorNode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createPeriodicWave)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createPeriodicWave(real: JsArray<JsNumber>, imag: JsArray<JsNumber>, constraints: PeriodicWaveConstraints = definedExternally): PeriodicWave

    /**
     * The createScriptProcessor() method of the BaseAudioContext interface creates a ScriptProcessorNode used for
     * direct audio processing.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createScriptProcessor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createScriptProcessor(bufferSize: Int = definedExternally, numberOfInputChannels: Int = definedExternally, numberOfOutputChannels: Int = definedExternally): ScriptProcessorNode

    /**
     * The createStereoPanner() method of the BaseAudioContext interface creates a StereoPannerNode, which can be used
     * to apply stereo panning to an audio source. It positions an incoming audio stream in a stereo image using a
     * low-cost panning algorithm.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createStereoPanner)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createStereoPanner(): StereoPannerNode

    /**
     * The createWaveShaper() method of the BaseAudioContext interface creates a WaveShaperNode, which represents a
     * non-linear distortion. It is used to apply distortion effects to your audio.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/createWaveShaper)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createWaveShaper(): WaveShaperNode

    /**
     * The decodeAudioData() method of the BaseAudioContext Interface is used to asynchronously decode audio file data
     * contained in an ArrayBuffer that is loaded from fetch(), XMLHttpRequest, or FileReader. The decoded AudioBuffer
     * is resampled to the AudioContext's sampling rate, then passed to a callback or promise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/decodeAudioData)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun decodeAudioData(audioData: ArrayBuffer, successCallback: ((AudioBuffer) -> Unit)? = definedExternally, errorCallback: ((DOMException) -> Unit)? = definedExternally): Promise<AudioBuffer>
}

public external interface AudioContextLatencyCategory : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val AudioContextLatencyCategory.Companion.BALANCED: AudioContextLatencyCategory get() = "balanced".toJsString().unsafeCast<AudioContextLatencyCategory>()
public inline val AudioContextLatencyCategory.Companion.INTERACTIVE: AudioContextLatencyCategory get() = "interactive".toJsString().unsafeCast<AudioContextLatencyCategory>()
public inline val AudioContextLatencyCategory.Companion.PLAYBACK: AudioContextLatencyCategory get() = "playback".toJsString().unsafeCast<AudioContextLatencyCategory>()

public external interface AudioSinkType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val AudioSinkType.Companion.NONE: AudioSinkType get() = "none".toJsString().unsafeCast<AudioSinkType>()

/**
 * The AudioContext interface represents an audio-processing graph built from audio modules linked together, each
 * represented by an AudioNode.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class AudioContext : BaseAudioContext {
    /**
     * The AudioContext() constructor creates a new AudioContext object which represents an audio-processing graph,
     * built from audio modules linked together, each represented by an AudioNode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/AudioContext)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(contextOptions: AudioContextOptions = definedExternally)

    /**
     * The baseLatency read-only property of the AudioContext interface returns a double that represents the number of
     * seconds of processing latency incurred by the AudioContext passing an audio buffer from the AudioDestinationNode
     * — i.e., the end of the audio graph — into the host system's audio subsystem ready for playing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/baseLatency)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val baseLatency: Double

    /**
     * The outputLatency read-only property of the AudioContext Interface provides an estimation of the output latency
     * of the current audio context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/outputLatency)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val outputLatency: Double

    /**
     * The sinkId read-only property of the AudioContext interface returns the sink ID of the current output audio
     * device.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/sinkId)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val sinkId: JsAny

    /**
     * The sinkchange event of the AudioContext interface is fired when the output audio device (and therefore, the
     * AudioContext.sinkId) has changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/sinkchange_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onsinkchange: ((Event) -> Unit)?
    public open var onerror: ((Event) -> Unit)?

    /**
     * The playbackStats read-only property of the AudioContext interface returns an AudioPlaybackStats object providing
     * access to duration, underrun, and latency statistics for the AudioContext. These statistics allow you to measure
     * audio delay and glitches.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/playbackStats)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val playbackStats: AudioPlaybackStats

    /**
     * The getOutputTimestamp() method of the AudioContext interface returns a new AudioTimestamp object containing two
     * audio timestamp values relating to the current audio context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/getOutputTimestamp)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getOutputTimestamp(): AudioTimestamp

    /**
     * The resume() method of the AudioContext interface resumes the progression of time in an audio context that has
     * previously been suspended.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/resume)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun resume(): Promise<JsAny?>

    /**
     * The suspend() method of the AudioContext Interface suspends the progression of time in the audio context,
     * temporarily halting audio hardware access and reducing CPU/battery usage in the process — this is useful if you
     * want an application to power down the audio hardware when it will not be using an audio context for a while.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/suspend)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun suspend(): Promise<JsAny?>

    /**
     * The close() method of the AudioContext Interface closes the audio context, releasing any system audio resources
     * that it uses.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/close)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun close(): Promise<JsAny?>

    /**
     * The setSinkId() method of the AudioContext interface sets the output audio device for the AudioContext. If a sink
     * ID is not explicitly set, the default system audio output device will be used.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/setSinkId)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setSinkId(sinkId: String): Promise<JsAny?>

    /**
     * The setSinkId() method of the AudioContext interface sets the output audio device for the AudioContext. If a sink
     * ID is not explicitly set, the default system audio output device will be used.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/setSinkId)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setSinkId(sinkId: AudioSinkOptions): Promise<JsAny?>

    /**
     * The createMediaElementSource() method of the AudioContext Interface is used to create a new
     * MediaElementAudioSourceNode object, given an existing HTML &lt;audio&gt; or &lt;video&gt; element, the audio from
     * which can then be played and manipulated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/createMediaElementSource)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createMediaElementSource(mediaElement: HTMLMediaElement): MediaElementAudioSourceNode

    /**
     * The createMediaStreamSource() method of the AudioContext Interface is used to create a new
     * MediaStreamAudioSourceNode object, given a media stream (say, from a MediaDevices.getUserMedia instance), the
     * audio from which can then be played and manipulated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/createMediaStreamSource)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createMediaStreamSource(mediaStream: MediaStream): MediaStreamAudioSourceNode

    /**
     * The createMediaStreamTrackSource() method of the AudioContext interface creates and returns a
     * MediaStreamTrackAudioSourceNode which represents an audio source whose data comes from the specified
     * MediaStreamTrack.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/createMediaStreamTrackSource)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createMediaStreamTrackSource(mediaStreamTrack: MediaStreamTrack): MediaStreamTrackAudioSourceNode

    /**
     * The createMediaStreamDestination() method of the AudioContext Interface is used to create a new
     * MediaStreamAudioDestinationNode object associated with a WebRTC MediaStream representing an audio stream, which
     * may be stored in a local file or sent to another computer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/createMediaStreamDestination)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createMediaStreamDestination(): MediaStreamAudioDestinationNode
}

public external interface AudioContextOptions : JsAny {
    public var latencyHint: JsAny?
    public var sampleRate: Float?
    public var sinkId: JsAny?
    public var renderSizeHint: JsAny?
}

public fun AudioContextOptions(latencyHint: JsAny? = null, sampleRate: Float? = null, sinkId: JsAny? = null, renderSizeHint: JsAny? = null): AudioContextOptions {
    val dictionary = newJsObject<AudioContextOptions>()
    if (latencyHint != null) dictionary.latencyHint = latencyHint
    if (sampleRate != null) dictionary.sampleRate = sampleRate
    if (sinkId != null) dictionary.sinkId = sinkId
    if (renderSizeHint != null) dictionary.renderSizeHint = renderSizeHint
    return dictionary
}

public external interface AudioSinkOptions : JsAny {
    public var type: AudioSinkType
}

public fun AudioSinkOptions(type: AudioSinkType): AudioSinkOptions {
    val dictionary = newJsObject<AudioSinkOptions>()
    dictionary.type = type
    return dictionary
}

/**
 * The AudioSinkInfo interface of the Web Audio API represents information describing an AudioContext's sink ID,
 * retrieved via AudioContext.sinkId.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioSinkInfo)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class AudioSinkInfo : JsAny {
    /**
     * The type read-only property of the AudioSinkInfo interface returns the type of the audio output device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioSinkInfo/type)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val type: AudioSinkType
}

public external interface AudioTimestamp : JsAny {
    public var contextTime: Double?
    public var performanceTime: Double?
}

public fun AudioTimestamp(contextTime: Double? = null, performanceTime: Double? = null): AudioTimestamp {
    val dictionary = newJsObject<AudioTimestamp>()
    if (contextTime != null) dictionary.contextTime = contextTime
    if (performanceTime != null) dictionary.performanceTime = performanceTime
    return dictionary
}

/**
 * The OfflineAudioContext interface is an AudioContext interface representing an audio-processing graph built from
 * linked together AudioNodes. In contrast with a standard AudioContext, an OfflineAudioContext doesn't render the audio
 * to the device hardware; instead, it generates it, as fast as it can, and outputs the result to an AudioBuffer.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class OfflineAudioContext : BaseAudioContext {
    /**
     * The OfflineAudioContext() constructor creates and returns a new OfflineAudioContext object instance, which can
     * then be used to render audio to an AudioBuffer rather than to an audio output device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/OfflineAudioContext)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(contextOptions: OfflineAudioContextOptions)

    /**
     * The OfflineAudioContext() constructor creates and returns a new OfflineAudioContext object instance, which can
     * then be used to render audio to an AudioBuffer rather than to an audio output device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/OfflineAudioContext)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(numberOfChannels: Int, length: Int, sampleRate: Float)

    /**
     * The startRendering() method of the OfflineAudioContext Interface starts rendering the audio graph, taking into
     * account the current connections and the current scheduled changes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/startRendering)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun startRendering(chunkSize: Int? = definedExternally): Promise<AudioBuffer>

    /**
     * The resume() method of the OfflineAudioContext interface resumes the progression of time in an audio context that
     * has been suspended. The promise resolves immediately because the OfflineAudioContext does not require the audio
     * hardware.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/resume)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun resume(): Promise<JsAny?>

    /**
     * The suspend() method of the OfflineAudioContext interface schedules a suspension of the time progression in the
     * audio context at the specified time and returns a promise. This is generally useful at the time of manipulating
     * the audio graph synchronously on OfflineAudioContext.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/suspend)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun suspend(suspendTime: Double): Promise<JsAny?>
    public open fun close(): Promise<JsAny?>

    /**
     * The length property of the OfflineAudioContext interface returns an integer representing the size of the buffer
     * in sample-frames.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/length)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val length: Int?

    /**
     * The complete event of the OfflineAudioContext interface is fired when the rendering of an offline audio context
     * is complete.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioContext/complete_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var oncomplete: ((OfflineAudioCompletionEvent) -> Unit)?
}

public external interface OfflineAudioContextOptions : JsAny {
    public var numberOfChannels: Int?
    public var length: Int?
    public var sampleRate: Float
    public var renderSizeHint: JsAny?
}

public fun OfflineAudioContextOptions(sampleRate: Float, numberOfChannels: Int? = null, length: Int? = null, renderSizeHint: JsAny? = null): OfflineAudioContextOptions {
    val dictionary = newJsObject<OfflineAudioContextOptions>()
    dictionary.sampleRate = sampleRate
    if (numberOfChannels != null) dictionary.numberOfChannels = numberOfChannels
    if (length != null) dictionary.length = length
    if (renderSizeHint != null) dictionary.renderSizeHint = renderSizeHint
    return dictionary
}

/**
 * The Web Audio API OfflineAudioCompletionEvent interface represents events that occur when the processing of an
 * OfflineAudioContext is terminated. The complete event uses this interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioCompletionEvent)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class OfflineAudioCompletionEvent : Event {
    /**
     * The OfflineAudioCompletionEvent() constructor of the Web Audio API creates a new OfflineAudioCompletionEvent
     * object.
     *
     * [MDN
     * Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioCompletionEvent/OfflineAudioCompletionEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(type: String, eventInitDict: OfflineAudioCompletionEventInit)

    /**
     * The renderedBuffer read-only property of the OfflineAudioCompletionEvent interface is an AudioBuffer containing
     * the result of processing an OfflineAudioContext.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OfflineAudioCompletionEvent/renderedBuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val renderedBuffer: AudioBuffer

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface OfflineAudioCompletionEventInit : EventInit {
    public var renderedBuffer: AudioBuffer
}

public fun OfflineAudioCompletionEventInit(renderedBuffer: AudioBuffer, bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null): OfflineAudioCompletionEventInit {
    val dictionary = newJsObject<OfflineAudioCompletionEventInit>()
    dictionary.renderedBuffer = renderedBuffer
    if (bubbles != null) dictionary.bubbles = bubbles
    if (cancelable != null) dictionary.cancelable = cancelable
    if (composed != null) dictionary.composed = composed
    return dictionary
}

/**
 * The AudioBuffer interface represents a short audio asset residing in memory, created from an audio file using the
 * AudioContext.decodeAudioData() method, or from raw data using AudioContext.createBuffer(). Once put into an
 * AudioBuffer, the audio can then be played by being passed into an AudioBufferSourceNode.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class AudioBuffer : JsAny {
    /**
     * The AudioBuffer constructor of the Web Audio API creates a new AudioBuffer object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/AudioBuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(options: AudioBufferOptions)

    /**
     * The sampleRate property of the AudioBuffer interface returns a float representing the sample rate, in samples per
     * second, of the PCM data stored in the buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/sampleRate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val sampleRate: Float

    /**
     * The length property of the AudioBuffer interface returns an integer representing the length, in sample-frames, of
     * the PCM data stored in the buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/length)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val length: Int

    /**
     * The duration property of the AudioBuffer interface returns a double representing the duration, in seconds, of the
     * PCM data stored in the buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/duration)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val duration: Double

    /**
     * The numberOfChannels property of the AudioBuffer interface returns an integer representing the number of discrete
     * audio channels described by the PCM data stored in the buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/numberOfChannels)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val numberOfChannels: Int

    /**
     * The getChannelData() method of the AudioBuffer Interface returns a Float32Array containing the PCM data
     * associated with the channel, defined by the channel parameter (with 0 representing the first channel).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/getChannelData)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getChannelData(channel: Int): Float32Array

    /**
     * The copyFromChannel() method of the AudioBuffer interface copies the audio sample data from the specified channel
     * of the AudioBuffer to a specified Float32Array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/copyFromChannel)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun copyFromChannel(destination: Float32Array, channelNumber: Int, bufferOffset: Int = definedExternally)

    /**
     * The copyToChannel() method of the AudioBuffer interface copies the samples to the specified channel of the
     * AudioBuffer, from the source array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/copyToChannel)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun copyToChannel(source: Float32Array, channelNumber: Int, bufferOffset: Int = definedExternally)
}

public external interface AudioBufferOptions : JsAny {
    public var numberOfChannels: Int?
    public var length: Int
    public var sampleRate: Float
}

public fun AudioBufferOptions(length: Int, sampleRate: Float, numberOfChannels: Int? = null): AudioBufferOptions {
    val dictionary = newJsObject<AudioBufferOptions>()
    dictionary.length = length
    dictionary.sampleRate = sampleRate
    if (numberOfChannels != null) dictionary.numberOfChannels = numberOfChannels
    return dictionary
}

/**
 * The AudioNode interface is a generic interface for representing an audio processing module.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class AudioNode : EventTarget {
    /**
     * The connect() method of the AudioNode interface lets you connect one of the node's outputs to a target, which may
     * be either another AudioNode (thereby directing the sound data to the specified node) or an AudioParam, so that
     * the node's output data is automatically used to change the value of that parameter over time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/connect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun connect(destinationNode: AudioNode, output: Int = definedExternally, input: Int = definedExternally): AudioNode

    /**
     * The connect() method of the AudioNode interface lets you connect one of the node's outputs to a target, which may
     * be either another AudioNode (thereby directing the sound data to the specified node) or an AudioParam, so that
     * the node's output data is automatically used to change the value of that parameter over time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/connect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun connect(destinationParam: AudioParam, output: Int = definedExternally)

    /**
     * The disconnect() method of the AudioNode interface lets you disconnect one or more nodes from the node on which
     * the method is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/disconnect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun disconnect()

    /**
     * The disconnect() method of the AudioNode interface lets you disconnect one or more nodes from the node on which
     * the method is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/disconnect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun disconnect(output: Int)

    /**
     * The disconnect() method of the AudioNode interface lets you disconnect one or more nodes from the node on which
     * the method is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/disconnect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun disconnect(destinationNode: AudioNode)

    /**
     * The disconnect() method of the AudioNode interface lets you disconnect one or more nodes from the node on which
     * the method is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/disconnect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun disconnect(destinationNode: AudioNode, output: Int)

    /**
     * The disconnect() method of the AudioNode interface lets you disconnect one or more nodes from the node on which
     * the method is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/disconnect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun disconnect(destinationNode: AudioNode, output: Int, input: Int)

    /**
     * The disconnect() method of the AudioNode interface lets you disconnect one or more nodes from the node on which
     * the method is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/disconnect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun disconnect(destinationParam: AudioParam)

    /**
     * The disconnect() method of the AudioNode interface lets you disconnect one or more nodes from the node on which
     * the method is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/disconnect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun disconnect(destinationParam: AudioParam, output: Int)

    /**
     * The read-only context property of the AudioNode interface returns the associated BaseAudioContext, that is the
     * object representing the processing graph the node is participating in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/context)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val context: BaseAudioContext

    /**
     * The numberOfInputs read-only property of the AudioNode interface returns the number of inputs feeding the node.
     * Source nodes are defined as nodes having a numberOfInputs property with a value of 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/numberOfInputs)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val numberOfInputs: Int

    /**
     * The numberOfOutputs read-only property of the AudioNode interface returns the number of outputs coming out of the
     * node. Destination nodes — like AudioDestinationNode — have a value of 0 for this attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/numberOfOutputs)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val numberOfOutputs: Int

    /**
     * The channelCount property of the AudioNode interface represents an integer used to determine how many channels
     * are used when up-mixing and down-mixing connections to any inputs to the node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelCount)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var channelCount: Int

    /**
     * The channelCountMode property of the AudioNode interface represents an enumerated value describing the way
     * channels must be matched between the node's inputs and outputs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelCountMode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var channelCountMode: ChannelCountMode

    /**
     * The channelInterpretation property of the AudioNode interface represents an enumerated value describing how input
     * channels are mapped to output channels when the number of inputs/outputs is different. For example, this setting
     * defines how a mono input will be up-mixed to a stereo or 5.1 channel output, or how a quad channel input will be
     * down-mixed to a stereo or mono output.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelInterpretation)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var channelInterpretation: ChannelInterpretation
}

public external interface ChannelCountMode : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val ChannelCountMode.Companion.MAX: ChannelCountMode get() = "max".toJsString().unsafeCast<ChannelCountMode>()
public inline val ChannelCountMode.Companion.CLAMPED_MAX: ChannelCountMode get() = "clamped-max".toJsString().unsafeCast<ChannelCountMode>()
public inline val ChannelCountMode.Companion.EXPLICIT: ChannelCountMode get() = "explicit".toJsString().unsafeCast<ChannelCountMode>()

public external interface ChannelInterpretation : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val ChannelInterpretation.Companion.SPEAKERS: ChannelInterpretation get() = "speakers".toJsString().unsafeCast<ChannelInterpretation>()
public inline val ChannelInterpretation.Companion.DISCRETE: ChannelInterpretation get() = "discrete".toJsString().unsafeCast<ChannelInterpretation>()

public external interface AudioNodeOptions : JsAny {
    public var channelCount: Int?
    public var channelCountMode: ChannelCountMode?
    public var channelInterpretation: ChannelInterpretation?
}

public fun AudioNodeOptions(channelCount: Int? = null, channelCountMode: ChannelCountMode? = null, channelInterpretation: ChannelInterpretation? = null): AudioNodeOptions {
    val dictionary = newJsObject<AudioNodeOptions>()
    if (channelCount != null) dictionary.channelCount = channelCount
    if (channelCountMode != null) dictionary.channelCountMode = channelCountMode
    if (channelInterpretation != null) dictionary.channelInterpretation = channelInterpretation
    return dictionary
}

public external interface AutomationRate : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val AutomationRate.Companion.A_RATE: AutomationRate get() = "a-rate".toJsString().unsafeCast<AutomationRate>()
public inline val AutomationRate.Companion.K_RATE: AutomationRate get() = "k-rate".toJsString().unsafeCast<AutomationRate>()

/**
 * The Web Audio API's AudioParam interface represents an audio-related parameter, usually a parameter of an AudioNode
 * (such as GainNode.gain).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class AudioParam : JsAny {
    /**
     * The value property of the AudioParam interface gets or sets the value of this AudioParam at the current time.
     * Initially, the value is set to AudioParam.defaultValue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/value)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var value: Float
    public open var automationRate: AutomationRate

    /**
     * The defaultValue read-only property of the AudioParam interface represents the initial value of the attributes as
     * defined by the specific AudioNode creating the AudioParam.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/defaultValue)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val defaultValue: Float

    /**
     * The minValue read-only property of the AudioParam interface represents the minimum possible value for the
     * parameter's nominal (effective) range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/minValue)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val minValue: Float

    /**
     * The maxValue read-only property of the AudioParam interface represents the maximum possible value for the
     * parameter's nominal (effective) range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/maxValue)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val maxValue: Float

    /**
     * The setValueAtTime() method of the AudioParam interface schedules an instant change to the AudioParam value at a
     * precise time, as measured against AudioContext.currentTime. The new value is given in the value parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/setValueAtTime)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setValueAtTime(value: Float, startTime: Double): AudioParam

    /**
     * The linearRampToValueAtTime() method of the AudioParam Interface schedules a gradual linear change in the value
     * of the AudioParam. The change starts at the time specified for the previous event, follows a linear ramp to the
     * new value given in the value parameter, and reaches the new value at the time given in the endTime parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/linearRampToValueAtTime)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun linearRampToValueAtTime(value: Float, endTime: Double): AudioParam

    /**
     * The exponentialRampToValueAtTime() method of the AudioParam Interface schedules a gradual exponential change in
     * the value of the AudioParam. The change starts at the time specified for the previous event, follows an
     * exponential ramp to the new value given in the value parameter, and reaches the new value at the time given in
     * the endTime parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/exponentialRampToValueAtTime)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun exponentialRampToValueAtTime(value: Float, endTime: Double): AudioParam

    /**
     * The setTargetAtTime() method of the AudioParam interface schedules the start of a gradual change to the
     * AudioParam value. This is useful for decay or release portions of ADSR envelopes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/setTargetAtTime)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setTargetAtTime(target: Float, startTime: Double, timeConstant: Float): AudioParam

    /**
     * The setValueCurveAtTime() method of the AudioParam interface schedules the parameter's value to change following
     * a curve defined by a list of values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/setValueCurveAtTime)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setValueCurveAtTime(values: JsArray<JsNumber>, startTime: Double, duration: Double): AudioParam

    /**
     * The cancelScheduledValues() method of the AudioParam Interface cancels all scheduled future changes to the
     * AudioParam.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/cancelScheduledValues)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun cancelScheduledValues(cancelTime: Double): AudioParam

    /**
     * The cancelAndHoldAtTime() method of the AudioParam interface cancels all scheduled future changes to the
     * AudioParam but holds its value at a given time until further changes are made using other methods.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/cancelAndHoldAtTime)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun cancelAndHoldAtTime(cancelTime: Double): AudioParam
}

/**
 * The AudioScheduledSourceNode interface—part of the Web Audio API—is a parent interface for several types of audio
 * source node interfaces which share the ability to be started and stopped, optionally at specified times.
 * Specifically, this interface defines the start() and stop() methods, as well as the ended event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class AudioScheduledSourceNode : AudioNode {
    /**
     * The ended event of the AudioScheduledSourceNode interface is fired when the source node has stopped playing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/ended_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onended: ((Event) -> Unit)?

    /**
     * The start() method on AudioScheduledSourceNode schedules a sound to begin playback at the specified time. If no
     * time is specified, then the sound begins playing immediately.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/start)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun start(`when`: Double = definedExternally)

    /**
     * The stop() method on AudioScheduledSourceNode schedules a sound to cease playback at the specified time. If no
     * time is specified, then the sound stops playing immediately.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/stop)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun stop(`when`: Double = definedExternally)
}

/**
 * The AnalyserNode interface represents a node able to provide real-time frequency and time-domain analysis
 * information. It is an AudioNode that passes the audio stream unchanged from the input to the output, but allows you
 * to take the generated data, process it, and create audio visualizations.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class AnalyserNode : AudioNode {
    /**
     * The AnalyserNode() constructor of the Web Audio API creates a new AnalyserNode object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/AnalyserNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, options: AnalyserOptions = definedExternally)

    /**
     * The getFloatFrequencyData() method of the AnalyserNode Interface copies the current frequency data into a
     * Float32Array array passed into it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/getFloatFrequencyData)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getFloatFrequencyData(array: Float32Array)

    /**
     * The getByteFrequencyData() method of the AnalyserNode interface copies the current frequency data into a
     * Uint8Array (unsigned byte array) passed into it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/getByteFrequencyData)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getByteFrequencyData(array: Uint8Array)

    /**
     * The getFloatTimeDomainData() method of the AnalyserNode Interface copies the current waveform, or time-domain,
     * data into a Float32Array array passed into it. Each array value is a sample, the magnitude of the signal at a
     * particular time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/getFloatTimeDomainData)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getFloatTimeDomainData(array: Float32Array)

    /**
     * The getByteTimeDomainData() method of the AnalyserNode Interface copies the current waveform, or time-domain,
     * data into a Uint8Array (unsigned byte array) passed into it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/getByteTimeDomainData)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getByteTimeDomainData(array: Uint8Array)

    /**
     * The fftSize property of the AnalyserNode interface is an unsigned long value and represents the window size in
     * samples that is used when performing a Fast Fourier Transform (FFT) to get frequency domain data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/fftSize)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var fftSize: Int

    /**
     * The frequencyBinCount read-only property of the AnalyserNode interface contains the total number of data points
     * available to AudioContext sampleRate. This is half of the value of the AnalyserNode.fftSize. The two methods'
     * indices have a linear relationship with the frequencies they represent, between 0 and the Nyquist frequency.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/frequencyBinCount)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val frequencyBinCount: Int

    /**
     * The minDecibels property of the AnalyserNode interface is a double value representing the minimum power value in
     * the scaling range for the FFT analysis data, for conversion to unsigned byte values — basically, this specifies
     * the minimum value for the range of results when using getByteFrequencyData().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/minDecibels)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var minDecibels: Double

    /**
     * The maxDecibels property of the AnalyserNode interface is a double value representing the maximum power value in
     * the scaling range for the FFT analysis data, for conversion to unsigned byte values — basically, this specifies
     * the maximum value for the range of results when using getByteFrequencyData().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/maxDecibels)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var maxDecibels: Double

    /**
     * The smoothingTimeConstant property of the AnalyserNode interface is a double value representing the averaging
     * constant with the last analysis frame. It's basically an average between the current buffer and the last buffer
     * the AnalyserNode processed, and results in a much smoother set of value changes over time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/smoothingTimeConstant)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var smoothingTimeConstant: Double
}

public external interface AnalyserOptions : AudioNodeOptions {
    public var fftSize: Int?
    public var maxDecibels: Double?
    public var minDecibels: Double?
    public var smoothingTimeConstant: Double?
}

public fun AnalyserOptions(channelCount: Int? = null, channelCountMode: ChannelCountMode? = null, channelInterpretation: ChannelInterpretation? = null, fftSize: Int? = null, maxDecibels: Double? = null, minDecibels: Double? = null, smoothingTimeConstant: Double? = null): AnalyserOptions {
    val dictionary = newJsObject<AnalyserOptions>()
    if (channelCount != null) dictionary.channelCount = channelCount
    if (channelCountMode != null) dictionary.channelCountMode = channelCountMode
    if (channelInterpretation != null) dictionary.channelInterpretation = channelInterpretation
    if (fftSize != null) dictionary.fftSize = fftSize
    if (maxDecibels != null) dictionary.maxDecibels = maxDecibels
    if (minDecibels != null) dictionary.minDecibels = minDecibels
    if (smoothingTimeConstant != null) dictionary.smoothingTimeConstant = smoothingTimeConstant
    return dictionary
}

/**
 * The AudioBufferSourceNode interface is an AudioScheduledSourceNode which represents an audio source consisting of
 * in-memory audio data, stored in an AudioBuffer.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class AudioBufferSourceNode : AudioScheduledSourceNode {
    /**
     * The AudioBufferSourceNode() constructor creates a new AudioBufferSourceNode object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/AudioBufferSourceNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, options: AudioBufferSourceOptions = definedExternally)

    /**
     * The buffer property of the AudioBufferSourceNode interface provides the ability to play back audio using an
     * AudioBuffer as the source of the sound data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/buffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var buffer: AudioBuffer?

    /**
     * The playbackRate read-only property of the AudioBufferSourceNode interface is a k-rate AudioParam that defines
     * the speed at which the audio asset will be played.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/playbackRate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val playbackRate: AudioParam

    /**
     * The detune property of the AudioBufferSourceNode interface is a k-rate AudioParam representing detuning of
     * oscillation in cents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/detune)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val detune: AudioParam

    /**
     * The loop property of the AudioBufferSourceNode interface is a Boolean indicating if the audio asset must be
     * replayed when the end of the AudioBuffer is reached.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/loop)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var loop: Boolean

    /**
     * The loopStart property of the AudioBufferSourceNode interface is a floating-point value indicating, in seconds,
     * where in the AudioBuffer the restart of the play must happen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/loopStart)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var loopStart: Double

    /**
     * The loopEnd property of the AudioBufferSourceNode interface specifies is a floating point number specifying, in
     * seconds, at what offset into playing the AudioBuffer playback should loop back to the time indicated by the
     * loopStart property. This is only used if the loop property is true.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/loopEnd)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var loopEnd: Double

    /**
     * The start() method of the AudioBufferSourceNode Interface is used to schedule playback of the audio data
     * contained in the buffer, or to begin playback immediately.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/start)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun start(`when`: Double = definedExternally, offset: Double = definedExternally, duration: Double = definedExternally)
}

public external interface AudioBufferSourceOptions : JsAny {
    public var buffer: AudioBuffer?
    public var detune: Float?
    public var loop: Boolean?
    public var loopEnd: Double?
    public var loopStart: Double?
    public var playbackRate: Float?
}

public fun AudioBufferSourceOptions(buffer: AudioBuffer? = null, detune: Float? = null, loop: Boolean? = null, loopEnd: Double? = null, loopStart: Double? = null, playbackRate: Float? = null): AudioBufferSourceOptions {
    val dictionary = newJsObject<AudioBufferSourceOptions>()
    if (buffer != null) dictionary.buffer = buffer
    if (detune != null) dictionary.detune = detune
    if (loop != null) dictionary.loop = loop
    if (loopEnd != null) dictionary.loopEnd = loopEnd
    if (loopStart != null) dictionary.loopStart = loopStart
    if (playbackRate != null) dictionary.playbackRate = playbackRate
    return dictionary
}

/**
 * The AudioDestinationNode interface represents the end destination of an audio graph in a given context — usually the
 * speakers of your device. It can also be the node that will "record" the audio data when used with an
 * OfflineAudioContext.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDestinationNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class AudioDestinationNode : AudioNode {
    /**
     * The maxChannelCount property of the AudioDestinationNode interface is an unsigned long defining the maximum
     * amount of channels that the physical device can handle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDestinationNode/maxChannelCount)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val maxChannelCount: Int
}

/**
 * The AudioListener interface represents the position and orientation of the unique person listening to the audio
 * scene, and is used in audio spatialization. All PannerNodes spatialize in relation to the AudioListener stored in the
 * BaseAudioContext.listener attribute.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class AudioListener : JsAny {
    /**
     * The positionX read-only property of the AudioListener interface is an AudioParam representing the x position of
     * the listener in 3D cartesian space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/positionX)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val positionX: AudioParam

    /**
     * The positionY read-only property of the AudioListener interface is an AudioParam representing the y position of
     * the listener in 3D cartesian space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/positionY)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val positionY: AudioParam

    /**
     * The positionZ read-only property of the AudioListener interface is an AudioParam representing the z position of
     * the listener in 3D cartesian space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/positionZ)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val positionZ: AudioParam

    /**
     * The forwardX read-only property of the AudioListener interface is an AudioParam representing the x value of the
     * direction vector defining the forward direction the listener is pointing in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/forwardX)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val forwardX: AudioParam

    /**
     * The forwardY read-only property of the AudioListener interface is an AudioParam representing the y value of the
     * direction vector defining the forward direction the listener is pointing in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/forwardY)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val forwardY: AudioParam

    /**
     * The forwardZ read-only property of the AudioListener interface is an AudioParam representing the z value of the
     * direction vector defining the forward direction the listener is pointing in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/forwardZ)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val forwardZ: AudioParam

    /**
     * The upX read-only property of the AudioListener interface is an AudioParam representing the x value of the
     * direction vector defining the up direction the listener is pointing in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/upX)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val upX: AudioParam

    /**
     * The upY read-only property of the AudioListener interface is an AudioParam representing the y value of the
     * direction vector defining the up direction the listener is pointing in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/upY)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val upY: AudioParam

    /**
     * The upZ read-only property of the AudioListener interface is an AudioParam representing the z value of the
     * direction vector defining the up direction the listener is pointing in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/upZ)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val upZ: AudioParam

    /**
     * The setPosition() method of the AudioListener Interface defines the position of the listener.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/setPosition)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setPosition(x: Float, y: Float, z: Float)

    /**
     * The setOrientation() method of the AudioListener interface defines the orientation of the listener.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioListener/setOrientation)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setOrientation(x: Float, y: Float, z: Float, xUp: Float, yUp: Float, zUp: Float)
}

/**
 * The AudioProcessingEvent interface of the Web Audio API represents events that occur when a ScriptProcessorNode input
 * buffer is ready to be processed.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioProcessingEvent)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class AudioProcessingEvent : Event {
    /**
     * The AudioProcessingEvent() constructor creates a new AudioProcessingEvent object.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioProcessingEvent/AudioProcessingEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(type: String, eventInitDict: AudioProcessingEventInit)

    /**
     * The playbackTime read-only property of the AudioProcessingEvent interface represents the time when the audio will
     * be played. It is in the same coordinate system as the time used by the AudioContext.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioProcessingEvent/playbackTime)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val playbackTime: Double

    /**
     * The inputBuffer read-only property of the AudioProcessingEvent interface represents the input buffer of an audio
     * processing event.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioProcessingEvent/inputBuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val inputBuffer: AudioBuffer

    /**
     * The outputBuffer read-only property of the AudioProcessingEvent interface represents the output buffer of an
     * audio processing event.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioProcessingEvent/outputBuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val outputBuffer: AudioBuffer

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface AudioProcessingEventInit : EventInit {
    public var playbackTime: Double
    public var inputBuffer: AudioBuffer
    public var outputBuffer: AudioBuffer
}

public fun AudioProcessingEventInit(playbackTime: Double, inputBuffer: AudioBuffer, outputBuffer: AudioBuffer, bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null): AudioProcessingEventInit {
    val dictionary = newJsObject<AudioProcessingEventInit>()
    dictionary.playbackTime = playbackTime
    dictionary.inputBuffer = inputBuffer
    dictionary.outputBuffer = outputBuffer
    if (bubbles != null) dictionary.bubbles = bubbles
    if (cancelable != null) dictionary.cancelable = cancelable
    if (composed != null) dictionary.composed = composed
    return dictionary
}

public external interface BiquadFilterType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val BiquadFilterType.Companion.LOWPASS: BiquadFilterType get() = "lowpass".toJsString().unsafeCast<BiquadFilterType>()
public inline val BiquadFilterType.Companion.HIGHPASS: BiquadFilterType get() = "highpass".toJsString().unsafeCast<BiquadFilterType>()
public inline val BiquadFilterType.Companion.BANDPASS: BiquadFilterType get() = "bandpass".toJsString().unsafeCast<BiquadFilterType>()
public inline val BiquadFilterType.Companion.LOWSHELF: BiquadFilterType get() = "lowshelf".toJsString().unsafeCast<BiquadFilterType>()
public inline val BiquadFilterType.Companion.HIGHSHELF: BiquadFilterType get() = "highshelf".toJsString().unsafeCast<BiquadFilterType>()
public inline val BiquadFilterType.Companion.PEAKING: BiquadFilterType get() = "peaking".toJsString().unsafeCast<BiquadFilterType>()
public inline val BiquadFilterType.Companion.NOTCH: BiquadFilterType get() = "notch".toJsString().unsafeCast<BiquadFilterType>()
public inline val BiquadFilterType.Companion.ALLPASS: BiquadFilterType get() = "allpass".toJsString().unsafeCast<BiquadFilterType>()

/**
 * The BiquadFilterNode interface represents a simple low-order filter, and is created using the
 * BaseAudioContext/createBiquadFilter method. It is an AudioNode that can represent different kinds of filters, tone
 * control devices, and graphic equalizers. A BiquadFilterNode always has exactly one input and one output.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class BiquadFilterNode : AudioNode {
    /**
     * The BiquadFilterNode() constructor of the Web Audio API creates a new BiquadFilterNode object, which represents a
     * simple low-order filter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/BiquadFilterNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, options: BiquadFilterOptions = definedExternally)

    /**
     * The type property of the BiquadFilterNode interface is a string (enum) value defining the kind of filtering
     * algorithm the node is implementing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/type)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var type: BiquadFilterType

    /**
     * The frequency property of the BiquadFilterNode interface is an a-rate AudioParam — a double representing a
     * frequency in the current filtering algorithm measured in hertz (Hz).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/frequency)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val frequency: AudioParam

    /**
     * The detune property of the BiquadFilterNode interface is an a-rate AudioParam representing detuning of the
     * frequency in cents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/detune)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val detune: AudioParam

    /**
     * The Q property of the BiquadFilterNode interface is an a-rate AudioParam, a double representing a Q factor, or
     * quality factor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/Q)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val Q: AudioParam

    /**
     * The gain property of the BiquadFilterNode interface is an a-rate AudioParam — a double representing the gain used
     * in the current filtering algorithm.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/gain)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val gain: AudioParam

    /**
     * The getFrequencyResponse() method of the BiquadFilterNode interface takes the current filtering algorithm's
     * settings and calculates the frequency response for frequencies specified in a specified array of frequencies.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/getFrequencyResponse)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getFrequencyResponse(frequencyHz: Float32Array, magResponse: Float32Array, phaseResponse: Float32Array)
}

public external interface BiquadFilterOptions : AudioNodeOptions {
    public var type: BiquadFilterType?
    public var Q: Float?
    public var detune: Float?
    public var frequency: Float?
    public var gain: Float?
}

public fun BiquadFilterOptions(channelCount: Int? = null, channelCountMode: ChannelCountMode? = null, channelInterpretation: ChannelInterpretation? = null, type: BiquadFilterType? = null, Q: Float? = null, detune: Float? = null, frequency: Float? = null, gain: Float? = null): BiquadFilterOptions {
    val dictionary = newJsObject<BiquadFilterOptions>()
    if (channelCount != null) dictionary.channelCount = channelCount
    if (channelCountMode != null) dictionary.channelCountMode = channelCountMode
    if (channelInterpretation != null) dictionary.channelInterpretation = channelInterpretation
    if (type != null) dictionary.type = type
    if (Q != null) dictionary.Q = Q
    if (detune != null) dictionary.detune = detune
    if (frequency != null) dictionary.frequency = frequency
    if (gain != null) dictionary.gain = gain
    return dictionary
}

/**
 * The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites different
 * mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for accessing
 * each channel separately, e.g., for performing channel mixing where gain must be separately controlled on each
 * channel.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ChannelMergerNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class ChannelMergerNode : AudioNode {
    /**
     * The ChannelMergerNode() constructor creates a new ChannelMergerNode object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ChannelMergerNode/ChannelMergerNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, options: ChannelMergerOptions = definedExternally)
}

public external interface ChannelMergerOptions : AudioNodeOptions {
    public var numberOfInputs: Int?
}

public fun ChannelMergerOptions(channelCount: Int? = null, channelCountMode: ChannelCountMode? = null, channelInterpretation: ChannelInterpretation? = null, numberOfInputs: Int? = null): ChannelMergerOptions {
    val dictionary = newJsObject<ChannelMergerOptions>()
    if (channelCount != null) dictionary.channelCount = channelCount
    if (channelCountMode != null) dictionary.channelCountMode = channelCountMode
    if (channelInterpretation != null) dictionary.channelInterpretation = channelInterpretation
    if (numberOfInputs != null) dictionary.numberOfInputs = numberOfInputs
    return dictionary
}

/**
 * The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the
 * different channels of an audio source into a set of mono outputs. This is useful for accessing each channel
 * separately, e.g., for performing channel mixing where gain must be separately controlled on each channel.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ChannelSplitterNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class ChannelSplitterNode : AudioNode {
    /**
     * The ChannelSplitterNode() constructor of the Web Audio API creates a new ChannelSplitterNode object instance,
     * representing a node that splits the input into a separate output for each of the source node's audio channels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ChannelSplitterNode/ChannelSplitterNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, options: ChannelSplitterOptions = definedExternally)
}

public external interface ChannelSplitterOptions : AudioNodeOptions {
    public var numberOfOutputs: Int?
}

public fun ChannelSplitterOptions(channelCount: Int? = null, channelCountMode: ChannelCountMode? = null, channelInterpretation: ChannelInterpretation? = null, numberOfOutputs: Int? = null): ChannelSplitterOptions {
    val dictionary = newJsObject<ChannelSplitterOptions>()
    if (channelCount != null) dictionary.channelCount = channelCount
    if (channelCountMode != null) dictionary.channelCountMode = channelCountMode
    if (channelInterpretation != null) dictionary.channelInterpretation = channelInterpretation
    if (numberOfOutputs != null) dictionary.numberOfOutputs = numberOfOutputs
    return dictionary
}

/**
 * The ConstantSourceNode interface—part of the Web Audio API—represents an audio source (based upon
 * AudioScheduledSourceNode) whose output is single unchanging value. This makes it useful for cases in which you need a
 * constant value coming in from an audio source. In addition, it can be used like a constructible AudioParam by
 * automating the value of its offset or by connecting another node to it; see Controlling multiple parameters with
 * ConstantSourceNode.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConstantSourceNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class ConstantSourceNode : AudioScheduledSourceNode {
    /**
     * The ConstantSourceNode() constructor creates a new ConstantSourceNode object instance, representing an audio
     * source which constantly outputs samples whose values are always the same.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConstantSourceNode/ConstantSourceNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, options: ConstantSourceOptions = definedExternally)

    /**
     * The read-only offset property of the ConstantSourceNode interface returns an AudioParam object indicating the
     * numeric a-rate value which is always returned by the source when asked for the next sample.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConstantSourceNode/offset)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val offset: AudioParam
}

public external interface ConstantSourceOptions : JsAny {
    public var offset: Float?
}

public fun ConstantSourceOptions(offset: Float? = null): ConstantSourceOptions {
    val dictionary = newJsObject<ConstantSourceOptions>()
    if (offset != null) dictionary.offset = offset
    return dictionary
}

/**
 * The ConvolverNode interface is an AudioNode that performs a Linear Convolution on a given AudioBuffer, often used to
 * achieve a reverb effect. A ConvolverNode always has exactly one input and one output.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConvolverNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class ConvolverNode : AudioNode {
    /**
     * The ConvolverNode() constructor of the Web Audio API creates a new ConvolverNode object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConvolverNode/ConvolverNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, options: ConvolverOptions = definedExternally)

    /**
     * The buffer property of the ConvolverNode interface represents a mono, stereo, or 4-channel AudioBuffer containing
     * the (possibly multichannel) impulse response used by the ConvolverNode to create the reverb effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConvolverNode/buffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var buffer: AudioBuffer?

    /**
     * The normalize property of the ConvolverNode interface is a boolean that controls whether the impulse response
     * from the buffer will be scaled by an equal-power normalization when the buffer attribute is set, or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConvolverNode/normalize)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var normalize: Boolean
}

public external interface ConvolverOptions : AudioNodeOptions {
    public var buffer: AudioBuffer?
    public var disableNormalization: Boolean?
}

public fun ConvolverOptions(channelCount: Int? = null, channelCountMode: ChannelCountMode? = null, channelInterpretation: ChannelInterpretation? = null, buffer: AudioBuffer? = null, disableNormalization: Boolean? = null): ConvolverOptions {
    val dictionary = newJsObject<ConvolverOptions>()
    if (channelCount != null) dictionary.channelCount = channelCount
    if (channelCountMode != null) dictionary.channelCountMode = channelCountMode
    if (channelInterpretation != null) dictionary.channelInterpretation = channelInterpretation
    if (buffer != null) dictionary.buffer = buffer
    if (disableNormalization != null) dictionary.disableNormalization = disableNormalization
    return dictionary
}

/**
 * The DelayNode interface represents a delay-line; an AudioNode audio-processing module that causes a delay between the
 * arrival of an input data and its propagation to the output.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DelayNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class DelayNode : AudioNode {
    /**
     * The DelayNode() constructor of the Web Audio API creates a new DelayNode object with a delay-line; an AudioNode
     * audio-processing module that causes a delay between the arrival of an input data, and its propagation to the
     * output.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DelayNode/DelayNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, options: DelayOptions = definedExternally)

    /**
     * The delayTime property of the DelayNode interface is an a-rate AudioParam representing the amount of delay to
     * apply.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DelayNode/delayTime)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val delayTime: AudioParam
}

public external interface DelayOptions : AudioNodeOptions {
    public var maxDelayTime: Double?
    public var delayTime: Double?
}

public fun DelayOptions(channelCount: Int? = null, channelCountMode: ChannelCountMode? = null, channelInterpretation: ChannelInterpretation? = null, maxDelayTime: Double? = null, delayTime: Double? = null): DelayOptions {
    val dictionary = newJsObject<DelayOptions>()
    if (channelCount != null) dictionary.channelCount = channelCount
    if (channelCountMode != null) dictionary.channelCountMode = channelCountMode
    if (channelInterpretation != null) dictionary.channelInterpretation = channelInterpretation
    if (maxDelayTime != null) dictionary.maxDelayTime = maxDelayTime
    if (delayTime != null) dictionary.delayTime = delayTime
    return dictionary
}

/**
 * The DynamicsCompressorNode interface provides a compression effect, which lowers the volume of the loudest parts of a
 * signal. Compression can help prevent clipping and distortion when multiple sounds are combined, and it is also used
 * in music production and game audio for dynamic control, tone shaping, and creative effects. DynamicsCompressorNode is
 * an AudioNode that has exactly one input and one output.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class DynamicsCompressorNode : AudioNode {
    /**
     * The DynamicsCompressorNode() constructor creates a new DynamicsCompressorNode object instance, which can be used
     * to provide a compression effect that lowers the volume of the loudest parts of a signal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/DynamicsCompressorNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, options: DynamicsCompressorOptions = definedExternally)

    /**
     * The threshold property of the DynamicsCompressorNode interface is a k-rate AudioParam representing the decibel
     * value above which the compression will start taking effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/threshold)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val threshold: AudioParam

    /**
     * The knee property of the DynamicsCompressorNode interface is a k-rate AudioParam containing a decibel value
     * representing the range above the threshold where the curve smoothly transitions to the compressed portion.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/knee)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val knee: AudioParam

    /**
     * The ratio property of the DynamicsCompressorNode interface Is a k-rate AudioParam representing the amount of
     * change, in dB, needed in the input for a 1 dB change in the output.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/ratio)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val ratio: AudioParam

    /**
     * The reduction read-only property of the DynamicsCompressorNode interface is a float representing the amount of
     * gain reduction currently applied by the compressor to the signal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/reduction)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val reduction: Float

    /**
     * The attack property of the DynamicsCompressorNode interface is a k-rate AudioParam representing the amount of
     * time, in seconds, required to reduce the gain by 10 dB. It defines how quickly the signal is adapted when its
     * volume is increased.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/attack)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val attack: AudioParam

    /**
     * The release property of the DynamicsCompressorNode interface Is a k-rate AudioParam representing the amount of
     * time, in seconds, required to increase the gain by 10 dB. It defines how quick the signal is adapted when its
     * volume is reduced.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DynamicsCompressorNode/release)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val release: AudioParam
}

public external interface DynamicsCompressorOptions : AudioNodeOptions {
    public var attack: Float?
    public var knee: Float?
    public var ratio: Float?
    public var release: Float?
    public var threshold: Float?
}

public fun DynamicsCompressorOptions(channelCount: Int? = null, channelCountMode: ChannelCountMode? = null, channelInterpretation: ChannelInterpretation? = null, attack: Float? = null, knee: Float? = null, ratio: Float? = null, release: Float? = null, threshold: Float? = null): DynamicsCompressorOptions {
    val dictionary = newJsObject<DynamicsCompressorOptions>()
    if (channelCount != null) dictionary.channelCount = channelCount
    if (channelCountMode != null) dictionary.channelCountMode = channelCountMode
    if (channelInterpretation != null) dictionary.channelInterpretation = channelInterpretation
    if (attack != null) dictionary.attack = attack
    if (knee != null) dictionary.knee = knee
    if (ratio != null) dictionary.ratio = ratio
    if (release != null) dictionary.release = release
    if (threshold != null) dictionary.threshold = threshold
    return dictionary
}

/**
 * The GainNode interface represents a change in volume. It is an AudioNode audio-processing module that causes a given
 * gain to be applied to the input data before its propagation to the output. A GainNode always has exactly one input
 * and one output, both with the same number of channels.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GainNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class GainNode : AudioNode {
    /**
     * The GainNode() constructor of the Web Audio API creates a new GainNode object which is an AudioNode that
     * represents a change in volume.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GainNode/GainNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, options: GainOptions = definedExternally)

    /**
     * The gain property of the GainNode interface is an a-rate AudioParam representing the amount of gain to apply.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GainNode/gain)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val gain: AudioParam
}

public external interface GainOptions : AudioNodeOptions {
    public var gain: Float?
}

public fun GainOptions(channelCount: Int? = null, channelCountMode: ChannelCountMode? = null, channelInterpretation: ChannelInterpretation? = null, gain: Float? = null): GainOptions {
    val dictionary = newJsObject<GainOptions>()
    if (channelCount != null) dictionary.channelCount = channelCount
    if (channelCountMode != null) dictionary.channelCountMode = channelCountMode
    if (channelInterpretation != null) dictionary.channelInterpretation = channelInterpretation
    if (gain != null) dictionary.gain = gain
    return dictionary
}

/**
 * The IIRFilterNode interface of the Web Audio API is an AudioNode processor which implements a general infinite
 * impulse response (IIR) filter; this type of filter can be used to implement tone control devices and graphic
 * equalizers as well. It lets the parameters of the filter response be specified, so that it can be tuned as needed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IIRFilterNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class IIRFilterNode : AudioNode {
    /**
     * The IIRFilterNode() constructor of the Web Audio API creates a new IIRFilterNode object which an AudioNode
     * processor which implements a general infinite impulse response filter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IIRFilterNode/IIRFilterNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, options: IIRFilterOptions)

    /**
     * The getFrequencyResponse() method of the IIRFilterNode interface takes the current filtering algorithm's settings
     * and calculates the frequency response for frequencies specified in a specified array of frequencies.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IIRFilterNode/getFrequencyResponse)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getFrequencyResponse(frequencyHz: Float32Array, magResponse: Float32Array, phaseResponse: Float32Array)
}

public external interface IIRFilterOptions : AudioNodeOptions {
    public var feedforward: JsArray<JsNumber>
    public var feedback: JsArray<JsNumber>
}

public fun IIRFilterOptions(feedforward: JsArray<JsNumber>, feedback: JsArray<JsNumber>, channelCount: Int? = null, channelCountMode: ChannelCountMode? = null, channelInterpretation: ChannelInterpretation? = null): IIRFilterOptions {
    val dictionary = newJsObject<IIRFilterOptions>()
    dictionary.feedforward = feedforward
    dictionary.feedback = feedback
    if (channelCount != null) dictionary.channelCount = channelCount
    if (channelCountMode != null) dictionary.channelCountMode = channelCountMode
    if (channelInterpretation != null) dictionary.channelInterpretation = channelInterpretation
    return dictionary
}

/**
 * The MediaElementAudioSourceNode interface represents an audio source consisting of an HTML &lt;audio&gt; or
 * &lt;video&gt; element. It is an AudioNode that acts as an audio source.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaElementAudioSourceNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class MediaElementAudioSourceNode : AudioNode {
    /**
     * The MediaElementAudioSourceNode() constructor creates a new MediaElementAudioSourceNode object instance.
     *
     * [MDN
     * Reference](https://developer.mozilla.org/docs/Web/API/MediaElementAudioSourceNode/MediaElementAudioSourceNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: AudioContext, options: MediaElementAudioSourceOptions)

    /**
     * The MediaElementAudioSourceNode interface's read-only mediaElement property indicates the HTMLMediaElement that
     * contains the audio track from which the node is receiving audio.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaElementAudioSourceNode/mediaElement)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val mediaElement: HTMLMediaElement
}

public external interface MediaElementAudioSourceOptions : JsAny {
    public var mediaElement: HTMLMediaElement
}

public fun MediaElementAudioSourceOptions(mediaElement: HTMLMediaElement): MediaElementAudioSourceOptions {
    val dictionary = newJsObject<MediaElementAudioSourceOptions>()
    dictionary.mediaElement = mediaElement
    return dictionary
}

/**
 * The MediaStreamAudioDestinationNode interface represents an audio destination consisting of a WebRTC MediaStream with
 * a single AudioMediaStreamTrack, which can be used in a similar way to a MediaStream obtained from
 * navigator.mediaDevices.getUserMedia().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamAudioDestinationNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class MediaStreamAudioDestinationNode : AudioNode {
    /**
     * The MediaStreamAudioDestinationNode() constructor of the Web Audio API creates a new
     * MediaStreamAudioDestinationNode object instance.
     *
     * [MDN
     * Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamAudioDestinationNode/MediaStreamAudioDestinationNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: AudioContext, options: AudioNodeOptions = definedExternally)

    /**
     * The stream property of the AudioContext interface represents a MediaStream containing a single audio
     * MediaStreamTrack with the same number of channels as the node itself.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamAudioDestinationNode/stream)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val stream: MediaStream
}

/**
 * The MediaStreamAudioSourceNode interface is a type of AudioNode which operates as an audio source whose media is
 * received from a MediaStream obtained using the WebRTC or Media Capture and Streams APIs.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamAudioSourceNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class MediaStreamAudioSourceNode : AudioNode {
    /**
     * The Web Audio API's MediaStreamAudioSourceNode() constructor creates and returns a new MediaStreamAudioSourceNode
     * object which uses the first audio track of a given MediaStream as its source.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamAudioSourceNode/MediaStreamAudioSourceNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: AudioContext, options: MediaStreamAudioSourceOptions)

    /**
     * The MediaStreamAudioSourceNode interface's read-only mediaStream property indicates the MediaStream that contains
     * the audio track from which the node is receiving audio.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamAudioSourceNode/mediaStream)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val mediaStream: MediaStream
}

public external interface MediaStreamAudioSourceOptions : JsAny {
    public var mediaStream: MediaStream
}

public fun MediaStreamAudioSourceOptions(mediaStream: MediaStream): MediaStreamAudioSourceOptions {
    val dictionary = newJsObject<MediaStreamAudioSourceOptions>()
    dictionary.mediaStream = mediaStream
    return dictionary
}

/**
 * The MediaStreamTrackAudioSourceNode interface is a type of AudioNode which represents a source of audio data taken
 * from a specific MediaStreamTrack obtained through the WebRTC or Media Capture and Streams APIs.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackAudioSourceNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class MediaStreamTrackAudioSourceNode : AudioNode {
    /**
     * The Web Audio API's MediaStreamTrackAudioSourceNode() constructor creates and returns a new
     * MediaStreamTrackAudioSourceNode object whose audio is taken from the MediaStreamTrack specified in the given
     * options object.
     *
     * [MDN
     * Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackAudioSourceNode/MediaStreamTrackAudioSourceNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: AudioContext, options: MediaStreamTrackAudioSourceOptions)
}

public external interface MediaStreamTrackAudioSourceOptions : JsAny {
    public var mediaStreamTrack: MediaStreamTrack
}

public fun MediaStreamTrackAudioSourceOptions(mediaStreamTrack: MediaStreamTrack): MediaStreamTrackAudioSourceOptions {
    val dictionary = newJsObject<MediaStreamTrackAudioSourceOptions>()
    dictionary.mediaStreamTrack = mediaStreamTrack
    return dictionary
}

public external interface OscillatorType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val OscillatorType.Companion.SINE: OscillatorType get() = "sine".toJsString().unsafeCast<OscillatorType>()
public inline val OscillatorType.Companion.SQUARE: OscillatorType get() = "square".toJsString().unsafeCast<OscillatorType>()
public inline val OscillatorType.Companion.SAWTOOTH: OscillatorType get() = "sawtooth".toJsString().unsafeCast<OscillatorType>()
public inline val OscillatorType.Companion.TRIANGLE: OscillatorType get() = "triangle".toJsString().unsafeCast<OscillatorType>()
public inline val OscillatorType.Companion.CUSTOM: OscillatorType get() = "custom".toJsString().unsafeCast<OscillatorType>()

/**
 * The OscillatorNode interface represents a periodic waveform, such as a sine wave. It is an AudioScheduledSourceNode
 * audio-processing module that causes a specified frequency of a given wave to be created—in effect, a constant tone.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class OscillatorNode : AudioScheduledSourceNode {
    /**
     * The OscillatorNode() constructor of the Web Audio API creates a new OscillatorNode object which is an AudioNode
     * that represents a periodic waveform, like a sine wave, optionally setting the node's properties' values to match
     * values in a specified object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/OscillatorNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, options: OscillatorOptions = definedExternally)

    /**
     * The type property of the OscillatorNode interface specifies what shape of waveform the oscillator will output.
     * There are several common waveforms available, as well as an option to specify a custom waveform shape. The shape
     * of the waveform will affect the tone that is produced.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/type)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var type: OscillatorType

    /**
     * The frequency property of the OscillatorNode interface is an a-rate AudioParam representing the frequency of
     * oscillation in hertz.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/frequency)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val frequency: AudioParam

    /**
     * The detune property of the OscillatorNode interface is an a-rate AudioParam representing detuning of oscillation
     * in cents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/detune)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val detune: AudioParam

    /**
     * The setPeriodicWave() method of the OscillatorNode interface is used to point to a PeriodicWave defining a
     * periodic waveform that can be used to shape the oscillator's output, when type is custom.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/setPeriodicWave)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setPeriodicWave(periodicWave: PeriodicWave)
}

public external interface OscillatorOptions : AudioNodeOptions {
    public var type: OscillatorType?
    public var frequency: Float?
    public var detune: Float?
    public var periodicWave: PeriodicWave?
}

public fun OscillatorOptions(channelCount: Int? = null, channelCountMode: ChannelCountMode? = null, channelInterpretation: ChannelInterpretation? = null, type: OscillatorType? = null, frequency: Float? = null, detune: Float? = null, periodicWave: PeriodicWave? = null): OscillatorOptions {
    val dictionary = newJsObject<OscillatorOptions>()
    if (channelCount != null) dictionary.channelCount = channelCount
    if (channelCountMode != null) dictionary.channelCountMode = channelCountMode
    if (channelInterpretation != null) dictionary.channelInterpretation = channelInterpretation
    if (type != null) dictionary.type = type
    if (frequency != null) dictionary.frequency = frequency
    if (detune != null) dictionary.detune = detune
    if (periodicWave != null) dictionary.periodicWave = periodicWave
    return dictionary
}

public external interface PanningModelType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val PanningModelType.Companion.EQUALPOWER: PanningModelType get() = "equalpower".toJsString().unsafeCast<PanningModelType>()
public inline val PanningModelType.Companion.HRTF: PanningModelType get() = "HRTF".toJsString().unsafeCast<PanningModelType>()

public external interface DistanceModelType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val DistanceModelType.Companion.LINEAR: DistanceModelType get() = "linear".toJsString().unsafeCast<DistanceModelType>()
public inline val DistanceModelType.Companion.INVERSE: DistanceModelType get() = "inverse".toJsString().unsafeCast<DistanceModelType>()
public inline val DistanceModelType.Companion.EXPONENTIAL: DistanceModelType get() = "exponential".toJsString().unsafeCast<DistanceModelType>()

/**
 * The PannerNode interface defines an audio-processing object that represents the location, direction, and behavior of
 * an audio source signal in a simulated physical space. This AudioNode uses right-hand Cartesian coordinates to
 * describe the source's position as a vector and its orientation as a 3D directional cone.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class PannerNode : AudioNode {
    /**
     * The PannerNode() constructor of the Web Audio API creates a new PannerNode object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/PannerNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, options: PannerOptions = definedExternally)

    /**
     * The panningModel property of the PannerNode interface is an enumerated value determining which spatialization
     * algorithm to use to position the audio in 3D space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/panningModel)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var panningModel: PanningModelType

    /**
     * The positionX property of the PannerNode interface specifies the X coordinate of the audio source's position in
     * 3D Cartesian coordinates, corresponding to the horizontal axis (left-right).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/positionX)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val positionX: AudioParam

    /**
     * The positionY property of the PannerNode interface specifies the Y coordinate of the audio source's position in
     * 3D Cartesian coordinates, corresponding to the vertical axis (top-bottom). The complete vector is defined by the
     * position of the audio source, given as (positionX, positionY, positionZ), and the orientation of the audio source
     * (that is, the direction in which it's facing), given as (orientationX, orientationY, orientationZ).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/positionY)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val positionY: AudioParam

    /**
     * The positionZ property of the PannerNode interface specifies the Z coordinate of the audio source's position in
     * 3D Cartesian coordinates, corresponding to the depth axis (behind-in front of the listener). The complete vector
     * is defined by the position of the audio source, given as (positionX, positionY, positionZ), and the orientation
     * of the audio source (that is, the direction in which it's facing), given as (orientationX, orientationY,
     * orientationZ).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/positionZ)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val positionZ: AudioParam

    /**
     * The orientationX property of the PannerNode interface indicates the X (horizontal) component of the direction in
     * which the audio source is facing, in a 3D Cartesian coordinate space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/orientationX)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val orientationX: AudioParam

    /**
     * The orientationY property of the PannerNode interface indicates the Y (vertical) component of the direction the
     * audio source is facing, in 3D Cartesian coordinate space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/orientationY)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val orientationY: AudioParam

    /**
     * The orientationZ property of the PannerNode interface indicates the Z (depth) component of the direction the
     * audio source is facing, in 3D Cartesian coordinate space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/orientationZ)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val orientationZ: AudioParam

    /**
     * The distanceModel property of the PannerNode interface is an enumerated value determining which algorithm to use
     * to reduce the volume of the audio source as it moves away from the listener.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/distanceModel)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var distanceModel: DistanceModelType

    /**
     * The refDistance property of the PannerNode interface is a double value representing the reference distance for
     * reducing volume as the audio source moves further from the listener – i.e., the distance at which the volume
     * reduction starts taking effect. This value is used by all distance models.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/refDistance)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var refDistance: Double

    /**
     * The maxDistance property of the PannerNode interface is a double value representing the maximum distance between
     * the audio source and the listener, after which the volume is not reduced any further. This value is used only by
     * the linear distance model.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/maxDistance)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var maxDistance: Double

    /**
     * The rolloffFactor property of the PannerNode interface is a double value describing how quickly the volume is
     * reduced as the source moves away from the listener. This value is used by all distance models. The rolloffFactor
     * property's default value is 1.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/rolloffFactor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var rolloffFactor: Double

    /**
     * The coneInnerAngle property of the PannerNode interface is a double value describing the angle, in degrees, of a
     * cone inside of which there will be no volume reduction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/coneInnerAngle)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var coneInnerAngle: Double

    /**
     * The coneOuterAngle property of the PannerNode interface is a double value describing the angle, in degrees, of a
     * cone outside of which the volume will be reduced by a constant value, defined by the coneOuterGain property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/coneOuterAngle)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var coneOuterAngle: Double

    /**
     * The coneOuterGain property of the PannerNode interface is a double value, describing the amount of volume
     * reduction outside the cone, defined by the coneOuterAngle attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/coneOuterGain)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var coneOuterGain: Double

    /**
     * The setPosition() method of the PannerNode Interface defines the position of the audio source relative to the
     * listener (represented by an AudioListener object stored in the BaseAudioContext.listener attribute.) The three
     * parameters x, y and z are unitless and describe the source's position in 3D space using the right-hand Cartesian
     * coordinate system.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/setPosition)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setPosition(x: Float, y: Float, z: Float)

    /**
     * The setOrientation() method of the PannerNode Interface defines the direction the audio source is playing in.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/setOrientation)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setOrientation(x: Float, y: Float, z: Float)
}

public external interface PannerOptions : AudioNodeOptions {
    public var panningModel: PanningModelType?
    public var distanceModel: DistanceModelType?
    public var positionX: Float?
    public var positionY: Float?
    public var positionZ: Float?
    public var orientationX: Float?
    public var orientationY: Float?
    public var orientationZ: Float?
    public var refDistance: Double?
    public var maxDistance: Double?
    public var rolloffFactor: Double?
    public var coneInnerAngle: Double?
    public var coneOuterAngle: Double?
    public var coneOuterGain: Double?
}

public fun PannerOptions(channelCount: Int? = null, channelCountMode: ChannelCountMode? = null, channelInterpretation: ChannelInterpretation? = null, panningModel: PanningModelType? = null, distanceModel: DistanceModelType? = null, positionX: Float? = null, positionY: Float? = null, positionZ: Float? = null, orientationX: Float? = null, orientationY: Float? = null, orientationZ: Float? = null, refDistance: Double? = null, maxDistance: Double? = null, rolloffFactor: Double? = null, coneInnerAngle: Double? = null, coneOuterAngle: Double? = null, coneOuterGain: Double? = null): PannerOptions {
    val dictionary = newJsObject<PannerOptions>()
    if (channelCount != null) dictionary.channelCount = channelCount
    if (channelCountMode != null) dictionary.channelCountMode = channelCountMode
    if (channelInterpretation != null) dictionary.channelInterpretation = channelInterpretation
    if (panningModel != null) dictionary.panningModel = panningModel
    if (distanceModel != null) dictionary.distanceModel = distanceModel
    if (positionX != null) dictionary.positionX = positionX
    if (positionY != null) dictionary.positionY = positionY
    if (positionZ != null) dictionary.positionZ = positionZ
    if (orientationX != null) dictionary.orientationX = orientationX
    if (orientationY != null) dictionary.orientationY = orientationY
    if (orientationZ != null) dictionary.orientationZ = orientationZ
    if (refDistance != null) dictionary.refDistance = refDistance
    if (maxDistance != null) dictionary.maxDistance = maxDistance
    if (rolloffFactor != null) dictionary.rolloffFactor = rolloffFactor
    if (coneInnerAngle != null) dictionary.coneInnerAngle = coneInnerAngle
    if (coneOuterAngle != null) dictionary.coneOuterAngle = coneOuterAngle
    if (coneOuterGain != null) dictionary.coneOuterGain = coneOuterGain
    return dictionary
}

/**
 * The PeriodicWave interface defines a periodic waveform that can be used to shape the output of an OscillatorNode.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PeriodicWave)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class PeriodicWave : JsAny {
    /**
     * The PeriodicWave() constructor of the Web Audio API creates a new PeriodicWave object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PeriodicWave/PeriodicWave)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, options: PeriodicWaveOptions = definedExternally)
}

public external interface PeriodicWaveConstraints : JsAny {
    public var disableNormalization: Boolean?
}

public fun PeriodicWaveConstraints(disableNormalization: Boolean? = null): PeriodicWaveConstraints {
    val dictionary = newJsObject<PeriodicWaveConstraints>()
    if (disableNormalization != null) dictionary.disableNormalization = disableNormalization
    return dictionary
}

public external interface PeriodicWaveOptions : PeriodicWaveConstraints {
    public var real: JsArray<JsNumber>?
    public var imag: JsArray<JsNumber>?
}

public fun PeriodicWaveOptions(disableNormalization: Boolean? = null, real: JsArray<JsNumber>? = null, imag: JsArray<JsNumber>? = null): PeriodicWaveOptions {
    val dictionary = newJsObject<PeriodicWaveOptions>()
    if (disableNormalization != null) dictionary.disableNormalization = disableNormalization
    if (real != null) dictionary.real = real
    if (imag != null) dictionary.imag = imag
    return dictionary
}

/**
 * The ScriptProcessorNode interface allows the generation, processing, or analyzing of audio using JavaScript.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScriptProcessorNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class ScriptProcessorNode : AudioNode {
    /**
     * The audioprocess event of the ScriptProcessorNode interface is fired when an input buffer of a script processor
     * is ready to be processed.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScriptProcessorNode/audioprocess_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onaudioprocess: ((AudioProcessingEvent) -> Unit)?

    /**
     * The bufferSize property of the ScriptProcessorNode interface returns an integer representing both the input and
     * output buffer size, in sample-frames. Its value can be a power of 2 value in the range 256 – 16384.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScriptProcessorNode/bufferSize)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val bufferSize: Int
}

/**
 * The StereoPannerNode interface of the Web Audio API represents a simple stereo panner node that can be used to pan an
 * audio stream left or right. It is an AudioNode audio-processing module that positions an incoming audio stream in a
 * stereo image using a low-cost equal-power panning algorithm.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StereoPannerNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class StereoPannerNode : AudioNode {
    /**
     * The StereoPannerNode() constructor of the Web Audio API creates a new StereoPannerNode object which is an
     * AudioNode that represents a simple stereo panner node that can be used to pan an audio stream left or right.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StereoPannerNode/StereoPannerNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, options: StereoPannerOptions = definedExternally)

    /**
     * The pan property of the StereoPannerNode interface is an a-rate AudioParam representing the amount of panning to
     * apply. The value can range between -1 (full left pan) and 1 (full right pan).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StereoPannerNode/pan)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val pan: AudioParam
}

public external interface StereoPannerOptions : AudioNodeOptions {
    public var pan: Float?
}

public fun StereoPannerOptions(channelCount: Int? = null, channelCountMode: ChannelCountMode? = null, channelInterpretation: ChannelInterpretation? = null, pan: Float? = null): StereoPannerOptions {
    val dictionary = newJsObject<StereoPannerOptions>()
    if (channelCount != null) dictionary.channelCount = channelCount
    if (channelCountMode != null) dictionary.channelCountMode = channelCountMode
    if (channelInterpretation != null) dictionary.channelInterpretation = channelInterpretation
    if (pan != null) dictionary.pan = pan
    return dictionary
}

public external interface OverSampleType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val OverSampleType.Companion.NONE: OverSampleType get() = "none".toJsString().unsafeCast<OverSampleType>()
public inline val OverSampleType.Companion._2X: OverSampleType get() = "2x".toJsString().unsafeCast<OverSampleType>()
public inline val OverSampleType.Companion._4X: OverSampleType get() = "4x".toJsString().unsafeCast<OverSampleType>()

/**
 * The WaveShaperNode interface represents a non-linear distorter.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class WaveShaperNode : AudioNode {
    /**
     * The WaveShaperNode() constructor of the Web Audio API creates a new WaveShaperNode object which is an AudioNode
     * that represents a non-linear distorter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/WaveShaperNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, options: WaveShaperOptions = definedExternally)

    /**
     * The curve property of the WaveShaperNode interface is a Float32Array of numbers describing the distortion to
     * apply.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/curve)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var curve: Float32Array?

    /**
     * The oversample property of the WaveShaperNode interface is an enumerated value indicating if oversampling must be
     * used. Oversampling is a technique for creating more samples (up-sampling) before applying a distortion effect to
     * the audio signal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/oversample)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var oversample: OverSampleType
}

public external interface WaveShaperOptions : AudioNodeOptions {
    public var curve: JsArray<JsNumber>?
    public var oversample: OverSampleType?
}

public fun WaveShaperOptions(channelCount: Int? = null, channelCountMode: ChannelCountMode? = null, channelInterpretation: ChannelInterpretation? = null, curve: JsArray<JsNumber>? = null, oversample: OverSampleType? = null): WaveShaperOptions {
    val dictionary = newJsObject<WaveShaperOptions>()
    if (channelCount != null) dictionary.channelCount = channelCount
    if (channelCountMode != null) dictionary.channelCountMode = channelCountMode
    if (channelInterpretation != null) dictionary.channelInterpretation = channelInterpretation
    if (curve != null) dictionary.curve = curve
    if (oversample != null) dictionary.oversample = oversample
    return dictionary
}

/**
 * The AudioWorklet interface of the Web Audio API is used to supply custom audio processing scripts that execute in a
 * separate thread to provide very low latency audio processing.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorklet)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class AudioWorklet : Worklet {
    /**
     * The port read-only property of the AudioWorklet interface returns a MessagePort object that can be used to send
     * and receive messages between the main thread and the associated AudioWorkletGlobalScope.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorklet/port)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val port: MessagePort
}

/**
 * The AudioWorkletGlobalScope interface of the Web Audio API represents a global execution context for user-supplied
 * code, which defines custom AudioWorkletProcessor-derived classes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class AudioWorkletGlobalScope : WorkletGlobalScope {
    /**
     * The registerProcessor method of the AudioWorkletGlobalScope interface registers a class constructor derived from
     * AudioWorkletProcessor interface under a specified name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/registerProcessor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun registerProcessor(name: String, processorCtor: (JsAny) -> AudioWorkletProcessor)

    /**
     * The read-only currentFrame property of the AudioWorkletGlobalScope interface returns an integer that represents
     * the ever-increasing current sample-frame of the audio block being processed. It is incremented by 128 (the size
     * of a render quantum) after the processing of each audio block.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/currentFrame)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val currentFrame: Double

    /**
     * The read-only currentTime property of the AudioWorkletGlobalScope interface returns a double that represents the
     * ever-increasing context time of the audio block being processed. It is equal to the currentTime property of the
     * BaseAudioContext the worklet belongs to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/currentTime)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val currentTime: Double

    /**
     * The read-only sampleRate property of the AudioWorkletGlobalScope interface returns a float that represents the
     * sample rate of the associated BaseAudioContext the worklet belongs to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/sampleRate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val sampleRate: Float
    public open val renderQuantumSize: Int

    /**
     * The port read-only property of the AudioWorkletGlobalScope interface returns a MessagePort object that can be
     * used to send and receive messages between the main thread and the associated AudioWorklet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/port)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val port: MessagePort
}

/**
 * The AudioParamMap interface of the Web Audio API represents an iterable and read-only set of multiple audio
 * parameters.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParamMap)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class AudioParamMap : JsAny {
    // not printed yet: maplike
}

/**
 * The AudioWorkletNode interface of the Web Audio API represents a base class for a user-defined AudioNode, which can
 * be connected to an audio routing graph along with other nodes. It has an associated AudioWorkletProcessor, which does
 * the actual audio processing in a Web Audio rendering thread.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class AudioWorkletNode : AudioNode {
    /**
     * The AudioWorkletNode() constructor creates a new AudioWorkletNode object, which represents an AudioNode that uses
     * a JavaScript function to perform custom audio processing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/AudioWorkletNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(context: BaseAudioContext, name: String, options: AudioWorkletNodeOptions = definedExternally)

    /**
     * The read-only parameters property of the AudioWorkletNode interface returns the associated AudioParamMap — that
     * is, a Map-like collection of AudioParam objects. They are instantiated during creation of the underlying
     * AudioWorkletProcessor according to its parameterDescriptors static getter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/parameters)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val parameters: AudioParamMap

    /**
     * The read-only port property of the AudioWorkletNode interface returns the associated MessagePort. It can be used
     * to communicate between the node and its associated AudioWorkletProcessor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/port)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val port: MessagePort

    /**
     * The processorerror event fires when the underlying AudioWorkletProcessor behind the node throws an exception in
     * its constructor, the process method, or any user-defined class method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/processorerror_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onprocessorerror: ((ErrorEvent) -> Unit)?
}

public external interface AudioWorkletNodeOptions : AudioNodeOptions {
    public var numberOfInputs: Int?
    public var numberOfOutputs: Int?
    public var outputChannelCount: JsArray<JsNumber>?
    public var parameterData: JsAny?
    public var processorOptions: JsAny?
}

public fun AudioWorkletNodeOptions(channelCount: Int? = null, channelCountMode: ChannelCountMode? = null, channelInterpretation: ChannelInterpretation? = null, numberOfInputs: Int? = null, numberOfOutputs: Int? = null, outputChannelCount: JsArray<JsNumber>? = null, parameterData: JsAny? = null, processorOptions: JsAny? = null): AudioWorkletNodeOptions {
    val dictionary = newJsObject<AudioWorkletNodeOptions>()
    if (channelCount != null) dictionary.channelCount = channelCount
    if (channelCountMode != null) dictionary.channelCountMode = channelCountMode
    if (channelInterpretation != null) dictionary.channelInterpretation = channelInterpretation
    if (numberOfInputs != null) dictionary.numberOfInputs = numberOfInputs
    if (numberOfOutputs != null) dictionary.numberOfOutputs = numberOfOutputs
    if (outputChannelCount != null) dictionary.outputChannelCount = outputChannelCount
    if (parameterData != null) dictionary.parameterData = parameterData
    if (processorOptions != null) dictionary.processorOptions = processorOptions
    return dictionary
}

/**
 * The AudioWorkletProcessor interface of the Web Audio API represents an audio processing code behind a custom
 * AudioWorkletNode. It lives in the AudioWorkletGlobalScope and runs on the Web Audio rendering thread. In turn, an
 * AudioWorkletNode based on it runs on the main thread.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletProcessor)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class AudioWorkletProcessor : JsAny {
    /**
     * The AudioWorkletProcessor() constructor creates a new AudioWorkletProcessor object, which represents an
     * underlying audio processing mechanism of an AudioWorkletNode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletProcessor/AudioWorkletProcessor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor()

    /**
     * The read-only port property of the AudioWorkletProcessor interface returns the associated MessagePort. It can be
     * used to communicate between the processor and the AudioWorkletNode to which it belongs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletProcessor/port)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val port: MessagePort
}

public external interface AudioParamDescriptor : JsAny {
    public var name: String
    public var defaultValue: Float?
    public var minValue: Float?
    public var maxValue: Float?
    public var automationRate: AutomationRate?
}

public fun AudioParamDescriptor(name: String, defaultValue: Float? = null, minValue: Float? = null, maxValue: Float? = null, automationRate: AutomationRate? = null): AudioParamDescriptor {
    val dictionary = newJsObject<AudioParamDescriptor>()
    dictionary.name = name
    if (defaultValue != null) dictionary.defaultValue = defaultValue
    if (minValue != null) dictionary.minValue = minValue
    if (maxValue != null) dictionary.maxValue = maxValue
    if (automationRate != null) dictionary.automationRate = automationRate
    return dictionary
}

/**
 * The AudioPlaybackStats interface of the Web Audio API provides access to duration, underrun, and latency statistics
 * for the associated AudioContext. These statistics allow you to measure audio delay and glitches.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioPlaybackStats)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class AudioPlaybackStats : JsAny {
    /**
     * The underrunDuration read-only property of the AudioPlaybackStats interface is a number indicating the total
     * duration of the underrun events that have occurred since the audio context was initialized.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioPlaybackStats/underrunDuration)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val underrunDuration: Double

    /**
     * The underrunEvents read-only property of the AudioPlaybackStats interface is a number indicating how many
     * underrun events have occurred since the audio context was initialized.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioPlaybackStats/underrunEvents)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val underrunEvents: Int

    /**
     * The totalDuration read-only property of the AudioPlaybackStats interface is a number indicating the total
     * duration of all audio frames since the audio context was initialized.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioPlaybackStats/totalDuration)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val totalDuration: Double

    /**
     * The averageLatency read-only property of the AudioPlaybackStats interface is a number indicating the average
     * latency since the audio context was initialized or since AudioPlaybackStats.resetLatency() was last called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioPlaybackStats/averageLatency)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val averageLatency: Double

    /**
     * The minimumLatency read-only property of the AudioPlaybackStats interface is a number indicating the minimum
     * latency since the audio context was initialized or since AudioPlaybackStats.resetLatency() was last called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioPlaybackStats/minimumLatency)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val minimumLatency: Double

    /**
     * The maximumLatency read-only property of the AudioPlaybackStats interface is a number indicating the maximum
     * latency since the audio context was initialized or since AudioPlaybackStats.resetLatency() was last called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioPlaybackStats/maximumLatency)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val maximumLatency: Double

    /**
     * The resetLatency() method of the AudioPlaybackStats interface resets the start of the interval during which
     * latency statistics are measured to the BaseAudioContext.currentTime.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioPlaybackStats/resetLatency)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun resetLatency()

    /**
     * The toJSON() method of the AudioPlaybackStats interface returns a JSON-serializable plain object representing the
     * AudioPlaybackStats object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioPlaybackStats/toJSON)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun toJSON(): JsAny
}
