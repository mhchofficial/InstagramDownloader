package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class GrowthFrictionInfoXXXX(
    @SerializedName("has_active_interventions")
    val hasActiveInterventions: Boolean?,
    @SerializedName("interventions")
    val interventions: InterventionsXXXX?
)