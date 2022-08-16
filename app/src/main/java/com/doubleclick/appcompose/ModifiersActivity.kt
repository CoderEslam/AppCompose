package com.doubleclick.appcompose

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.doubleclick.appcompose.MainActivity
import com.doubleclick.appcompose.ui.theme.AppComposeTheme

class ModifiersActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppComposeTheme() {
                // A surface container using the 'background' color from the theme

        }
    }
}

@Composable
fun Greeting3(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    AppComposeTheme() {
        Column(
            modifier = Modifier
                .background(Color.Green)
                .fillMaxHeight(.5f)
                .padding(top = 50.dp)
                .width(300.dp)
                .border(5.dp, Color.Magenta)
                .padding(5.dp)
                .border(5.dp, Color.Gray)
                .padding(5.dp)
                .border(10.dp, Color.Blue)
                .padding(10.dp)
//                        .requiredWidth(300.dp)
        ) {
            Text(text = "eslam", modifier = Modifier
                .border(5.dp, Color.Yellow)
                .padding(5.dp)
                .border(5.dp, Color.Blue)
                .padding(5.dp)
                .clickable {
                    Toast
                        .makeText(this@ModifiersActivity, "Done", Toast.LENGTH_SHORT)
                        .show()
                    startActivity(
                        Intent(
                            this@ModifiersActivity,
                            MainActivity::class.java
                        )
                    )
//                            overridePendingTransition(R.anim.slid, R.anim.slid)
                })
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "ghazy")
        }
    }
    }
}