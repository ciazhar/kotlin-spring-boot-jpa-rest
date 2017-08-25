package com.ciazhar.springkotlinrest.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by ciazhar on 8/25/17.
 */

@RestController
class HelloController{

    @RequestMapping("/hello")
    fun hello():String{
        return "Hello"
    }
}