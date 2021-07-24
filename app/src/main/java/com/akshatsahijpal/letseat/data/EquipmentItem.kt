package com.akshatsahijpal.letseat.data

import com.google.gson.annotations.SerializedName

data class EquipmentItem(@SerializedName("image")
                         val image: String = "",
                         @SerializedName("localizedName")
                         val localizedName: String = "",
                         @SerializedName("name")
                         val name: String = "",
                         @SerializedName("id")
                         val id: Int = 0)