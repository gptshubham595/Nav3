package com.compose.navigation.nav2.route

import com.compose.navigation.models.Dummy
import kotlinx.serialization.Serializable

@Serializable
sealed class Nav2Routes(val route: String) {
    @Serializable
    data object FirstScreenNav2Routes : Nav2Routes("first_screen_route")

    @Serializable
    data class SecondScreenNav2Routes(val id: Int, val data: String) : Nav2Routes("second_screen_route")
}