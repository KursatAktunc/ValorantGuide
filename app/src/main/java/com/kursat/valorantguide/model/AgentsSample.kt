package com.kursat.valorantguide.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class AgentsSample(

    @SerializedName("status" ) var status : Int?            = null,
    @SerializedName("data"   ) var data   : ArrayList<Data> = arrayListOf()

) : Serializable