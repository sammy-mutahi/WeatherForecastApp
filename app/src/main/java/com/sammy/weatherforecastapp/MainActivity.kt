package com.sammy.weatherforecastapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.sammy.weatherforecastapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navHostFragment = NavHostFragment.create(
            com.sammy.forecast_presentation.R.navigation.core_navigation
        )

        supportFragmentManager.beginTransaction()
            .replace(R.id.parent_container, navHostFragment)
            .setPrimaryNavigationFragment(navHostFragment)
            .commit()
    }
}