package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class EffectActionSheet(
    @SerializedName("primary_actions")
    val primaryActions: List<String>?,
    @SerializedName("secondary_actions")
    val secondaryActions: List<String>?
)