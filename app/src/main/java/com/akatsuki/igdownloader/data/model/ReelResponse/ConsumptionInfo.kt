package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class ConsumptionInfo(
    @SerializedName("is_bookmarked")
    val isBookmarked: Boolean?,
    @SerializedName("is_trending_in_clips")
    val isTrendingInClips: Boolean?,
    @SerializedName("should_mute_audio_reason")
    val shouldMuteAudioReason: String?,
    @SerializedName("should_mute_audio_reason_type")
    val shouldMuteAudioReasonType: Any?
)