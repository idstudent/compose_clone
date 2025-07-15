package com.exam.compose_clone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.exam.compose_clone.screen.MainScreen
import com.exam.compose_clone.ui.theme.Compose_cloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_cloneTheme {
                MainScreen(navController = rememberNavController())
            }
        }
    }
}