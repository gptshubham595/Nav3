package com.compose.navigation.nav3.route

import com.compose.navigation.models.Dummy
import kotlinx.serialization.Serializable

@Serializable
sealed class Routes(val route: String) {
    data object FirstScreenRoutes : Routes("first_screen")
    data class SecondScreenRoutes(val id: Int, val data: Dummy) : Routes("second_screen")
}

