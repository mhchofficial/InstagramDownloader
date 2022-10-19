package com.akatsuki.igdownloader.data.model.ReelResponse


import com.google.gson.annotations.SerializedName

data class CreativeConfig(
    @SerializedName("camera_tools")
    val cameraTools: List<String>?,
    @SerializedName("capture_type")
    val captureType: String?,
    @SerializedName("creation_tool_info")
    val creationToolInfo: List<CreationToolInfo>?,
    @SerializedName("effect_configs")
    val effectConfigs: List<EffectConfig>?,
    @SerializedName("effect_ids")
    val effectIds: List<Long>?
)