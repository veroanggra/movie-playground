package com.veroanggra.movieplayground.di

import com.veroanggra.movieplayground.repository.remote.MovieService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module

object HiltModules {
    @Provides
    fun provideRetrofitInterface(): MovieService {
        return Retrofit.Builder()
            .baseUrl("").addConverterFactory(GsonConverterFactory.create())
            .build().create(MovieService::class.java)
    }
}