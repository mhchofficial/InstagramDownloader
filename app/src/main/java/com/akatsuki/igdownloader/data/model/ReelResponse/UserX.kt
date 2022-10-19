package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class UserX(
    @SerializedName("account_badges")
    val accountBadges: List<Any>?,
    @SerializedName("follow_friction_type")
    val followFrictionType: Int?,
    @SerializedName("full_name")
    val fullName: String?,
    @SerializedName("growth_friction_info")
    val growthFrictionInfo: GrowthFrictionInfoX?,
    @SerializedName("has_anonymous_profile_picture")
    val hasAnonymousProfilePicture: Boolean?,
    @SerializedName("has_highlight_reels")
    val hasHighlightReels: Boolean?,
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