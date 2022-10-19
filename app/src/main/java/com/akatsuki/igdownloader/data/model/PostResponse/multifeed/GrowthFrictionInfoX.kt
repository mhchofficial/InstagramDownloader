package com.akatsuki.igdownloader.data.model.PostResponse.multifeed


import com.google.gson.annotations.SerializedName

data class GrowthFrictionInfoX(
    @SerializedName("has_active_interventions")
    val hasActiveInterventions: Boolean?,
    @SerializedName("interventions")
    val interventions: InterventionsX?
)