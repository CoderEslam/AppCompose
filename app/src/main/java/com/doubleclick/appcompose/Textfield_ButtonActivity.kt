package com.doubleclick.appcompose

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.doubleclick.appcompose.ui.theme.AppComposeTheme

class Textfield_ButtonActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var textFiledState by remember {
                mutableStateOf("")
            }
            // A surface container using the 'background' color from the theme
            Scaffold(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxSize()
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 30.dp)
                ) {
                    TextField(value = textFiledState, label = { // text place holder
                        Text(text = "enter here")
                    }, onValueChange = {
                        textFiledState = it
                    }, singleLine = true, modifier = Modifier.fillMaxWidth())
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = {
                        Toast
                            .makeText(
                                this@Textfield_ButtonActivity,
                                "$textFiledState",
                                Toast.LENGTH_SHORT
                            )
                            .show()
                    }) {
                        Text(text = "Click here")
                    }
                }
            }

        }

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    AppComposeTheme {

    }
}