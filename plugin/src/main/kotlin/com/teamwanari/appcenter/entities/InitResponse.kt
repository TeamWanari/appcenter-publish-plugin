package com.teamwanari.appcenter.entities

import kotlinx.serialization.Serializable

@Serializable
data class InitResponse(
        val upload_id: String,
        val upload_url: String
)
