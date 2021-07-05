package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout as WidgetConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)

        val rootConstraintLayout = findViewById<WidgetConstraintLayout>(R.id.constraint_layout)

        val clickableViews: List<View> = listOf(
            boxOneText, boxTwoText, boxThreeText, boxFourText,
            boxFiveText, redButton, greenButton, yellowButton, rootConstraintLayout
        )

        for (item in clickableViews) {
            item.setOnClickListener {
                makeColored(item)
            }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            //R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            //R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            //R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            //R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            //R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            //else -> view.setBackgroundColor(Color.LTGRAY)
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.monday)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.tuesday)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.wednesday)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.thursday)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.friday)

            R.id.constraint_layout -> view.setBackgroundColor(Color.DKGRAY)

            R.id.red_button -> findViewById<TextView>(R.id.box_three_text).setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> findViewById<TextView>(R.id.box_four_text).setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> findViewById<TextView>(R.id.box_five_text).setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}