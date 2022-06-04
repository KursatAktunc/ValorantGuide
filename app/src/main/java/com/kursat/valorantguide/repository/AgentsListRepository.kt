package com.kursat.valorantguide.repository

import com.kursat.valorantguide.service.ValorantApiService
import javax.inject.Inject

class AgentsListRepository @Inject constructor(private val retrofitService: ValorantApiService) {
    suspend fun getAllAgents(language: String, isPlayableCharacter: Boolean) =
        retrofitService.getAllAgents(language, isPlayableCharacter)
}