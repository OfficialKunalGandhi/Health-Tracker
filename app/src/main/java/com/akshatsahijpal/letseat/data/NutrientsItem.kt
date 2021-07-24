package com.akshatsahijpal.letseat.data

import com.google.gson.annotations.SerializedName

data class NutrientsItem(@SerializedName("amount")
                         val amount: Double = 0.0,
                         @SerializedName("unit")
                         val unit: String = "",
                         @SerializedName("percentOfDailyNeeds")
                         val percentOfDailyNeeds: Double = 0.0,
                         @SerializedName("name")
                         val name: String = "",
                         @SerializedName("title")
                         val title: String = "")