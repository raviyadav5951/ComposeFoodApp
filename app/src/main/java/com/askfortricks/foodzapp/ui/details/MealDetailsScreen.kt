package com.askfortricks.foodzapp.ui.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.askfortricks.foodzapp.model.response.Category

@Composable
fun MealDetailsScreen(meal:Category?){

    Column {
        Row {
            Card {
                Image(
                    painter = rememberAsyncImagePainter(model = meal?.strCategoryThumb),
                    contentDescription = "thumb",
                    modifier = Modifier
                        .size(200.dp)
                        .padding(10.dp)

                )
            }
            
            Text(text = meal?.strCategory?:"default name")

        }
        Button(onClick = { /*TODO*/ },) {
            Text("Change state of meal profile picture")
        }


    }

}