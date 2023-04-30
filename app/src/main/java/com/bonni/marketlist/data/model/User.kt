package com.bonni.marketlist.data.model

data class User(
    val id: String,
    val name: String,
    val address: String,
    val marketList: List<Market>
)
