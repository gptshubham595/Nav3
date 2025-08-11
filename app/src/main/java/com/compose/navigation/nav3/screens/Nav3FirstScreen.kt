package com.compose.navigation.nav3.screens

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
import com.compose.navigation.ui.theme.MyStoreTheme

@Composable
fun Nav3FirstScreen(modifier: Modifier, onClick: () -> Unit = {}) {
    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("First Screen")
        Spacer(Modifier.height(12.dp))
        Button(onClick) {
            Text("Go to Second Screen")
        }
    }
}

@Preview
@Composable
fun Nav3FirstScreenPreview() {
    MyStoreTheme {
        Nav3FirstScreen(Modifier.fillMaxSize(),{})
    }
}