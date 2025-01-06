package com.example.jetpackcomposepoc.project_setup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class ProjectSetupActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "Hello World!")
        }
    }
}

@Composable
fun SayHello(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true, name = "Hello Message", widthDp = 100, heightDp = 100)
@Composable
private fun PreviewSayHello() {
    SayHello("Neha")
}

//@Preview(showBackground = true, name = "Hello Message2")
//@Composable
//fun SayHello2(name: String = "Neha") {
//    Text(text = "Hello $name!")
//}