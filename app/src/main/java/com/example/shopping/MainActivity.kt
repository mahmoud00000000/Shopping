package com.example.shopping

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shopping.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemList = listOf(
            product(R.drawable.pro_1, "pro1".toInt()),
            product(R.drawable.pro_2, "pro2".toInt()),
            product(R.drawable.pro_3, "pro3".toInt()),
            product(R.drawable.pro_4, "pro4".toInt()),
            product(R.drawable.pro_5, "pro5".toInt()),
            product(R.drawable.pro_6, "pro6".toInt()),
            product(R.drawable.pro_7, "pro7".toInt()),
            product(R.drawable.pro_8, "pro8".toInt()),
            product(R.drawable.pro_9, "pro9".toInt()),
            product(R.drawable.pro_10, "pro10".toInt())
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = customAdapter(itemList)

    }
}