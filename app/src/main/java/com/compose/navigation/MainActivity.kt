package com.compose.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.compose.navigation.nav2.route.Nav2Route
import com.compose.navigation.nav3.route.Nav3Route
import com.compose.navigation.ui.theme.MyStoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyStoreTheme {
//                Nav3Route()
                Nav2Route()
            }
        }
    }
}






