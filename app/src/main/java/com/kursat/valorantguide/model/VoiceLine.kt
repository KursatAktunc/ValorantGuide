package com.kursat.valorantguide.model

import com.google.gson.annotations.SerializedName

data class VoiceLine (

  @SerializedName("minDuration" ) var minDuration : Double?              = null,
  @SerializedName("maxDuration" ) var maxDuration : Double?              = null,
  @SerializedName("mediaList"   ) var mediaList   : ArrayList<MediaList> = arrayListOf()

)