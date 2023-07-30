package com.example.tesla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tesla.databinding.ActivityProgramBinding

class ActivityProgram : AppCompatActivity() {
    //create binding:
    lateinit var binding: ActivityProgramBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProgramBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}