package com.sammy.forecast_presentation.utils

import android.Manifest
import android.content.Context
import androidx.fragment.app.Fragment
import com.vmadalin.easypermissions.EasyPermissions

object Permissions {
    fun hasLocationPermission(context: Context): Boolean {
        return EasyPermissions.hasPermissions(
            context,
            Manifest.permission.ACCESS_FINE_LOCATION
        )
    }

    fun requestLocationPermission(fragment: Fragment) {
        EasyPermissions.requestPermissions(
            fragment,
            "Enable location to see weather forecast",
            Constants.LOCATION_PERMISSION_REQUEST_CODE,
            Manifest.permission.ACCESS_FINE_LOCATION
        )
    }
}