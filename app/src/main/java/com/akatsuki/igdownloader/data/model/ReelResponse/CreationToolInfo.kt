package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class CreationToolInfo(
    @SerializedName("appearance_effect")
    val appearanceEffect: Int?,
    @SerializedName("camera_tool")
    val cameraTool: Int?,
    @SerializedName("color_filters")
    val colorFilters: String?,
    @SerializedName("duration_selector_seconds")
    val durationSelectorSeconds: Int?,
    @SerializedName("speed_selector")
    val speedSelector: Double?,
    @SerializedName("timer_selector_seconds")
    val timerSelectorSeconds: Int?
)