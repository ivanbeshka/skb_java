package com.example.skb_java.data.db

import com.example.skb_java.data.dao.InfoDao
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class DataDb(
    @SerialName("price")
    val price: Float,

    @SerialName("info")
    val info: InfoDb
)