package com.akatsuki.igdownloader.data.model.TvResponse


import com.google.gson.annotations.SerializedName

data class FriendshipStatus(
    @SerializedName("following")
    val following: Boolean?,
    @SerializedName("is_bestie")
    val isBestie: Boolean?,
    @SerializedName("is_feed_favorite")
    val isFeedFavorite: Boolean?,
    @SerializedName("is_restricted")
    val isRestricted: Boolean?,
    @SerializedName("outgoing_request")
    val outgoingRequest: Boolean?
)