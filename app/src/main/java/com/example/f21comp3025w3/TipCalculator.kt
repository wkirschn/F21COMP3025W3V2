package com.example.f21comp3025w3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.f21comp3025w3.databinding.ActivityTipCalculatorBinding

class TipCalculator : AppCompatActivity() {


    private lateinit var binding : ActivityTipCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipCalculatorBinding.inflate(layoutInflater)

        setContentView(binding.root)

    }
}