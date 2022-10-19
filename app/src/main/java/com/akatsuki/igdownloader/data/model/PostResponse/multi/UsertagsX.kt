package com.akatsuki.igdownloader.data.model.PostResponse.multi


import com.google.gson.annotations.SerializedName

data class UsertagsX(
    @SerializedName("in")
    val inX: List<InX>?
)