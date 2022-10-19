package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class UserXX(
    @SerializedName("follow_friction_type")
    val followFrictionType: Int?,
    @SerializedName("full_name")
    val fullName: String?,
    @SerializedName("growth_friction_info")
    val growthFrictionInfo: GrowthFrictionInfoXXX?,
    @SerializedName("is_private")
    val isPrivate: Boolean?,
    @SerializedName("is_verified")
    val isVerified: Boolean?,
    @SerializedName("pk")
    val pk: Long?,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String?,
    @SerializedName("username")
    val username: String?
)