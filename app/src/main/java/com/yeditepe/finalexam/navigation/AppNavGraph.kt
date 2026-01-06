package com.yeditepe.finalexam.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "tasks"
    ) {

        // TODO 1: Add composable for "tasks"
        composable("task") {
            TasksScreen(
                onTaskClick = { title ->
                    navController.navigate("taskDetail/$title")
                }
            )
        }
    }
        // TODO 2: Add composable for "taskDetail/{title}"

    composable(
            route = "taskDetail/{title}",
            arguments = listOf(navArgument("title") { type = NavType.StringType })
        ) { backStackEntry ->
            val title = backStackEntry.arguments?.getString("title")
            requireNotNull(title) { "Task title parameter wasn't found"}

        TaskDetailScreen(
            title = title,
            onBack = { navController.popBackStack()
            }
        }
    }
}
