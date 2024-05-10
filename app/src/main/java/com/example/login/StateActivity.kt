package com.example.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.sp

class StateActivity :ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                ButtonReact()
            }
        }
    }
    @Composable
    fun ButtonReact() {
        var count by remember {
            mutableStateOf(0)
        }
        Button(onClick = {
            ++count
        }) {
            Text(text = "저장", fontSize = 24.sp)
        }
        for(i in 1..count) {
            Text(text = "$i: 저장했어요", fontSize = 24.sp)
        }
    }
}

