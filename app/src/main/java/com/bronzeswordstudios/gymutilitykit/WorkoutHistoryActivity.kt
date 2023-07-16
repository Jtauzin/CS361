package com.bronzeswordstudios.gymutilitykit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bronzeswordstudios.gymutilitykit.databinding.ActivityWorkoutHistoryBinding

class WorkoutHistoryActivity : AppCompatActivity() {

    lateinit var binding: ActivityWorkoutHistoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityWorkoutHistoryBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val recyclerView: RecyclerView = binding.recyclerView
        val workout1 = Workout("Super press", 1, 1000)
        val workout2 = Workout("Ultra press", 10, 100)
        val workout3 = Workout("Mega press", 35, 10)
        val workoutArray: Array<Workout> = arrayOf(workout1, workout2, workout3)
        val workoutAdapter: WorkoutAdapter = WorkoutAdapter(workoutArray)
        recyclerView.adapter = workoutAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        binding.homeButton.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        })

        binding.helpButton.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, HelpActivity::class.java))
        })
    }
}