package com.askfortricks.foodzapp.ui.meals

import androidx.lifecycle.ViewModel
import com.askfortricks.foodzapp.model.MealsRepository
import com.askfortricks.foodzapp.model.response.Category

class MealCategoriesViewModel(private  val repository:MealsRepository= MealsRepository()):ViewModel() {

    suspend fun getMealsFromRepo():List<Category> {
         return repository.getMeals().categories
    }

}