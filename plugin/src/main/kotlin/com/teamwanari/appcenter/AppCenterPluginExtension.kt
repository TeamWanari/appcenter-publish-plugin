package com.teamwanari.appcenter

import java.io.File

const val APP_CENTER_EXTENSION = "appCenter"

open class AppCenterPluginExtension {
    var apiToken: String? = null
    var appOwner: String? = null
    var appName: String? = null
    var artifact: File? = null
    var destination: String? = null
    var releaseNotes: String? = null
    var verbose: Boolean = false
}