package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class ClipsMetadata(
    @SerializedName("additional_audio_info")
    val additionalAudioInfo: AdditionalAudioInfo?,
    @SerializedName("asset_recommendation_info")
    val assetRecommendationInfo: Any?,
    @SerializedName("audio_ranking_info")
    val audioRankingInfo: AudioRankingInfo?,
    @SerializedName("audio_type")
    val audioType: String?,
    @SerializedName("branded_content_tag_info")
    val brandedContentTagInfo: BrandedContentTagInfo?,
    @SerializedName("breaking_content_info")
    val breakingContentInfo: Any?,
    @SerializedName("breaking_creator_info")
    val breakingCreatorInfo: Any?,
    @SerializedName("challenge_info")
    val challengeInfo: Any?,
    @SerializedName("clips_creation_entry_point")
    val clipsCreationEntryPoint: String?,
    @SerializedName("contextual_highlight_info")
    val contextualHighlightInfo: Any?,
    @SerializedName("disable_use_in_clips_client_cache")
    val disableUseInClipsClientCache: Boolean?,
    @SerializedName("featured_label")
    val featuredLabel: Any?,
    @SerializedName("is_fan_club_promo_video")
    val isFanClubPromoVideo: Any?,
    @SerializedName("is_shared_to_fb")
    val isSharedToFb: Boolean?,
    @SerializedName("mashup_info")
    val mashupInfo: MashupInfo?,
    @SerializedName("music_canonical_id")
    val musicCanonicalId: String?,
    @SerializedName("music_info")
    val musicInfo: Any?,
    @SerializedName("nux_info")
    val nuxInfo: Any?,
    @SerializedName("original_sound_info")
    val originalSoundInfo: OriginalSoundInfo?,
    @SerializedName("reels_on_the_rise_info")
    val reelsOnTheRiseInfo: Any?,
    @SerializedName("shopping_info")
    val shoppingInfo: Any?,
    @SerializedName("template_info")
    val templateInfo: Any?,
    @SerializedName("viewer_interaction_settings")
    val viewerInteractionSettings: Any?
)