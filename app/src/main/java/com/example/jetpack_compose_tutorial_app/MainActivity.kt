package com.example.jetpack_compose_tutorial_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_tutorial_app.ui.theme.Jetpack_Compose_tutorial_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_Compose_tutorial_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPage(
                        title = stringResource(R.string.jetpack_compose_tutorial),
                        message1 = getString(R.string.message_1),
                        message2 = getString(R.string.message_2))
                    //Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun GreetingPage(title: String,message1: String,message2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column (
        modifier = Modifier
            .fillMaxHeight()
    ){
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = message1,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp
                )
        )
        Text(
            text = message2,
            modifier = Modifier
                .padding(16.dp)
        )
    }

//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Jetpack_Compose_tutorial_appTheme {
        //Greeting("Android")
    }
}

/*
* Jetpack Compose tutorial
Jetpack Compose is a modern toolkit for building native Android UI.
*  Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.
* In this tutorial, you build a simple UI component with declarative functions.
* You call Compose functions to say what elements you want and the Compose compiler does the rest.
*  Compose is built around Composable functions. These functions let you define your app\'s UI programmatically because they
*  let you describe how it should look and provide data dependencies,
* rather than focus on the process of the UI\'s construction, such as initializing an element and then attaching it to a parent.
*  To create a Composable function,
* you add the @Composable annotation to the function name.
* */