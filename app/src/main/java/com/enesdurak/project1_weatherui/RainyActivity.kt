package com.enesdurak.project1_weatherui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RainyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rainy)
    }

    fun rainyToSnowy(view : View){
        val intent = Intent(this, SnowyActivity::class.java)
        startActivity(intent)
    }

    fun rainyToSunny(view : View){
        val intent = Intent(this, SunnyActivity::class.java)
        startActivity(intent)
    }
}