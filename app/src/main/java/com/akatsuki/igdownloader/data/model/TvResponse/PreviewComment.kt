package com.akatsuki.igdownloader.data.model.TvResponse


import com.google.gson.annotations.SerializedName

data class PreviewComment(
    @SerializedName("bit_flags")
    val bitFlags: Int?,
    @SerializedName("comment_like_count")
    val commentLikeCount: Int?,
    @SerializedName("content_type")
    val contentType: String?,
    @SerializedName("created_at")
    val createdAt: Int?,
    @SerializedName("created_at_utc")
    val createdAtUtc: Int?,
    @SerializedName("did_report_as_spam")
    val didReportAsSpam: Boolean?,
    @SerializedName("has_liked_comment")
    val hasLikedComment: Boolean?,
    @SerializedName("has_translation")
    val hasTranslation: Boolean?,
    @SerializedName("is_covered")
    val isCovered: Boolean?,
    @SerializedName("is_pinned")
    val isPinned: Boolean?,
    @SerializedName("media_id")
    val mediaId: Long?,
    @SerializedName("pk")
    val pk: Long?,
    @SerializedName("private_reply_status")
    val privateReplyStatus: Int?,
    @SerializedName("share_enabled")
    val shareEnabled: Boolean?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("text")
    val text: String?,
    @SerializedName("type")
    val type: Int?,
    @SerializedName("user")
    val user: UserX?,
    @SerializedName("user_id")
    val userId: Long?
)