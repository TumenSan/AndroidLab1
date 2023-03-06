package com.example.lab1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class DescriptionPageMain : AppCompatActivity() {
    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.description_page_main)

        viewPager2 = findViewById(R.id.viewPager2)
        viewPager2.adapter = ViewPagerAdapter()
    }

    public fun nextPage(view: View){
        val intent = Intent(this, DescriptionPage2::class.java)
        startActivity(intent)
    }

    public fun skip(view: View){
        val intent = Intent(this, SignUp::class.java)
        startActivity(intent)
    }
}