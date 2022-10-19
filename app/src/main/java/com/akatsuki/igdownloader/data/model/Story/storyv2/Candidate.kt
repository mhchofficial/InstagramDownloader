package com.akatsuki.igdownloader.data.model.Story.storyv2


import com.google.gson.annotations.SerializedName

data class Candidate(
    @SerializedName("height")
    val height: Int?,
    @SerializedName("scans_profile")
    val scansProfile: String?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("width")
    val width: Int?
)