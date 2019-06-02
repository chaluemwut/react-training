package com.example.demo


data class APIResponse(val status: Int, var obj: Any)

data class ProductMapper(val id: Int, val name: String, val price: Int)