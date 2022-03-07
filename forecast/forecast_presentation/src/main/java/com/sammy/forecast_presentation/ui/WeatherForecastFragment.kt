package com.sammy.forecast_presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.sammy.forecast_presentation.databinding.FragmentWeatherForecastBinding
import com.sammy.forecast_presentation.utils.Constants
import com.sammy.forecast_presentation.utils.Permissions
import com.sammy.forecast_presentation.utils.Permissions.requestLocationPermission
import com.vmadalin.easypermissions.EasyPermissions
import com.vmadalin.easypermissions.dialogs.SettingsDialog
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WeatherForecastFragment : Fragment(), EasyPermissions.PermissionCallbacks {

    private val binding: FragmentWeatherForecastBinding by lazy {
        FragmentWeatherForecastBinding.inflate(layoutInflater)
    }

    private val viewModel: WeatherForecastViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        checkLocationPermission()
        observeViewModel()
    }

    private fun checkLocationPermission() {
        if (Permissions.hasLocationPermission(requireContext())) {
            viewModel.getLocation()
            observeViewModel()
        } else {
            requestLocationPermission(this)
        }
    }

    private fun observeViewModel() {

    }

    override fun onPermissionsDenied(requestCode: Int, perms: List<String>) {
        if (EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
            SettingsDialog.Builder(requireContext()).build().show()
        } else {
            requestLocationPermission(this)
        }
    }

    override fun onPermissionsGranted(requestCode: Int, perms: List<String>) {
        when (requestCode) {
            Constants.LOCATION_PERMISSION_REQUEST_CODE -> {
                viewModel.getLocation()
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            Constants.LOCATION_PERMISSION_REQUEST_CODE -> {
                EasyPermissions.onRequestPermissionsResult(
                    requestCode,
                    permissions,
                    grantResults,
                    this
                )
            }
        }
    }

}