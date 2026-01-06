package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    private val _tasks = MutableStateFlow<List<Task>>(emptyList())
    val tasks = _tasks.asStateFlow()
    init {listof(
        Task(1,"task 1",notcompleted),
        Task(2,"task 2",completed)
    )





    }
    // Initially add at least 2 tasks

    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        val currentTasks = _tasks.value.toMutableList()
        val taskIndex = currentTasks.indexOfFirst { it.id == taskId }

    }
}

