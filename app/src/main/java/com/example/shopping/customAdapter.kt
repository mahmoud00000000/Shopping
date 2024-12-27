package com.example.shopping

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.shopping.databinding.ItemHomeProductBinding

class customAdapter(private val product: List<product>) : RecyclerView.Adapter<customAdapter.MyViewHolder>() {
    class MyViewHolder (val binding: ItemHomeProductBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemHomeProductBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount() = product.size



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentProduct = product[position]
        holder.binding.itemImage.setImageResource(currentProduct.pic)
        holder.binding.text1.text = currentProduct.name
        holder.binding.text2.text = currentProduct.description
        holder.binding.text3.text = currentProduct.price.toString()









    }
    }


