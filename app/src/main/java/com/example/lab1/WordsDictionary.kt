package com.example.lab1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.lab1.fragments.DictionaryFragment
import com.example.lab1.fragments.TrainingFragment
import com.example.lab1.fragments.VideoFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class WordsDictionary : AppCompatActivity() {
    private val dictionaryFragment = DictionaryFragment()
    private val trainingFragment = TrainingFragment()
    private val videoFragment = VideoFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.words_dictionary)
        replaceFragment(dictionaryFragment)

        var bottom_nav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottom_nav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_dictionary -> replaceFragment(dictionaryFragment)
                R.id.ic_training -> replaceFragment(trainingFragment)
                R.id.ic_video -> replaceFragment(videoFragment)
            }
            true
        }


    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}