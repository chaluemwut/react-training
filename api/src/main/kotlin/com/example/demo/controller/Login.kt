package com.example.demo.controller

import com.example.demo.APIResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class Login {

    @GetMapping("/login")
    fun login(@RequestParam username: String, @RequestParam password: String): APIResponse {
        println("start login..")
        if(username.equals("ecp") && password.equals("ecp")){
            val res = APIResponse(1, "test")
            return res
        } else {
            val res = APIResponse(-1, "test")
            return res
        }
    }
}