package com.bonni.marketlist.data.model

data class Product(
    val id: String,
    val name: String,
    val brand: String,
    val type: String,
    val price: Map<Int, Int>
)
