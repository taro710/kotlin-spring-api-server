package com.example.kotlinspringrestapi.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class Controller {
    @GetMapping(
        value = ["/api/hoge"],
        produces = ["application/json"]
    )
    fun apiAroundPropertiesGet(
    ): String {
        println("アクセス検知")
        return "hoge"
    }

}