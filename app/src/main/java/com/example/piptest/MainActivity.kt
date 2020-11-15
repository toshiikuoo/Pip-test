package com.example.piptest

import android.app.Activity
import android.app.Notification
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.app.PictureInPictureParams
import android.util.Rational
import android.view.View
import android.content.res.Configuration
import com.example.piptest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.myButton.setOnClickListener{ startPip() }
    }

    private fun startPip(){
        enterPictureInPictureMode();
        return
    }
}
