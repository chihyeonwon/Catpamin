package com.example.lovecat.data


import com.google.gson.annotations.SerializedName

data class CatModelItem(
    @SerializedName("height")
    val height: Int,
    @SerializedName("id")
    val id: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("width")
    val width: Int
)