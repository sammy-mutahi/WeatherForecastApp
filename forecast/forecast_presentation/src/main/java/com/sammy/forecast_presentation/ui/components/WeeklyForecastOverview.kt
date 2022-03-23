package com.sammy.forecast_presentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sammy.core_ui.LocalSpacing
import com.sammy.forecast_domain.model.WeatherForecast
import com.sammy.forecast_presentation.R
import com.sammy.forecast_presentation.utils.ViewBackgroundColorState

@Composable
fun WeekelyForecast(
    colorState: ViewBackgroundColorState,
    forecast: WeatherForecast,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current
    val forecastId = forecast.id.toString()
    val icon: Int = iconId(forecastId)
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround,
    ) {
        Text(text = forecast.day, style = MaterialTheme.typography.body2, color = Color.White)
        Image(painter = painterResource(id = icon), contentDescription = "")
        Text(
            text = "${forecast.temp} ℃",
            style = MaterialTheme.typography.body2,
            color = Color.White
        )
    }
}

private fun iconId(forecastId: String): Int {
    return when {
        //thunderstorm 2xx
        forecastId.startsWith("2", true) -> {
            R.drawable.rain3x
        }
        //drizzle 3xx
        forecastId.startsWith("3", true) -> {
            R.drawable.rain3x
        }
        //rain 5xx
        forecastId.startsWith("5", true) -> {
            R.drawable.rain3x
        }
        //snow 6xx
        forecastId.startsWith("6", true) -> {
            R.drawable.rain3x
        }
        //atmosphere 7xx
        forecastId.startsWith("7", true) -> {
            R.drawable.partlysunny3x
        }
        //sunny/ clear 8xx
        forecastId.startsWith("8", true) -> {
            R.drawable.clear3x
        }
        else -> {
            R.drawable.partlysunny3x
        }
    }
}