package com.example.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.login.ui.theme.LoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        for (i in 1..10) {
            if (i % 2 == 0) {
                LoginTitle(i)
            }
        }
    }
}

@Composable
fun LoginTitle(index: Int) {
    Row {
        Text("Compose $index 최고", fontSize = 20.sp)
        Text(text = "국 밥충")
        Text(text = "인텔 과정", color = Color.Blue)
    }
}

@Preview(showBackground = true)
@Composable
fun WantKnowMyPersonalities() {
    Column(
        modifier = Modifier
            .background(Color(0xffffffff)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.intp),
            contentDescription = "intp-t"
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
        )
        Image( //text 대체
            painter = painterResource(id = R.drawable.intp_description),
            contentDescription = "intp describe"
        )
    }
}