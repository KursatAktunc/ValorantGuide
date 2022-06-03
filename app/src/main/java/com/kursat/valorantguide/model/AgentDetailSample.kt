package com.kursat.valorantguide.model

import com.google.gson.annotations.SerializedName

data class AgentDetailSample(

    @SerializedName("status" ) var status : Int?  = null,
    @SerializedName("data"   ) var data   : Data? = Data()

)