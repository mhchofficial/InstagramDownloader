package com.akatsuki.igdownloader.data.model.TvResponse


import com.google.gson.annotations.SerializedName

data class AdditionalCandidates(
    @SerializedName("first_frame")
    val firstFrame: FirstFrame?,
    @SerializedName("igtv_first_frame")
    val igtvFirstFrame: IgtvFirstFrame?
)