package com.yeditepe.finalexam.repository

import com.yeditepe.finalexam.api.TaskApi
import com.yeditepe.finalexam.model.Task

class TaskRepository(private val api: TaskApi) {

    suspend fun fetchTasks(): List<Task> {
        // TODO 1: Call API
        val tasksDto = api.getTasks()

        // TODO 2: Convert TaskDto list to Task list
        return tasksDto.map { taskDto ->
            Task(
                id = taskDto.id,
                title = taskDto.title,
                completed = taskDto.completed,
                userId = taskDto.userId
            )
        }



        return TODO("Provide the return value")

    }
}

