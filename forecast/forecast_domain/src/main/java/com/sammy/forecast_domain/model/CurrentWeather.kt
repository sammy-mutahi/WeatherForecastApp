package com.sammy.forecast_domain.model

data class CurrentWeather(
    val icon: String,
    val temp: String,
    val maxTemp: String,
    val minTemp: String,
    val description: String
)