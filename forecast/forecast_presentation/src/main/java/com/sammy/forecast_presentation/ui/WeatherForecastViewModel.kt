package com.sammy.forecast_presentation.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sammy.forecast_domain.use_case.GetUseCases
import com.sammy.forecast_presentation.data.WeatherForecastUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherForecastViewModel @Inject constructor(
    private val useCases: GetUseCases
) : ViewModel() {
    private val _state = MutableLiveData<WeatherForecastUiModel>()
    val state: LiveData<WeatherForecastUiModel> = _state

    fun getCurrentWeather(
        latitude: String,
        longitude: String,
        apiKey: String
    ) = viewModelScope.launch {
        _state.value = state.value?.copy(
            isLoading = true
        )
        useCases.currentWeather.invoke(
            latitude, longitude, apiKey
        )
            .onSuccess {
                _state.value = _state.value?.copy(
                    isLoading = false,
                    currentWeather = it
                )
            }
            .onFailure {
                _state.value = it.message?.let { message ->
                    _state.value?.copy(
                        isLoading = false,
                        error = message
                    )
                }
            }
    }

    fun getWeatherForecast(
        latitude: String,
        longitude: String,
        apiKey: String
    ) = viewModelScope.launch {
        useCases.weatherForecast.invoke(
            latitude,
            longitude,
            apiKey
        )
            .onSuccess {
                _state.value = _state.value?.copy(
                    isLoading = false,
                    weatherForecast = it
                )
            }
            .onFailure {
                _state.value = it.message?.let { message ->
                    _state.value?.copy(
                        isLoading = false,
                        error = message
                    )
                }
            }
    }

}