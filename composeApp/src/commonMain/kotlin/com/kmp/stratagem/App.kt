package com.kmp.stratagem

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import com.kmp.stratagem.screen.Screen
import com.kmp.stratagem.screen.screens.GameScreen
import com.kmp.stratagem.screen.screens.MainMenuScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        // to track the screen that the player is in
        var currentScreen: Screen by remember { mutableStateOf(Screen.MainMenu) }

        when (currentScreen) {

            Screen.MainMenu -> MainMenuScreen(
                onStartGame = { currentScreen = Screen.Game },
                onQuit = getPlatform()::doQuitApp
            )

            Screen.Game -> GameScreen(onBack = {
                currentScreen = Screen.MainMenu
            })
        }
    }
}