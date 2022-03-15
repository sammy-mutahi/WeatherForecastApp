package com.sammy.weatherforecastapp.di

import android.content.Context
import android.location.Criteria
import android.location.Geocoder
import android.location.LocationManager
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object LocationModule {

    @Provides
    @Singleton
    fun provideFusedLocationProvider(
        @ApplicationContext context: Context
    ): FusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context)

    @Provides
    @Singleton
    fun provideLocationManager(@ApplicationContext context: Context): LocationManager =
        context.getSystemService(Context.LOCATION_SERVICE) as LocationManager

    @Provides
    @Singleton
    fun provideCriteria(): Criteria = Criteria()

    @Provides
    @Singleton
    fun provideGeoCoder(
        @ApplicationContext context: Context
    ): Geocoder = Geocoder(context)
}