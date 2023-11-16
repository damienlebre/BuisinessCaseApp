package com.example.buisinesscaseapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.buisinesscaseapp.ui.theme.BuisinessCaseAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuisinessCaseAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
        Log.i("MainActivity", "onCreate works")
    }
    override  fun onStart(){
        super.onStart()
        Log.i("MainActivity", "onStart works")
    }

    override fun onResume(){
        super.onResume()
        Log.i("MainActivity", "onResume works")
    }

    override fun onPause(){
        super.onPause()
        Log.i("MainActivity", "onPause works")
    }

    override  fun onStop(){
        super.onStop()
        Log.i("MainActivity", "onStop works!")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.i("MainActivity", "onDestroy works!")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BuisinessCaseAppTheme {
        Greeting("Android")
    }
}