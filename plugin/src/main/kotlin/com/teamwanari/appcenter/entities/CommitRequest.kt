package com.teamwanari.appcenter.entities

import com.teamwanari.appcenter.STATUS_COMMITTED
import kotlinx.serialization.Serializable

@Serializable
data class CommitRequest(
        val status: String = STATUS_COMMITTED
)
