package com.example.expensetracker.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color


val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val lightRed = Color(0x1AF95B51)
val Red = Color(0xFFF95B51)

val gray = Color(0xFF888888)

val Gradient1 =
    listOf(
        Color(0xFF429690),
        Color(0xFF2A7C76)
    )

val Teal_gradient = Brush.linearGradient(
    colors = Gradient1,
    start = androidx.compose.ui.geometry.Offset(0f, 0f), // Top-left corner
    end = androidx.compose.ui.geometry.Offset(0f, Float.POSITIVE_INFINITY) // Bottom-right corner
)
val gradientColors2 =
    listOf(
        Color(0xFF63B5AF),
        Color(0xFF438883)
    )

val teal_aqua_gradient = Brush.linearGradient(
    colors = gradientColors2,
    start = androidx.compose.ui.geometry.Offset(0f, 0f), // Top-left corner
    end = androidx.compose.ui.geometry.Offset(0f, Float.POSITIVE_INFINITY) // Bottom-right corner
)

val BackgroundGradient = listOf(
    Color(0xFF429690),
    Color(0xFF2A7C76)
)