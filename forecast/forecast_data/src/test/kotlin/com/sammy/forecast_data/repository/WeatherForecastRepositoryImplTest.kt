package com.sammy.forecast_data.repository

import com.google.common.truth.Truth
import com.sammy.forecast_data.data.network.ApiService
import com.sammy.forecast_data.data.repository.WeatherForecastRepositoryImpl
import com.sammy.forecast_data.network.invalidCurrentWeatherResponse
import com.sammy.forecast_data.network.validCurrentWeatherResponse
import com.sammy.forecast_data.network.validWeatherForecastResponse
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

class WeatherForecastRepositoryImplTest {
    private lateinit var repositoryImpl: WeatherForecastRepositoryImpl
    private lateinit var mockWebServer: MockWebServer
    private lateinit var api: ApiService
    private lateinit var okHttpClient: OkHttpClient

    @Before
    fun setUp() {
        mockWebServer = MockWebServer()
        okHttpClient = OkHttpClient.Builder()
            .writeTimeout(1, TimeUnit.SECONDS)
            .readTimeout(1, TimeUnit.SECONDS)
            .connectTimeout(1, TimeUnit.SECONDS)
            .build()
        api = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .client(okHttpClient)
            .baseUrl(mockWebServer.url("/"))
            .build()
            .create(ApiService::class.java)
        repositoryImpl = WeatherForecastRepositoryImpl(api)

    }

    @Test
    fun `Get current weather, Valid response, Return result`() = runBlocking {
        //
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(validCurrentWeatherResponse)
        )
        val result = repositoryImpl.getCurrentWeather(
            "-0.303099",
            "36.080025",
            "0bc9bc2a73fd9644f664cf5f5c5be8d7"
        )
        Truth.assertThat(result.isSuccess).isTrue()
    }

    @Test
    fun `Get current weather, invalid response, Return exception`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(404)
                .setBody(invalidCurrentWeatherResponse)
        )
        val result = repositoryImpl.getCurrentWeather(
            "-0.303099",
            "36.080025",
            "0bc9bc2a73fd9644f664cf5f5c5be8d7"
        )
        Truth.assertThat(result.isFailure).isTrue()
    }

    @Test
    fun `Get weather forecast, valid response, Return result`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(validWeatherForecastResponse)
        )
        val result = repositoryImpl.getForecast(
            "-0.303099",
            "36.080025",
            "0bc9bc2a73fd9644f664cf5f5c5be8d7"
        )
        Truth.assertThat(result.isSuccess).isTrue()
    }

    @After
    fun tearDown() {
        mockWebServer.shutdown()
    }
}