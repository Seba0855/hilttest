package com.example.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object BolekLolekModule {

    @Bolek
    @Provides
    fun provideBolekName(): String = "Bolek"

    @Lolek
    @Provides
    fun provideLolekName(): String = "Lolek"
}