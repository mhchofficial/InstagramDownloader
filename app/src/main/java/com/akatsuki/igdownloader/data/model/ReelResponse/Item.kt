package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("can_see_insights_as_brand")
    val canSeeInsightsAsBrand: Boolean?,
    @SerializedName("can_view_more_preview_comments")
    val canViewMorePreviewComments: Boolean?,
    @SerializedName("can_viewer_reshare")
    val canViewerReshare: Boolean?,
    @SerializedName("can_viewer_save")
    val canViewerSave: Boolean?,
    @SerializedName("caption")
    val caption: Caption?,
    @SerializedName("caption_is_edited")
    val captionIsEdited: Boolean?,
    @SerializedName("client_cache_key")
    val clientCacheKey: String?,
    @SerializedName("clips_metadata")
    val clipsMetadata: ClipsMetadata?,
    @SerializedName("code")
    val code: String?,
    @SerializedName("comment_count")
    val commentCount: Int?,
    @SerializedName("comment_inform_treatment")
    val commentInformTreatment: CommentInformTreatment?,
    @SerializedName("comment_likes_enabled")
    val commentLikesEnabled: Boolean?,
    @SerializedName("comment_threading_enabled")
    val commentThreadingEnabled: Boolean?,
    @SerializedName("commerciality_status")
    val commercialityStatus: String?,
    @SerializedName("creative_config")
    val creativeConfig: CreativeConfig?,
    @SerializedName("deleted_reason")
    val deletedReason: Int?,
    @SerializedName("device_timestamp")
    val deviceTimestamp: Long?,
    @SerializedName("featured_products_cta")
    val featuredProductsCta: Any?,
    @SerializedName("filter_type")
    val filterType: Int?,
    @SerializedName("has_audio")
    val hasAudio: Boolean?,
    @SerializedName("has_liked")
    val hasLiked: Boolean?,
    @SerializedName("has_more_comments")
    val hasMoreComments: Boolean?,
    @SerializedName("has_shared_to_fb")
    val hasSharedToFb: Int?,
    @SerializedName("hide_view_all_comment_entrypoint")
    val hideViewAllCommentEntrypoint: Boolean?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("image_versions2")
    val imageVersions2: ImageVersions2?,
    @SerializedName("inline_composer_display_condition")
    val inlineComposerDisplayCondition: String?,
    @SerializedName("inline_composer_imp_trigger_time")
    val inlineComposerImpTriggerTime: Int?,
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
    @SerializedName("is_unified_video")
    val isUnifiedVideo: Boolean?,
    @SerializedName("is_visual_reply_commenter_notice_enabled")
    val isVisualReplyCommenterNoticeEnabled: Boolean?,
    @SerializedName("like_and_view_counts_disabled")
    val likeAndViewCountsDisabled: Boolean?,
    @SerializedName("like_count")
    val likeCount: Int?,
    @SerializedName("max_num_visible_preview_comments")
    val maxNumVisiblePreviewComments: Int?,
    @SerializedName("media_cropping_info")
    val mediaCroppingInfo: MediaCroppingInfo?,
    @SerializedName("media_type")
    val mediaType: Int?,
    @SerializedName("music_metadata")
    val musicMetadata: Any?,
    @SerializedName("next_max_id")
    val nextMaxId: Long?,
    @SerializedName("number_of_qualities")
    val numberOfQualities: Int?,
    @SerializedName("organic_tracking_token")
    val organicTrackingToken: String?,
    @SerializedName("original_height")
    val originalHeight: Int?,
    @SerializedName("original_width")
    val originalWidth: Int?,
    @SerializedName("photo_of_you")
    val photoOfYou: Boolean?,
    @SerializedName("pk")
    val pk: Long?,
    @SerializedName("play_count")
    val playCount: Int?,
    @SerializedName("preview_comments")
    val previewComments: List<PreviewComment>?,
    @SerializedName("product_type")
    val productType: String?,
    @SerializedName("profile_grid_control_enabled")
    val profileGridControlEnabled: Boolean?,
    @SerializedName("sharing_friction_info")
    val sharingFrictionInfo: SharingFrictionInfo?,
    @SerializedName("should_request_ads")
    val shouldRequestAds: Boolean?,
    @SerializedName("taken_at")
    val takenAt: Int?,
    @SerializedName("top_likers")
    val topLikers: List<Any>?,
    @SerializedName("user")
    val user: UserXXX?,
    @SerializedName("video_codec")
    val videoCodec: String?,
    @SerializedName("video_dash_manifest")
    val videoDashManifest: String?,
    @SerializedName("video_duration")
    val videoDuration: Double?,
    @SerializedName("video_subtitles_confidence")
    val videoSubtitlesConfidence: Double?,
    @SerializedName("video_versions")
    val videoVersions: List<VideoVersion>?,
    @SerializedName("view_count")
    val viewCount: Int?
)