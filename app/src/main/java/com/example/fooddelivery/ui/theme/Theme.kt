package com.example.fooddelivery.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

object AppTheme {
    val colors: AppColors
        @Composable get() = LocalAppColors.current

    val typography: AppTyphography
        @Composable get() = LocalAppTyphography.current
}

@Composable
fun FoodDeliveryTheme(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalAppColors provides extendedColors,
        LocalAppTyphography provides extendedTyphography
    ) {
        content()
    }
}