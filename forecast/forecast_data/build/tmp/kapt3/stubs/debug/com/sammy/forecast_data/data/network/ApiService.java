package com.sammy.forecast_data.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J9\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJC\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0003\u0010\u000f\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/sammy/forecast_data/data/network/ApiService;", "", "getCurrentWeather", "Lcom/sammy/forecast_data/data/dto/CurrentWeatherDto;", "latitude", "", "longitude", "apiKey", "metrics", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherForecast", "Lcom/sammy/forecast_data/data/dto/ForecastDto;", "lat", "lon", "units", "exclude", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "forecast_data_debug"})
public abstract interface ApiService {
    @org.jetbrains.annotations.NotNull()
    public static final com.sammy.forecast_data.data.network.ApiService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "http://api.openweathermap.org/data/2.5/";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "weather")
    public abstract java.lang.Object getCurrentWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lat")
    java.lang.String latitude, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lon")
    java.lang.String longitude, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "appid")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "units")
    java.lang.String metrics, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.sammy.forecast_data.data.dto.CurrentWeatherDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "onecall")
    public abstract java.lang.Object getWeatherForecast(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lat")
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lon")
    java.lang.String lon, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "appid")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "units")
    java.lang.String units, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "exclude")
    java.lang.String exclude, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.sammy.forecast_data.data.dto.ForecastDto> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/sammy/forecast_data/data/network/ApiService$Companion;", "", "()V", "BASE_URL", "", "forecast_data_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "http://api.openweathermap.org/data/2.5/";
        
        private Companion() {
            super();
        }
    }
}