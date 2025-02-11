package com.example.expensetracker.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color


val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val gradientColors1 =
    listOf(
        Color(0xFF429690),
        Color(0xFF2A7C76)
    )

val gradientBlue = Brush.linearGradient(
    colors = gradientColors1,
    start = androidx.compose.ui.geometry.Offset(0f, 0f), // Top-left corner
    end = androidx.compose.ui.geometry.Offset(0f, Float.POSITIVE_INFINITY) // Bottom-right corner
)