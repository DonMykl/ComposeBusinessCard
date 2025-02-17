package com.example.composebusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
                    ContactName()
                }
            }
        }
    }
}

@Composable
fun ContactName(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        val image: Painter = painterResource(R.drawable.android_logo)
        Image(painter = image,
            contentDescription = null,
            modifier = Modifier
                .width(200.dp)
                .height(200.dp))
        Text(text = stringResource(R.string.full_name_text),
            modifier = Modifier,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Text(text = stringResource(R.string.android_developer_text),
            modifier = Modifier,
            textAlign = TextAlign.Justify,
            fontSize = 20.sp,
        )

    }
    Column (modifier = Modifier
        .fillMaxWidth(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Row (modifier = Modifier,
            horizontalArrangement = Arrangement.Center,
        ){
            Icon(Icons.Filled.Call,
                contentDescription = null,
                modifier = Modifier
                    .weight(1f))
            Text(text = stringResource(R.string.phone_number_text,),
                modifier = Modifier,
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
            )
        }
        Row (modifier = Modifier,
            horizontalArrangement = Arrangement.Center){
            Icon(Icons.Filled.Share,
                contentDescription = null,
                modifier = Modifier
                    .weight(1f))

            Text(modifier = Modifier,
                text = stringResource(R.string.social_media_text),
                textAlign = TextAlign.Center,
                fontSize = 20.sp)
        }
        Row(modifier = Modifier,
            horizontalArrangement = Arrangement.Center) {
            Icon(Icons.Filled.Email, contentDescription = null,
                modifier = Modifier
                    .weight(1f))
            Text(text = stringResource(R.string.email_text),
                modifier = Modifier,
                fontSize = 20.sp)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeBusinessCardTheme {
        ContactName()
    }
}