package com.example.tesla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tesla.databinding.ActivityDryBinding

class ActivityDry : AppCompatActivity() {
    //create binding:
    lateinit var binding: ActivityDryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDryBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}