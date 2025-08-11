package com.compose.navigation.nav2.route

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.compose.navigation.nav2.screens.Nav2FirstScreen
import com.compose.navigation.nav2.screens.Nav2SecondScreen
import com.compose.navigation.nav3.route.Routes

@Composable
fun Nav2Route(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Routes.FirstScreenRoutes.route,
    ) {
        composable(Routes.FirstScreenRoutes.route) {
            Nav2FirstScreen(modifier, navController)
        }
        composable<Routes.SecondScreenRoutes> { it: NavBackStackEntry ->
            val arg = it.toRoute<Routes.SecondScreenRoutes>()
            Nav2SecondScreen(modifier, arg.id, arg.data, navController)
        }

    }
}