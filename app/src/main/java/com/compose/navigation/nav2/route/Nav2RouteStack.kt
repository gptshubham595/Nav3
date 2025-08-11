package com.compose.navigation.nav2.route

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.compose.navigation.models.Dummy
import com.compose.navigation.nav2.screens.Nav2FirstScreen
import com.compose.navigation.nav2.screens.Nav2SecondScreen
import kotlinx.serialization.json.Json

@Composable
fun Nav2Route(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Nav2Routes.FirstScreenNav2Routes.route,
    ) {
        composable(Nav2Routes.FirstScreenNav2Routes.route) {
            Nav2FirstScreen(modifier, navController)
        }
        composable<Nav2Routes.SecondScreenNav2Routes> { it: NavBackStackEntry ->
            val args = it.toRoute<Nav2Routes.SecondScreenNav2Routes>()
            val dataObject = Json.decodeFromString<Dummy>(args.data)
            Nav2SecondScreen(modifier, args.id, dataObject, navController)
        }

    }
}