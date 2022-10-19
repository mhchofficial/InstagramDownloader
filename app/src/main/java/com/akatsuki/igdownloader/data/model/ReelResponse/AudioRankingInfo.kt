package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class AudioRankingInfo(
    @SerializedName("best_audio_cluster_id")
    val bestAudioClusterId: String?
)