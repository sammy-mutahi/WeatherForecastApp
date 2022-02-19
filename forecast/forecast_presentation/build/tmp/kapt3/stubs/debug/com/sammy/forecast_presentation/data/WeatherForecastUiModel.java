package com.sammy.forecast_presentation.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\nH\u00c6\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/sammy/forecast_presentation/data/WeatherForecastUiModel;", "", "isLoading", "", "currentWeather", "Lcom/sammy/forecast_domain/model/CurrentWeather;", "weatherForecast", "", "Lcom/sammy/forecast_domain/model/WeatherForecast;", "error", "", "(ZLcom/sammy/forecast_domain/model/CurrentWeather;Ljava/util/List;Ljava/lang/String;)V", "getCurrentWeather", "()Lcom/sammy/forecast_domain/model/CurrentWeather;", "getError", "()Ljava/lang/String;", "()Z", "getWeatherForecast", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "forecast_presentation_debug"})
public final class WeatherForecastUiModel {
    private final boolean isLoading = false;
    @org.jetbrains.annotations.NotNull()
    private final com.sammy.forecast_domain.model.CurrentWeather currentWeather = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.sammy.forecast_domain.model.WeatherForecast> weatherForecast = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String error = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sammy.forecast_presentation.data.WeatherForecastUiModel copy(boolean isLoading, @org.jetbrains.annotations.NotNull()
    com.sammy.forecast_domain.model.CurrentWeather currentWeather, @org.jetbrains.annotations.NotNull()
    java.util.List<com.sammy.forecast_domain.model.WeatherForecast> weatherForecast, @org.jetbrains.annotations.NotNull()
    java.lang.String error) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public WeatherForecastUiModel(boolean isLoading, @org.jetbrains.annotations.NotNull()
    com.sammy.forecast_domain.model.CurrentWeather currentWeather, @org.jetbrains.annotations.NotNull()
    java.util.List<com.sammy.forecast_domain.model.WeatherForecast> weatherForecast, @org.jetbrains.annotations.NotNull()
    java.lang.String error) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sammy.forecast_domain.model.CurrentWeather component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sammy.forecast_domain.model.CurrentWeather getCurrentWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sammy.forecast_domain.model.WeatherForecast> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sammy.forecast_domain.model.WeatherForecast> getWeatherForecast() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getError() {
        return null;
    }
}