package com.sammy.forecast_presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.sammy.forecast_presentation.databinding.FragmentWeatherForecastBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WeatherForecastFragment : Fragment() {

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

}