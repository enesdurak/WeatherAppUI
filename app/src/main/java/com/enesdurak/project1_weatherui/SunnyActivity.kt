package com.enesdurak.project1_weatherui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SunnyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sunny)
    }

    fun sunnyToRainy(view : View){
        val intent = Intent(this, RainyActivity::class.java)
        startActivity(intent)
    }

    fun sunnyToSnowy(view : View){
        val intent = Intent(this, SnowyActivity::class.java)
        startActivity(intent)
    }
}