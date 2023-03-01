package com.veroanggra.movieplayground.data

data class MovieResponse(
    val Response: String,
    val Search: List<Movie>,
    val totalResults: String
)

data class Movie(
    val Poster: String,
    val Title: String,
    val Type: String,
    val Year: String,
    val imdbID: String
)

//data class MovieResponse(
//    val page: Int,
//    val totalPages: Int,
//    val results: List<ResultsItem>,
//    val totalResults: Int
//)
//
//data class ResultsItem(
//    val overview: String,
//    val originalLanguage: String,
//    val originalTitle: String,
//    val video: Boolean,
//    val title: String,
//    val genreIds: List<Int>,
//    val posterPath: String,
//    val backdropPath: String,
//    val releaseDate: String,
//    val popularity: String,
//    val voteAverage: String,
//    val id: Int,
//    val adult: Boolean,
//    val voteCount: Int
//)