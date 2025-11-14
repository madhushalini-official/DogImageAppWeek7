package com.example.dogimageappweek7.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dogimageappweek7.ui.screen.DogScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "dog_screen") {
        composable("dog_screen") {
            DogScreen()
        }
    }
}
