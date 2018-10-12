# appcenter-publish-plugin

[![Kotlin 1.2.71](https://img.shields.io/badge/Kotlin-1.2.71-blue.svg)](http://kotlinlang.org)
[![Releases](https://img.shields.io/github/release/TeamWanari/appcenter-publish-plugin.svg)](https://github.com/TeamWanari/appcenter-publish-plugin/releases)
[![Gradle Plugin](https://img.shields.io/maven-metadata/v/https/plugins.gradle.org/m2/gradle/plugin/appcenter-publish-plugin/plugin/maven-metadata.xml.svg?label=Gradle%20Plugin&style=flat)](https://plugins.gradle.org/plugin/com.teamwanari.appcenter-publish-plugin)
[![JitPack Release](https://jitpack.io/v/TeamWanari/appcenter-publish-plugin.svg)](https://jitpack.io/#TeamWanari/appcenter-publish-plugin)
[![Travis](https://travis-ci.org/TeamWanari/appcenter-publish-plugin.svg?branch=master)](https://travis-ci.org/TeamWanari/appcenter-publish-plugin/builds)
[![MIT License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/TeamWanari/appcenter-publish-plugin/blob/master/LICENSE)

Description
-----------
This is a simple Gradle Plugin which helps you upload your build artifacts to AppCenter.

Usage
-----

latest_version = ![Latest version](https://img.shields.io/github/release/TeamWanari/appcenter-publish-plugin.svg)

Build script snippet for plugins DSL for Gradle 2.1 and later:
```
plugins {
  id "com.teamwanari.appcenter-publish-plugin" version "$latest_version"
}
```

Build script snippet for use in older Gradle versions or where dynamic configuration is required:
```
buildscript {
  repositories {
    maven {
      url "https://plugins.gradle.org/m2/"
    }
  }
  dependencies {
    classpath "gradle.plugin.appcenter-publish-plugin:plugin:$latest_version"
  }
}

apply plugin: "com.teamwanari.appcenter-publish-plugin"
```

And the configuration block:
```
appCenter {
    apiToken = "****"               // Required. Token generated on your AppCenter account
    appName = "MyTestApp"           // Required. App name on AppCenter
    appOwner = "me"                 // Required. User or Organization name who owns the App on AppCenter
    artifact = file("$projectDir/xyz/xyz.apk") // Required. Path to your release build artifact
    destination = "QA Testers"      // Required. Name of the Test Group on AppCenter
    releaseNotes = "Test release notes.... from Gradle Plugin :)" // Optional. Release notes...
    verbose = true                  // Optional. Enables API call logging. Defaults to false
}
```

If everything is set, go to terminal and execute **appCenterUpload** gradle task.

License
-------
```
MIT License

Copyright (c) 2018 TeamWanari

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
