package com.sammy.forecast_presentation.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013J\u001e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/sammy/forecast_presentation/ui/WeatherForecastViewModel;", "Landroidx/lifecycle/ViewModel;", "useCases", "Lcom/sammy/forecast_domain/use_case/GetUseCases;", "(Lcom/sammy/forecast_domain/use_case/GetUseCases;)V", "_currentLocation", "Landroidx/lifecycle/MutableLiveData;", "Landroid/location/Location;", "_state", "Lcom/sammy/forecast_presentation/data/WeatherForecastUiModel;", "currentLocation", "Landroidx/lifecycle/LiveData;", "getCurrentLocation", "()Landroidx/lifecycle/LiveData;", "state", "getState", "getCurrentWeather", "Lkotlinx/coroutines/Job;", "latitude", "", "longitude", "apiKey", "getWeatherForecast", "forecast_presentation_debug"})
public final class WeatherForecastViewModel extends androidx.lifecycle.ViewModel {
    private final com.sammy.forecast_domain.use_case.GetUseCases useCases = null;
    private final androidx.lifecycle.MutableLiveData<com.sammy.forecast_presentation.data.WeatherForecastUiModel> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.sammy.forecast_presentation.data.WeatherForecastUiModel> state = null;
    private final androidx.lifecycle.MutableLiveData<android.location.Location> _currentLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<android.location.Location> currentLocation = null;
    
    @javax.inject.Inject()
    public WeatherForecastViewModel(@org.jetbrains.annotations.NotNull()
    com.sammy.forecast_domain.use_case.GetUseCases useCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.sammy.forecast_presentation.data.WeatherForecastUiModel> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.location.Location> getCurrentLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getCurrentWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String latitude, @org.jetbrains.annotations.NotNull()
    java.lang.String longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getWeatherForecast(@org.jetbrains.annotations.NotNull()
    java.lang.String latitude, @org.jetbrains.annotations.NotNull()
    java.lang.String longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
        return null;
    }
}