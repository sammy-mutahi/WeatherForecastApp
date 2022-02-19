package com.sammy.forecast_presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/sammy/forecast_presentation/WeatherForecastViewModel;", "Landroidx/lifecycle/ViewModel;", "useCases", "Lcom/sammy/forecast_domain/use_case/GetUseCases;", "(Lcom/sammy/forecast_domain/use_case/GetUseCases;)V", "forecast_presentation_debug"})
public final class WeatherForecastViewModel extends androidx.lifecycle.ViewModel {
    private final com.sammy.forecast_domain.use_case.GetUseCases useCases = null;
    
    @javax.inject.Inject()
    public WeatherForecastViewModel(@org.jetbrains.annotations.NotNull()
    com.sammy.forecast_domain.use_case.GetUseCases useCases) {
        super();
    }
}