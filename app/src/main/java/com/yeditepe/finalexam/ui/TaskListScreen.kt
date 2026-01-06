package com.yeditepe.finalexam.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.yeditepe.finalexam.model.Task
import com.yeditepe.finalexam.viewmodel.TaskViewModel

@Composable
fun TaskListScreen(viewModel: TaskViewModel = viewModel()) {

    // TODO 3: Read task list from ViewModel
    val tasks = viewModel.tasks



    Column {
        // TODO 4: Display task titles and completion status
        // Use a simple Column or LazyColumn
    LazyColumn {
        items(tasks) { task ->
            TaskRow(task = task, onTaskClick = onTaskClick)
        }
    }
}

@Composable
fun TaskRow(task: Task, navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {

            // TODO 3: Navigate to detail screen with task titleonTaskClick(task.title)
                onTaskClick(task.title)
            }
            .padding(16.dp)
    ) {
        Text(
            text = task.title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.weight(1f)
        )

        }
    )
}
