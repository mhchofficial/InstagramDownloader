package com.akatsuki.igdownloader.data.model.PostResponse.multi


import com.google.gson.annotations.SerializedName

data class GrowthFrictionInfoXXX(
    @SerializedName("has_active_interventions")
    val hasActiveInterventions: Boolean?,
    @SerializedName("interventions")
    val interventions: InterventionsXXX?
)