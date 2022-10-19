package com.akatsuki.igdownloader.data.model.Story.storyv2


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("account_badges")
    val accountBadges: List<Any>?,
    @SerializedName("fan_club_info")
    val fanClubInfo: FanClubInfo?,
    @SerializedName("follow_friction_type")
    val followFrictionType: Int?,
    @SerializedName("full_name")
    val fullName: String?,
    @SerializedName("growth_friction_info")
    val growthFrictionInfo: GrowthFrictionInfo?,
    @SerializedName("has_anonymous_profile_picture")
    val hasAnonymousProfilePicture: Boolean?,
    @SerializedName("has_highlight_reels")
    val hasHighlightReels: Boolean?,
    @SerializedName("is_favorite")
    val isFavorite: Boolean?,
    @SerializedName("is_private")
    val isPrivate: Boolean?,
    @SerializedName("is_unpublished")
    val isUnpublished: Boolean?,
    @SerializedName("is_verified")
    val isVerified: Boolean?,
    @SerializedName("pk")
    val pk: Long?,
    @SerializedName("profile_pic_id")
    val profilePicId: String?,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String?,
    @SerializedName("transparency_product_enabled")
    val transparencyProductEnabled: Boolean?,
    @SerializedName("username")
    val username: String?
)