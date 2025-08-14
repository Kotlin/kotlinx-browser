# kotlinx-browser

[![Kotlin Alpha](https://kotl.in/badges/alpha.svg)](https://kotlinlang.org/docs/components-stability.html)
[![JetBrains official project](https://jb.gg/badges/official.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)
[![Kotlin](https://img.shields.io/badge/kotlin-1.9.23-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Slack channel](https://img.shields.io/badge/chat-slack-blue.svg?logo=slack)](https://kotlinlang.slack.com/archives/CDFP59223)
[![TeamCity build](https://img.shields.io/teamcity/build/s/KotlinTools_KotlinxBrowser_Build.svg?server=http%3A%2F%2Fteamcity.jetbrains.com)](https://teamcity.jetbrains.com/viewType.html?buildTypeId=KotlinTools_KotlinxDatetime_Build_All&guest=1)


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


## Building

The project requires Kotlin 2.2.20-Beta2 to build and to run tests.

After that, the project can be opened in IDEA and/or built with Gradle.

To build and run tests, execute:
```gradle
./gradlew build
```
