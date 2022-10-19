package com.akatsuki.igdownloader.data.model.PostResponse.carousel_container


import com.google.gson.annotations.SerializedName

data class Candidate(
    @SerializedName("estimated_scans_sizes")
    val estimatedScansSizes: List<Int>?,
    @SerializedName("height")
    val height: Int?,
    @SerializedName("scans_profile")
    val scansProfile: String?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("width")
    val width: Int?
)