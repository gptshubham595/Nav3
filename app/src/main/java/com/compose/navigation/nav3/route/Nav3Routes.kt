package com.compose.navigation.nav3.route

import com.compose.navigation.models.Dummy
import kotlinx.serialization.Serializable

@Serializable
sealed class Nav3Routes() {
    @Serializable
    data object FirstScreenNav3Routes : Nav3Routes()

    @Serializable
    data class SecondScreenNav3Routes(val id: Int, val data: Dummy) : Nav3Routes()
}