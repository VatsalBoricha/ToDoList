package com.example.assignment04


import android.content.Context
import android.content.Intent
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment04.databinding.ActivityToDolistBinding
import java.text.SimpleDateFormat

class TaskAdapter(private val context: Context, private val items: List<ToDoTasks>) :
    RecyclerView.Adapter<TaskAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ActivityToDolistBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        // data views binding
        holder.binding.taskName.text = item.name
        holder.binding.dueDate.text = SimpleDateFormat("yyyy-MM-dd").format(item.dueDate.toDate())

        holder.binding.editTaskButton.setOnClickListener {
            val intent = Intent(context, TaskDetailsActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(val binding: ActivityToDolistBinding) : RecyclerView.ViewHolder(binding.root)
}
