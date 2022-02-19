package com.sammy.forecast_presentation.data

import com.sammy.forecast_domain.model.CurrentWeather
import com.sammy.forecast_domain.model.WeatherForecast

data class WeatherForecastUiModel(
    val isLoading: Boolean = false,
    val currentWeather: CurrentWeather,
    val weatherForecast: List<WeatherForecast> = arrayListOf(),
    val error: String
)
