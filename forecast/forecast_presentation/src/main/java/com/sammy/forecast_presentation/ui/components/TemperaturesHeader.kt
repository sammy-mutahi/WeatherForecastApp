package com.sammy.forecast_presentation.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sammy.forecast_presentation.data.WeatherForecastUiState

@Composable
fun TemperatureHeader(
    state: WeatherForecastUiState,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
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
                    style = MaterialTheme.typography.caption
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
                    style = MaterialTheme.typography.caption
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
                    style = MaterialTheme.typography.caption
                )
            }
        }
    }
}