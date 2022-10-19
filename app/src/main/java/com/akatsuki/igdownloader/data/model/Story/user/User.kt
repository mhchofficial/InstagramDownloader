package com.akatsuki.igdownloader.data.model.Story.user


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    val id: String?,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String?,
    @SerializedName("state_controlled_media_country")
    val stateControlledMediaCountry: Any?,
    @SerializedName("username")
    val username: String?
)