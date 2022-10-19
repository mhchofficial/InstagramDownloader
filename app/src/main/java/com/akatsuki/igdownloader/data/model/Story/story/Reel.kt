package com.akatsuki.igdownloader.data.model.Story.story


import com.google.gson.annotations.SerializedName

data class Reel(
    @SerializedName("ad_expiry_timestamp_in_millis")
    val adExpiryTimestampInMillis: Any?,
    @SerializedName("can_gif_quick_reply")
    val canGifQuickReply: Boolean?,
    @SerializedName("can_react_with_avatar")
    val canReactWithAvatar: Boolean?,
    @SerializedName("can_reply")
    val canReply: Boolean?,
    @SerializedName("can_reshare")
    val canReshare: Boolean?,
    @SerializedName("expiring_at")
    val expiringAt: Int?,
    @SerializedName("has_besties_media")
    val hasBestiesMedia: Boolean?,
    @SerializedName("has_fan_club_media")
    val hasFanClubMedia: Boolean?,
    @SerializedName("id")
    val id: Long?,
    @SerializedName("is_cta_sticker_available")
    val isCtaStickerAvailable: Any?,
    @SerializedName("items")
    val items: List<Item>?,
    @SerializedName("latest_reel_media")
    val latestReelMedia: Int?,
    @SerializedName("media_count")
    val mediaCount: Int?,
    @SerializedName("media_ids")
    val mediaIds: List<Long>?,
    @SerializedName("prefetch_count")
    val prefetchCount: Int?,
    @SerializedName("reel_type")
    val reelType: String?,
    @SerializedName("seen")
    val seen: Int?,
    @SerializedName("user")
    val user: UserX?
)