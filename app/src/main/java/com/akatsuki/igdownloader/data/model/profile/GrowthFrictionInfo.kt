package com.akatsuki.igdownloader.data.model.profile


import com.google.gson.annotations.SerializedName

data class GrowthFrictionInfo(
    @SerializedName("has_active_interventions")
    var hasActiveInterventions: Boolean?,
    @SerializedName("interventions")
    var interventions: Interventions?
)