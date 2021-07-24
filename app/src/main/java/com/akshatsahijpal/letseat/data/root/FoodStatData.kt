package com.akshatsahijpal.letseat.data.root

import com.akshatsahijpal.letseat.data.subroot.ResultsItem
import com.google.gson.annotations.SerializedName

data class FoodStatData(@SerializedName("number")
                        val number: Int = 0,
                        @SerializedName("totalResults")
                        val totalResults: Int = 0,
                        @SerializedName("offset")
                        val offset: Int = 0,
                        @SerializedName("results")
                        val results: List<ResultsItem>?)