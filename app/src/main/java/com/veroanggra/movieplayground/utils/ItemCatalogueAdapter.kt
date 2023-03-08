package com.veroanggra.movieplayground.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imgLoad")
fun imgLoad(view: ImageView, url: String) {
    Glide.with(view).load(url).into(view)
}