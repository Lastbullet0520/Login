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
                var count by remember {
                    mutableStateOf(0)
                }
                var SaveButtonEnable by remember {
                    mutableStateOf(true)
                }
                var DeleteButtonEnable by remember {
                    mutableStateOf(false)
                }
                Button(onClick = {++count},
                    enabled = SaveButtonEnable,

                ) {
                    if (count >= 15) {
                        SaveButtonEnable = false
                    } else {
                        SaveButtonEnable = true
                    }
                    Text(text = "저장", fontSize = 24.sp)
                }
                Button(onClick = {--count},
                    enabled = DeleteButtonEnable
                ) {
                    if (count > 0) {
                        DeleteButtonEnable = true
                    } else {
                        DeleteButtonEnable = false
                    }
                    Text(text = "삭제", fontSize = 24.sp)
                }
                for(i in 1..count) {
                    Text(text = "$i: 저장했어요", fontSize = 24.sp)

                }
            }
        }
    }
}

//@Composable
//fun ButtonReact() {
//}