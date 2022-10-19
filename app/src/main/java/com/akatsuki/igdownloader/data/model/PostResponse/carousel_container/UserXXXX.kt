package com.akatsuki.igdownloader.data.model.PostResponse.carousel_container


import com.google.gson.annotations.SerializedName

data class UserXXXX(
    @SerializedName("follow_friction_type")
    val followFrictionType: Int?,
    @SerializedName("full_name")
    val fullName: String?,
    @SerializedName("growth_friction_info")
    val growthFrictionInfo: GrowthFrictionInfoXXXX?,
    @SerializedName("is_private")
    val isPrivate: Boolean?,
    @SerializedName("is_verified")
    val isVerified: Boolean?,
    @SerializedName("pk")
    val pk: Long?,
    @SerializedName("profile_pic_id")
    val profilePicId: String?,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String?,
    @SerializedName("username")
    val username: String?
)