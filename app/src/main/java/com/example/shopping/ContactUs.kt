package com.example.shopping.home

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shopping.databinding.ActivityContactUsBinding


class ContactUs : AppCompatActivity() {

    private lateinit var binding: ActivityContactUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactUsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.contactBackBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        window.statusBarColor = Color.parseColor("#FFFFFF")

        window.decorView.systemUiVisibility = 0

    }
}