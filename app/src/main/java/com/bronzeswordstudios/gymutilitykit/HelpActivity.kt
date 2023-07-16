package com.bronzeswordstudios.gymutilitykit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bronzeswordstudios.gymutilitykit.databinding.ActivityHelpBinding

class HelpActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHelpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeButton.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        })
    }
}