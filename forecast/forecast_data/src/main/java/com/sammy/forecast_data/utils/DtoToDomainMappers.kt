package com.sammy.forecast_data.utils

import com.sammy.forecast_data.data.dto.CurrentWeatherDto
import com.sammy.forecast_data.data.dto.Daily
import com.sammy.forecast_domain.model.CurrentWeather
import com.sammy.forecast_domain.model.WeatherForecast


fun Daily.toWeatherForecast(): WeatherForecast {
    return WeatherForecast(
        this.weather[0].id,
        "${this.temp.day.toInt()}",
        Converters.convertToDay(this.dt.toLong())
    )

}


fun CurrentWeatherDto.toCurrentWeather(): CurrentWeather {
    return CurrentWeather(
        icon = this.weather[0].icon,
        "${this.main.temp}",
        "${this.main.tempMax}",
        "${this.main.tempMin}",
        this.weather[0].description
    )
}