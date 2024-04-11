package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
               DiceRollerApp()
            }
        }
    }
}

@Preview
@Composable
fun DiceRollerApp(){
    DiceWithButtonAndImage(modifier = Modifier
        .fillMaxSize() //be as large as the element not smaller
        .wrapContentSize(Alignment.Center)) // center the element if smaller
}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier){
    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Roll")
        }
    }
}