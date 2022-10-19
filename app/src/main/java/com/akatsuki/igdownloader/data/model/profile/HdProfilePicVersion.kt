package com.akatsuki.igdownloader.data.model.profile


import com.google.gson.annotations.SerializedName

data class HdProfilePicVersion(
    @SerializedName("height")
    var height: Int?,
    @SerializedName("url")
    var url: String?,
    @SerializedName("width")
    var width: Int?
)