/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'web-animations', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.animations

import kotlin.js.*
import org.w3c.dom.*

/**
 * The AnimationTimeline interface of the Web Animations API represents the timeline of an animation.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationTimeline)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class AnimationTimeline : JsAny

public external interface DocumentTimelineOptions : JsAny {
    public var originTime: Double?
}

public fun DocumentTimelineOptions(originTime: Double? = null): DocumentTimelineOptions {
    val dictionary = newJsObject<DocumentTimelineOptions>()
    if (originTime != null) dictionary.originTime = originTime
    return dictionary
}

/**
 * The DocumentTimeline interface of the Web Animations API represents animation timelines, including the default
 * document timeline (accessed via Document.timeline).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentTimeline)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class DocumentTimeline : AnimationTimeline {
    /**
     * The DocumentTimeline() constructor of the Web Animations API creates a new instance of the DocumentTimeline
     * object associated with the active document of the current browsing context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentTimeline/DocumentTimeline)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(options: DocumentTimelineOptions = definedExternally)
}

/**
 * The Animation interface of the Web Animations API represents a single animation player and provides playback controls
 * and a timeline for an animation node or source.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class Animation : EventTarget {
    /**
     * The Animation() constructor of the Web Animations API returns a new Animation object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/Animation)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(effect: AnimationEffect? = definedExternally, timeline: AnimationTimeline? = definedExternally)

    /**
     * The Animation.id property of the Web Animations API returns or sets a string used to identify the animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/id)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var id: String

    /**
     * The Animation.effect property of the Web Animations API gets and sets the target effect of an animation. The
     * target effect may be either an effect object of a type based on AnimationEffect, such as KeyframeEffect, or null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/effect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var effect: AnimationEffect?

    /**
     * The Animation.timeline property of the Animation interface returns or sets the timeline associated with this
     * animation. A timeline is a source of time values for synchronization purposes, and is an AnimationTimeline-based
     * object. By default, the animation's timeline and the Document's timeline are the same.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/timeline)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var timeline: AnimationTimeline?

    /**
     * The Animation.playbackRate property of the Web Animations API returns or sets the playback rate of the animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/playbackRate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var playbackRate: Double

    /**
     * The read-only Animation.playState property of the Web Animations API returns an enumerated value describing the
     * playback state of an animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/playState)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val playState: AnimationPlayState

    /**
     * The read-only Animation.replaceState property of the Web Animations API indicates whether the animation has been
     * removed by the browser automatically after being replaced by another animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/replaceState)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val replaceState: AnimationReplaceState

    /**
     * The read-only Animation.pending property of the Web Animations API indicates whether the animation is currently
     * waiting for an asynchronous operation such as initiating playback or pausing a running animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/pending)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val pending: Boolean

    /**
     * The read-only Animation.ready property of the Web Animations API returns a Promise which resolves when the
     * animation is ready to play. A new promise is created every time the animation enters the "pending" play state as
     * well as when the animation is canceled, since in both of those scenarios, the animation is ready to be started
     * again.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/ready)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val ready: Promise<Animation>

    /**
     * The Animation.finished read-only property of the Web Animations API returns a Promise which resolves once the
     * animation has finished playing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finished)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val finished: Promise<Animation>

    /**
     * The finish event of the Animation interface is fired when the animation finishes playing, either when the
     * animation completes naturally, or when the Animation.finish() method is called to immediately cause the animation
     * to finish up.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finish_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onfinish: ((Event) -> Unit)?

    /**
     * The cancel event of the Animation interface is fired when the Animation.cancel() method is called or when the
     * animation enters the "idle" play state from another state, such as when the animation is removed from an element
     * before it finishes playing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/cancel_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var oncancel: ((Event) -> Unit)?

    /**
     * The remove event of the Animation interface fires when the animation is automatically removed by the browser.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/remove_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onremove: ((Event) -> Unit)?

    /**
     * The Web Animations API's cancel() method of the Animation interface clears all KeyframeEffects caused by this
     * animation and aborts its playback.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/cancel)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun cancel()

    /**
     * The finish() method of the Web Animations API's Animation Interface sets the current playback time to the end of
     * the animation corresponding to the current playback direction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finish)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun finish()

    /**
     * The play() method of the Web Animations API's Animation Interface starts or resumes playing of an animation. If
     * the animation is finished, calling play() restarts the animation, playing it from the beginning.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/play)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun play()

    /**
     * The pause() method of the Web Animations API's Animation interface suspends playback of the animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/pause)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun pause()

    /**
     * The updatePlaybackRate() method of the Web Animations API's Animation Interface sets the speed of an animation
     * after first synchronizing its playback position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/updatePlaybackRate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun updatePlaybackRate(playbackRate: Double)

    /**
     * The Animation.reverse() method of the Animation Interface reverses the playback direction, meaning the animation
     * ends at its beginning. If called on an unplayed animation, the whole animation is played backwards. If called on
     * a paused animation, the animation will continue in reverse.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/reverse)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun reverse()

    /**
     * The persist() method of the Web Animations API's Animation interface explicitly persists an animation, preventing
     * it from being automatically removed when it is replaced by another animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/persist)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun persist()

    /**
     * The commitStyles() method of the Web Animations API's Animation interface writes the computed values of the
     * animation's current styles into its target element's style attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/commitStyles)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun commitStyles()
}

public external interface AnimationPlayState : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val AnimationPlayState.Companion.IDLE: AnimationPlayState get() = "idle".toJsString().unsafeCast<AnimationPlayState>()
public inline val AnimationPlayState.Companion.RUNNING: AnimationPlayState get() = "running".toJsString().unsafeCast<AnimationPlayState>()
public inline val AnimationPlayState.Companion.PAUSED: AnimationPlayState get() = "paused".toJsString().unsafeCast<AnimationPlayState>()
public inline val AnimationPlayState.Companion.FINISHED: AnimationPlayState get() = "finished".toJsString().unsafeCast<AnimationPlayState>()

public external interface AnimationReplaceState : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val AnimationReplaceState.Companion.ACTIVE: AnimationReplaceState get() = "active".toJsString().unsafeCast<AnimationReplaceState>()
public inline val AnimationReplaceState.Companion.REMOVED: AnimationReplaceState get() = "removed".toJsString().unsafeCast<AnimationReplaceState>()
public inline val AnimationReplaceState.Companion.PERSISTED: AnimationReplaceState get() = "persisted".toJsString().unsafeCast<AnimationReplaceState>()

/**
 * The AnimationEffect interface of the Web Animations API is an interface representing animation effects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class AnimationEffect : JsAny {
    /**
     * The AnimationEffect.getTiming() method of the AnimationEffect interface returns an object containing the timing
     * properties for the Animation Effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getTiming)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getTiming(): EffectTiming

    /**
     * The getComputedTiming() method of the AnimationEffect interface returns the calculated timing properties for this
     * animation effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getComputedTiming)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getComputedTiming(): ComputedEffectTiming

    /**
     * The updateTiming() method of the AnimationEffect interface updates the specified timing properties for an
     * animation effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/updateTiming)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun updateTiming(timing: OptionalEffectTiming = definedExternally)
}

public external interface EffectTiming : JsAny {
    public var fill: FillMode?
    public var iterationStart: Double?
    public var iterations: Double?
    public var direction: PlaybackDirection?
    public var easing: String?
}

public fun EffectTiming(fill: FillMode? = null, iterationStart: Double? = null, iterations: Double? = null, direction: PlaybackDirection? = null, easing: String? = null): EffectTiming {
    val dictionary = newJsObject<EffectTiming>()
    if (fill != null) dictionary.fill = fill
    if (iterationStart != null) dictionary.iterationStart = iterationStart
    if (iterations != null) dictionary.iterations = iterations
    if (direction != null) dictionary.direction = direction
    if (easing != null) dictionary.easing = easing
    return dictionary
}

public external interface OptionalEffectTiming : JsAny {
    public var delay: Double?
    public var endDelay: Double?
    public var fill: FillMode?
    public var iterationStart: Double?
    public var iterations: Double?
    public var duration: JsAny?
    public var direction: PlaybackDirection?
    public var easing: String?
}

public fun OptionalEffectTiming(delay: Double? = null, endDelay: Double? = null, fill: FillMode? = null, iterationStart: Double? = null, iterations: Double? = null, duration: JsAny? = null, direction: PlaybackDirection? = null, easing: String? = null): OptionalEffectTiming {
    val dictionary = newJsObject<OptionalEffectTiming>()
    if (delay != null) dictionary.delay = delay
    if (endDelay != null) dictionary.endDelay = endDelay
    if (fill != null) dictionary.fill = fill
    if (iterationStart != null) dictionary.iterationStart = iterationStart
    if (iterations != null) dictionary.iterations = iterations
    if (duration != null) dictionary.duration = duration
    if (direction != null) dictionary.direction = direction
    if (easing != null) dictionary.easing = easing
    return dictionary
}

public external interface FillMode : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val FillMode.Companion.NONE: FillMode get() = "none".toJsString().unsafeCast<FillMode>()
public inline val FillMode.Companion.FORWARDS: FillMode get() = "forwards".toJsString().unsafeCast<FillMode>()
public inline val FillMode.Companion.BACKWARDS: FillMode get() = "backwards".toJsString().unsafeCast<FillMode>()
public inline val FillMode.Companion.BOTH: FillMode get() = "both".toJsString().unsafeCast<FillMode>()
public inline val FillMode.Companion.AUTO: FillMode get() = "auto".toJsString().unsafeCast<FillMode>()

public external interface PlaybackDirection : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val PlaybackDirection.Companion.NORMAL: PlaybackDirection get() = "normal".toJsString().unsafeCast<PlaybackDirection>()
public inline val PlaybackDirection.Companion.REVERSE: PlaybackDirection get() = "reverse".toJsString().unsafeCast<PlaybackDirection>()
public inline val PlaybackDirection.Companion.ALTERNATE: PlaybackDirection get() = "alternate".toJsString().unsafeCast<PlaybackDirection>()
public inline val PlaybackDirection.Companion.ALTERNATE_REVERSE: PlaybackDirection get() = "alternate-reverse".toJsString().unsafeCast<PlaybackDirection>()

public external interface ComputedEffectTiming : EffectTiming {
    public var progress: Double?
    public var currentIteration: Double?
}

public fun ComputedEffectTiming(fill: FillMode? = null, iterationStart: Double? = null, iterations: Double? = null, direction: PlaybackDirection? = null, easing: String? = null, progress: Double? = null, currentIteration: Double? = null): ComputedEffectTiming {
    val dictionary = newJsObject<ComputedEffectTiming>()
    if (fill != null) dictionary.fill = fill
    if (iterationStart != null) dictionary.iterationStart = iterationStart
    if (iterations != null) dictionary.iterations = iterations
    if (direction != null) dictionary.direction = direction
    if (easing != null) dictionary.easing = easing
    if (progress != null) dictionary.progress = progress
    if (currentIteration != null) dictionary.currentIteration = currentIteration
    return dictionary
}

/**
 * The KeyframeEffect interface of the Web Animations API lets us create sets of animatable properties and values,
 * called keyframes. These can then be played using the Animation() constructor.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class KeyframeEffect : AnimationEffect {
    /**
     * The KeyframeEffect() constructor of the Web Animations API returns a new KeyframeEffect object instance, and also
     * allows you to clone an existing keyframe effect object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/KeyframeEffect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(target: Element?, keyframes: JsAny?, options: Double)

    /**
     * The KeyframeEffect() constructor of the Web Animations API returns a new KeyframeEffect object instance, and also
     * allows you to clone an existing keyframe effect object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/KeyframeEffect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(target: Element?, keyframes: JsAny?, options: KeyframeEffectOptions)

    /**
     * The KeyframeEffect() constructor of the Web Animations API returns a new KeyframeEffect object instance, and also
     * allows you to clone an existing keyframe effect object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/KeyframeEffect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(target: Element?, keyframes: JsAny?)

    /**
     * The KeyframeEffect() constructor of the Web Animations API returns a new KeyframeEffect object instance, and also
     * allows you to clone an existing keyframe effect object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/KeyframeEffect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(source: KeyframeEffect)

    /**
     * The target property of a KeyframeEffect interface represents the element or pseudo-element being animated. It may
     * be null for animations that do not target a specific element. It performs as both a getter and a setter, except
     * with animations and transitions generated by CSS.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/target)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var target: Element?

    /**
     * The pseudoElement property of a KeyframeEffect interface is a string representing the pseudo-element being
     * animated. It may be null for animations that do not target a pseudo-element. It performs as both a getter and a
     * setter, except with animations and transitions generated by CSS.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/pseudoElement)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var pseudoElement: String?

    /**
     * The composite property of a KeyframeEffect resolves how an element's animation impacts its underlying property
     * values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/composite)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var composite: CompositeOperation

    /**
     * The getKeyframes() method of a KeyframeEffect returns an Array of the computed keyframes that make up this
     * animation along with their computed offsets.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/getKeyframes)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getKeyframes(): JsArray<JsAny>

    /**
     * The setKeyframes() method of the KeyframeEffect interface replaces the keyframes that make up the affected
     * KeyframeEffect with a new set of keyframes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/setKeyframes)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setKeyframes(keyframes: JsAny?)
}

public external interface BaseComputedKeyframe : JsAny {
    public var offset: Double?
    public var computedOffset: Double?
    public var easing: String?
    public var composite: CompositeOperationOrAuto?
}

public fun BaseComputedKeyframe(offset: Double? = null, computedOffset: Double? = null, easing: String? = null, composite: CompositeOperationOrAuto? = null): BaseComputedKeyframe {
    val dictionary = newJsObject<BaseComputedKeyframe>()
    if (offset != null) dictionary.offset = offset
    if (computedOffset != null) dictionary.computedOffset = computedOffset
    if (easing != null) dictionary.easing = easing
    if (composite != null) dictionary.composite = composite
    return dictionary
}

public external interface BasePropertyIndexedKeyframe : JsAny {
    public var offset: JsAny?
    public var easing: JsAny?
    public var composite: JsAny?
}

public fun BasePropertyIndexedKeyframe(offset: JsAny? = null, easing: JsAny? = null, composite: JsAny? = null): BasePropertyIndexedKeyframe {
    val dictionary = newJsObject<BasePropertyIndexedKeyframe>()
    if (offset != null) dictionary.offset = offset
    if (easing != null) dictionary.easing = easing
    if (composite != null) dictionary.composite = composite
    return dictionary
}

public external interface BaseKeyframe : JsAny {
    public var offset: Double?
    public var easing: String?
    public var composite: CompositeOperationOrAuto?
}

public fun BaseKeyframe(offset: Double? = null, easing: String? = null, composite: CompositeOperationOrAuto? = null): BaseKeyframe {
    val dictionary = newJsObject<BaseKeyframe>()
    if (offset != null) dictionary.offset = offset
    if (easing != null) dictionary.easing = easing
    if (composite != null) dictionary.composite = composite
    return dictionary
}

public external interface KeyframeEffectOptions : EffectTiming {
    public var composite: CompositeOperation?
    public var pseudoElement: String?
}

public fun KeyframeEffectOptions(fill: FillMode? = null, iterationStart: Double? = null, iterations: Double? = null, direction: PlaybackDirection? = null, easing: String? = null, composite: CompositeOperation? = null, pseudoElement: String? = null): KeyframeEffectOptions {
    val dictionary = newJsObject<KeyframeEffectOptions>()
    if (fill != null) dictionary.fill = fill
    if (iterationStart != null) dictionary.iterationStart = iterationStart
    if (iterations != null) dictionary.iterations = iterations
    if (direction != null) dictionary.direction = direction
    if (easing != null) dictionary.easing = easing
    if (composite != null) dictionary.composite = composite
    if (pseudoElement != null) dictionary.pseudoElement = pseudoElement
    return dictionary
}

public external interface CompositeOperation : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val CompositeOperation.Companion.REPLACE: CompositeOperation get() = "replace".toJsString().unsafeCast<CompositeOperation>()
public inline val CompositeOperation.Companion.ADD: CompositeOperation get() = "add".toJsString().unsafeCast<CompositeOperation>()
public inline val CompositeOperation.Companion.ACCUMULATE: CompositeOperation get() = "accumulate".toJsString().unsafeCast<CompositeOperation>()

public external interface CompositeOperationOrAuto : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val CompositeOperationOrAuto.Companion.REPLACE: CompositeOperationOrAuto get() = "replace".toJsString().unsafeCast<CompositeOperationOrAuto>()
public inline val CompositeOperationOrAuto.Companion.ADD: CompositeOperationOrAuto get() = "add".toJsString().unsafeCast<CompositeOperationOrAuto>()
public inline val CompositeOperationOrAuto.Companion.ACCUMULATE: CompositeOperationOrAuto get() = "accumulate".toJsString().unsafeCast<CompositeOperationOrAuto>()
public inline val CompositeOperationOrAuto.Companion.AUTO: CompositeOperationOrAuto get() = "auto".toJsString().unsafeCast<CompositeOperationOrAuto>()

public external interface Animatable : JsAny {
    /**
     * The Element interface's animate() method is a shortcut method which creates a new Animation, applies it to the
     * element, then plays the animation. It returns the created Animation object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun animate(keyframes: JsAny?, options: Double): Animation

    /**
     * The Element interface's animate() method is a shortcut method which creates a new Animation, applies it to the
     * element, then plays the animation. It returns the created Animation object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun animate(keyframes: JsAny?, options: KeyframeAnimationOptions): Animation

    /**
     * The Element interface's animate() method is a shortcut method which creates a new Animation, applies it to the
     * element, then plays the animation. It returns the created Animation object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun animate(keyframes: JsAny?): Animation

    /**
     * The getAnimations() method of the Element interface returns an array of all Animation objects affecting this
     * element, or that are scheduled to do so in the future. It can optionally return Animation objects either for
     * descendant elements and their pseudo-elements or just for the specified pseudo-element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAnimations)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getAnimations(options: GetAnimationsOptions = definedExternally): JsArray<Animation>
}

public external interface KeyframeAnimationOptions : KeyframeEffectOptions {
    public var id: String?
    public var timeline: AnimationTimeline?
}

public fun KeyframeAnimationOptions(fill: FillMode? = null, iterationStart: Double? = null, iterations: Double? = null, direction: PlaybackDirection? = null, easing: String? = null, composite: CompositeOperation? = null, pseudoElement: String? = null, id: String? = null, timeline: AnimationTimeline? = null): KeyframeAnimationOptions {
    val dictionary = newJsObject<KeyframeAnimationOptions>()
    if (fill != null) dictionary.fill = fill
    if (iterationStart != null) dictionary.iterationStart = iterationStart
    if (iterations != null) dictionary.iterations = iterations
    if (direction != null) dictionary.direction = direction
    if (easing != null) dictionary.easing = easing
    if (composite != null) dictionary.composite = composite
    if (pseudoElement != null) dictionary.pseudoElement = pseudoElement
    if (id != null) dictionary.id = id
    if (timeline != null) dictionary.timeline = timeline
    return dictionary
}

public external interface GetAnimationsOptions : JsAny {
    public var subtree: Boolean?
    public var pseudoElement: String?
}

public fun GetAnimationsOptions(subtree: Boolean? = null, pseudoElement: String? = null): GetAnimationsOptions {
    val dictionary = newJsObject<GetAnimationsOptions>()
    if (subtree != null) dictionary.subtree = subtree
    if (pseudoElement != null) dictionary.pseudoElement = pseudoElement
    return dictionary
}
