package com.akatsuki.igdownloader.data.model.TvResponse


import com.google.gson.annotations.SerializedName

data class In(
    @SerializedName("categories")
    val categories: Any?,
    @SerializedName("duration_in_video_in_sec")
    val durationInVideoInSec: Any?,
    @SerializedName("position")
    val position: List<Double>?,
    @SerializedName("show_category_of_user")
    val showCategoryOfUser: Boolean?,
    @SerializedName("start_time_in_video_in_sec")
    val startTimeInVideoInSec: Any?,
    @SerializedName("user")
    val user: UserXXX?
)