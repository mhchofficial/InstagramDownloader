package com.akatsuki.igdownloader.data.model.PostResponse.carousel_container


import com.google.gson.annotations.SerializedName

data class CarouselMedia(
    @SerializedName("carousel_parent_id")
    val carouselParentId: String?,
    @SerializedName("commerciality_status")
    val commercialityStatus: String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("image_versions2")
    val imageVersions2: ImageVersions2?,
    @SerializedName("is_dash_eligible")
    val isDashEligible: Int?,
    @SerializedName("media_type")
    val mediaType: Int?,
    @SerializedName("number_of_qualities")
    val numberOfQualities: Int?,
    @SerializedName("original_height")
    val originalHeight: Int?,
    @SerializedName("original_width")
    val originalWidth: Int?,
    @SerializedName("pk")
    val pk: Long?,
    @SerializedName("usertags")
    val usertags: Usertags?,
    @SerializedName("video_codec")
    val videoCodec: String?,
    @SerializedName("video_dash_manifest")
    val videoDashManifest: String?,
    @SerializedName("video_duration")
    val videoDuration: Double?,
    @SerializedName("video_versions")
    val videoVersions: List<VideoVersion>?
)