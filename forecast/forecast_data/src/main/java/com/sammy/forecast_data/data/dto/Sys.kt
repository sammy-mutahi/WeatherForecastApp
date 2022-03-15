package com.sammy.forecast_data.data.dto


import com.squareup.moshi.Json


data class Sys(
    @field:Json(name = "country")
    val country: String,
    @field:Json(name = "sunrise")
    val sunrise: Int,
    @field:Json(name = "sunset")
    val sunset: Int
)