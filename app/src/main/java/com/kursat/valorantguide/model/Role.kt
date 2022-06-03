package com.kursat.valorantguide.model

import com.google.gson.annotations.SerializedName

data class Role (

  @SerializedName("uuid"        ) var uuid        : String? = null,
  @SerializedName("displayName" ) var displayName : String? = null,
  @SerializedName("description" ) var description : String? = null,
  @SerializedName("displayIcon" ) var displayIcon : String? = null,
  @SerializedName("assetPath"   ) var assetPath   : String? = null

)