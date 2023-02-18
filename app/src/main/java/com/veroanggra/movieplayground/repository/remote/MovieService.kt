package com.veroanggra.movieplayground.repository.remote

import com.veroanggra.movieplayground.data.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {

    @GET("/movie/popular")
    suspend fun getDiscover(
        @Query("api_key") api_key: String,
        @Query("language") language: String,
        @Query("page") page: Int
    ): Response<MovieResponse>
}
