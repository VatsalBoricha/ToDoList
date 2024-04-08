package com.example.assignment04

data class ToDoTasks(
    val name: String = "",
    val isCompleted: Boolean = false,
    val notes: String = "",
    val hasDueDate: Boolean = true,
    val dueDate: com.google.firebase.Timestamp=com.google.firebase.Timestamp.now()
)
