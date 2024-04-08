package com.example.assignment04

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.example.assignment04.databinding.ActivityToDodetailBinding

class TaskDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityToDodetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToDodetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.cancelButton.setOnClickListener {
            finish()
        }
    }
}