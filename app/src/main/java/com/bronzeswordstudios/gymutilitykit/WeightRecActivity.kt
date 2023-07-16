package com.bronzeswordstudios.gymutilitykit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import com.bronzeswordstudios.gymutilitykit.databinding.ActivityWeightRecBinding

class WeightRecActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWeightRecBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeightRecBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.repetitionsSpinner.minValue = 1
        binding.repetitionsSpinner.maxValue = 25

        binding.weightSpinner.minValue = 1
        binding.weightSpinner.maxValue = 250

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.workout_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            binding.workoutSpinner.adapter = adapter
        }

        binding.homeButton.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        })

        binding.helpButton.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, HelpActivity::class.java))
        })

        binding.cancelButton.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, WeightRecActivity::class.java))
            finish()
        })

        binding.entryButtonGroup.setOnCheckedChangeListener { radioGroup, i ->
            val id = binding.entryButtonGroup.checkedRadioButtonId
            if (id == R.id.dropdown_entry_button){
                binding.enterWorkoutText.visibility = View.INVISIBLE
                binding.enterWorkoutSpinner.visibility = View.VISIBLE
            }
            else if (id == R.id.manual_entry_button) {
                binding.enterWorkoutText.visibility = View.VISIBLE
                binding.enterWorkoutSpinner.visibility = View.INVISIBLE
            }
        }
    }
}