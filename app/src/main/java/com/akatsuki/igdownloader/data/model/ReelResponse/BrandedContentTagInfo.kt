package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class BrandedContentTagInfo(
    @SerializedName("can_add_tag")
    val canAddTag: Boolean?
)