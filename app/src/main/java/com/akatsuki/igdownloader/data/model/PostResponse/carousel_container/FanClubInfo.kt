package com.akatsuki.igdownloader.data.model.PostResponse.carousel_container


import com.google.gson.annotations.SerializedName

data class FanClubInfo(
    @SerializedName("fan_club_id")
    val fanClubId: Any?,
    @SerializedName("fan_club_name")
    val fanClubName: Any?
)