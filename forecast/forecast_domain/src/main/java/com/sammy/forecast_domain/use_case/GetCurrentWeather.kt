package com.sammy.forecast_domain.use_case

import com.sammy.forecast_domain.model.CurrentWeather
import com.sammy.forecast_domain.repository.WeatherRepository

class GetCurrentWeather(
    private val repository: WeatherRepository
) {
    suspend operator fun invoke(
        latitude: String,
        longitude: String,
        apiKey: String
    ): Result<CurrentWeather> {
        return repository.getCurrentWeather(
            latitude,
            longitude,
            apiKey
        )
    }
}