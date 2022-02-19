package com.sammy.forecast_domain.use_case

import com.sammy.forecast_domain.model.WeatherForecast
import com.sammy.forecast_domain.repository.WeatherRepository

class GetWeatherForecast(
    private val repository: WeatherRepository
) {
    suspend operator fun invoke(
        latitude: String,
        longitude: String,
        apiKey: String
    ): Result<List<WeatherForecast>> {
        return repository.getForecast(
            latitude,
            longitude,
            apiKey
        )
    }
}