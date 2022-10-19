package com.akatsuki.igdownloader.data.model.Story.story


import com.google.gson.annotations.SerializedName

data class ImageVersions2(
    @SerializedName("candidates")
    val candidates: List<Candidate>?
)