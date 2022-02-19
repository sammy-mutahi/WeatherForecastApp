package com.sammy.forecast_presentation

import androidx.lifecycle.ViewModel
import com.sammy.forecast_domain.use_case.GetUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WeatherForecastViewModel @Inject constructor(
    private val useCases: GetUseCases
) : ViewModel()