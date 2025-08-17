package com.example.fooddelivery.data

import androidx.annotation.DrawableRes

data class ProductFlavorState(
    val name : String,
    val price : String,
    @DrawableRes val image : Int
)