package com.compose.nav3

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {
    data object FirstScreenRoute : Routes()
    data class SecondScreenRoute(val id: Int, val data: Dummy) : Routes()
}

data class Dummy(
    val name: String,
    val description: String,
    val price: Double
)