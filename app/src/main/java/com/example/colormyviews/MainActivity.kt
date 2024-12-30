package com.example.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(
            binding.boxOneText,
            binding.boxTwoText,
            binding.boxThreeText,
            binding.boxFourText,
            binding.boxFiveText,
            binding.main,
            binding.buttonRed,
            binding.buttonYellow,
            binding.buttonGreen
        )
        for (item in clickableViews) {
            item.setOnClickListener {makeColored(it)}
        }
    }

    fun makeColored(view: View) {
        when (view) {
            binding.boxOneText -> view.setBackgroundColor(Color.DKGRAY)
            binding.boxTwoText -> view.setBackgroundColor(Color.GRAY)
            binding.boxThreeText -> view.setBackgroundResource(android.R.color.holo_green_light)
            binding.boxFourText -> view.setBackgroundResource(android.R.color.holo_green_dark)
            binding.boxFiveText -> view.setBackgroundResource(android.R.color.holo_green_light)
            binding.buttonRed -> view.setBackgroundColor(Color.RED)
            binding.buttonYellow -> view.setBackgroundColor(ContextCompat.getColor(this, R.color.my_yellow))
            binding.buttonGreen -> view.setBackgroundColor(ContextCompat.getColor(this, R.color.my_green))
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

}