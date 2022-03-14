package com.sammy.forecast_presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sammy.core_ui.LocalSpacing
import com.sammy.forecast_presentation.data.WeatherForecastUiState

@Composable
fun CurrentWeatherheader(
    state: WeatherForecastUiState,
    modifier: Modifier = Modifier,
    onEvent: () -> Unit
) {
    val spacing = LocalSpacing.current
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(
                RoundedCornerShape(
                    bottomStart = 50.dp,
                    bottomEnd = 50.dp
                )
            )
            .background(MaterialTheme.colors.primary)
            .padding(
                horizontal = spacing.spaceLarge,
                vertical = spacing.spaceExtraLarge
            )
    ) {
        onEvent.invoke()
        Text(text = state.locationName, style = TextStyle(color = Color.Black))
        state.currentWeather?.let {
            Text(text = it.temp, style = TextStyle(color = Color.Black))
            Text(text = it.description, style = TextStyle(color = Color.Black))
        }
    }
}