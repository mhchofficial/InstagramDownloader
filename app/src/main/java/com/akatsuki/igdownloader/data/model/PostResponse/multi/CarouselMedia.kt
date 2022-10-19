package com.akatsuki.igdownloader.data.model.PostResponse.multi


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
    @SerializedName("media_type")
    val mediaType: Int?,
    @SerializedName("original_height")
    val originalHeight: Int?,
    @SerializedName("original_width")
    val originalWidth: Int?,
    @SerializedName("pk")
    val pk: Long?,
    @SerializedName("usertags")
    val usertags: Usertags?
)