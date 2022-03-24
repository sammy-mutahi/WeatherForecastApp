package com.sammy.forecast_data.utils

import com.google.common.truth.Truth
import org.junit.Test

class ConvertersTest {
    @Test
    fun `Given the correct current time in long, Return day of the week`() {
        val dt: Long = 1644519780
        val dayOfTheWeek = Converters.convertToDay(dt)
        Truth.assertThat(dayOfTheWeek).isEqualTo("Thursday")
    }

    @Test
    fun `Given random current time in long, Return wrong day of the week`() {
        val dt: Long = 1644519780123445667
        val dayOfTheWeek = Converters.convertToDay(dt)
        Truth.assertThat(dayOfTheWeek).isNotEqualTo("Sunday")
    }
}