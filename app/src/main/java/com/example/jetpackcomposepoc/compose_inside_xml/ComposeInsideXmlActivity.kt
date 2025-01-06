package com.example.jetpackcomposepoc.compose_inside_xml

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import com.example.jetpackcomposepoc.R

class ComposeInsideXmlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compose_inside_xml)
        val composeView = findViewById<ComposeView>(R.id.compose_view)
        composeView.setContent {
            SayHello("Neha")
        }
    }
}

@Composable
fun SayHello(name: String) {
    Text(text = "Hello $name!")
}