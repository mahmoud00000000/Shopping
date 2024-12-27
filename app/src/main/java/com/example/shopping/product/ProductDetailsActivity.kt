package com.example.shopping.product

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shopping.YourData
import com.example.shopping.databinding.ActivityProductDetailsBinding

class ProductDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent.extras?.getInt("image")?.let { binding.productImage.setImageResource(it) }
        intent.extras?.getString("description")?.let { binding.detailsProductTV.setText(it) }
        intent.extras?.getDouble("price")?.let { binding.priceNum.text = it.toString()}

        binding.backBtn.setOnClickListener {
            finish()
        }

        binding.bookBtn.setOnClickListener {
            val intent = Intent(this, YourData::class.java)
            startActivity(intent)
        }

        window.statusBarColor = Color.parseColor("#FFFFFF")

        window.decorView.systemUiVisibility = 0

    }
}