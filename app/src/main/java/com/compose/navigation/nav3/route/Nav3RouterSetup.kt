package com.compose.navigation.nav3.route

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import com.compose.navigation.models.Dummy
import com.compose.navigation.nav3.screens.Nav3FirstScreen
import com.compose.navigation.nav3.screens.Nav3SecondScreen

fun nav3RouterSetup(backStack: SnapshotStateList<Any>): (Any) -> NavEntry<Any> {
    return entryProvider {
        entry<Routes.FirstScreenRoutes> { key: Routes.FirstScreenRoutes ->
            Nav3FirstScreen(modifier = Modifier.fillMaxSize()) {
                backStack.add(
                    Routes.SecondScreenRoutes(
                        1, Dummy(
                            name = "Sample Item",
                            description = "This is a sample item description.",
                            price = 19.99
                        )
                    )
                )
            }
        }
        entry<Routes.SecondScreenRoutes> { key: Routes.SecondScreenRoutes ->
            Nav3SecondScreen(modifier = Modifier.fillMaxSize(), key.id, key.data) {
                backStack.removeLastOrNull() // kind of like navigation.popBack()
            }
        }
    }
}