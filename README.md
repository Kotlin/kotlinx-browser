# kotlinx-browser

[![Kotlin Alpha](https://kotl.in/badges/alpha.svg)](https://kotlinlang.org/docs/components-stability.html)
[![JetBrains official project](https://jb.gg/badges/official.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)
[![Kotlin](https://img.shields.io/badge/kotlin-2.2.20-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Slack channel](https://img.shields.io/badge/chat-slack-blue.svg?logo=slack)](https://kotlinlang.slack.com/archives/CDFP59223)
[![TeamCity build](https://img.shields.io/teamcity/build/s/KotlinTools_KotlinxBrowser_Build.svg?server=http%3A%2F%2Fteamcity.jetbrains.com)](https://teamcity.jetbrains.com/viewType.html?buildTypeId=KotlinTools_KotlinxBrowser_Build&guest=1)


Kotlin browser API

A Kotlin library for working with browser declarations in Kotlin with WasmJs and JS targets.

See [Using in your projects](#using-in-your-projects) for the instructions how to setup a dependency in your project.

## Status

This library is still in work-in-progress state. Which means that it is not published into public repository and not yet intended to use by end user.

## Requirements

Is required to use:

* Kotlin `2.2.20-Beta2` or newer

<!---
## Types

Work in progress

### Type use-cases

Work in progress

## Implementation

Work in progress

--->

## Using in your projects

> Note that the library is experimental, and the API is subject to change.

The library is compatible with the Kotlin Standard Library not lower than `2.2.20-Beta2`.

(with older Kotlin versions one needs to use `kotlinx-browser` version `0.3`)

### Gradle

- Add the Maven Central repository if it is not already there:

```kotlin
repositories {
    mavenCentral()
}
```

- In multiplatform projects, add a dependency to common or target source set dependencies:
```kotlin
kotlin {
    wasmJs {
        browser()
    }
    
    js {
        browser()
    }
    
    sourceSets {
        commonMain {
             dependencies {
                 implementation("org.jetbrains.kotlinx:kotlinx-browser:0.5.0")
             }
        }
    }
}
```


## Documentation

* [Migration guide](docs/migration-guide.md): moving from the dukat-generated declarations (kotlinx-browser 0.x,
  `kotlin-dom-api-compat`).
* [Development guide](docs/development.md): how the declarations are generated from Web IDL, how to regenerate them,
  and what the checks protect.
* [Front-end decision record](docs/front-end-decision.md): why the generator reads Web IDL through `webidl2.js`.

## Building

The build uses the Kotlin Gradle plugin version pinned in `build.gradle.kts`; no separate Kotlin installation is
needed. Node is only needed to ingest a new webref release.

To build and run all checks, execute:
```shell
./gradlew check
```

The sources in `src/webMain/generated` are generated; see the [development guide](docs/development.md) before
changing them.
