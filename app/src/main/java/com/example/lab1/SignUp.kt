package com.example.lab1

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_page)
    }

    public fun firstPage(view: View){
        val intent = Intent(this, DescriptionPageMain::class.java)
        startActivity(intent)
    }
    public fun nextPage(view: View){
        // get reference to all views

        var et_user_name = findViewById(R.id.et_user_name) as EditText
        var et_password = findViewById(R.id.et_password) as EditText
        var et_email = findViewById(R.id.et_email) as EditText

        val user_name = et_user_name.text;
        val password = et_password.text;
        val email = et_email.text;

        if (user_name.isNullOrEmpty() || password.isNullOrEmpty() || email.isNullOrEmpty()) {
            // Если хоть одна переменная пустая или null, то выводим сообщение об ошибке
            Toast.makeText(this@SignUp, "Error, missing text", Toast.LENGTH_LONG).show()
        } else {
            val intent = Intent(this, WordsDictionary::class.java)
            startActivity(intent)
        }
    }

/*
    show_pass_btn.setOnClickListener
    {
        if (showHideBtn.text.toString().equals("Show")) {
            et_password.transformationMethod = HideReturnsTransformationMethod.getInstance()
            showHideBtn.text = "Hide"
        } else {
            et_password.transformationMethod = PasswordTransformationMethod.getInstance()
            showHideBtn.text = "Show"
        }
    }
    */
    //public fun ShowHidePass(view: View){

    //}

}