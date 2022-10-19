package com.akatsuki.igdownloader.data.model.Story.storyv2


import com.google.gson.annotations.SerializedName

data class CommentInformTreatment(
    @SerializedName("action_type")
    val actionType: Any?,
    @SerializedName("should_have_inform_treatment")
    val shouldHaveInformTreatment: Boolean?,
    @SerializedName("text")
    val text: String?,
    @SerializedName("url")
    val url: Any?
)