package com.akatsuki.igdownloader.data.model.PostResponse.feed


import com.google.gson.annotations.SerializedName

data class ImageVersions2(
    @SerializedName("candidates")
    val candidates: List<Candidate>?
)