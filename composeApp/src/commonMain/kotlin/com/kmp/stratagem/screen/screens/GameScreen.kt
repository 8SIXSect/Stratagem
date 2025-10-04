package com.kmp.stratagem.screen.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import libs.FastNoiseLite
import kotlin.math.pow


/**
 *
 */
@Composable
fun GameScreen(onBack: () -> Unit) {

    val noise = FastNoiseLite()
    noise.SetNoiseType(FastNoiseLite.NoiseType.Perlin)
    noise.SetFrequency(0.075f)
    val battlefield = Array(100) {
        FloatArray(100) { 0f }
    }

    for (x in 0 until 100) {
        for (y in 0 until 100) {
            battlefield[x][y] = noise.GetNoise(x.toFloat(), y.toFloat())
        }
    }

    LazyVerticalGrid(
        columns = GridCells.Fixed(100),
        verticalArrangement = Arrangement.Center,
        horizontalArrangement = Arrangement.Center,
    ) {
        items(100 * 100) { index ->
            val row = index / 100
            val col = index % 100
            var noiseVal: Float = battlefield[row][col]
            noiseVal = (noiseVal + 1f) / 2f
            noiseVal = noiseVal.pow(1.5f)

            val color = when {
                noiseVal < 0.1f -> Color.Blue
                noiseVal < 0.5f -> Color.Yellow
                noiseVal < 0.7f -> Color.Green
                noiseVal < 0.9f -> Color(6, 64, 43)
                else -> Color.Gray
            }

            Box(
                modifier = Modifier
                    .size(4.dp) // tiny box to avoid huge memory usage
                    .background(color)
            )
        }
    }
}
