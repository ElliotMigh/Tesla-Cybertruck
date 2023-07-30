package com.example.tesla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tesla.databinding.ActivityRangeBinding

class ActivityRange : AppCompatActivity() {
    //create binding:
    lateinit var binding: ActivityRangeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRangeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}