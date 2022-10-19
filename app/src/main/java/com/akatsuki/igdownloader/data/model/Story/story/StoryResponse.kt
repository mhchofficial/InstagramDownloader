package com.akatsuki.igdownloader.data.model.Story.story


import com.google.gson.annotations.SerializedName

data class StoryResponse(
    @SerializedName("broadcast")
    val broadcast: Any?,
    @SerializedName("reel")
    val reel: Reel?,
    @SerializedName("status")
    val status: String?
)