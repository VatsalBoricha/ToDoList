package com.example.assignment03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
* Assignment 3 - To Do List App
* Name : Vatsal Boricha
* StudentID: 200528698
* Date: 24th march 2024
* Description: This is a To Do List app that can add tasks, delete or edit them.
* It can also be viewed in calendar view. The toggle switch is to indicate if the task is completed or not.There is also input
* text for the name of tasks and notes. There is optional due dates and completed toggle switches.  */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}