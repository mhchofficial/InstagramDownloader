package com.akatsuki.igdownloader.data.model.Story.story


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("can_reply")
    val canReply: Boolean?,
    @SerializedName("can_reshare")
    val canReshare: Boolean?,
    @SerializedName("can_see_insights_as_brand")
    val canSeeInsightsAsBrand: Boolean?,
    @SerializedName("can_send_custom_emojis")
    val canSendCustomEmojis: Boolean?,
    @SerializedName("can_viewer_save")
    val canViewerSave: Boolean?,
    @SerializedName("caption")
    val caption: Any?,
    @SerializedName("caption_is_edited")
    val captionIsEdited: Boolean?,
    @SerializedName("caption_position")
    val captionPosition: Double?,
    @SerializedName("client_cache_key")
    val clientCacheKey: String?,
    @SerializedName("code")
    val code: String?,
    @SerializedName("comment_inform_treatment")
    val commentInformTreatment: CommentInformTreatment?,
    @SerializedName("commerciality_status")
    val commercialityStatus: String?,
    @SerializedName("deleted_reason")
    val deletedReason: Int?,
    @SerializedName("device_timestamp")
    val deviceTimestamp: Long?,
    @SerializedName("expiring_at")
    val expiringAt: Int?,
    @SerializedName("filter_type")
    val filterType: Int?,
    @SerializedName("fundraiser_tag")
    val fundraiserTag: FundraiserTag?,
    @SerializedName("has_audio")
    val hasAudio: Boolean?,
    @SerializedName("has_liked")
    val hasLiked: Boolean?,
    @SerializedName("has_shared_to_fb")
    val hasSharedToFb: Int?,
    @SerializedName("has_translation")
    val hasTranslation: Boolean?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("image_versions2")
    val imageVersions2: ImageVersions2?,
    @SerializedName("imported_taken_at")
    val importedTakenAt: Int?,
    @SerializedName("integrity_review_decision")
    val integrityReviewDecision: String?,
    @SerializedName("is_dash_eligible")
    val isDashEligible: Int?,
    @SerializedName("is_in_profile_grid")
    val isInProfileGrid: Boolean?,
    @SerializedName("is_organic_product_tagging_eligible")
    val isOrganicProductTaggingEligible: Boolean?,
    @SerializedName("is_paid_partnership")
    val isPaidPartnership: Boolean?,
    @SerializedName("is_reel_media")
    val isReelMedia: Boolean?,
    @SerializedName("is_unified_video")
    val isUnifiedVideo: Boolean?,
    @SerializedName("is_visual_reply_commenter_notice_enabled")
    val isVisualReplyCommenterNoticeEnabled: Boolean?,
    @SerializedName("like_and_view_counts_disabled")
    val likeAndViewCountsDisabled: Boolean?,
    @SerializedName("media_type")
    val mediaType: Int?,
    @SerializedName("music_metadata")
    val musicMetadata: Any?,
    @SerializedName("number_of_qualities")
    val numberOfQualities: Int?,
    @SerializedName("organic_tracking_token")
    val organicTrackingToken: String?,
    @SerializedName("original_height")
    val originalHeight: Int?,
    @SerializedName("original_media_has_visual_reply_media")
    val originalMediaHasVisualReplyMedia: Boolean?,
    @SerializedName("original_width")
    val originalWidth: Int?,
    @SerializedName("photo_of_you")
    val photoOfYou: Boolean?,
    @SerializedName("pk")
    val pk: Long?,
    @SerializedName("product_type")
    val productType: String?,
    @SerializedName("profile_grid_control_enabled")
    val profileGridControlEnabled: Boolean?,
    @SerializedName("sharing_friction_info")
    val sharingFrictionInfo: SharingFrictionInfo?,
    @SerializedName("should_request_ads")
    val shouldRequestAds: Boolean?,
    @SerializedName("show_one_tap_fb_share_tooltip")
    val showOneTapFbShareTooltip: Boolean?,
    @SerializedName("story_feed_media")
    val storyFeedMedia: List<StoryFeedMedia>?,
    @SerializedName("story_static_models")
    val storyStaticModels: List<Any>?,
    @SerializedName("supports_reel_reactions")
    val supportsReelReactions: Boolean?,
    @SerializedName("taken_at")
    val takenAt: Int?,
    @SerializedName("user")
    val user: User?,
    @SerializedName("video_codec")
    val videoCodec: String?,
    @SerializedName("video_dash_manifest")
    val videoDashManifest: String?,
    @SerializedName("video_duration")
    val videoDuration: Double?,
    @SerializedName("video_versions")
    val videoVersions: List<VideoVersion>?
)