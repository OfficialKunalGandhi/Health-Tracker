package com.akshatsahijpal.letseat.data

import com.google.gson.annotations.SerializedName

data class Nutrition(@SerializedName("caloricBreakdown")
                     val caloricBreakdown: CaloricBreakdown,
                     @SerializedName("weightPerServing")
                     val weightPerServing: WeightPerServing,
                     @SerializedName("ingredients")
                     val ingredients: List<IngredientsItem>?,
                     @SerializedName("flavonoids")
                     val flavonoids: List<FlavonoidsItem>?,
                     @SerializedName("properties")
                     val properties: List<PropertiesItem>?,
                     @SerializedName("nutrients")
                     val nutrients: List<NutrientsItem>?)