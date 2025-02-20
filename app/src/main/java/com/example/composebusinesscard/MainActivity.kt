package com.example.composebusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebusinesscard.ui.theme.ComposeBusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBusinessCardTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFF073042)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val image: Painter = painterResource(R.drawable.android_logo)

        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
        )

        Text(
            text = stringResource(R.string.full_name_text),
            modifier = Modifier,
            fontSize = 35.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(R.string.android_developer_text),
            modifier = Modifier,
            textAlign = TextAlign.Justify,
            color = Color(0xFF3ddc84),
            fontSize = 25.sp,
        )
        Spacer(
            modifier = Modifier
                .padding(bottom = 300.dp)
        )

    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 100.dp)
            .padding(top = 100.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            modifier = Modifier
                .padding(bottom = 10.dp)
                .padding(top = 10.dp)
                .padding(start = 50.dp)
                .padding(end = 50.dp),
        ) {
            Icon(
                Icons.Filled.Call,
                contentDescription = null,
                modifier = Modifier
                    .weight(1f),
                Color(0xFF3ddc84)
            )

            Text(
                text = stringResource(R.string.phone_number_text),
                modifier = Modifier
                    .weight(3f),
                color = Color.White

            )
        }
        Row(
            modifier = Modifier
                .padding(bottom = 10.dp)
                .padding(top = 10.dp)
                .padding(start = 50.dp)
                .padding(end = 50.dp),
            horizontalArrangement = Arrangement.Center
        ) {

            Icon(
                Icons.Filled.Share,
                contentDescription = null,
                modifier = Modifier
                    .weight(1f),
                Color(0xFF3ddc84)
            )

            Text(
                text = stringResource(R.string.social_media_text),
                modifier = Modifier
                    .weight(3f),
                color = Color.White
            )
        }
        Row(
            modifier = Modifier
                .padding(bottom = 10.dp)
                .padding(top = 10.dp)
                .padding(start = 50.dp)
                .padding(end = 50.dp),
            horizontalArrangement = Arrangement.Center
        ) {

            Icon(
                Icons.Filled.Email, contentDescription = null,
                modifier = Modifier
                    .weight(1f),
                Color(0xFF3ddc84)
            )

            Text(
                text = stringResource(R.string.email_text),
                modifier = Modifier
                    .weight(3f),
                color = Color.White
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeBusinessCardTheme {
        BusinessCard()
    }
}