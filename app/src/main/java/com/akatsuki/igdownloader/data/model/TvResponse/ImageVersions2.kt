package com.akatsuki.igdownloader.data.model.TvResponse


import com.google.gson.annotations.SerializedName

data class ImageVersions2(
    @SerializedName("additional_candidates")
    val additionalCandidates: AdditionalCandidates?,
    @SerializedName("candidates")
    val candidates: List<Candidate>?
)