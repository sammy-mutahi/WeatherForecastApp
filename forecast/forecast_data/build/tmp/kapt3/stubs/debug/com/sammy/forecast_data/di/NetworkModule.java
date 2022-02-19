package com.sammy.forecast_data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/sammy/forecast_data/di/NetworkModule;", "", "()V", "provideApiService", "Lcom/sammy/forecast_data/data/network/ApiService;", "client", "Lokhttp3/OkHttpClient;", "provideForecastRepository", "Lcom/sammy/forecast_domain/WeatherRepository;", "apiService", "provideOkHttpClient", "forecast_data_debug"})
@dagger.Module()
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.sammy.forecast_data.di.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.sammy.forecast_data.data.network.ApiService provideApiService(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.sammy.forecast_domain.WeatherRepository provideForecastRepository(@org.jetbrains.annotations.NotNull()
    com.sammy.forecast_data.data.network.ApiService apiService) {
        return null;
    }
}