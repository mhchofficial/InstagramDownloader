package com.akatsuki.igdownloader.data.model.mediaid_bumsun


import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class MediaIdResponse(
    @SerializedName("result")
    var result: String?,
    @SerializedName("status")
    var status: Boolean?
)