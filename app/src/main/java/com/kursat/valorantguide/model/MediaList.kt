package com.kursat.valorantguide.model

import com.google.gson.annotations.SerializedName

data class MediaList (

  @SerializedName("id"    ) var id    : Int?    = null,
  @SerializedName("wwise" ) var wwise : String? = null,
  @SerializedName("wave"  ) var wave  : String? = null

)