package com.akatsuki.igdownloader.data.model.Story.storyv2


import com.google.gson.annotations.SerializedName

data class FundraiserTag(
    @SerializedName("has_standalone_fundraiser")
    val hasStandaloneFundraiser: Boolean?
)