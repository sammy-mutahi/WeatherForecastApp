package com.sammy.core_ui

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

val BrightGreen: Color = Color(0xFF00C713)
val DarkGreen: Color = Color(0xFF00790C)
val Orange: Color = Color(0xFFFFAA00)
val LightGray: Color = Color(0xFF808080)
val MediumGray: Color = Color(0xFF404040)
val DarkGray: Color = Color(0xFF202020)
val TextWhite: Color = Color(0xFFEEEEEE)

data class Color(
    val sunnyBackgroundColor: Color = Color(0xFF47AB2F),
    val cloudyBackgroundColor: Color = Color(0xFF54717A),
    val rainyBackgroundColor: Color = Color(0xFF57575D)
)

val LocalColors = compositionLocalOf { Color() }