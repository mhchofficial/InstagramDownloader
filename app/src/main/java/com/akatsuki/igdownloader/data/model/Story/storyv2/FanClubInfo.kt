package com.akatsuki.igdownloader.data.model.Story.storyv2


import com.google.gson.annotations.SerializedName

data class FanClubInfo(
    @SerializedName("fan_club_id")
    val fanClubId: Any?,
    @SerializedName("fan_club_name")
    val fanClubName: Any?
)