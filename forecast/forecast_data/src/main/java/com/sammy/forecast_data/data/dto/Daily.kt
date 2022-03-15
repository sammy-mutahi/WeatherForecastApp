package com.sammy.forecast_data.data.dto

import com.squareup.moshi.Json

data class Daily(
    @field:Json(name = "clouds")
    val clouds: Int,
    @field:Json(name = "dew_point")
    val dewPoint: Double,
    @field:Json(name = "dt")
    val dt: Int,
    @field:Json(name = "feels_like")
    val feelsLike: FeelsLike,
    @field:Json(name = "humidity")
    val humidity: Int,
    @field:Json(name = "moon_phase")
    val moonPhase: Double,
    @field:Json(name = "moonrise")
    val moonrise: Int,
    @field:Json(name = "moonset")
    val moonset: Int,
    @field:Json(name = "pop")
    val pop: Double,
    @field:Json(name = "pressure")
    val pressure: Int,
    @field:Json(name = "sunrise")
    val sunrise: Int,
    @field:Json(name = "sunset")
    val sunset: Int,
    @field:Json(name = "temp")
    val temp: Temp,
    @field:Json(name = "uvi")
    val uvi: Double,
    @field:Json(name = "weather")
    val weather: List<Weather>,
    @field:Json(name = "wind_deg")
    val windDeg: Int,
    @field:Json(name = "wind_gust")
    val windGust: Double,
    @field:Json(name = "wind_speed")
    val windSpeed: Double
)