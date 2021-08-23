package com.enesdurak.project1_weatherui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SnowyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snowy)
    }

    fun snowyToRainy(view : View){
        val intent = Intent(this, RainyActivity::class.java)
        startActivity(intent)
    }

    fun snowyToSunny(view : View){
        val intent = Intent(this, SunnyActivity::class.java)
        startActivity(intent)
    }
}
