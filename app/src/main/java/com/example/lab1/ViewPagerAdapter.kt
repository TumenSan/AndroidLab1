package com.example.lab1


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter : RecyclerView.Adapter<PagerVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH =
        PagerVH(LayoutInflater.from(parent.context).inflate(R.layout.description_page1, parent, false))

    override fun getItemCount(): Int = 3

    override fun onBindViewHolder(holder: PagerVH, position: Int) = holder.itemView.run {
        var upText = findViewById<TextView>(R.id.textView2)
        var BottomText = findViewById<TextView>(R.id.textView3)
        var image = findViewById<ImageView>(R.id.GfG_full_logo)
        var button = findViewById<Button>(R.id.button)
        when (position) {
            0 -> {
                upText.text = "Learn anytime \nand anywhere"
                BottomText.text= "Quarantine is the perfect time to spend your\nday learning something new, from anywhere!"
                image.setImageResource(R.drawable.cool_kids_long_distance_relationship)
                button.text = "Next"
            }
            1 -> {
                upText.text = "Find a course \nfor you"
                BottomText.text="Quarantine is the perfect time to spend your\nday learning something new, from anywhere!"
                image.setImageResource(R.drawable.cool_kids_staying_home)
                button.text = "Next"
            }
            2 -> {
                upText.text = "Improve your skills"
                BottomText.text="Quarantine is the perfect time to spend your\nday learning something new, from anywhere!"
                image.setImageResource(R.drawable.cool_kids_high_tech)
                button.text = "Let's Start"
            }
            else -> {
                upText.text = "Incorrect"
                BottomText.text="Incorrect"
            }
        }
    }
}

class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView)