# WeatherForecastApplication

<div align="center">
  <a>
    <img src="https://github.com/sammy-mutahi/WeatherForecastApp/blob/main/screenshots/weatherforecast.png" alt="Logo" width="200">
  </a>

<h4 align="center">Weather Forecast App built with Jetpack Compose</h4>
</div>

## About the app

- The main goal of making this app is to learn Jetpack Compose along with other architecture
  components like modularisation etc.
- The app uses [OpenWeatherMap One Call API](https://openweathermap.org/api/one-call-api) to fetch
  current, hourly, and daily(7 days) weather updates.

## About Jetpack Compose

* Jetpack Compose is a modern Android UI toolkit introduced by Google.
* It simplifies the app development process and speeds it up.
* With Jetpack Compose, you can write less code compared to the current view building approach –
  which also means less potential bugs.
* There is one more great thing about it – it uses Kotlin.
* Compose is surely the next big thing in Native Android Development.
* You can learn more about Compose
  here: [Compose Codelabs by Google](https://developer.android.com/courses/pathways/compose)

### How it's built

* Technologies used
    * [Kotlin](https://kotlinlang.org/)
    * [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html)
    * [Hilt](https://developer.android.com/training/dependency-injection/hilt-android)
    * [Retrofit](https://square.github.io/retrofit/)
    * [Jetpack](https://developer.android.com/jetpack)
        * [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle)
        * [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)

* Architecture
    * Modular Architecture
    * MVVM - Model View View Model

* Tests
    * [JUnit5](https://junit.org/junit5/)
    * [MockK](https://github.com/mockk/mockk)
    * [Truth](https://github.com/google/truth)

* CI/CD
    * Github Actions

## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and
create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull
request. You can also simply open an issue with the tag "enhancement" or "feature". Don't forget to
give the project a star!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request
