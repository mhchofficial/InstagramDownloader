package com.akatsuki.igdownloader.data.model.Story.story


import com.google.gson.annotations.SerializedName

data class StoryFeedMedia(
    @SerializedName("height")
    val height: Double?,
    @SerializedName("is_fb_sticker")
    val isFbSticker: Int?,
    @SerializedName("is_hidden")
    val isHidden: Int?,
    @SerializedName("is_pinned")
    val isPinned: Int?,
    @SerializedName("is_sticker")
    val isSticker: Int?,
    @SerializedName("media_code")
    val mediaCode: String?,
    @SerializedName("media_id")
    val mediaId: String?,
    @SerializedName("product_type")
    val productType: String?,
    @SerializedName("rotation")
    val rotation: Double?,
    @SerializedName("width")
    val width: Double?,
    @SerializedName("x")
    val x: Double?,
    @SerializedName("y")
    val y: Double?,
    @SerializedName("z")
    val z: Int?
)