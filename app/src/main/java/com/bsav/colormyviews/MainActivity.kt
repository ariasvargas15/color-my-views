package com.bsav.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.annotation.ColorInt
import androidx.appcompat.app.AppCompatActivity
import com.bsav.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        with(binding) {
            boxOne.setColorWhenClicked(Color.DKGRAY)
            boxTwo.setColorWhenClicked(Color.GRAY)
            boxThree.setColorWhenClicked(Color.MAGENTA)
            boxFour.setColorWhenClicked(Color.BLUE)
            boxFive.setColorWhenClicked(Color.CYAN)
            redButton.setColorForViewWhenClicked(boxThree, Color.RED)
            yellowButton.setColorForViewWhenClicked(boxFour, Color.YELLOW)
            greenButton.setColorForViewWhenClicked(boxFive, Color.GREEN)
            root.setColorWhenClicked(Color.LTGRAY)

        }
    }

    private fun View.setColorWhenClicked(@ColorInt color: Int) {
        setOnClickListener {
            setBackgroundColor(color)
        }
    }

    private fun View.setColorForViewWhenClicked(view: View, @ColorInt color: Int) {
        setOnClickListener {
            view.setBackgroundColor(color)
        }
    }
}