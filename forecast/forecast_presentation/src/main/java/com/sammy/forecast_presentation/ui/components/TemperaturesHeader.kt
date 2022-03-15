package com.sammy.forecast_presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sammy.core_ui.LocalColors
import com.sammy.core_ui.LocalSpacing
import com.sammy.forecast_presentation.data.WeatherForecastUiState
import com.sammy.forecast_presentation.utils.ViewBackgroundColorState

@Composable
fun TemperatureHeader(
    state: WeatherForecastUiState,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current
    val colors = LocalColors.current
    val backgroundColor = when (state.viewBackgroundColorState) {
        ViewBackgroundColorState.CLOUDY -> colors.cloudyBackgroundColor
        ViewBackgroundColorState.RAINY -> colors.rainyBackgroundColor
        else -> colors.sunnyBackgroundColor
    }
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(backgroundColor),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column {
            Text(
                text = "MinTemp",
                color = Color.White,
                style = MaterialTheme.typography.subtitle1
            )
            Spacer(modifier = modifier.height(4.dp))
            state.currentWeather?.let {
                Text(
                    text = "${state.currentWeather.minTemp} ℃",
                    color = Color.White,
                    style = MaterialTheme.typography.body2
                )
            }
        }

        Column {
            Text(
                text = "Current",
                color = Color.White,
                style = MaterialTheme.typography.subtitle1
            )
            Spacer(modifier = modifier.height(4.dp))
            state.currentWeather?.let {
                Text(
                    text = "${state.currentWeather.temp} ℃",
                    color = Color.White,
                    style = MaterialTheme.typography.body2
                )
            }
        }

        Column {
            Text(
                text = "MaxTemp",
                color = Color.White,
                style = MaterialTheme.typography.subtitle1
            )
            Spacer(modifier = modifier.height(4.dp))
            state.currentWeather?.let {
                Text(
                    text = "${state.currentWeather.maxTemp} ℃",
                    color = Color.White,
                    style = MaterialTheme.typography.body2
                )
            }
        }
    }
}