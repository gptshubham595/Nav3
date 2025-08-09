package com.compose.nav3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.compose.nav3.screens.FirstScreen
import com.compose.nav3.screens.SecondScreen
import com.compose.nav3.ui.theme.MyStoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyStoreTheme {
                val backStack = remember { mutableStateListOf<Any>(Routes.FirstScreenRoute) }
                NavDisplay(
                    backStack = backStack,
                    onBack = { backStack.removeLastOrNull() },
                    entryProvider = entryProvider {
                        entry<Routes.FirstScreenRoute> { key: Routes.FirstScreenRoute ->
                            FirstScreen(modifier = Modifier.fillMaxSize()) {
                                backStack.add(
                                    Routes.SecondScreenRoute(
                                        1,
                                        Dummy(
                                            name = "Sample Item",
                                            description = "This is a sample item description.",
                                            price = 19.99
                                        )
                                    )
                                )
                            }
                        }
                        entry<Routes.SecondScreenRoute> { key: Routes.SecondScreenRoute ->
                            SecondScreen(modifier = Modifier.fillMaxSize(), key.id, key.data) {
                                backStack.removeLastOrNull() // kind of like navigation.popBack()
                            }

                        }
                    }
                )
            }
        }
    }
}





