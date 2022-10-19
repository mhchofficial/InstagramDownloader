package com.akatsuki.igdownloader.data.model.PostResponse.multifeed


import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("address")
    val address: String?,
    @SerializedName("city")
    val city: String?,
    @SerializedName("external_source")
    val externalSource: String?,
    @SerializedName("facebook_places_id")
    val facebookPlacesId: Long?,
    @SerializedName("has_viewer_saved")
    val hasViewerSaved: Boolean?,
    @SerializedName("is_eligible_for_guides")
    val isEligibleForGuides: Boolean?,
    @SerializedName("lat")
    val lat: Double?,
    @SerializedName("lng")
    val lng: Double?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("pk")
    val pk: Long?,
    @SerializedName("short_name")
    val shortName: String?
)