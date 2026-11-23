# Decision record: the Web IDL front-end

**Status:** decided, implemented (2026-11). **Scope:** how the generator reads Web IDL. The backend and the
lowerings are not part of this decision.

## Decision

The generator reads **Web IDL pre-parsed by [`webidl2.js`](https://github.com/w3c/webidl2.js), committed to the
repository as JSON**:

```
pinned @webref/idl (exact version) → webidl2.js (Node, `npm run ingest` only) → webref-idl.json (committed)
  → IdlFrontend → IR → lowerings → backend
```

- Versions are pinned exactly in `package.json`: `@webref/idl@3.86.0`, `webidl2@24.5.0`, and `@webref/events@1.27.1`
  and `@webref/css@8.7.8` from the same crawl.
- `./gradlew` needs neither Node nor the network. Node is only used by the ingest chore, and its output (`idl/`,
  `webref-idl.json`, `webref-events.json`, `webref-css.json`) is a reviewable diff.
- CSSOM defines the per-property attributes of `CSSStyleProperties` (`style.color`) in prose, not in IDL. The
  front-end adds them as the partial interface that prose describes, from the property names in `@webref/css`
  (`idl/frontend/WebrefCss.kt`), so they go through the lowerings and the backend like any other IDL.
- The JSON is read by `generator/src/main/kotlin/idl/frontend/WebIdl2JsonFrontend.kt` into the generator's own IR
  (`idl/ir/`). The IR is lossless: `npm run check:ir-roundtrip` prints all 346 specs back and compares them.
- dukat's IDL **lowerings** are kept, ported onto that IR (`idl/lowering/`). Its parser, `convertToModel`, `astModel`
  and string translator are not.

## Why: the legacy parser cannot read modern Web IDL

dukat's IDL parser is a third-party ANTLR grammar
(`idl/idl-parser/src/main/antlr4/org/antlr/webidl/WebIDL.g4`, 675 lines, BSD, "Copyright (c) 2013, 2015 Rainer
Schuster"). It transcribes the *Web IDL (Second Edition), W3C Editor's Draft 13 November 2014* and has no upstream.
It was built with ANTLR 4.13.2 and run over every file of the pinned `@webref/idl@3.86.0` corpus.

**Hard failures: 22 of 346 files, 382 syntax errors.**

| File | Errors | Cause |
|---|---|---|
| `wai-aria.idl` | 102 | `[Reflect="aria-atomic"]`: string-valued extended attributes |
| `html.idl` | 84 | `[Reflect="rel"]`, `[ReflectRange=(0,1)]` |
| `css-anchor-position.idl` | 74 | dashed member names |
| `css-fonts-5.idl` | 49 | dashed member names |
| `wasm-js-api.idl` | 14 | `module` is a keyword in the 2014 grammar |
| `streams.idl` | 13 | cascade from `[Exposed=*]` |
| `cssom.idl` | 10 | |
| `dom.idl`, `webidl.idl`, `SVG.idl` | 5 each | `[Exposed=*]` (wildcard exposure, post-2020) |

**Silent corruption.** These constructs parse without errors into plausible but wrong trees:

| Construct | Occurrences | How the 2014 grammar reads it |
|---|---|---|
| `undefined foo()` | **1163** in 154 files | a type named `undefined` |
| `constructor(DOMString x)` | **358** in 121 files | an operation returning type `constructor`, with no name |
| `bigint` | 4 | an identifier type `bigint` |
| `ObservableArray<T>` | 3 | a generic of an unknown type |
| `async iterable<>` | 1 | a hard error |

This is made worse by the rest of the legacy pipeline:

- `parseIDL.kt` installs no error listener. ANTLR prints to stderr and recovers, so a failing declaration is dropped
  while the build stays green.
- `convertToModel.kt` maps `void` to `Unit` but has no entry for `undefined`. Every void method would return an
  unresolved type `Undefined`.
- The legacy `idl/` directory was a pre-2020 snapshot: it had 618 `void`, 109 `[Constructor]` and no `constructor()`.
  Webref 3.86.0 has no `void` and no `[Constructor]`. The legacy parser only worked because its input was old.

So moving to current webref and replacing the parser had to be done together.

## Alternatives

| # | Variant | Verdict |
|---|---|---|
| A | Vendor dukat's IDL core | **Narrowed to A′:** only the lowerings were vendored. The grammar, `convertToModel` and `astModel` were dropped. |
| B | Keep `dukat:0.5.8-rc.6` as a dependency | **Rejected.** It cannot read modern webref (the numbers above). Fixing that needs a dukat release, which is exactly the coupling to remove. |
| C | New front-end on `webidl2.js` | **Chosen,** with the JSON committed, which removes the "Node in the build" objection. |
| D | Karakum + `@types/web` | **Rejected.** It loses the most information. It also needs wasm support added to an external alpha project first (`karakum-team/karakum#12`). |

**Why not TypeScript (D).** `@types/web` is a projection of Web IDL that has already lost information:
- extended attributes
- `[SameObject]`
- exposure sets
- the distinction between dictionaries and interfaces

It also adds TypeScript-isms, such as declaration merging and structural unions, that heuristics would then have to
undo.

**Why not "own the grammar" (the honest counter-option).** If a JVM-only pipeline were a hard requirement, the
alternative would be to regenerate the ANTLR grammar from the current Web IDL spec. That is about 1–2 days of
mechanical work, gated by a parse-integrity test. Rejected: it means owning a Web IDL grammar forever with no
upstream, and paying that again on every spec change. `webidl2.js`, by contrast, has a maintainer, a test suite, and
the whole webref corpus as continuous validation.

## Independent confirmations

Three projects reached the same pipeline on their own: pinned `@webref/idl` → `webidl2.js` → their own IR → their own
merge and lowering passes → their own backend, with committed generated sources.

1. **webref itself** validates its curated IDL with `webidl2.js`. It is the reference parser for this corpus.
2. **[`swiftwasm/WebAPIKit`](https://github.com/swiftwasm/WebAPIKit)** pins `"@webref/idl": "3.60.3"` exactly, parses
   with `webidl2.js`, and merges partials, mixins and typedefs in its own ~330-line `MergeDeclarations.swift`.
3. **[`dart-lang/web`](https://github.com/dart-lang/web)** (`package:web`) does the same, generates its version table
   from `package-lock.json`, and regenerates in CI, failing on any diff.

None of them wrote their own IDL parser, used a TypeScript projection for the browser surface, or kept a third-party
converter as a product dependency.

## Consequences

- The parser is no longer ours to maintain. A Web IDL change reaches us as a `webidl2` version bump with a reviewable
  JSON diff.
- A spec that fails to parse, or a reference that does not resolve, fails generation. It is not silently dropped
  (surface pass, `surface-report.txt`).
- `dukat:0.5.8-rc.6` is gone from the classpath (2026-11): the new backend replaced the dukat chain and its
  temporary `IrToDukat` adapter. `jsoup` went earlier with the spec-page scraping.
