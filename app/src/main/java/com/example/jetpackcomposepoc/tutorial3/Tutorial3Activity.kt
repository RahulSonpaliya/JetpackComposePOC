package com.example.jetpackcomposepoc.tutorial3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposepoc.R

class Tutorial3Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { TextInput() }
    }
}

@Composable
fun TextInput() {
    val state = remember {mutableStateOf("")}
    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        },
        label = { Text(text = "Name") },
        placeholder = { Text(text = "Enter your name") },
    )
}

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun TextFieldPreview() {
    TextField(
        value = "",
        onValueChange = {},
        label = { Text(text = "Name") },
        placeholder = { Text(text = "Enter your name") },
    )
}

@Preview(showBackground = true, widthDp = 120, heightDp = 50)
@Composable
fun ButtonPreview() {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Black,
            containerColor = Color.White,
        ),
        enabled = false
    ) {
        Text(text = "Click Me")
        Image(
            painter = painterResource(R.drawable.food_express_logo),
            contentDescription = "Logo",
        )
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 300)
@Composable
fun ImagePreview() {
    Image(
        painter = painterResource(R.drawable.food_express_logo),
        contentDescription = "Logo",
        colorFilter = ColorFilter.tint(Color.Cyan),
        contentScale = ContentScale.Crop
    )
}

@Preview(showBackground = true, widthDp = 300, heightDp = 300)
@Composable
fun TextPreview() {
    Text(
        text = "Hello World!",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        color = Color.Red,
        fontSize = 36.sp,
        textAlign = TextAlign.End
    )
}