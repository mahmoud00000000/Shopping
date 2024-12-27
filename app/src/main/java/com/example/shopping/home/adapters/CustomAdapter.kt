package com.example.shopping.home.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shopping.product.ProductDetailsActivity
import com.example.shopping.databinding.ItemHomeProductBinding
import com.example.shopping.product.ProductDataModel

class CustomAdapter(private val product: List<ProductDataModel>) :
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {
    var context: Context? = null

    class MyViewHolder(val binding: ItemHomeProductBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        this.context = parent.context
        val binding =
            ItemHomeProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount() = product.size


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentProduct = product[position]
        holder.binding.itemImage.setImageResource(currentProduct.pic)
        holder.binding.text1.text = currentProduct.name
        holder.binding.text2.text = currentProduct.description
        holder.binding.text3.text = currentProduct.price.toString()
        holder.binding.cardRv.setOnClickListener {
            val intent = Intent(context, ProductDetailsActivity::class.java)
            intent.putExtra("name",currentProduct.name)
            intent.putExtra("image",currentProduct.pic)
            intent.putExtra("description",currentProduct.description)
            intent.putExtra("price",currentProduct.price)
            context?.startActivity(intent)
        }


    }
}


