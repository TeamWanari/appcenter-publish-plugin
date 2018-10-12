package com.teamwanari.appcenter.entities

import com.teamwanari.appcenter.STATUS_COMMITTED

data class CommitRequest(
        val status: String = STATUS_COMMITTED
)
