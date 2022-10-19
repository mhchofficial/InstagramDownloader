package com.akatsuki.igdownloader.data.model.PostResponse.multi


import com.google.gson.annotations.SerializedName

data class MusicMetadata(
    @SerializedName("audio_type")
    val audioType: Any?,
    @SerializedName("music_canonical_id")
    val musicCanonicalId: String?,
    @SerializedName("music_info")
    val musicInfo: Any?,
    @SerializedName("original_sound_info")
    val originalSoundInfo: Any?
)