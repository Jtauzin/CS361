package com.bronzeswordstudios.gymutilitykit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bronzeswordstudios.gymutilitykit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addWorkoutButton.setOnClickListener(View.OnClickListener {
           startActivity(Intent(this, WorkoutEntryActivity::class.java))
        })

        binding.weightRecButton.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, WeightRecActivity::class.java))
        })
    }
}