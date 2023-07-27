package com.example.tesla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tesla.databinding.ActivityInfoCyberTruckBinding

class ActivityInfoCyberTruck : AppCompatActivity() {
    //create binding:
    lateinit var binding: ActivityInfoCyberTruckBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoCyberTruckBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}