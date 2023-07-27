package com.example.tesla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tesla.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //create binding:
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Toast.makeText(this, "TESLA", Toast.LENGTH_SHORT).show()

        //go to activity info cybertruck:
        binding.btnGoToInfoActivity.setOnClickListener {
            val intentGoToInfoCyberTruck = Intent(this, ActivityInfoCyberTruck::class.java)
            startActivity(intentGoToInfoCyberTruck)
        }
    }
}