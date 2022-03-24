package com.sammy.forecast_presentation.ui

import android.annotation.SuppressLint
import android.location.Geocoder
import android.location.Location
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.android.gms.location.FusedLocationProviderClient
import com.sammy.forecast_domain.use_case.GetUseCases
import com.sammy.forecast_presentation.data.WeatherForecastUiState
import com.sammy.forecast_presentation.utils.ViewBackgroundColorState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherForecastViewModel @Inject constructor(
    private val useCases: GetUseCases,
    private val fusedlocation: FusedLocationProviderClient,
    private val geocoder: Geocoder
) : ViewModel() {

    var state by mutableStateOf(WeatherForecastUiState())
        private set

    init {
          fetchCurrentLocation()
    }


    fun getCurrentWeather(
        latitude: String,
        longitude: String,
        apiKey: String
    ) = viewModelScope.launch {
        state = state.copy(
            isLoading = true
        )
        useCases.currentWeather.invoke(
            latitude, longitude, apiKey
        )
            .onSuccess {
                val backgroundState = when {

                    it.description.contains("rain", true) -> ViewBackgroundColorState.RAINY
                    it.description.contains("cloud", true) -> ViewBackgroundColorState.CLOUDY
                    else -> ViewBackgroundColorState.SUNNY

                }

                state = state.copy(
                    isLoading = false,
                    currentWeather = it,
                    viewBackgroundColorState = backgroundState
                )
            }
            .onFailure {
                state = state.copy(
                    isLoading = false,
                    error = it.localizedMessage
                )
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
                state = state.copy(
                    isLoading = false,
                    weatherForecast = it
                )
            }
            .onFailure {
                state = state.copy(
                    isLoading = false,
                    error = it.localizedMessage
                )
            }
    }

    @SuppressLint("MissingPermission")
    private fun fetchCurrentLocation() {
        try {
            val locationResult = fusedlocation.lastLocation
            locationResult.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val lastKnownLocaton = task.result
                    lastKnownLocaton?.let {
                        Log.e("ViewModel", "Last Known Location: $it")
                        getLocationName(it)
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun getLocationName(lastLocation: Location) {
        try {
            val addresses =
                geocoder.getFromLocation(lastLocation.latitude, lastLocation.longitude, 1)
            val address = addresses[0]
            state = state.copy(
                lastLocation = lastLocation
            )
            state = state.copy(
                locationName = address.adminArea
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}