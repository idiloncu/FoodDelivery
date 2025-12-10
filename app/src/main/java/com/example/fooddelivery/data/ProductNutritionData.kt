package com.example.fooddelivery.data

data class ProductNutritionData(
    val calories:Calories,
    val nutrition : List<NutritionState>
)

data class Calories(
    val value : String,
    val unit : String
)

data class NutritionState(
    val amount:String,
    val unit : String,
    val title : String
)
val productNutritionData = ProductNutritionData(
    calories = Calories(
        value = "200",
        unit = "Cal"
    ),
    nutrition = listOf(
        NutritionState(
            amount = "100",
            unit = "g",
            title = "Fat"
        ),
        NutritionState(
            amount = "43",
            unit = "g",
            title = "Protein"
        ),
        NutritionState(
            amount = "66",
            unit = "g",
            title = "Carbohydrates"
        )
    )
)
