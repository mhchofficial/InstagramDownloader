package com.akatsuki.igdownloader.data.model.TvResponse


import com.google.gson.annotations.SerializedName

data class FirstFrame(
    @SerializedName("height")
    val height: Int?,
    @SerializedName("scans_profile")
    val scansProfile: String?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("width")
    val width: Int?
)