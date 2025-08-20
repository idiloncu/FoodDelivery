package com.example.fooddelivery.data

import androidx.annotation.DrawableRes
import com.example.fooddelivery.R

data class ProductFlavorState(
    val name: String,
    val price: String,
    @DrawableRes val image: Int
)

val ProductFlavorsData = listOf(
    ProductFlavorState(
        name = "Chedar",
        price = "$0.99",
        image = R.drawable.cheese
    ),
    ProductFlavorState(
        name = "Bacon",
        price = "$0.99",
        image = R.drawable.bacon
    ),
    ProductFlavorState(
        name = "Onion",
        price = "$0.39",
        image = R.drawable.onion

    )
)