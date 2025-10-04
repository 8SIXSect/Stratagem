package com.kmp.stratagem.screen.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp

/**
 * This is the screen that players see when they load up the game. It allows the players to start a new game or leave.
 */
@Composable
fun MainMenuScreen(onStartGame: () -> Unit, onQuit: (() -> Unit)? = null) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primaryContainer),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Main Menu", style = MaterialTheme.typography.headlineLarge)

        Spacer(Modifier.height(20.dp))

        Button(onClick = onStartGame) {
            Text("Start Game")
        }

        if (onQuit != null) {
            Spacer(Modifier.height(12.dp))

            Button(
                onClick = onQuit,
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.errorContainer
                )
            ) {
                Text("Quit", color = MaterialTheme.colorScheme.onErrorContainer)
            }
        }
    }
}
