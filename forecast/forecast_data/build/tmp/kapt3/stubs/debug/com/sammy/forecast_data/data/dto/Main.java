package com.sammy.forecast_data.data.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001J\t\u0010$\u001a\u00020%H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u00a8\u0006&"}, d2 = {"Lcom/sammy/forecast_data/data/dto/Main;", "", "feelsLike", "", "grndLevel", "", "humidity", "pressure", "seaLevel", "temp", "tempMax", "tempMin", "(DIIIIDDD)V", "getFeelsLike", "()D", "getGrndLevel", "()I", "getHumidity", "getPressure", "getSeaLevel", "getTemp", "getTempMax", "getTempMin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "forecast_data_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Main {
    private final double feelsLike = 0.0;
    private final int grndLevel = 0;
    private final int humidity = 0;
    private final int pressure = 0;
    private final int seaLevel = 0;
    private final double temp = 0.0;
    private final double tempMax = 0.0;
    private final double tempMin = 0.0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sammy.forecast_data.data.dto.Main copy(@com.squareup.moshi.Json(name = "feels_like")
    double feelsLike, @com.squareup.moshi.Json(name = "grnd_level")
    int grndLevel, @com.squareup.moshi.Json(name = "humidity")
    int humidity, @com.squareup.moshi.Json(name = "pressure")
    int pressure, @com.squareup.moshi.Json(name = "sea_level")
    int seaLevel, @com.squareup.moshi.Json(name = "temp")
    double temp, @com.squareup.moshi.Json(name = "temp_max")
    double tempMax, @com.squareup.moshi.Json(name = "temp_min")
    double tempMin) {
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
    
    public Main(@com.squareup.moshi.Json(name = "feels_like")
    double feelsLike, @com.squareup.moshi.Json(name = "grnd_level")
    int grndLevel, @com.squareup.moshi.Json(name = "humidity")
    int humidity, @com.squareup.moshi.Json(name = "pressure")
    int pressure, @com.squareup.moshi.Json(name = "sea_level")
    int seaLevel, @com.squareup.moshi.Json(name = "temp")
    double temp, @com.squareup.moshi.Json(name = "temp_max")
    double tempMax, @com.squareup.moshi.Json(name = "temp_min")
    double tempMin) {
        super();
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final double getFeelsLike() {
        return 0.0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getGrndLevel() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getHumidity() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getPressure() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getSeaLevel() {
        return 0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getTemp() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getTempMax() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double getTempMin() {
        return 0.0;
    }
}