package com.doubleclick.appcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.doubleclick.appcompose.ui.theme.AppComposeTheme
import kotlin.random.Random

class StateActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                val color = remember {
                    mutableStateOf(Color.Yellow)
                }
                ColorBox(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                ) {
                    color.value = it
                }
                Box(
                    modifier = Modifier
                        .background(color = color.value)
                        .weight(1f)
                        .fillMaxSize()
                )
            }

            AppComposeTheme {
                // A surface container using the 'background' color from the theme

            }
        }
    }
}


@Composable
fun ColorBox(modifier: Modifier = Modifier, color: (Color) -> Unit) {
    AppComposeTheme {
        Box(modifier = modifier
            .fillMaxSize()
            .clickable {
                color(
                    Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat(), 1f)
                )
            })
    }
}