package com.sammy.forecast_domain.di

import com.sammy.forecast_domain.repository.WeatherRepository
import com.sammy.forecast_domain.use_case.GetCurrentWeather
import com.sammy.forecast_domain.use_case.GetUseCases
import com.sammy.forecast_domain.use_case.GetWeatherForecast
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@InstallIn(ViewModelComponent::class)
@Module
object UseCaseModule {

    @ViewModelScoped
    @Provides
    fun provideUseCase(
        weatherRepository: WeatherRepository
    ): GetUseCases {
        return GetUseCases(
            currentWeather = GetCurrentWeather(weatherRepository),
            weatherForecast = GetWeatherForecast(weatherRepository)
        )
    }
}