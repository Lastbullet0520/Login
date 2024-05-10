package com.example.login

import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.LENGTH_SHORT
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp

class SubActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                SubButton("확인")
                SubButton("수정")
                SubButton("취소")
                SubButton("삭제")
                SubButton("저장")
            }
        }
    }
    @Composable
    fun SubButton(name: String) {
        Button(onClick = {
            Toast.makeText(this@SubActivity, name, LENGTH_SHORT).show()
        }) {
            Text(text = name, fontSize = 16.sp)
        }
    }

}


@Composable
fun CarrotList()    {
    Row {
        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
        Column {

        }
    }
}