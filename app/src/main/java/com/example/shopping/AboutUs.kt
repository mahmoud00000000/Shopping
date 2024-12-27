package com.example.shopping.home

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shopping.databinding.ActivityAboutUsBinding


class AboutUs : AppCompatActivity() {

    private lateinit var binding: ActivityAboutUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutUsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.aboutusBackBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        window.statusBarColor = Color.parseColor("#FFFFFF")

        window.decorView.systemUiVisibility = 0
    }
}