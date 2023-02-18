package com.veroanggra.movieplayground.data

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    val page: Int,
    val totalPages: Int,
    val results: List<ResultsItem?>,
    val totalResults: Int
)

data class ResultsItem(

    val overview: String,
    val originalLanguage: String,
    val originalTitle: String,
    val video: Boolean,
    val title: String,
    val genreIds: List<Int>,
    val posterPath: String,
    val backdropPath: String,
    val releaseDate: String,
    val popularity: Double,
    val voteAverage: Double,
    val id: Int,
    val adult: Boolean,
    val voteCount: Int
)

