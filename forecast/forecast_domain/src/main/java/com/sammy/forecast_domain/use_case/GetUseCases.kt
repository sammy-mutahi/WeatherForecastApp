package com.sammy.forecast_domain.use_case

data class GetUseCases(
    val currentWeather: GetCurrentWeather,
    val weatherForecast: GetWeatherForecast
)