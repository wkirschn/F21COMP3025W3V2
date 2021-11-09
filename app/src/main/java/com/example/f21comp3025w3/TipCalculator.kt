package com.example.f21comp3025w3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import androidx.core.widget.addTextChangedListener
import com.example.f21comp3025w3.databinding.ActivityTipCalculatorBinding
import java.text.NumberFormat

class TipCalculator : AppCompatActivity() {


    private lateinit var binding : ActivityTipCalculatorBinding
    private var tipPercent = 15
    private var initialMealCost = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.preTipMealAmountEditText.addTextChangedListener {
            if (!it.isNullOrBlank())
                initialMealCost = it.toString().toDouble()
            else
                initialMealCost = 0.0

            calculateTip()
        }

            binding.tipPercentSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(p0: SeekBar?, seekBarValue: Int, p2: Boolean) {
                    tipPercent = seekBarValue
                    binding.tipPercentTextView.text = "${tipPercent}%"
                    calculateTip()
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {

                }

                override fun onStopTrackingTouch(p0: SeekBar?) {

                }

            })

    }

    private fun calculateTip()
    {
        var tip = initialMealCost * tipPercent / 100
        binding.tipPercentTextView.text = "${tipPercent}%"


        val currencyFormat = NumberFormat.getCurrencyInstance()
        binding.tipTotalTextView.text = currencyFormat.format(tip)
        binding.amountWithTipTextView.text = currencyFormat.format(tip + initialMealCost)
    }



}