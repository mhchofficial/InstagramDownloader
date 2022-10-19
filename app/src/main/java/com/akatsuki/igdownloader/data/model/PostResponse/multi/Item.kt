package com.akatsuki.igdownloader.data.model.PostResponse.multi


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
    @SerializedName("carousel_media")
    val carouselMedia: List<CarouselMedia>?,
    @SerializedName("carousel_media_count")
    val carouselMediaCount: Int?,
    @SerializedName("client_cache_key")
    val clientCacheKey: String?,
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
    @SerializedName("deleted_reason")
    val deletedReason: Int?,
    @SerializedName("device_timestamp")
    val deviceTimestamp: Long?,
    @SerializedName("featured_products_cta")
    val featuredProductsCta: Any?,
    @SerializedName("filter_type")
    val filterType: Int?,
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
    @SerializedName("inline_composer_display_condition")
    val inlineComposerDisplayCondition: String?,
    @SerializedName("inline_composer_imp_trigger_time")
    val inlineComposerImpTriggerTime: Int?,
    @SerializedName("integrity_review_decision")
    val integrityReviewDecision: String?,
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
    @SerializedName("location")
    val location: Location?,
    @SerializedName("max_num_visible_preview_comments")
    val maxNumVisiblePreviewComments: Int?,
    @SerializedName("media_type")
    val mediaType: Int?,
    @SerializedName("music_metadata")
    val musicMetadata: MusicMetadata?,
    @SerializedName("organic_tracking_token")
    val organicTrackingToken: String?,
    @SerializedName("photo_of_you")
    val photoOfYou: Boolean?,
    @SerializedName("pk")
    val pk: Long?,
    @SerializedName("preview_comments")
    val previewComments: List<Any>?,
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
    val user: UserXX?,
    @SerializedName("usertags")
    val usertags: UsertagsX?
)