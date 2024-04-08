package com.example.assignment04

import com.google.android.gms.tasks.Tasks
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.toObject

class  DatabaseManagerFirestore {

    private val db = FirebaseFirestore.getInstance()
    private val collectionref = db.collection("ToDoList")


    fun getTasks(onComplete: (List<ToDoTasks>) -> Unit) {
        val db = FirebaseFirestore.getInstance()
        val collectionRef = db.collection("ToDoList")

        fun getTasks(onComplete: (List<Tasks>) -> Unit) {
            collectionRef.get()
                .addOnSuccessListener { result ->
                    val tasks = result.mapNotNull { it.toObject<Tasks>() }
                    onComplete(tasks)
                }
                .addOnFailureListener {
                    onComplete(emptyList())
                }
        }

        fun saveTodo(todo: Tasks, onComplete: (Boolean) -> Unit) {
            collectionRef.add(todo)
                .addOnSuccessListener {
                    onComplete(true)
                }
                .addOnFailureListener { error ->
                    onComplete(false)
                }
        }

    }
}