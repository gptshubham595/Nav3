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
import com.compose.navigation.nav3.route.Nav3Routes

fun nav3RouterSetup(backStack: SnapshotStateList<Any>): (Any) -> NavEntry<Any> {
    return entryProvider {
        entry<Nav3Routes.FirstScreenNav3Routes> { key: Nav3Routes.FirstScreenNav3Routes ->
            Nav3FirstScreen(modifier = Modifier.fillMaxSize()) {
                backStack.add(
                    Nav3Routes.SecondScreenNav3Routes(
                        1, Dummy(
                            name = "Sample Item",
                            description = "This is a sample item description.",
                            price = 19.99
                        )
                    )
                )
            }
        }
        entry<Nav3Routes.SecondScreenNav3Routes> { key: Nav3Routes.SecondScreenNav3Routes ->
            Nav3SecondScreen(modifier = Modifier.fillMaxSize(), key.id, key.data) {
                backStack.removeLastOrNull() // kind of like navigation.popBack()
            }
        }
    }
}