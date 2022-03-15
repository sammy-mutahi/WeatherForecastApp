package com.sammy.forecast_data.data.dto

import com.squareup.moshi.Json

data class FeelsLike(
    @field:Json(name = "day")
    val day: Double,
    @field:Json(name = "eve")
    val eve: Double,
    @field:Json(name = "morn")
    val morn: Double,
    @field:Json(name = "night")
    val night: Double
)