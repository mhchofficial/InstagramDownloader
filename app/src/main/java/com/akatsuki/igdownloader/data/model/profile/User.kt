package com.akatsuki.igdownloader.data.model.profile


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("about_your_account_bloks_entrypoint_enabled")
    var aboutYourAccountBloksEntrypointEnabled: Boolean?,
    @SerializedName("account_badges")
    var accountBadges: List<Any>?,
    @SerializedName("account_type")
    var accountType: Int?,
    @SerializedName("aggregate_promote_engagement")
    var aggregatePromoteEngagement: Boolean?,
    @SerializedName("allow_mention_setting")
    var allowMentionSetting: String?,
    @SerializedName("allow_tag_setting")
    var allowTagSetting: String?,
    @SerializedName("allowed_commenter_type")
    var allowedCommenterType: String?,
    @SerializedName("auto_expand_chaining")
    var autoExpandChaining: Boolean?,
    @SerializedName("besties_count")
    var bestiesCount: Int?,
    @SerializedName("bio_links")
    var bioLinks: List<Any>?,
    @SerializedName("biography")
    var biography: String?,
    @SerializedName("can_add_fb_group_link_on_profile")
    var canAddFbGroupLinkOnProfile: Boolean?,
    @SerializedName("can_be_tagged_as_sponsor")
    var canBeTaggedAsSponsor: Boolean?,
    @SerializedName("can_boost_post")
    var canBoostPost: Boolean?,
    @SerializedName("can_convert_to_business")
    var canConvertToBusiness: Boolean?,
    @SerializedName("can_create_new_standalone_fundraiser")
    var canCreateNewStandaloneFundraiser: Boolean?,
    @SerializedName("can_create_new_standalone_personal_fundraiser")
    var canCreateNewStandalonePersonalFundraiser: Boolean?,
    @SerializedName("can_create_sponsor_tags")
    var canCreateSponsorTags: Boolean?,
    @SerializedName("can_follow_hashtag")
    var canFollowHashtag: Boolean?,
    @SerializedName("can_see_organic_insights")
    var canSeeOrganicInsights: Boolean?,
    @SerializedName("can_see_primary_country_in_settings")
    var canSeePrimaryCountryInSettings: Boolean?,
    @SerializedName("can_see_support_inbox")
    var canSeeSupportInbox: Boolean?,
    @SerializedName("can_see_support_inbox_v1")
    var canSeeSupportInboxV1: Boolean?,
    @SerializedName("can_tag_products_from_merchants")
    var canTagProductsFromMerchants: Boolean?,
    @SerializedName("eligible_shopping_formats")
    var eligibleShoppingFormats: List<Any>?,
    @SerializedName("eligible_shopping_signup_entrypoints")
    var eligibleShoppingSignupEntrypoints: List<Any>?,
    @SerializedName("existing_user_age_collection_enabled")
    var existingUserAgeCollectionEnabled: Boolean?,
    @SerializedName("external_url")
    var externalUrl: String?,
    @SerializedName("fan_club_info")
    var fanClubInfo: FanClubInfo?,
    @SerializedName("fbid_v2")
    var fbidV2: Long?,
    @SerializedName("fbpay_experience_enabled")
    var fbpayExperienceEnabled: Boolean?,
    @SerializedName("feed_post_reshare_disabled")
    var feedPostReshareDisabled: Boolean?,
    @SerializedName("follow_friction_type")
    var followFrictionType: Int?,
    @SerializedName("follower_count")
    var followerCount: Int?,
    @SerializedName("following_count")
    var followingCount: Int?,
    @SerializedName("following_tag_count")
    var followingTagCount: Int?,
    @SerializedName("full_name")
    var fullName: String?,
    @SerializedName("geo_media_count")
    var geoMediaCount: Int?,
    @SerializedName("growth_friction_info")
    var growthFrictionInfo: GrowthFrictionInfo?,
    @SerializedName("has_anonymous_profile_picture")
    var hasAnonymousProfilePicture: Boolean?,
    @SerializedName("has_biography_translation")
    var hasBiographyTranslation: Boolean?,
    @SerializedName("has_chaining")
    var hasChaining: Boolean?,
    @SerializedName("has_eligible_whatsapp_linking_category")
    var hasEligibleWhatsappLinkingCategory: Any?,
    @SerializedName("has_exclusive_feed_content")
    var hasExclusiveFeedContent: Boolean?,
    @SerializedName("has_guides")
    var hasGuides: Boolean?,
    @SerializedName("has_highlight_reels")
    var hasHighlightReels: Boolean?,
    @SerializedName("has_placed_orders")
    var hasPlacedOrders: Boolean?,
    @SerializedName("has_saved_items")
    var hasSavedItems: Boolean?,
    @SerializedName("has_videos")
    var hasVideos: Boolean?,
    @SerializedName("hd_profile_pic_url_info")
    var hdProfilePicUrlInfo: HdProfilePicUrlInfo?,
    @SerializedName("hd_profile_pic_versions")
    var hdProfilePicVersions: List<HdProfilePicVersion>?,
    @SerializedName("highlight_reshare_disabled")
    var highlightReshareDisabled: Boolean?,
    @SerializedName("include_direct_blacklist_status")
    var includeDirectBlacklistStatus: Boolean?,
    @SerializedName("interop_messaging_user_fbid")
    var interopMessagingUserFbid: Long?,
    @SerializedName("is_allowed_to_create_standalone_nonprofit_fundraisers")
    var isAllowedToCreateStandaloneNonprofitFundraisers: Boolean?,
    @SerializedName("is_allowed_to_create_standalone_personal_fundraisers")
    var isAllowedToCreateStandalonePersonalFundraisers: Boolean?,
    @SerializedName("is_business")
    var isBusiness: Boolean?,
    @SerializedName("is_call_to_action_enabled")
    var isCallToActionEnabled: Any?,
    @SerializedName("is_digital_collectibles_onboarding_enabled")
    var isDigitalCollectiblesOnboardingEnabled: Boolean?,
    @SerializedName("is_eligible_for_affiliate_shop_onboarding")
    var isEligibleForAffiliateShopOnboarding: Boolean?,
    @SerializedName("is_eligible_to_show_fb_cross_sharing_nux")
    var isEligibleToShowFbCrossSharingNux: Boolean?,
    @SerializedName("is_hide_more_comment_enabled")
    var isHideMoreCommentEnabled: Boolean?,
    @SerializedName("is_igd_product_picker_enabled")
    var isIgdProductPickerEnabled: Boolean?,
    @SerializedName("is_interest_account")
    var isInterestAccount: Boolean?,
    @SerializedName("is_memorialized")
    var isMemorialized: Boolean?,
    @SerializedName("is_muted_words_custom_enabled")
    var isMutedWordsCustomEnabled: Boolean?,
    @SerializedName("is_muted_words_global_enabled")
    var isMutedWordsGlobalEnabled: Boolean?,
    @SerializedName("is_needy")
    var isNeedy: Boolean?,
    @SerializedName("is_new_to_instagram")
    var isNewToInstagram: Boolean?,
    @SerializedName("is_potential_business")
    var isPotentialBusiness: Boolean?,
    @SerializedName("is_private")
    var isPrivate: Boolean?,
    @SerializedName("is_profile_action_needed")
    var isProfileActionNeeded: Boolean?,
    @SerializedName("is_shopping_auto_highlight_eligible")
    var isShoppingAutoHighlightEligible: Boolean?,
    @SerializedName("is_shopping_catalog_source_selection_enabled")
    var isShoppingCatalogSourceSelectionEnabled: Boolean?,
    @SerializedName("is_shopping_community_content_enabled")
    var isShoppingCommunityContentEnabled: Boolean?,
    @SerializedName("is_shopping_settings_enabled")
    var isShoppingSettingsEnabled: Boolean?,
    @SerializedName("is_supervision_features_enabled")
    var isSupervisionFeaturesEnabled: Boolean?,
    @SerializedName("is_verified")
    var isVerified: Boolean?,
    @SerializedName("media_count")
    var mediaCount: Int?,
    @SerializedName("needs_to_accept_shopping_seller_onboarding_terms")
    var needsToAcceptShoppingSellerOnboardingTerms: Boolean?,
    @SerializedName("open_external_url_with_in_app_browser")
    var openExternalUrlWithInAppBrowser: Boolean?,
    @SerializedName("page_id_for_new_suma_biz_account")
    var pageIdForNewSumaBizAccount: Any?,
    @SerializedName("personal_account_ads_page_id")
    var personalAccountAdsPageId: Any?,
    @SerializedName("personal_account_ads_page_name")
    var personalAccountAdsPageName: Any?,
    @SerializedName("pk")
    var pk: Long?,
    @SerializedName("primary_profile_link_type")
    var primaryProfileLinkType: Int?,
    @SerializedName("professional_conversion_suggested_account_type")
    var professionalConversionSuggestedAccountType: Int?,
    @SerializedName("profile_pic_id")
    var profilePicId: String?,
    @SerializedName("profile_pic_url")
    var profilePicUrl: String?,
    @SerializedName("recently_bestied_by_count")
    var recentlyBestiedByCount: Int?,
    @SerializedName("reel_auto_archive")
    var reelAutoArchive: String?,
    @SerializedName("request_contact_enabled")
    var requestContactEnabled: Boolean?,
    @SerializedName("show_besties_badge")
    var showBestiesBadge: Boolean?,
    @SerializedName("show_conversion_edit_entry")
    var showConversionEditEntry: Boolean?,
    @SerializedName("show_fb_link_on_profile")
    var showFbLinkOnProfile: Boolean?,
    @SerializedName("show_insights_terms")
    var showInsightsTerms: Boolean?,
    @SerializedName("show_post_insights_entry_point")
    var showPostInsightsEntryPoint: Boolean?,
    @SerializedName("total_ar_effects")
    var totalArEffects: Int?,
    @SerializedName("total_clips_count")
    var totalClipsCount: Int?,
    @SerializedName("total_igtv_videos")
    var totalIgtvVideos: Int?,
    @SerializedName("transparency_product_enabled")
    var transparencyProductEnabled: Boolean?,
    @SerializedName("username")
    var username: String?,
    @SerializedName("usertag_review_enabled")
    var usertagReviewEnabled: Boolean?,
    @SerializedName("usertags_count")
    var usertagsCount: Int?,
    @SerializedName("whatsapp_number")
    var whatsappNumber: String?
)