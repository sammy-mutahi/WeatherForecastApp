package com.sammy.forecast_data.data.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u000bH\u00c6\u0003JA\u0010\u001b\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010 \u001a\u00020\tH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/sammy/forecast_data/data/dto/ForecastDto;", "", "daily", "", "Lcom/sammy/forecast_data/data/dto/Daily;", "lat", "", "lon", "timezone", "", "timezoneOffset", "", "(Ljava/util/List;DDLjava/lang/String;I)V", "getDaily", "()Ljava/util/List;", "getLat", "()D", "getLon", "getTimezone", "()Ljava/lang/String;", "getTimezoneOffset", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "forecast_data_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ForecastDto {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.sammy.forecast_data.data.dto.Daily> daily = null;
    private final double lat = 0.0;
    private final double lon = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String timezone = null;
    private final int timezoneOffset = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sammy.forecast_data.data.dto.ForecastDto copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "daily")
    java.util.List<com.sammy.forecast_data.data.dto.Daily> daily, @com.squareup.moshi.Json(name = "lat")
    double lat, @com.squareup.moshi.Json(name = "lon")
    double lon, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "timezone")
    java.lang.String timezone, @com.squareup.moshi.Json(name = "timezone_offset")
    int timezoneOffset) {
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
    
    public ForecastDto(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "daily")
    java.util.List<com.sammy.forecast_data.data.dto.Daily> daily, @com.squareup.moshi.Json(name = "lat")
    double lat, @com.squareup.moshi.Json(name = "lon")
    double lon, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "timezone")
    java.lang.String timezone, @com.squareup.moshi.Json(name = "timezone_offset")
    int timezoneOffset) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sammy.forecast_data.data.dto.Daily> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sammy.forecast_data.data.dto.Daily> getDaily() {
        return null;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getLat() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getLon() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimezone() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getTimezoneOffset() {
        return 0;
    }
}