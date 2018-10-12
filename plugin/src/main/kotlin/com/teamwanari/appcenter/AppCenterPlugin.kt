package com.teamwanari.appcenter

import org.gradle.api.Plugin
import org.gradle.api.Project

class AppCenterPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.extensions.create(APP_CENTER_EXTENSION, AppCenterPluginExtension::class.java)
        project.tasks.create("appCenterUpload", AppCenterUploadTask::class.java)
    }
}
