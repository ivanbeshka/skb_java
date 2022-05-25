package com.example.skb_java.data.db

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class InfoDb(
    @SerialName("id")
    val id: Int,

    @SerialName("date")
    val date: String
)