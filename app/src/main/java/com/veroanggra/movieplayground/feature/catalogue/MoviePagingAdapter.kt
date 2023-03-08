package com.veroanggra.movieplayground.feature.catalogue

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.veroanggra.movieplayground.data.ResultsItem
import com.veroanggra.movieplayground.databinding.FragmentMovieBinding

class MoviePagingAdapter: PagingDataAdapter<ResultsItem, MoviePagingAdapter.MyMovieViewHolder>(DIFF_UTIL) {
    companion object{
        val DIFF_UTIL = object : DiffUtil.ItemCallback<ResultsItem>(){
            override fun areItemsTheSame(oldItem: ResultsItem, newItem: ResultsItem): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: ResultsItem,
                newItem: ResultsItem
            ): Boolean {
                return oldItem == newItem
            }
        }
    }

    inner class MyMovieViewHolder(val viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root)

    override fun onBindViewHolder(holder: MoviePagingAdapter.MyMovieViewHolder, position: Int) {
        holder.viewDataBinding.setVariable(/**holder**/, getItem(position))
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MoviePagingAdapter.MyMovieViewHolder {
        // replace with item fragment
        val movieBinding = FragmentMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyMovieViewHolder(movieBinding)
    }

}