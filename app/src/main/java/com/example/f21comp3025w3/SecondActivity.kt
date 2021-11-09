package com.example.f21comp3025w3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.f21comp3025w3.databinding.ActivitySecondBinding



class SecondActivity : AppCompatActivity() {
    private lateinit var bindingTwo : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingTwo = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(bindingTwo.root)
        Log.i("Lifecycle", "SecondActivity.OnCreate() method")


        bindingTwo.button2.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onStop() {
        super.onStop()
        Log.i("Lifecycle", "SecondActivity.OnStop() method")
    }
    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle", "SecondActivity.OnStart() method")
    }
    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle", "SecondActivity.OnResume() method")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("Lifecycle", "SecondActivity.OnDestroy() method")
    }
    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle", "SecondActivity.OnPause() method")
    }
}