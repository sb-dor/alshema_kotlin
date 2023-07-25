package com.example.alshema_kotlin.pages.bottom_nav_bar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BottomNavbarGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomNavbarItems.screen1.route) {
        composable(BottomNavbarItems.screen1.route) {
            HomeScreen()
        }
        composable(BottomNavbarItems.screen2.route) {
            AzsScreen()
        }
        composable(BottomNavbarItems.screen3.route) {
            PromoScreen()
        }
        composable(BottomNavbarItems.screen4.route) {
            MoreScreen()
        }
    }
}