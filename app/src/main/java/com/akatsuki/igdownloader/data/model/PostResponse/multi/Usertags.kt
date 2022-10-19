package com.akatsuki.igdownloader.data.model.PostResponse.multi


import com.google.gson.annotations.SerializedName

data class Usertags(
    @SerializedName("in")
    val inX: List<In>?
)