package com.sammy.forecast_presentation.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.sammy.core_ui.LocalColors
import com.sammy.core_ui.LocalSpacing
import com.sammy.forecast_presentation.BuildConfig
import com.sammy.forecast_presentation.ui.components.CurrentWeatherheader
import com.sammy.forecast_presentation.ui.components.TemperatureHeader
import com.sammy.forecast_presentation.ui.components.WeekelyForecast
import com.sammy.forecast_presentation.utils.ViewBackgroundColorState

@Composable
fun HomeScreen(
    viewModel: WeatherForecastViewModel = hiltViewModel()
) {
    val spacing = LocalSpacing.current
    val state = viewModel.state
    val context = LocalContext.current
    val colors = LocalColors.current
    val systemUiController = rememberSystemUiController()

    val surfaceColor = when (state.viewBackgroundColorState) {
        ViewBackgroundColorState.CLOUDY -> colors.cloudyBackgroundColor
        ViewBackgroundColorState.RAINY -> colors.rainyBackgroundColor
        else -> colors.sunnyBackgroundColor
    }

    systemUiController.setSystemBarsColor(
        color = surfaceColor
    )

    LaunchedEffect(key1 = state) {
        viewModel.getCurrentWeather(
            "${state.lastLocation?.latitude}",
            "${state.lastLocation?.longitude}",
            BuildConfig.OPEN_WEATHER_API_KEY
        )
        viewModel.getWeatherForecast(
            "${state.lastLocation?.latitude}",
            "${state.lastLocation?.longitude}",
            BuildConfig.OPEN_WEATHER_API_KEY
        )
    }

    Surface(modifier = Modifier.fillMaxSize(), color = surfaceColor) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = spacing.spaceMedium)
        ) {
            item {
                CurrentWeatherheader(state = state)
                TemperatureHeader(state = state)
            }
            items(state.weatherForecast) { forecast ->
                WeekelyForecast(state.viewBackgroundColorState, forecast)
            }
        }
    }

}