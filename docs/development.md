# Development guide

How kotlinx-browser is built: where the declarations come from, how to regenerate them, and what the checks protect.
For the decision to read Web IDL through `webidl2.js`, see [front-end-decision.md](front-end-decision.md). For
the changes users see coming from the dukat-generated versions, see [migration-guide.md](migration-guide.md).

## What the library is

The library is Kotlin `external` declarations for the browser APIs (`org.w3c.*`, `org.khronos.webgl`), plus a few
hand-written helpers (`kotlinx.browser`, `kotlinx.dom`), for **Kotlin/JS and Kotlin/Wasm from one source set**. The
declarations are generated from the specifications' Web IDL. There is one copy in `webMain`, with no `expect`/`actual`.

## Repository layout

| Path | What it is | Edit by hand? |
|---|---|---|
| `src/webMain/generated/` | Generated declarations, one file per spec, at `<package path>/<spec>.kt` | **No.** Regenerate |
| `src/webMain/kotlin/kotlinx/browser/` | `window`, `document`, `localStorage`, `sessionStorage` | Yes |
| `src/webMain/kotlin/kotlinx/dom/` | DOM helpers (`addClass`, `appendText`, …), `ItemArrayLike` and `asList()`, `JsObjects.kt` (internal helpers the generated code calls) | Yes |
| `src/{web,js,wasmJs}Main/kotlin/org.w3c/org.khronos.webgl.typedarrays.kt` | ECMAScript built-ins Web IDL refers to (`ArrayBuffer`, typed arrays, `DataView`) | Yes |
| `src/{web,js,wasmJs}Main/kotlin/arrayCopy*.kt`, `src/webTest/kotlin/arrayCopyTest.kt` | Typed-array ↔ Kotlin-array conversions and their test | **No.** `./gradlew :generator:generateUtils` |
| `src/webTest/kotlin/` | Runtime tests run on Node for both targets (`InteropTest`, `SmokeTest`) | Yes |
| `api/kotlinx-browser.klib.api` | ABI dump for both targets in one file | **No.** `./gradlew updateKotlinAbi` |
| `generator/` | The generator (Kotlin/JVM, Gradle subproject `:generator`) | Yes |
| `package.json`, `package-lock.json` | The pinned generator inputs: `@webref/idl`, `@webref/events`, `@webref/css`, `webidl2`, `@mdn/browser-compat-data` | Only to bump them (see [Bumping webref](#bumping-webref)) |
| `mdn/summaries.json`, `mdn/commit` | MDN's summary of each Web API page, for the KDoc, and the `mdn/content` commit it is from. CC-BY-SA 2.5, see `NOTICE` | **No.** `./gradlew :generator:updateMdnSummaries` (see [KDoc](#kdoc)) |
| `NOTICE` | Attribution of the MDN content in the KDoc; packed into every published jar | When an attributed input changes |
| `scripts/` | `prepare-webref.js` (parses the pinned packages into JSON), `check-ir-roundtrip.js`, run by Gradle; `fetch-mdn.js`, run by `updateMdnSummaries` | Yes |
| `surface-report.txt` | Everything pruned from the allowlisted specs, and why | **No.** Regenerate |
| `docs/` | This guide, the migration guide, decision records | Yes |

The webref inputs are not committed. Before the generator runs, Gradle installs the packages pinned in
`package-lock.json` (`npmInstall`, which runs `npm ci`) and parses them into `generator/build/webref/`
(`prepareWebref`). Both tasks come from [gradle-node-plugin](https://github.com/node-gradle/gradle-node-plugin), which
downloads the Node.js version pinned in `generator/build.gradle.kts` into `generator/.gradle/nodejs/`, so no separate
Node installation is needed. A first build needs the npm registry; after that, the tasks are up to date until `package-lock.json` or the scripts
change.

## Commands

| Task | Command |
|---|---|
| Everything: compile, Node tests on both targets, generator tests, ABI check | `./gradlew check` |
| Library tests only | `./gradlew jsNodeTest wasmJsNodeTest` |
| Generator tests only | `./gradlew :generator:test` |
| Regenerate the declarations and `surface-report.txt` | `./gradlew :generator:generateWebApi` |
| Regenerate the typed-array conversions | `./gradlew :generator:generateUtils` |
| Update the golden files after an intended generator change | `./gradlew :generator:test -PupdateGolden=true` |
| Update the ABI dump after an intended API change | `./gradlew updateKotlinAbi` |
| Install and parse the pinned webref packages into `generator/build/webref` | `./gradlew :generator:prepareWebref` (run automatically) |
| Render the IR back as Web IDL into `generator/build/idl-ir` | `./gradlew :generator:dumpIdlIr` |
| Check that the IR is lossless (part of `check`) | `./gradlew :generator:checkIrRoundTrip` |

`check` fails when anything committed is stale:

- **`GeneratedSourcesTest`:** `src/webMain/generated` differs from what the generator prints.
- **`GeneratedUtilsTest`:** the `arrayCopy*` files differ.
- **Golden tests:** a golden file in `generator/src/test/resources/golden/` differs.
- **`checkKotlinAbi`:** the ABI dump differs from the compiled library.
- **`checkIrRoundTrip`:** the IR, rendered back as Web IDL, no longer re-parses into the same webidl2 output.

The generator gets every location it reads or writes as a system property (`kotlinx.browser.webrefIdl`,
`…generatedSources`, `…surfaceReport`, …; see `GeneratorPaths` and `generator/build.gradle.kts`), so it does not
depend on the working directory. Run it and its tests through Gradle; outside Gradle, pass the properties with
`-D`. The committed files the generator tests read are declared as inputs of `:generator:test`, so a hand edit to any
of them reruns the tests instead of being skipped as up to date.

### After changing the generator

```shell
./gradlew :generator:generateWebApi
./gradlew :generator:test -PupdateGolden=true
./gradlew updateKotlinAbi
./gradlew check
```

Then review the diffs of `src/webMain/generated`, the goldens, `surface-report.txt` and `api/kotlinx-browser.klib.api`.
The ABI diff is the user-visible change.

## The pipeline

```
@webref/idl, @webref/events, @webref/css, webidl2, BCD   (package-lock.json: exact versions and integrity hashes)
        │  :generator:npmInstall, :generator:prepareWebref   (gradle-node-plugin)
        ▼
generator/build/webref/webref-idl.json (parsed by webidl2.js), webref-events.json, webref-css.json, bcd-api.json
        │                                                    (not committed)    + mdn/summaries.json (committed)
        │  :generator:generateWebApi   (JVM)
        ▼
frontend ─► surface ─► lowering ─► backend ─► src/webMain/generated/**/*.kt, surface-report.txt   (committed)
```

All generator code is under `generator/src/main/kotlin/idl/`.

| Stage | Code | What it does |
|---|---|---|
| Inputs | `IdlInput.kt`, `Specs.kt` | `GeneratorPaths` (locations from system properties); `SPEC_ALLOWLIST` (spec → Kotlin package), `EXCLUDED_SPECS`, `EXCLUDED_TYPES` |
| Front-end | `frontend/WebIdl2JsonFrontend.kt` | Reads `webref-idl.json` into the IR (`ir/IdlIR.kt`). The IR is lossless: `checkIrRoundTrip` prints it back and compares |
| | `frontend/WebrefEvents.kt` | Which event each `on…` handler receives |
| | `frontend/WebDocs.kt` | The KDoc inputs: MDN page and deprecation per declaration (BCD), MDN summaries |
| | `frontend/WebrefCss.kt` | Adds the CSS property attributes of `CSSStyleProperties`, which CSSOM defines in prose rather than IDL, as a partial interface |
| Surface | `surface/Surface.kt`, `surface/Builtins.kt` | Starts from the whole corpus. Keeps the allowlisted specs and prunes references into excluded specs and types (recorded in `surface-report.txt`). Any reference left unresolved fails generation |
| Lowering | `lowering/Lowering.kt` | In order: `mergePartials`, `resolveTypedefs`, `UnionMarkers`, `expandUnionOverloads`, `Shapes`, `EventHandlerTypes`, `Overrides` |
| Type mapping | `mapping/WasmTypeMapping.kt` | IDL type → Kotlin type, depending on position (`String` in a signature, `JsString` as a type argument) |
| Backend | `backend/KotlinBackend.kt` | Prints one Kotlin file per spec |

The lowerings, briefly:

- **`mergePartials`:** folds `partial interface`/`partial dictionary` declarations into the main definition.
- **`resolveTypedefs`:** replaces every typedef with its type.
- **`UnionMarkers`:** a union whose members are all interfaces becomes an empty marker interface that every member
  extends. It is named after its typedef (`CanvasImageSource`) or after its members (`UnionElementOrText`).
- **`expandUnionOverloads`:** any other union in an argument becomes a set of overloads. Elsewhere it becomes
  `JsAny`.
- **`Shapes`:** decides each Kotlin shape:
  - an interface with its own constructor → `open class`, without one → `abstract class`
  - mixins and callback interfaces → `interface`
  - namespaces → `object`
  - `[LegacyFactoryFunction]` → its own `open class` (`Image`, `Audio`, `Option`)

  It also copies constants and statics into class companions, because Kotlin companions are not inherited.
- **`EventHandlerTypes`:** narrows `on…: ((Event) -> Unit)?` to the event actually fired, for example
  `(PointerEvent) -> Unit`.
- **`Overrides`:** marks what must be `override`, adds members a class inherits through more than one path, and drops
  members that clash with a supertype.

### What the backend prints

| IDL | Kotlin |
|---|---|
| interface | `external open/abstract class`, or `external interface` for mixins and callback interfaces |
| dictionary | `external interface X : Parent` with a `var` per field, plus a factory `fun X(...)`. Inherited fields come first, least derived first; required fields have no default. The factory only sets the arguments that are not `null`, so absent members stay absent |
| enum | `external interface X : JsAny` with an empty companion; each value is `inline val X.Companion.V: X` (`RequestMode.CORS`) |
| constant on a class | `val` in the class companion, read from the JS class |
| constant on an interface | `inline val X.Companion.NAME: T get() = <IDL value>`, because an external interface's companion is not usable on Wasm |
| special getter/setter | `operator fun X.get/set` extension over the helpers in `JsObjects.kt` |
| operation taking a callback interface | An extra overload taking a Kotlin function. `addEventListener` and `MediaQueryList.addListener` are instead extensions that return `() -> Unit`, which removes the listener |
| namespace | `external object` |

Not printed yet: `iterable`/`maplike`/`setlike` declarations and deleters. Each leaves a `// not printed yet:` line in
the golden file.

## Changing what is generated

- **Add a spec:** add a `SpecEntry(spec, package)` to `SPEC_ALLOWLIST` in `Specs.kt`, then regenerate. Specs only
  referenced by allowlisted ones go into the "dependencies" part of the list.
- **Leave out a spec or a built-in type that an allowlisted spec references:** add it to `EXCLUDED_SPECS` or
  `EXCLUDED_TYPES` with a reason. References into it are pruned and listed in `surface-report.txt`. An entry that no
  longer prunes anything fails generation, so the lists can only shrink.
- **Packages:** every definition goes into its spec's package; there are no per-definition overrides.
- **A spec bug the backend must work around:** keep the workaround narrow, named and tested so that it fails once
  the spec is fixed. Example: `NOT_INDEXERS` in the backend, guarded by `notIndexersAreStillSpecial`.

## Bumping webref

```shell
# 1. Set the new exact versions in package.json. @webref/idl, @webref/events and @webref/css must come from the
#    same crawl: compare their publish times with `npm view @webref/idl time` (and the same for the others).
# 2. Update package-lock.json; any npm works:
npm install --package-lock-only
# 3. Regenerate and check; prepareWebref reruns because package-lock.json changed:
./gradlew :generator:generateWebApi
./gradlew :generator:test -PupdateGolden=true
./gradlew updateKotlinAbi
./gradlew check                   # includes checkIrRoundTrip: the IR still reads every spec losslessly
```

Review in this order:
1. `src/webMain/generated` and `surface-report.txt`: what changed upstream, and what is pruned now.
2. The ABI diff: what users get.

To see the raw upstream change, compare `generator/build/webref/` before and after the bump.

## KDoc

Every generated declaration that MDN documents gets KDoc: MDN's summary of the page, a deprecation note if BCD marks
it deprecated, "Available only in secure contexts." for `[SecureContext]`, and a link to the page.

- **Links and deprecation** come from `@mdn/browser-compat-data` (BCD, CC0), pinned in `package-lock.json` and
  extracted by `prepareWebref` into `bcd-api.json`. BCD keys are IDL names: `Element.getAttribute`, `URL.URL` for the
  constructor, `URL.canParse_static`, `Element.click_event` (used for `onclick`).
- **Summaries** come from MDN's `metadata.json`, which has no versioned release. `updateMdnSummaries` fetches it and
  writes the Web API summaries to `mdn/summaries.json` and the `mdn/content` commit to `mdn/commit`; both are
  committed, so the text is pinned and its changes are reviewed. Run it deliberately, then regenerate:
  ```shell
  ./gradlew :generator:updateMdnSummaries
  ./gradlew :generator:generateWebApi
  ./gradlew :generator:test -PupdateGolden=true
  ```
- **Licence.** The summaries are MDN prose under CC-BY-SA 2.5 by Mozilla Contributors, not Apache 2.0. `NOTICE`
  attributes them, every comment links to its page, and every published jar contains `META-INF/NOTICE`. Don't
  copy MDN text anywhere else in the repository.
- **Lookup** (`backend/DocComments.kt`): an interface by name; a member on its own interface, else, for a mixin member,
  on the interfaces that include the mixin and their ancestors, in `includes` order. So `ParentNode.append` is
  documented with MDN's page of `Document.append`. Dictionaries, enums and typedefs have no BCD entries.
- **Text:** a summary ending in a sentence that introduces a list (`…the following values:`) loses that sentence;
  `[`, `]`, `<`, `>`, `&`, `*/` and a leading `@` are escaped; lines are wrapped at 120 columns.

Generation fails on anything unresolved or ambiguous, for example a new reference into a spec that isn't allowlisted,
or two enum values with the same Kotlin name. Resolve these explicitly; don't silence them.

## Tests

| Test | Where | Checks |
|---|---|---|
| Unit tests per stage | `generator/src/test/kotlin/idl/{frontend,surface,lowering,mapping,backend}` | Each pass on small IR built with `LoweringTestDsl`, and facts about the real corpus (`Real*Test`) |
| Golden slice | `GoldenSliceTest`, `RealLoweringTest`, `KotlinBackendTest` with `golden/*.idl`, `golden/kotlin-slice.kt` | A fixed set of definitions (`GOLDEN_SLICE`) as parsed IDL, as lowered IDL and as Kotlin |
| Up to date | `GeneratedSourcesTest`, `GeneratedUtilsTest` | Committed generated files equal fresh output |
| Runtime | `src/webTest/kotlin/InteropTest.kt` | The shapes the generator relies on actually work on JS and Wasm (Node) |
| ABI | `checkKotlinAbi` | `api/kotlinx-browser.klib.api` |

When adding a generated shape, add a runtime test to `InteropTest` if the shape depends on interop behavior. Node has
no DOM, so stand in plain objects (`js("({})")`) or globals you install yourself.

## Platform behavior to know

These were all found by runtime tests; check them before relying on similar constructs.

- **Interface companions on Wasm:** a `val` in the companion of an `external interface` is not read from JS at all
  (it is `0`). On JS it is read from a global named after the interface. This is why interface constants are inline
  extensions holding the IDL value.
- **Casts on Wasm:** casting to an external *class* (`as`, or a generic `T` bound to one) is an `instanceof` check
  against the class's JS global. It throws if the global does not exist, for example `CSSStyleProperties` on Node or
  in browsers that have not shipped that name. Use `unsafeCast` where the object is known to be right.
- **`js()` on Wasm:** the declared parameter and return types decide the conversion at the boundary. That is why
  `JsObjects.kt` has one helper per key and value kind. In an expression-bodied function, a `js()` call must be a
  single expression: `= js("a; b;")` is a JS syntax error on Wasm.
- **Same function, same listener:** a Kotlin function passed twice is the same JS function on both targets, so the
  member `removeEventListener(type, f)` removes what `addEventListener(type, f)` added.
- **Node's `EventTarget` (22.0–26.2) does not remove capture listeners.** This is a Node bug, reproducible in plain
  JS. Tests use `capture = false`.
- **`COMPANION_OBJECT_IN_EXTERNAL_INTERFACE`:** the generated enums and interfaces with constants suppress it on the
  companion only. The compiler warns that this behavior is unspecified (172 warnings: 86 companions × 2 targets).

## Conventions

- Never edit generated files. Change the generator or its inputs and regenerate.
- Every generated file starts with `generatedFileHeader` (`generator/src/main/kotlin/helpers/header.kt`): fixed text
  and `\n`, so output is byte-identical on every date and OS.
- Source files carry the Apache 2.0 header pointing to "the LICENSE file" at the repository root.
- The library compiles in explicit API mode (`explicitApi()`): public declarations and members, generated or not,
  state `public` and their return types. Overrides are exempt, so the backend prints `public` on everything else.
- Generator failures list every problem at once (`LoweringException`, `SurfaceException`) instead of stopping at the
  first.
