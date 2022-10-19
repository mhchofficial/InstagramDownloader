package com.akatsuki.igdownloader.data.model.profile


import com.google.gson.annotations.SerializedName

data class ProfileResponse(
    @SerializedName("status")
    var status: String?,
    @SerializedName("user")
    var user: User?
)