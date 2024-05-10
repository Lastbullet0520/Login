package com.example.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.login.ui.theme.LoginTheme

class NullActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTheme {
                ButtonActivity()
            }
        }
    }
}


@Composable
fun ButtonActivity() {
    var count by remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier.background(Color(0xFFFEFEFE)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(25.dp))
        Text(text = "English", fontSize = 12.sp, modifier = Modifier)
        Image(
            painter = painterResource(id = R.drawable.insta_logo), contentDescription = "logo",
            modifier = Modifier
                .size(240.dp, 140.dp)
                .padding(vertical = 10.dp)
        )
        Button(
            onClick = { /*TODO 링크 이동*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1877F1)
            ),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.size(240.dp, 32.dp),

            ) {
            Image(
                painter = painterResource(id = R.drawable.facebook_logo),
                contentDescription = null,
                modifier = Modifier.size(15.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(text = "Continue with Facebook")
        }
        Spacer(modifier = Modifier.size(30.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Divider(
                modifier = Modifier
                    .background(Color.LightGray)
                    .width(120.dp)
                    .height(2.dp)
            )
            Text(
                text = "OR", fontSize = 16.sp, color = Color.LightGray
            )
            Divider(
                modifier = Modifier
                    .background(Color.LightGray)
                    .width(120.dp)
                    .height(2.dp)
            )
        }
        Spacer(modifier = Modifier.size(30.dp))
        var text by remember {
            mutableStateOf("")
        }
        TextField(
            value = text, onValueChange = { text = it },
            label = { Text("phone number, user name, of email", fontSize = 12.sp) },
            modifier = Modifier.height(50.dp)
        )
        Spacer(modifier = Modifier.size(10.dp))

        TextField(
            value = text, onValueChange = { text = it },
            label = { Text("password",fontSize = 12.sp) },
            modifier = Modifier.height(50.dp)
        )
        Text(text = "forgot password?", textAlign = TextAlign.End,
            modifier = Modifier.width(280.dp),
            fontSize = 12.sp,
            color = Color(0xFF1877F1),
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.size(30.dp))
        Button(
            onClick = { /*TODO 링크 이동*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1877F1),
                disabledContainerColor = Color(0xFF9FC1F0)
            ),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.size(240.dp, 32.dp),
            enabled = false,

            ) {
            Text(text = "Log in", color = Color.White)
        }
        Spacer(modifier = Modifier.size(16.dp))
        Row{
            Text(text = "Don't have an account? ",
                fontSize = 12.sp
            )
            Text(text = "sign up", color = Color(0xFF1877F1), fontSize = 12.sp)
        }
        Spacer(modifier = Modifier.size(120.dp))
        Text(text="from", fontSize = 10.sp)
        Text(text="FACEBOOK")
        Spacer(modifier = Modifier.size(10.dp))
    }


}

@Preview(showBackground = true)
@Composable
fun ButtonActivityPreview() {
    LoginTheme {
        ButtonActivity()
    }
}