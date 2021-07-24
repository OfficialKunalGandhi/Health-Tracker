package com.akshatsahijpal.letseat.data.subroot

import com.google.gson.annotations.SerializedName

data class ResultsItem(@SerializedName("sustainable")
                       val sustainable: Boolean = false,
                       @SerializedName("analyzedInstructions")
                       val analyzedInstructions: List<AnalyzedInstructionsItem>?,
                       @SerializedName("glutenFree")
                       val glutenFree: Boolean = false,
                       @SerializedName("veryPopular")
                       val veryPopular: Boolean = false,
                       @SerializedName("healthScore")
                       val healthScore: Int = 0,
                       @SerializedName("title")
                       val title: String = "",
                       @SerializedName("diets")
                       val diets: List<String>?,
                       @SerializedName("aggregateLikes")
                       val aggregateLikes: Int = 0,
                       @SerializedName("creditsText")
                       val creditsText: String = "",
                       @SerializedName("readyInMinutes")
                       val readyInMinutes: Int = 0,
                       @SerializedName("sourceUrl")
                       val sourceUrl: String = "",
                       @SerializedName("dairyFree")
                       val dairyFree: Boolean = false,
                       @SerializedName("servings")
                       val servings: Int = 0,
                       @SerializedName("vegetarian")
                       val vegetarian: Boolean = false,
                       @SerializedName("id")
                       val id: Int = 0,
                       @SerializedName("imageType")
                       val imageType: String = "",
                       @SerializedName("summary")
                       val summary: String = "",
                       @SerializedName("image")
                       val image: String = "",
                       @SerializedName("veryHealthy")
                       val veryHealthy: Boolean = false,
                       @SerializedName("vegan")
                       val vegan: Boolean = false,
                       @SerializedName("cheap")
                       val cheap: Boolean = false,
                       @SerializedName("dishTypes")
                       val dishTypes: List<String>?,
                       @SerializedName("gaps")
                       val gaps: String = "",
                       @SerializedName("cuisines")
                       val cuisines: List<String>?,
                       @SerializedName("lowFodmap")
                       val lowFodmap: Boolean = false,
                       @SerializedName("license")
                       val license: String = "",
                       @SerializedName("nutrition")
                       val nutrition: Nutrition,
                       @SerializedName("weightWatcherSmartPoints")
                       val weightWatcherSmartPoints: Int = 0,
                       @SerializedName("spoonacularScore")
                       val spoonacularScore: Int = 0,
                       @SerializedName("pricePerServing")
                       val pricePerServing: Double = 0.0,
                       @SerializedName("sourceName")
                       val sourceName: String = "",
                       @SerializedName("spoonacularSourceUrl")
                       val spoonacularSourceUrl: String = "")