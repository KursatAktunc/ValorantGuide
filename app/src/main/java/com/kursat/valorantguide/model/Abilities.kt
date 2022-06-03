package com.kursat.valorantguide.model

import com.google.gson.annotations.SerializedName

data class Abilities (

  @SerializedName("slot"        ) var slot        : String? = null,
  @SerializedName("displayName" ) var displayName : String? = null,
  @SerializedName("description" ) var description : String? = null,
  @SerializedName("displayIcon" ) var displayIcon : String? = null

)