package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class OriginalMedia(
    @SerializedName("formatted_mashups_count")
    val formattedMashupsCount: Any?,
    @SerializedName("mashups_allowed")
    val mashupsAllowed: Boolean?,
    @SerializedName("media_type")
    val mediaType: String?,
    @SerializedName("non_privacy_filtered_mashups_media_count")
    val nonPrivacyFilteredMashupsMediaCount: Int?,
    @SerializedName("pk")
    val pk: Long?,
    @SerializedName("product_type")
    val productType: String?,
    @SerializedName("sidecar_child_media_ids")
    val sidecarChildMediaIds: Any?,
    @SerializedName("user")
    val user: UserX?
)