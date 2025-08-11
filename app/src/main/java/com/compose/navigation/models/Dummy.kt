package com.compose.navigation.models

import kotlinx.serialization.Serializable

@Serializable
data class Dummy(
    val name: String,
    val description: String,
    val price: Double
)