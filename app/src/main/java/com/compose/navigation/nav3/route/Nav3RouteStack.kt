package com.compose.navigation.nav3.route

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation3.ui.NavDisplay
import com.compose.navigation.nav3.route.Nav3Routes

@Composable
fun Nav3Route() {
    val backStack =
        remember { mutableStateListOf<Any>(Nav3Routes.FirstScreenNav3Routes) }
    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = nav3RouterSetup(backStack)
    )
}