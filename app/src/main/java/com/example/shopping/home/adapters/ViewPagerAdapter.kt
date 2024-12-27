package com.example.shopping.home.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shopping.databinding.ItemViewPagerBinding

class ViewPagerAdapter(private val images: List<Int>) :
    RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemViewPagerBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(imageRes: Int) {
            binding.imageView.setImageResource(imageRes)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemViewPagerBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(images[position])
        holder.itemView.setOnClickListener {

        }
    }

    override fun getItemCount() = images.size
}
