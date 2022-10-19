package com.akatsuki.igdownloader.data.model.Story.storyv2


import com.google.gson.annotations.SerializedName

data class ImageVersions2(
    @SerializedName("candidates")
    val candidates: List<Candidate>?
)