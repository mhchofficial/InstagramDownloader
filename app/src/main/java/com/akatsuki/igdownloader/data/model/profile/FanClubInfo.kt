package com.akatsuki.igdownloader.data.model.profile


import com.google.gson.annotations.SerializedName

data class FanClubInfo(
    @SerializedName("fan_club_id")
    var fanClubId: Any?,
    @SerializedName("fan_club_name")
    var fanClubName: Any?
)