package com.sammy.forecast_presentation.data

import android.location.Location
import com.sammy.forecast_domain.model.CurrentWeather
import com.sammy.forecast_domain.model.WeatherForecast

data class WeatherForecastUiState(
    val lastLocation: Location? = null,
    val isLoading: Boolean = false,
    val currentWeather: CurrentWeather? = null,
    val weatherForecast: List<WeatherForecast> = arrayListOf(),
    val locationName: String = "",
    val error: String = ""
)
