package com.example.exerciciocheckboxudemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_checkBox.setOnClickListener() {
            if (button_checkBox.isChecked)
                image_android.setColorFilter(resources.getColor(R.color.colorAndroidGreen))
            else
                image_android.setColorFilter(resources.getColor(R.color.colorAndroidBlack))
        }
    }

}