package com.tpc.nudj

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.tpc.nudj.ui.navigation.ScreenRoute
import com.tpc.nudj.ui.screen.DemoScreen
import com.tpc.nudj.ui.screen.auth.register.RegisterScreen
import com.tpc.nudj.ui.theme.NudjTheme
import dagger.hilt.android.AndroidEntryPoint
@AndroidEntryPoint

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NudjTheme {
                RegisterScreen(
                    onNavigateBack = { finish() } // Ya jo bhi navigation logic ho
                )

            }
        }
    }
}