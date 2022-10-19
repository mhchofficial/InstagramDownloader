package com.akatsuki.igdownloader.data.model.Story.storyv2


import com.google.gson.annotations.SerializedName

data class UserX(
    @SerializedName("follow_friction_type")
    val followFrictionType: Int?,
    @SerializedName("friendship_status")
    val friendshipStatus: FriendshipStatus?,
    @SerializedName("full_name")
    val fullName: String?,
    @SerializedName("growth_friction_info")
    val growthFrictionInfo: GrowthFrictionInfoX?,
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