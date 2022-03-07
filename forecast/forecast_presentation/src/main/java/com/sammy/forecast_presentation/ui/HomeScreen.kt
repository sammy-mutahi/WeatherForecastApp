package com.sammy.forecast_presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.hilt.navigation.compose.hiltViewModel
import com.sammy.core_ui.LocalSpacing

@Composable
fun HomeScreen(
    scaffoldState: ScaffoldState,
    viewModel: WeatherForecastViewModel = hiltViewModel()
) {
    val spacing = LocalSpacing.current
    val state = viewModel.state
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Fuck Yeah!!", textAlign = TextAlign.Center)
    }
}