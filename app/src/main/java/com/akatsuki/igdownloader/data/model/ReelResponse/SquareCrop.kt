package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class SquareCrop(
    @SerializedName("crop_bottom")
    val cropBottom: Double?,
    @SerializedName("crop_left")
    val cropLeft: Double?,
    @SerializedName("crop_right")
    val cropRight: Double?,
    @SerializedName("crop_top")
    val cropTop: Double?
)