package com.sammy.forecast_presentation.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/sammy/forecast_presentation/utils/LocationUtils;", "", "fusedLocation", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "fetchLocationUpdates", "Lkotlinx/coroutines/flow/Flow;", "Landroid/location/Location;", "Companion", "forecast_presentation_debug"})
public final class LocationUtils {
    private final com.google.android.gms.location.FusedLocationProviderClient fusedLocation = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.sammy.forecast_presentation.utils.LocationUtils.Companion Companion = null;
    public static final long UPDATE_INTERVAL = 3000L;
    public static final long FAST_UPDATE_INTERVAL = 3000L;
    
    @javax.inject.Inject()
    public LocationUtils(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient fusedLocation) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<android.location.Location> fetchLocationUpdates() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/sammy/forecast_presentation/utils/LocationUtils$Companion;", "", "()V", "FAST_UPDATE_INTERVAL", "", "UPDATE_INTERVAL", "forecast_presentation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}