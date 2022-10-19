package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class AudioReattributionInfo(
    @SerializedName("should_allow_restore")
    val shouldAllowRestore: Boolean?
)