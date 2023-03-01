package com.veroanggra.movieplayground.ui.catalogue

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.veroanggra.movieplayground.data.ResultsItem
import com.veroanggra.movieplayground.repository.remote.MovieService
import com.veroanggra.movieplayground.utils.Constants

class MoviePaging(val movieService: MovieService, val  d: String) : PagingSource<Int, ResultsItem>() {
    override fun getRefreshKey(state: PagingState<Int, ResultsItem>): Int? {
        return state.anchorPosition?.let{
            val anchorPage = state?.closestPageToPosition(it)
            anchorPage?.prevKey?.plus(1)?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ResultsItem> {
        val page = params.key ?: 1

        return  try {
            val data = movieService.getDiscover(Constants.API_KEY, d, page)
            LoadResult.Page(
                data = data.body()!!.results,
                prevKey = if (page == 1) null else page-1,
                nextKey = if (data.body()?.results!!.isEmpty()) null else page + 1
            )
        } catch (e: java.lang.Exception) {
            LoadResult.Error(e)
        }
    }
}