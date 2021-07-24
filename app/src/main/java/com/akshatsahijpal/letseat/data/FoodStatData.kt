package com.akshatsahijpal.letseat.data

import com.google.gson.annotations.SerializedName

data class FoodStatData(@SerializedName("number")
                        val number: Int = 0,
                        @SerializedName("totalResults")
                        val totalResults: Int = 0,
                        @SerializedName("offset")
                        val offset: Int = 0,
                        @SerializedName("results")
                        val results: List<ResultsItem>?)