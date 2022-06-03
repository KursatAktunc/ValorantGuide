package com.kursat.valorantguide.di

import com.kursat.valorantguide.repository.AgentsListRepository
import com.kursat.valorantguide.service.ValorantApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideAgentsListRepository(apiService: ValorantApiService): AgentsListRepository =
        AgentsListRepository(apiService)
}