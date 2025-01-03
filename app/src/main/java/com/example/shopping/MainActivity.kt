package com.example.shopping.home

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shopping.R
import com.example.shopping.home.adapters.ViewPagerAdapter
import com.example.shopping.databinding.ActivityMainBinding
import com.example.shopping.home.adapters.CustomAdapter
import com.example.shopping.product.ProductDataModel

class MainActivity : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        window.statusBarColor = Color.parseColor("#FFFFFF")

        window.decorView.systemUiVisibility = 0




        val images = listOf(
            R.drawable.pro_11,
            R.drawable.pro_12,
            R.drawable.pro_13,
            R.drawable.pro_14,
            R.drawable.pro_15
        )

        val adapter = ViewPagerAdapter(images)
        binding.viewpager.adapter = adapter





        val itemList = listOf(
            ProductDataModel(R.drawable.pro_1, "Generic", 440.00,"برينت اون لاين هودي وسويت شيرت بغطاء للرأس أسود للرجال"),
            ProductDataModel(R.drawable.pro_2, "Meza",399.00,"سويت شيرت MIZAYEH الرجالية ذات القلنسوة ذات الألوان المرقطة - سترة بغطاء رأس مريحة بسحاب أمامي - مثالية للأسلوب اليومي والدفء"),
            ProductDataModel(R.drawable.pro_3, "LC Waikiki",824.00,"سويت شيرت LC WAIKIKI هوديي مطبوع بأكمام طويلة للرجال"),
            ProductDataModel(R.drawable.pro_4, "Levi's",3.299,"سويت شيرت برسوم جرافيك من Levi's للرجال"),
            ProductDataModel(R.drawable.pro_5, "LC Waikiki",824.00,"سويت شيرت LC WAIKIKI بغطاء للرأس وأكمام طويلة مطبوعة للرجال"),
            ProductDataModel(R.drawable.pro_6, "Print Online",480.00,"سويت شيرت بقلنسوة برباط عنق للرجال من Printonline"),
            ProductDataModel(R.drawable.pro_7, "Generic",475.00,"هودي قطن بسحاب أمامي"),
            ProductDataModel(R.drawable.pro_8, "activ",469.00,"سويت شيرت بغطاء للرأس من Activ للرجال من ACTIV BASIC"),
            ProductDataModel(R.drawable.pro_9, "Generic",379.00,"هوديي بأكمام طويلة للرجال"),
            ProductDataModel(R.drawable.pro_10, "ISTANBUL MODEL",450.00,"ISTANBUL MODEL سويت شيرت رجالي من الصوف بغطاء للرأس وأكمام طويلة مع جيب - مصنوع من القطن الفاخر")
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = CustomAdapter(itemList)

        // Setup Toolbar
        setSupportActionBar(binding.toolbar)

        // Setup Drawer Toggle
        toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            binding.toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // Handle Navigation Item Clicks
        binding.navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> {
                    binding.contentText.text = "Home Selected"

                }
                R.id.nav_settings -> {
                    binding.contentText.text = "Settings Selected"

                }
                R.id.nav_about -> {
                    binding.contentText.text = "About Selected"
                }
            }
            binding.drawerLayout.closeDrawers()
            true

        }

    }

    }
