package com.akatsuki.igdownloader.data.model.Story.story


import com.google.gson.annotations.SerializedName

data class FundraiserTag(
    @SerializedName("has_standalone_fundraiser")
    val hasStandaloneFundraiser: Boolean?
)