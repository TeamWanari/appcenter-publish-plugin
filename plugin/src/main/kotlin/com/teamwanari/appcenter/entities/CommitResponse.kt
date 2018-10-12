package com.teamwanari.appcenter.entities

import kotlinx.serialization.Serializable

@Serializable
data class CommitResponse(
        val release_id: String,
        val release_url: String
)
