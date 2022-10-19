package com.akatsuki.igdownloader.data.model.Story.user


import com.google.gson.annotations.SerializedName

data class UserStoryResponse(
    @SerializedName("showQRModal")
    val showQRModal: Boolean?,
    @SerializedName("user")
    val user: User?
)