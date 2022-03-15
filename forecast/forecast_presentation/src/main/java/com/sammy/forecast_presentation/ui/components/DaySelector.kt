package com.sammy.forecast_presentation.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sammy.core_ui.LocalSpacing
import com.sammy.forecast_presentation.data.WeatherForecastUiState

@Composable
fun DaySelector(
    state: WeatherForecastUiState,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = spacing.spaceLarge, end = spacing.spaceLarge),
        elevation = 4.dp
    ) {
        Row(
            modifier = modifier,
        ) {
            Column(
                modifier = modifier.padding(24.dp)
            ) {
                Text(text = "MinTemp")
                Spacer(modifier = modifier.height(8.dp))
                state.currentWeather?.let {
                    Text(text = state.currentWeather.minTemp)
                }
            }

            Column(
                modifier = modifier.padding(24.dp)
            ) {
                Text(text = "Temp")
                Spacer(modifier = modifier.height(8.dp))
                state.currentWeather?.let {
                    Text(text = state.currentWeather.temp)
                }
            }

            Column(
                modifier = modifier.padding(24.dp)
            ) {
                Text(text = "MaxTemp")
                Spacer(modifier = modifier.height(8.dp))
                state.currentWeather?.let {
                    Text(text = state.currentWeather.maxTemp)
                }
            }
        }
    }
}