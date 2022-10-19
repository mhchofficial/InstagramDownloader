package com.akatsuki.igdownloader.data.model.Story.story


import com.google.gson.annotations.SerializedName

data class FriendshipStatus(
    @SerializedName("blocking")
    val blocking: Boolean?,
    @SerializedName("followed_by")
    val followedBy: Boolean?,
    @SerializedName("following")
    val following: Boolean?,
    @SerializedName("incoming_request")
    val incomingRequest: Boolean?,
    @SerializedName("is_bestie")
    val isBestie: Boolean?,
    @SerializedName("is_feed_favorite")
    val isFeedFavorite: Boolean?,
    @SerializedName("is_private")
    val isPrivate: Boolean?,
    @SerializedName("is_restricted")
    val isRestricted: Boolean?,
    @SerializedName("muting")
    val muting: Boolean?,
    @SerializedName("outgoing_request")
    val outgoingRequest: Boolean?
)