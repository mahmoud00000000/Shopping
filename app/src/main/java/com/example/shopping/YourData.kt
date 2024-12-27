package com.example.shopping

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.shopping.databinding.ActivityYourDataBinding

class YourData : AppCompatActivity() {

    private lateinit var binding: ActivityYourDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYourDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.orderBtn.setOnClickListener {
            Toast.makeText(this, "تم الحجز بنجاح", Toast.LENGTH_SHORT).show()
        }

    }
}