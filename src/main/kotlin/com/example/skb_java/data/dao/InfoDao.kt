package com.example.skb_java.data.dao

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class InfoDao(
    @SerialName("date")
    val date: String
)