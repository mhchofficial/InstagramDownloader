package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class ImageVersions2(
    @SerializedName("additional_candidates")
    val additionalCandidates: AdditionalCandidates?,
    @SerializedName("animated_thumbnail_spritesheet_info_candidates")
    val animatedThumbnailSpritesheetInfoCandidates: AnimatedThumbnailSpritesheetInfoCandidates?,
    @SerializedName("candidates")
    val candidates: List<Candidate>?
)