package com.akatsuki.igdownloader.data.model.PostResponse.feed


import com.google.gson.annotations.SerializedName

data class UserX(
    @SerializedName("account_badges")
    val accountBadges: List<Any>?,
    @SerializedName("fan_club_info")
    val fanClubInfo: FanClubInfo?,
    @SerializedName("follow_friction_type")
    val followFrictionType: Int?,
    @SerializedName("friendship_status")
    val friendshipStatus: FriendshipStatus?,
    @SerializedName("full_name")
    val fullName: String?,
    @SerializedName("growth_friction_info")
    val growthFrictionInfo: GrowthFrictionInfoX?,
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
    @SerializedName("latest_reel_media")
    val latestReelMedia: Int?,
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