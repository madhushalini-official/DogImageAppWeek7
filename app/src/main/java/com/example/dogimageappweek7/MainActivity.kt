package com.example.dogimageappweek7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.example.dogimageappweek7.ui.screen.DogScreen
import com.example.dogimageappweek7.ui.theme.DogImageAppWeek7Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DogImageAppWeek7Theme {
                Surface {
                    DogScreen() // Directly show DogScreen instead of NavGraph
                }
            }
        }
    }
}
