package com.example.shopping

import android.view.LayoutInflater
import android.view.ViewGroup
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
        holder.binding.imageRv.setImageResource(currentProduct.pic)
        holder.binding.textRv1.text = currentProduct.name.toString()
        holder.binding.textRv2.text = currentProduct.name.toString()
        holder.binding.textRv3.text = currentProduct.name.toString()
    }


}