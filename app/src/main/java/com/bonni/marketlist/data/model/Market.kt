package com.bonni.marketlist.data.model

data class Market(
    val id: String,
    val name: String,
    val address: String,
    val productList: List<Product>
)
