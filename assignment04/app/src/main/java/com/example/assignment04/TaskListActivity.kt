package com.example.assignment04

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assignment04.databinding.ActivityMainBinding
import com.google.android.gms.tasks.Tasks
import com.google.firebase.FirebaseApp

class   TaskListActivity : AppCompatActivity() {

    private lateinit var todoAdapter: TaskAdapter
    private val todoList: MutableList<ToDoTasks> = mutableListOf()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Initializing FireBase:
        FirebaseApp.initializeApp(this)

        val firestore = DatabaseManagerFirestore()
        firestore.getTasks { tasks ->
            for ( task in tasks){
                println(task.name)
                println(task.hasDueDate)
                println(task.notes)
                println(task.isCompleted)
                println(task.dueDate)
            }
            val recyclerView = binding.FirstRecyclerView
            recyclerView.layoutManager = LinearLayoutManager(this)
            todoAdapter = TaskAdapter(this, tasks)
            recyclerView.adapter = todoAdapter
        }
    }


    }

