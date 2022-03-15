package com.sammy.forecast_data.data.dto


import com.squareup.moshi.Json

data class Clouds(
    @field:Json(name = "all")
    val all: Int
)