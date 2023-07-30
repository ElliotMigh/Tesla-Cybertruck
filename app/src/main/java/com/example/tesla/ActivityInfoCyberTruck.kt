package com.example.tesla

import android.content.Intent
import android.graphics.drawable.shapes.Shape
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.tesla.databinding.ActivityInfoCyberTruckBinding
import soup.neumorphism.ShapeType

class ActivityInfoCyberTruck : AppCompatActivity() {
    //create binding:
    lateinit var binding: ActivityInfoCyberTruckBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoCyberTruckBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //go to activity battery:
        goToBatteryActivity()

        //go to dry activity:
        goToDryActivity()

        //go to range activity:
        goToRangeActivity()

        //go to program activity
        goToProgramActivity()
    }

    private fun goToBatteryActivity() {
        binding.neumorphBattery.setOnClickListener {
            //edit shape type when clicked:
            binding.neumorphBattery.setShapeType(ShapeType.PRESSED)

//            edit icon tint color when clicked:
            binding.neumorphBattery.setColorFilter(
                ContextCompat.getColor(this, R.color.blue_light),
                android.graphics.PorterDuff.Mode.SRC_IN
            )
            //create intent for going another activity:
            val intentBattery = Intent(this, ActivityBattery::class.java)
            startActivity(intentBattery)
        }
    }

    private fun goToDryActivity() {
        binding.neumorphDry.setOnClickListener {
            //edit shape type when clicked:
            binding.neumorphDry.setShapeType(ShapeType.PRESSED)

            //edit icon tint color when clicked:
            binding.neumorphDry.setColorFilter(
                ContextCompat.getColor(this, R.color.blue_light),
                android.graphics.PorterDuff.Mode.SRC_IN
            )
            //create intent for going another activity:
            val intentDry = Intent(this, ActivityDry::class.java)
            startActivity(intentDry)
        }
    }

    private fun goToRangeActivity() {
        binding.neumorphRange.setOnClickListener {
            //edit shape type when clicked:
            binding.neumorphRange.setShapeType(ShapeType.PRESSED)

            //edit icon tit color when clicked:
            binding.neumorphRange.setColorFilter(
                ContextCompat.getColor(this, R.color.blue_light),
                android.graphics.PorterDuff.Mode.SRC_IN
            )

            //create intent for going another activity:
            val intentRange = Intent(this, ActivityRange::class.java)
            startActivity(intentRange)
        }
    }

    private fun goToProgramActivity() {
        binding.neumorphProgram.setOnClickListener {
            //edit shape type when clicked:
            binding.neumorphProgram.setShapeType(ShapeType.PRESSED)

            //edit icon tint color when clicked:
            binding.neumorphProgram.setColorFilter(
                ContextCompat.getColor(this, R.color.blue_light),
                android.graphics.PorterDuff.Mode.SRC_IN
            )

            //create intent for going another activity:
            val intentProgram = Intent(this, ActivityProgram::class.java)
            startActivity(intentProgram)
        }
    }
}