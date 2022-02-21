package com.sammy.forecast_presentation.utils

import android.location.Location
import android.os.Looper
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import javax.inject.Inject

class LocationUtils @Inject constructor(
    private val fusedLocation: FusedLocationProviderClient
) {
    fun fetchLocationUpdates(): Flow<Location> = callbackFlow {
        val locationRequest = LocationRequest.create().apply {
            interval = UPDATE_INTERVAL
            fastestInterval = FAST_UPDATE_INTERVAL
            priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        }
        val callback = object : LocationCallback() {
            override fun onLocationResult(p0: LocationResult) {
                super.onLocationResult(p0)
                trySend(p0.lastLocation)
            }
        }
        fusedLocation.requestLocationUpdates(
            locationRequest,
            callback,
            Looper.getMainLooper()
        )
        awaitClose {
            fusedLocation.removeLocationUpdates(callback)
        }
    }

    companion object {
        const val UPDATE_INTERVAL = 3000L
        const val FAST_UPDATE_INTERVAL = 3000L
    }
}