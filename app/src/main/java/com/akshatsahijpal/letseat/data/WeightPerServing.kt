package com.akshatsahijpal.letseat.data

import com.google.gson.annotations.SerializedName

data class WeightPerServing(@SerializedName("amount")
                            val amount: Int = 0,
                            @SerializedName("unit")
                            val unit: String = "")