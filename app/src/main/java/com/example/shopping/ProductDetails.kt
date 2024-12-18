package com.example.shopping

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.shopping.databinding.ActivityProductDetailsBinding

class ProductDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}