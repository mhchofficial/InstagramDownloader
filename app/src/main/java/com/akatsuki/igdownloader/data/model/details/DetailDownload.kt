package com.akatsuki.igdownloader.data.model.details


import androidx.annotation.Keep
import com.akatsuki.igdownloader.data.model.details.Urls
import com.google.gson.annotations.SerializedName

@Keep
data class DetailDownload(
    @SerializedName("username")
    val username: String?,
    @SerializedName("image_profile")
    val image_profile: String?,
    @SerializedName("caption")
    val caption: String?,
    @SerializedName("urls")
    val urls: List<Urls>?


)
