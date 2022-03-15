package com.sammy.forecast_data.data.dto

import com.squareup.moshi.Json


data class ForecastDto(
    @field:Json(name = "daily")
    val daily: List<Daily>,
    @field:Json(name = "lat")
    val lat: Double,
    @field:Json(name = "lon")
    val lon: Double,
    @field:Json(name = "timezone")
    val timezone: String,
    @field:Json(name = "timezone_offset")
    val timezoneOffset: Int
)