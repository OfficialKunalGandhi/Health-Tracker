package com.akshatsahijpal.letseat.data.subroot

import com.google.gson.annotations.SerializedName

data class AnalyzedInstructionsItem(@SerializedName("name")
                                    val name: String = "",
                                    @SerializedName("steps")
                                    val steps: List<StepsItem>?)