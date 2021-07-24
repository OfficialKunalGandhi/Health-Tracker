package com.akshatsahijpal.letseat.data.subroot

import com.google.gson.annotations.SerializedName

data class StepsItem(@SerializedName("number")
                     val number: Int = 0,
                     @SerializedName("ingredients")
                     val ingredients: List<IngredientsItem>?,
                     @SerializedName("equipment")
                     val equipment: List<EquipmentItem>?,
                     @SerializedName("step")
                     val step: String = "")