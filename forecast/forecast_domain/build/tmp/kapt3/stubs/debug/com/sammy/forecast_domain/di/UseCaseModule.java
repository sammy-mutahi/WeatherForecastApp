package com.sammy.forecast_domain.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/sammy/forecast_domain/di/UseCaseModule;", "", "()V", "provideUseCase", "Lcom/sammy/forecast_domain/use_case/GetUseCases;", "weatherRepository", "Lcom/sammy/forecast_domain/repository/WeatherRepository;", "forecast_domain_debug"})
@dagger.Module()
public final class UseCaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.sammy.forecast_domain.di.UseCaseModule INSTANCE = null;
    
    private UseCaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.sammy.forecast_domain.use_case.GetUseCases provideUseCase(@org.jetbrains.annotations.NotNull()
    com.sammy.forecast_domain.repository.WeatherRepository weatherRepository) {
        return null;
    }
}