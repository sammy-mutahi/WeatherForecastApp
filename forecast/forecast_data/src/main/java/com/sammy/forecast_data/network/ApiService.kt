package com.sammy.forecast_data.network

import com.sammy.forecast_data.data.dto.CurrentWeatherDto
import com.sammy.forecast_data.data.dto.ForecastDto
import retrofit2.http.GET
import retrofit2.http.Query

internal interface ApiService {
    @GET("weather")
    suspend fun getCurrentWeather(
        @Query("lat") latitude: String,
        @Query("lon") longitude: String,
        @Query("appid") apiKey: String,
        @Query("units") metrics: String = "metric"
    ): CurrentWeatherDto

    @GET("onecall")
    suspend fun getWeatherForecast(
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("appid") apiKey: String,
        @Query("units") units: String = "metric",
        @Query("exclude") exclude: String = "current,minutely,hourly,alerts"
    ): ForecastDto

    companion object {
        const val BASE_URL = "http://api.openweathermap.org/data/2.5/"
    }

}