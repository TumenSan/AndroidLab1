package com.example.lab1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class DescriptionPage1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.description_page1)
/*
        val dotsIndicator = findViewById<DotsIndicator>(R.id.dots_indicator)
        val viewPager = findViewById<ViewPager>(R.id.view_pager)
        val adapter = ViewPagerAdapter()
        viewPager.adapter = adapter
        dotsIndicator.attachTo(viewPager)
 */

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