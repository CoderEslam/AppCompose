package com.doubleclick.appcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.doubleclick.appcompose.ui.theme.AppComposeTheme

private const val TAG = "LazyColumnItemsIndexedA"

class LazyColumnItemsIndexedActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppComposeTheme {
                // A surface container using the 'background' color from the theme
                LazyColumn {
                    itemsIndexed(
                        listOf(
                            "e",
                            "f",
                            "f",
                            "u",
                            "o",
                            "iuj",
                            "ojhj",
                            "f",
                            "f",
                            "u",
                            "o",
                            "iuj",
                            "ojhj",
                            "f",
                            "f",
                            "u",
                            "o",
                            "iuj",
                            "ojhj",
                            "f",
                            "f",
                            "u",
                            "o",
                            "iuj",
                            "ojhj",
                            "f",
                            "f",
                            "u",
                            "o",
                            "iuj",
                            "ojhj"
                        )
                    ) { i, s ->
                        Log.e(TAG, "" + i);
                        Text(
                            text = "Item $s",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 24.dp)
                        )
                    }

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview7() {
    AppComposeTheme {
    }
}