package com.example.hilttest.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level.BODY
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {
    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        setLevel(BODY)
    }

    @Provides
    fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient =
        OkHttpClient()
            .newBuilder()
            .addInterceptor(loggingInterceptor)
            .build()

    @Provides
    fun provideConverterFactory(): MoshiConverterFactory = MoshiConverterFactory.create()

    @Provides
    @BolekURL
    fun provideBolekURL(): String = "https://bolek.pl/"

    @Provides
    @LolekURL
    fun provideLolekURL(): String = "https://lolek.pl/"

    @Provides
    fun provideRetrofit(
        loggingClient: OkHttpClient,
        converterFactory: MoshiConverterFactory,
        @BolekURL bolekLolekURL: String
    ): Retrofit = Retrofit.Builder()
        .baseUrl(bolekLolekURL)
        .addConverterFactory(converterFactory)
        .client(loggingClient)
        .build()

}