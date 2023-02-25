package com.example.lab1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class DescriptionPage1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.description_page1)
    }

    public fun nextPage(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}