package com.project.assignment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.project.assignment.R
import com.project.assignment.model.ImageData

class ImageListAdapter(private val context: Context,
                       private val imageSet: List<ImageData>): RecyclerView.Adapter<ImageListAdapter.ImageViewHolder>() {


    class ImageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val imageView = itemView.findViewById<ImageView>(R.id.image)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {

        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)

        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {

        val currentItem = imageSet[position]
        Glide.with(holder.itemView.context).load(currentItem.url).into(holder.imageView)
    }

    override fun getItemCount(): Int {

        return imageSet.size

    }

}



