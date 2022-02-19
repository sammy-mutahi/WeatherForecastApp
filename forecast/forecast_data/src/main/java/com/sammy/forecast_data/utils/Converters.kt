package com.sammy.forecast_data.utils

import java.text.SimpleDateFormat
import java.util.*

/*
* Returns day of the week from dt i.e Monday
* */
object Converters {
    fun convertToDay(currentTime: Long): String {
        val epoch = currentTime * 1000

        val dateFormat = SimpleDateFormat("EEEE", Locale.getDefault())

        return dateFormat.format(Date(epoch))
    }
}