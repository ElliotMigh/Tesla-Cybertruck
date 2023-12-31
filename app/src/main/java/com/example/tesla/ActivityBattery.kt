package com.example.tesla

import android.graphics.drawable.shapes.Shape
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tesla.databinding.ActivityBatteryBinding
import soup.neumorphism.ShapeType

class ActivityBattery : AppCompatActivity() {
    //create binding:
    lateinit var binding: ActivityBatteryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBatteryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //click on back button:
        binding.neumorphBackButton.setOnClickListener {

            //edit shape when clicked:
            binding.neumorphBackButton.setShapeType(ShapeType.PRESSED)

            onBackPressed()
        }
    }
}