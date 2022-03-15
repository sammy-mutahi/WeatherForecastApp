package com.sammy.forecast_presentation.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.sammy.core_ui.LocalSpacing
import com.sammy.forecast_presentation.ui.components.CurrentWeatherheader
import com.sammy.forecast_presentation.ui.components.TemperatureHeader

@Composable
fun HomeScreen(
    viewModel: WeatherForecastViewModel = hiltViewModel()
) {
    val spacing = LocalSpacing.current
    val state = viewModel.state
    val context = LocalContext.current
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = spacing.spaceMedium)
    ) {
        item {
            CurrentWeatherheader(state = state)
            TemperatureHeader(state = state)
        }
    }
}