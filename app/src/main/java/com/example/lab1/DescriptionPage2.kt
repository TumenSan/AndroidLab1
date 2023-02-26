package com.example.lab1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class DescriptionPage2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.description_page2)
    }

    public fun nextPage(view: View){
        val intent = Intent(this, DescriptionPage3::class.java)
        startActivity(intent)
    }
}