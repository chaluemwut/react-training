package com.example.demo.controller

import com.example.demo.APIResponse
import com.example.demo.ProductMapper
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Product {

    @GetMapping("/list")
    fun list(): APIResponse {
        val data = ArrayList<ProductMapper>()
        data.add(ProductMapper(1, "p1", 20))
        data.add(ProductMapper(2, "p2", 30))
        val res = APIResponse(1, data)
        return res;
    }
}