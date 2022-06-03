package com.kursat.valorantguide.service

import com.kursat.valorantguide.model.AgentsSample
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ValorantApiService {

    @GET("v1/agents")
    suspend fun getAllAgents(
        @Query("language") language: String,
        @Query("isPlayableCharacter") isPlayableCharacter: Boolean
    ): Response<AgentsSample>
}