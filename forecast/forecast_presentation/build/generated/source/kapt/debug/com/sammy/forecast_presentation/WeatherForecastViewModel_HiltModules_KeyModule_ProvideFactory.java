// Generated by Dagger (https://dagger.dev).
package com.sammy.forecast_presentation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherForecastViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static WeatherForecastViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(WeatherForecastViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final WeatherForecastViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new WeatherForecastViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
