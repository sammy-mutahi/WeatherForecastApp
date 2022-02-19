package com.sammy.forecast_data.data.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u00bf\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u001aJ\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0012H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\bH\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0005H\u00c6\u0003J\u00c3\u0001\u0010D\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00052\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010\u0013\u001a\u00020\u00052\u000e\b\u0003\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0003\u0010\u0017\u001a\u00020\u00032\b\b\u0003\u0010\u0018\u001a\u00020\u00052\b\b\u0003\u0010\u0019\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010H\u001a\u00020\u0003H\u00d6\u0001J\t\u0010I\u001a\u00020JH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0011\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001e\u00a8\u0006K"}, d2 = {"Lcom/sammy/forecast_data/data/dto/Daily;", "", "clouds", "", "dewPoint", "", "dt", "feelsLike", "Lcom/sammy/forecast_data/data/dto/FeelsLike;", "humidity", "moonPhase", "moonrise", "moonset", "pop", "pressure", "sunrise", "sunset", "temp", "Lcom/sammy/forecast_data/data/dto/Temp;", "uvi", "weather", "", "Lcom/sammy/forecast_data/data/dto/Weather;", "windDeg", "windGust", "windSpeed", "(IDILcom/sammy/forecast_data/data/dto/FeelsLike;IDIIDIIILcom/sammy/forecast_data/data/dto/Temp;DLjava/util/List;IDD)V", "getClouds", "()I", "getDewPoint", "()D", "getDt", "getFeelsLike", "()Lcom/sammy/forecast_data/data/dto/FeelsLike;", "getHumidity", "getMoonPhase", "getMoonrise", "getMoonset", "getPop", "getPressure", "getSunrise", "getSunset", "getTemp", "()Lcom/sammy/forecast_data/data/dto/Temp;", "getUvi", "getWeather", "()Ljava/util/List;", "getWindDeg", "getWindGust", "getWindSpeed", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "forecast_data_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Daily {
    private final int clouds = 0;
    private final double dewPoint = 0.0;
    private final int dt = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.sammy.forecast_data.data.dto.FeelsLike feelsLike = null;
    private final int humidity = 0;
    private final double moonPhase = 0.0;
    private final int moonrise = 0;
    private final int moonset = 0;
    private final double pop = 0.0;
    private final int pressure = 0;
    private final int sunrise = 0;
    private final int sunset = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.sammy.forecast_data.data.dto.Temp temp = null;
    private final double uvi = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.sammy.forecast_data.data.dto.Weather> weather = null;
    private final int windDeg = 0;
    private final double windGust = 0.0;
    private final double windSpeed = 0.0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sammy.forecast_data.data.dto.Daily copy(@com.squareup.moshi.Json(name = "clouds")
    int clouds, @com.squareup.moshi.Json(name = "dew_point")
    double dewPoint, @com.squareup.moshi.Json(name = "dt")
    int dt, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "feels_like")
    com.sammy.forecast_data.data.dto.FeelsLike feelsLike, @com.squareup.moshi.Json(name = "humidity")
    int humidity, @com.squareup.moshi.Json(name = "moon_phase")
    double moonPhase, @com.squareup.moshi.Json(name = "moonrise")
    int moonrise, @com.squareup.moshi.Json(name = "moonset")
    int moonset, @com.squareup.moshi.Json(name = "pop")
    double pop, @com.squareup.moshi.Json(name = "pressure")
    int pressure, @com.squareup.moshi.Json(name = "sunrise")
    int sunrise, @com.squareup.moshi.Json(name = "sunset")
    int sunset, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "temp")
    com.sammy.forecast_data.data.dto.Temp temp, @com.squareup.moshi.Json(name = "uvi")
    double uvi, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "weather")
    java.util.List<com.sammy.forecast_data.data.dto.Weather> weather, @com.squareup.moshi.Json(name = "wind_deg")
    int windDeg, @com.squareup.moshi.Json(name = "wind_gust")
    double windGust, @com.squareup.moshi.Json(name = "wind_speed")
    double windSpeed) {
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
    
    public Daily(@com.squareup.moshi.Json(name = "clouds")
    int clouds, @com.squareup.moshi.Json(name = "dew_point")
    double dewPoint, @com.squareup.moshi.Json(name = "dt")
    int dt, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "feels_like")
    com.sammy.forecast_data.data.dto.FeelsLike feelsLike, @com.squareup.moshi.Json(name = "humidity")
    int humidity, @com.squareup.moshi.Json(name = "moon_phase")
    double moonPhase, @com.squareup.moshi.Json(name = "moonrise")
    int moonrise, @com.squareup.moshi.Json(name = "moonset")
    int moonset, @com.squareup.moshi.Json(name = "pop")
    double pop, @com.squareup.moshi.Json(name = "pressure")
    int pressure, @com.squareup.moshi.Json(name = "sunrise")
    int sunrise, @com.squareup.moshi.Json(name = "sunset")
    int sunset, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "temp")
    com.sammy.forecast_data.data.dto.Temp temp, @com.squareup.moshi.Json(name = "uvi")
    double uvi, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "weather")
    java.util.List<com.sammy.forecast_data.data.dto.Weather> weather, @com.squareup.moshi.Json(name = "wind_deg")
    int windDeg, @com.squareup.moshi.Json(name = "wind_gust")
    double windGust, @com.squareup.moshi.Json(name = "wind_speed")
    double windSpeed) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getClouds() {
        return 0;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getDewPoint() {
        return 0.0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getDt() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sammy.forecast_data.data.dto.FeelsLike component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sammy.forecast_data.data.dto.FeelsLike getFeelsLike() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getHumidity() {
        return 0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getMoonPhase() {
        return 0.0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getMoonrise() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getMoonset() {
        return 0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double getPop() {
        return 0.0;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getPressure() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getSunrise() {
        return 0;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getSunset() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sammy.forecast_data.data.dto.Temp component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sammy.forecast_data.data.dto.Temp getTemp() {
        return null;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    public final double getUvi() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sammy.forecast_data.data.dto.Weather> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sammy.forecast_data.data.dto.Weather> getWeather() {
        return null;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int getWindDeg() {
        return 0;
    }
    
    public final double component17() {
        return 0.0;
    }
    
    public final double getWindGust() {
        return 0.0;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    public final double getWindSpeed() {
        return 0.0;
    }
}