package com.akatsuki.igdownloader.data.model.PostResponse.multifeed


import com.google.gson.annotations.SerializedName

data class SharingFrictionInfo(
    @SerializedName("bloks_app_url")
    val bloksAppUrl: Any?,
    @SerializedName("sharing_friction_payload")
    val sharingFrictionPayload: Any?,
    @SerializedName("should_have_sharing_friction")
    val shouldHaveSharingFriction: Boolean?
)