package com.akshatsahijpal.letseat.data

import com.google.gson.annotations.SerializedName

data class CaloricBreakdown(@SerializedName("percentCarbs")
                            val percentCarbs: Double = 0.0,
                            @SerializedName("percentProtein")
                            val percentProtein: Double = 0.0,
                            @SerializedName("percentFat")
                            val percentFat: Double = 0.0)