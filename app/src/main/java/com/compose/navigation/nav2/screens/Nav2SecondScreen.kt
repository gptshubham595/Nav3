package com.compose.navigation.nav2.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.compose.navigation.models.Dummy
import com.compose.navigation.ui.theme.MyStoreTheme


@Composable
fun Nav2SecondScreen(
    modifier: Modifier,
    id: Int,
    data: Dummy?,
    navController: NavController?
) {
    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Second Screen $id ${data?.name}",
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(Modifier.height(12.dp))
        Button({ navController?.popBackStack() }) {
            Text(
                "Go back to First Screen",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Preview
@Composable
fun Nav2SecondScreenPreview() {
    MyStoreTheme {
        Nav2SecondScreen(
            Modifier.fillMaxSize(),
            1,
            null,
            null
        )
    }
}