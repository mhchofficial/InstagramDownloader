package com.akatsuki.igdownloader.data.model.PostResponse.multi


import com.google.gson.annotations.SerializedName

data class GrowthFrictionInfo(
    @SerializedName("has_active_interventions")
    val hasActiveInterventions: Boolean?,
    @SerializedName("interventions")
    val interventions: Interventions?
)