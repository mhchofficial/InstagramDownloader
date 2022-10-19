package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class EffectConfig(
    @SerializedName("attribution_user")
    val attributionUser: AttributionUser?,
    @SerializedName("attribution_user_id")
    val attributionUserId: String?,
    @SerializedName("device_position")
    val devicePosition: Any?,
    @SerializedName("effect_action_sheet")
    val effectActionSheet: EffectActionSheet?,
    @SerializedName("effect_actions")
    val effectActions: List<String>?,
    @SerializedName("failure_code")
    val failureCode: String?,
    @SerializedName("failure_reason")
    val failureReason: String?,
    @SerializedName("fan_club")
    val fanClub: Any?,
    @SerializedName("formatted_clips_media_count")
    val formattedClipsMediaCount: Any?,
    @SerializedName("gatekeeper")
    val gatekeeper: Any?,
    @SerializedName("gatelogic")
    val gatelogic: Any?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("is_creative_tool")
    val isCreativeTool: Boolean?,
    @SerializedName("is_spot_effect")
    val isSpotEffect: Boolean?,
    @SerializedName("is_spot_recognition_effect")
    val isSpotRecognitionEffect: Boolean?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("save_status")
    val saveStatus: String?,
    @SerializedName("thumbnail_image")
    val thumbnailImage: ThumbnailImage?
)