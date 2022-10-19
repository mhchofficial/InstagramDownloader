package com.akatsuki.igdownloader.data.model.Story.storyv2


import com.google.gson.annotations.SerializedName

data class Story2Response(
    @SerializedName("broadcast")
    val broadcast: Any?,
    @SerializedName("reel")
    val reel: Reel?,
    @SerializedName("status")
    val status: String?
)