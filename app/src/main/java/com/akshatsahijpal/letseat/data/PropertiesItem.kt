package com.akshatsahijpal.letseat.data

import com.google.gson.annotations.SerializedName

data class PropertiesItem(@SerializedName("amount")
                          val amount: Double = 0.0,
                          @SerializedName("unit")
                          val unit: String = "",
                          @SerializedName("name")
                          val name: String = "",
                          @SerializedName("title")
                          val title: String = "")