package com.example.skb_java.controllers

import com.example.skb_java.data.dao.DataDao
import com.example.skb_java.data.db.DataDb
import com.example.skb_java.data.db.InfoDb
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.Random

@RestController
class AddIdController {

    private val rnd = Random()

    @PostMapping("/addId")
    fun addId(@RequestBody(required = true) data: DataDao): DataDb {
        val infoDb = InfoDb(rnd.nextInt(), data.info.date)
        return DataDb(data.price, infoDb)
    }
}