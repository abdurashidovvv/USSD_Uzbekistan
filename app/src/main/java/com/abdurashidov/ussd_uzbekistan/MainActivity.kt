package com.abdurashidov.ussd_uzbekistan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdurashidov.ussd_uzbekistan.databinding.ActivityMainBinding
import com.abdurashidov.ussd_uzbekistan.models.Beeline

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Beeline.loadBeelineData()
        Beeline.loadUcellData()

    }
}