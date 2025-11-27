package com.synac.helloworld.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.synac.helloworld.ui.theme.HelloWorldTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
){
    var name by remember { mutableStateOf("World") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Greeting(name = name)
        Spacer(modifier = Modifier.padding(24.dp))
        Button(
            onClick = { name = "Android"}
        ) {
            Text(text = "Click Me")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "hello $name!")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWorldTheme {
        HomeScreen()
    }
}