package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class OriginalSoundInfo(
    @SerializedName("allow_creator_to_rename")
    val allowCreatorToRename: Boolean?,
    @SerializedName("audio_asset_id")
    val audioAssetId: Long?,
    @SerializedName("audio_parts")
    val audioParts: List<Any>?,
    @SerializedName("can_remix_be_shared_to_fb")
    val canRemixBeSharedToFb: Boolean?,
    @SerializedName("consumption_info")
    val consumptionInfo: ConsumptionInfo?,
    @SerializedName("dash_manifest")
    val dashManifest: String?,
    @SerializedName("duration_in_ms")
    val durationInMs: Int?,
    @SerializedName("formatted_clips_media_count")
    val formattedClipsMediaCount: Any?,
    @SerializedName("hide_remixing")
    val hideRemixing: Boolean?,
    @SerializedName("ig_artist")
    val igArtist: IgArtist?,
    @SerializedName("is_audio_automatically_attributed")
    val isAudioAutomaticallyAttributed: Boolean?,
    @SerializedName("is_explicit")
    val isExplicit: Boolean?,
    @SerializedName("music_canonical_id")
    val musicCanonicalId: Any?,
    @SerializedName("original_audio_subtype")
    val originalAudioSubtype: String?,
    @SerializedName("original_audio_title")
    val originalAudioTitle: String?,
    @SerializedName("original_media_id")
    val originalMediaId: Long?,
    @SerializedName("progressive_download_url")
    val progressiveDownloadUrl: String?,
    @SerializedName("should_mute_audio")
    val shouldMuteAudio: Boolean?,
    @SerializedName("time_created")
    val timeCreated: Int?
)