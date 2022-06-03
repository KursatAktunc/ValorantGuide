package com.kursat.valorantguide.util.extensions

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("android:loadImageFromUrl")
fun ImageView.loadImageFromUrl(url: String) {
    load(url) {
        crossfade(true)
    }
}