package com.sammy.forecast_presentation.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0013J\u001e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/sammy/forecast_presentation/ui/WeatherForecastViewModel;", "Landroidx/lifecycle/ViewModel;", "useCases", "Lcom/sammy/forecast_domain/use_case/GetUseCases;", "locationUtils", "Lcom/sammy/forecast_presentation/utils/LocationUtils;", "(Lcom/sammy/forecast_domain/use_case/GetUseCases;Lcom/sammy/forecast_presentation/utils/LocationUtils;)V", "_currentLocation", "Landroidx/lifecycle/MutableLiveData;", "Landroid/location/Location;", "_state", "Lcom/sammy/forecast_presentation/data/WeatherForecastUiModel;", "currentLocation", "Landroidx/lifecycle/LiveData;", "getCurrentLocation", "()Landroidx/lifecycle/LiveData;", "state", "getState", "getCurrentWeather", "Lkotlinx/coroutines/Job;", "latitude", "", "longitude", "apiKey", "getLocation", "getWeatherForecast", "forecast_presentation_debug"})
public final class WeatherForecastViewModel extends androidx.lifecycle.ViewModel {
    private final com.sammy.forecast_domain.use_case.GetUseCases useCases = null;
    private final com.sammy.forecast_presentation.utils.LocationUtils locationUtils = null;
    private final androidx.lifecycle.MutableLiveData<com.sammy.forecast_presentation.data.WeatherForecastUiModel> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.sammy.forecast_presentation.data.WeatherForecastUiModel> state = null;
    private final androidx.lifecycle.MutableLiveData<android.location.Location> _currentLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<android.location.Location> currentLocation = null;
    
    @javax.inject.Inject()
    public WeatherForecastViewModel(@org.jetbrains.annotations.NotNull()
    com.sammy.forecast_domain.use_case.GetUseCases useCases, @org.jetbrains.annotations.NotNull()
    com.sammy.forecast_presentation.utils.LocationUtils locationUtils) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getLocation() {
        return null;
    }
}