package com.askfortricks.foodzapp.ui.meals

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.askfortricks.foodzapp.model.response.Category
import com.askfortricks.foodzapp.model.response.MealsCategoriesResponse
import com.askfortricks.foodzapp.ui.theme.FoodzAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodzAppTheme {
                MealsCategoriesScreen()
            }
        }
    }
}

@Composable
fun MealsCategoriesScreen(){
    val viewModel: MealCategoriesViewModel = viewModel()
    val rememberedMeals:MutableState<List<Category>> =remember{ mutableStateOf(emptyList<Category>()) }
    viewModel.getMealsFromRepo {
        response ->
        val meal=response?.categories
        Log.d("response",meal.toString())
        rememberedMeals.value=meal.orEmpty()

    }
    
    LazyColumn{
        items(rememberedMeals.value){
            meal->
            Text(text = meal.strCategory)
        }
    }


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FoodzAppTheme {
        MealsCategoriesScreen()
    }
}