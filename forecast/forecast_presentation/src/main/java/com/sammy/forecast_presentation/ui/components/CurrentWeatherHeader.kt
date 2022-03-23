package com.sammy.forecast_presentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sammy.core_ui.LocalSpacing
import com.sammy.forecast_presentation.R
import com.sammy.forecast_presentation.data.WeatherForecastUiState
import com.sammy.forecast_presentation.utils.ViewBackgroundColorState

@Composable
fun CurrentWeatherheader(
    state: WeatherForecastUiState,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current
    Column {
        Card(
            modifier = modifier
                .fillMaxWidth()
                .height(240.dp)
        ) {
            Image(
                painter = painterResource(
                    id = when (state.viewBackgroundColorState) {
                        ViewBackgroundColorState.CLOUDY -> R.drawable.forest_cloudy
                        ViewBackgroundColorState.RAINY -> R.drawable.forest_cloudy
                        else -> R.drawable.forest_sunny
                    }
                ),
                contentDescription = "",
                contentScale = ContentScale.FillWidth,
                modifier = modifier.fillMaxWidth()

            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                val color = when (state.viewBackgroundColorState) {
                    ViewBackgroundColorState.RAINY -> Color.White
                    ViewBackgroundColorState.CLOUDY -> Color.White
                    else -> Color.Black
                }
                Text(text = state.locationName, style = MaterialTheme.typography.h1, color = color)
                state.currentWeather?.let {

                    Text(text = "${it.temp} ℃", style = MaterialTheme.typography.h1, color = color)
                    Text(
                        text = it.description,
                        style = MaterialTheme.typography.caption,
                        color = color
                    )
                }
            }
        }
    }
}