package com.teamwanari.appcenter.entities

import kotlinx.serialization.Serializable

@Serializable
data class DistributionRequest(
        val destination_name: String,
        val release_notes: String
)
