package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class Default(
    @SerializedName("file_size_kb")
    val fileSizeKb: Int?,
    @SerializedName("max_thumbnails_per_sprite")
    val maxThumbnailsPerSprite: Int?,
    @SerializedName("rendered_width")
    val renderedWidth: Int?,
    @SerializedName("sprite_height")
    val spriteHeight: Int?,
    @SerializedName("sprite_urls")
    val spriteUrls: List<String>?,
    @SerializedName("sprite_width")
    val spriteWidth: Int?,
    @SerializedName("thumbnail_duration")
    val thumbnailDuration: Double?,
    @SerializedName("thumbnail_height")
    val thumbnailHeight: Int?,
    @SerializedName("thumbnail_width")
    val thumbnailWidth: Int?,
    @SerializedName("thumbnails_per_row")
    val thumbnailsPerRow: Int?,
    @SerializedName("total_thumbnail_num_per_sprite")
    val totalThumbnailNumPerSprite: Int?,
    @SerializedName("video_length")
    val videoLength: Double?
)