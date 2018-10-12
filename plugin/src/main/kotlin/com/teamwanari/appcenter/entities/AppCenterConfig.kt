package com.teamwanari.appcenter.entities

import java.io.File

data class AppCenterConfig(
        val apiToken: String,
        val appOwner: String,
        val appName: String,
        val artifact: File,
        val destination: String,
        val releaseNotes: String,
        val verbose: Boolean
)
