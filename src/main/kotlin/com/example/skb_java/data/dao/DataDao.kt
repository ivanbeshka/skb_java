package com.example.skb_java.data.dao

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class DataDao(
    @SerialName("price")
    val price: Float,

    @SerialName("info")
    val info: InfoDao
)
