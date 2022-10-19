package com.akatsuki.igdownloader.data.model.PostResponse.multifeed


import com.google.gson.annotations.SerializedName

data class MultiFeedResponse(
    @SerializedName("auto_load_more_enabled")
    val autoLoadMoreEnabled: Boolean?,
    @SerializedName("items")
    val items: List<Item>?,
    @SerializedName("more_available")
    val moreAvailable: Boolean?,
    @SerializedName("num_results")
    val numResults: Int?,
    @SerializedName("status")
    val status: String?
)