package com.akatsuki.igdownloader.data.model.PostResponse.feed


import com.google.gson.annotations.SerializedName

data class videoversionsMMX(
    @SerializedName("video_versions")
    val videoVersions: List<VideoVersion>?
)