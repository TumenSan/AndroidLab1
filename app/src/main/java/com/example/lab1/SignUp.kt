package com.example.lab1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_page)

        // get reference to all views
        var et_user_name = findViewById(R.id.et_user_name) as EditText
        var et_password = findViewById(R.id.et_password) as EditText
        var et_email = findViewById(R.id.et_email) as EditText
        var btn_submit = findViewById(R.id.btn_submit) as Button

        // set on-click listener
        btn_submit.setOnClickListener {
            val user_name = et_user_name.text;
            val password = et_password.text;
            val email = et_email.text;
            Toast.makeText(this@SignUp, user_name, Toast.LENGTH_LONG).show()

            // your code to validate the user_name and password combination
            // and verify the same

        }
    }

    public fun nextPage(view: View){
        val intent = Intent(this, DescriptionPage1::class.java)
        startActivity(intent)
    }
}