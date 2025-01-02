package com.example.shopping

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.shopping.databinding.ActivityYourDataBinding
import com.example.shopping.home.MainActivity

class YourData : AppCompatActivity() {

    private lateinit var binding: ActivityYourDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYourDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.orderBtn.setOnClickListener {
            val firstname = binding.firstName.text.toString()
            val scoundname = binding.scoundName.text.toString()
            val emailaddress = binding.emailadressEt.text.toString()
            val number = binding.phoneNumber.text.toString()
            if (firstname.isBlank() || scoundname.isBlank() || emailaddress.isBlank() || number.isBlank())
                Toast.makeText(this, "برجاء ادخال بياناتك", Toast.LENGTH_SHORT).show()
            else{
                Toast.makeText(this, "تم الحجز بنجاح", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }

        window.statusBarColor = Color.parseColor("#FFFFFF")

        window.decorView.systemUiVisibility = 0



    }
}