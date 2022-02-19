package com.sammy.forecast_data.data.repository

import com.sammy.forecast_data.data.network.ApiService
import com.sammy.forecast_data.utils.toCurrentWeather
import com.sammy.forecast_data.utils.toWeatherForecast
import com.sammy.forecast_domain.model.CurrentWeather
import com.sammy.forecast_domain.model.WeatherForecast
import com.sammy.forecast_domain.repository.WeatherRepository
import javax.inject.Inject

class WeatherForecastRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : WeatherRepository {
    override suspend fun getCurrentWeather(
        latitude: String,
        longitude: String,
        apikey: String
    ): Result<CurrentWeather> {
        return try {
            Result.success(
                apiService.getCurrentWeather(
                    latitude,
                    longitude,
                    apikey
                ).toCurrentWeather()
            )
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    override suspend fun getForecast(
        latitude: String,
        longitude: String,
        apikey: String
    ): Result<List<WeatherForecast>> {
        return try {
            Result.success(
                apiService.getWeatherForecast(
                    latitude,
                    longitude,
                    apikey
                ).daily.map {
                    it.toWeatherForecast()
                }
            )
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

}


