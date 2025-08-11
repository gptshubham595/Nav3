package com.compose.navigation.nav2.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.compose.navigation.models.Dummy
import com.compose.navigation.nav2.route.Nav2Routes
import com.compose.navigation.ui.theme.MyStoreTheme
import kotlinx.serialization.json.Json

@Composable
fun Nav2FirstScreen(modifier: Modifier, navController: NavController?) {
    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("First Screen Nav2")
        Spacer(Modifier.height(12.dp))
        Button(onClick = {
            val dummyObject = Dummy(
                name = "Dummy Data 1",
                description = "This is a dummy data for testing",
                price = 100.0,
            )
            val dummyJsonString = Json.encodeToString(dummyObject)
            navController?.navigate(
                route = Nav2Routes.SecondScreenNav2Routes(
                    1, dummyJsonString
                )
            )
        }) {
            Text("Go to Second Screen")
        }
    }
}

@Preview
@Composable
fun Nav2FirstScreenPreview() {
    MyStoreTheme {
        Nav2FirstScreen(modifier = Modifier, null)
    }
}