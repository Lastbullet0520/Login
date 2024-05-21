package com.example.login

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.edit
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
                    LoginTitle()
                }
            }
        }
    }
}



@Composable
fun LoginTitle() {
    val activity = LocalContext.current as? Activity
    val sharedPref = remember { activity?.getPreferences(Context.MODE_PRIVATE) }



    Column(
        modifier = Modifier
            .background(Color(0xffffffff))
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var clickCount: Int by remember {
            val saveCount = sharedPref?.getInt("lastCount",0)
            mutableIntStateOf(saveCount ?: 0)
        }
        Text(text = "Click times : $clickCount")
        Button(onClick = { ++clickCount
            sharedPref?.edit {
                putInt("lastCount",clickCount)
            }
        }) {
            Text(text = "Increase")
        }
        Button(onClick = { --clickCount
        sharedPref?.edit {
            putInt("lastCount",clickCount)
        }}) {
            Text(text = "Decrease")
        }
        Button(onClick = { clickCount = 0
        sharedPref?. edit {
            putInt("lastCount",clickCount)
        }
        }) {
            Text(text = "Reset")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LoginTitlePreview() {
        LoginTitle()

}