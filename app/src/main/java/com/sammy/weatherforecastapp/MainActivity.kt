package com.sammy.weatherforecastapp

import android.Manifest
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberMultiplePermissionsState
import com.sammy.forecast_presentation.ui.HomeScreen
import com.sammy.weatherforecastapp.components.PermissionsRationaleDialog
import com.sammy.weatherforecastapp.navigation.Route
import com.sammy.weatherforecastapp.ui.theme.WeatherForecastTheme
import com.sammy.weatherforecastapp.utils.isPermanentlyDenied
import dagger.hilt.android.AndroidEntryPoint

@OptIn(ExperimentalPermissionsApi::class)
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WeatherForecastTheme {
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()

                //permission
                val permissionsState = rememberMultiplePermissionsState(
                    permissions = listOf(
                        //we can always add more permissions
                        Manifest.permission.ACCESS_FINE_LOCATION
                    )
                )

                val lifecycleOwner = LocalLifecycleOwner.current
                DisposableEffect(
                    key1 = lifecycleOwner,
                    effect = {
                        val observer = LifecycleEventObserver { _, event ->
                            if (event == Lifecycle.Event.ON_START) {
                                permissionsState.launchMultiplePermissionRequest()
                            }
                        }
                        lifecycleOwner.lifecycle.addObserver(observer)

                        onDispose {
                            lifecycleOwner.lifecycle.removeObserver(observer)
                        }
                    }
                )
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    scaffoldState = scaffoldState
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = Route.HOME
                    ) {
                        composable(Route.HOME) {
                            permissionsState.permissions.forEach { perm ->
                                when (perm.permission) {
                                    Manifest.permission.ACCESS_FINE_LOCATION -> {
                                        when {
                                            perm.hasPermission -> {
                                                HomeScreen(
                                                    scaffoldState = scaffoldState
                                                )
                                            }
                                            perm.shouldShowRationale -> {
                                                //show rationale dialog
                                                PermissionsRationaleDialog(
                                                    positiveAction = {
                                                        permissionsState.launchMultiplePermissionRequest()
                                                    },
                                                    negativeButton = {

                                                    }
                                                )
                                            }
                                            perm.isPermanentlyDenied() -> {
                                                //enable from settings

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}