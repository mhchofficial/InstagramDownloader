package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class AttributionUser(
    @SerializedName("instagram_user_id")
    val instagramUserId: String?,
    @SerializedName("profile_picture")
    val profilePicture: ProfilePicture?,
    @SerializedName("username")
    val username: String?
)