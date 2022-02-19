package com.sammy.forecast_domain.repository

import com.sammy.forecast_domain.model.CurrentWeather
import com.sammy.forecast_domain.model.WeatherForecast

interface WeatherRepository {
    suspend fun getCurrentWeather(
        latitude: String,
        longitude: String,
        apikey: String
    ): Result<CurrentWeather>

    suspend fun getForecast(
        latitude: String,
        longitude: String,
        apikey: String
    ): Result<List<WeatherForecast>>
}