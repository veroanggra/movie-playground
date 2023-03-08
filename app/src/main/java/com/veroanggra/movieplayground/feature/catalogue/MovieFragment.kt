package com.veroanggra.movieplayground.feature.catalogue

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.veroanggra.movieplayground.databinding.FragmentMovieBinding


class MovieFragment : Fragment() {
    lateinit var bindingMovie : FragmentMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       bindingMovie= FragmentMovieBinding.inflate(inflater, container, false)
        return bindingMovie.root
    }
}