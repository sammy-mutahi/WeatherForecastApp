package com.sammy.forecast_data.data.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lcom/sammy/forecast_data/data/dto/Temp;", "", "day", "", "eve", "max", "min", "morn", "night", "(DDDDDD)V", "getDay", "()D", "getEve", "getMax", "getMin", "getMorn", "getNight", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "forecast_data_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Temp {
    private final double day = 0.0;
    private final double eve = 0.0;
    private final double max = 0.0;
    private final double min = 0.0;
    private final double morn = 0.0;
    private final double night = 0.0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sammy.forecast_data.data.dto.Temp copy(@com.squareup.moshi.Json(name = "day")
    double day, @com.squareup.moshi.Json(name = "eve")
    double eve, @com.squareup.moshi.Json(name = "max")
    double max, @com.squareup.moshi.Json(name = "min")
    double min, @com.squareup.moshi.Json(name = "morn")
    double morn, @com.squareup.moshi.Json(name = "night")
    double night) {
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
    
    public Temp(@com.squareup.moshi.Json(name = "day")
    double day, @com.squareup.moshi.Json(name = "eve")
    double eve, @com.squareup.moshi.Json(name = "max")
    double max, @com.squareup.moshi.Json(name = "min")
    double min, @com.squareup.moshi.Json(name = "morn")
    double morn, @com.squareup.moshi.Json(name = "night")
    double night) {
        super();
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final double getDay() {
        return 0.0;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getEve() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getMax() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getMin() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double getMorn() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getNight() {
        return 0.0;
    }
}