package com.askfortricks.foodzapp.model

import com.askfortricks.foodzapp.api.MealsWebService
import com.askfortricks.foodzapp.model.response.Category
import com.askfortricks.foodzapp.model.response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MealsRepository(private val webService: MealsWebService= MealsWebService()) {
    companion object{
        @Volatile
        private var instance:MealsRepository?=null

        fun getInstance()=instance?: synchronized(this){
            instance?:MealsRepository().also {
                instance=it
            }
        }

    }

    private var cacheMeals= listOf<Category>()

    suspend fun getMeals(): MealsCategoriesResponse {
        var response=webService.getMeals()
        cacheMeals=response.categories
        return response

    }

    fun getMeal(mealID:String):Category?{
        return cacheMeals.firstOrNull {
            it.idCategory==mealID
        }
    }
}