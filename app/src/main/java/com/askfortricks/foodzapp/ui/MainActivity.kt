package com.askfortricks.foodzapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.askfortricks.foodzapp.ui.meals.FoodzApp
import com.askfortricks.foodzapp.ui.meals.MealsCategoriesScreen
import com.askfortricks.foodzapp.ui.theme.FoodzAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodzAppTheme {
               FoodzApp()
            }
        }
    }
}

