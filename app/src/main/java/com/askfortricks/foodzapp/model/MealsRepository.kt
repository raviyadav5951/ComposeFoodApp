package com.askfortricks.foodzapp.model

import com.askfortricks.foodzapp.api.MealsWebService
import com.askfortricks.foodzapp.model.response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MealsRepository(private val webService: MealsWebService= MealsWebService()) {

    suspend fun getMeals(): MealsCategoriesResponse {
        return webService.getMeals()

    }
}