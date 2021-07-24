package com.akshatsahijpal.letseat.data.subroot

import com.google.gson.annotations.SerializedName

data class IngredientsItem(@SerializedName("amount")
                           val amount: Double = 0.0,
                           @SerializedName("unit")
                           val unit: String = "",
                           @SerializedName("name")
                           val name: String = "",
                           @SerializedName("id")
                           val id: Int = 0,
                           @SerializedName("nutrients")
                           val nutrients: List<NutrientsItem>?)