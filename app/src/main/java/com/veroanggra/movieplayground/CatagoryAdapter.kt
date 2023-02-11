package com.veroanggra.movieplayground

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.RecyclerView
import com.veroanggra.movieplayground.model.Genre

class CatagoryAdapter(private val genre: List<Genre>) : RecyclerView.Adapter<CatagoryAdapter.GenreHolder>() {

    private var onItemClickCallback: OnItemClickCallback? = null
    inner class GenreHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(genre: Genre){
            with(itemView){

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenreHolder {
        return GenreHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_genre, parent, false))
    }

    override fun getItemCount(): Int = genre.size

    override fun onBindViewHolder(holder: GenreHolder, position: Int) {
        holder.bind(genre[position])
    }
}