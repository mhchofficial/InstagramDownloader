package com.akatsuki.igdownloader.data.model.details


import com.google.gson.annotations.SerializedName

data class Urls(
    @SerializedName("url")
    val url: String?
)