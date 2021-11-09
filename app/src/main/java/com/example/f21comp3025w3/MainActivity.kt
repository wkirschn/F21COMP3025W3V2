package com.example.f21comp3025w3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.f21comp3025w3.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i("Lifecycle", "MainActivity.OnCreate() method")


        binding.button.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }


}
    override fun onStop() {
        super.onStop()
        Log.i("Lifecycle", "MainActivity.OnStop() method")
    }
    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle", "MainActivity.OnStart() method")
    }
    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle", "MainActivity.OnResume() method")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("Lifecycle", "MainActivity.OnDestroy() method")
    }
    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle", "MainActivity.OnPause() method")
    }
}

