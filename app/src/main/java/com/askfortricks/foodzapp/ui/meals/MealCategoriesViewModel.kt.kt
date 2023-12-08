package com.askfortricks.foodzapp.ui.meals

import androidx.lifecycle.ViewModel
import com.askfortricks.foodzapp.model.MealsRepository
import com.askfortricks.foodzapp.model.response.MealsCategoriesResponse

class MealCategoriesViewModel(private  val repository:MealsRepository= MealsRepository()):ViewModel() {

    fun getMealsFromRepo(successCallback:(response: MealsCategoriesResponse?)->Unit) {
         repository.getMeals(){
             response->
             successCallback(response)
        }    
    }

}