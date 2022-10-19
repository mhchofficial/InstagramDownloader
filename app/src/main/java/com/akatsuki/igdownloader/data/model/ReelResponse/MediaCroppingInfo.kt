package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class MediaCroppingInfo(
    @SerializedName("square_crop")
    val squareCrop: SquareCrop?
)