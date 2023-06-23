package com.example.a7minutesworkoutapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a7minutesworkoutapp.databinding.ActivityFinishBinding

class FinishActivity: AppCompatActivity() {

    private var binding: ActivityFinishBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.finishButton?.setOnClickListener{
            finish()
        }
    }
}