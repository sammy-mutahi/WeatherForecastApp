package com.sammy.forecast_data.data.dto


import com.squareup.moshi.Json

data class Wind(
    @field:Json(name = "deg")
    val deg: Int,
    @field:Json(name = "gust")
    val gust: Double,
    @field:Json(name = "speed")
    val speed: Double
)