package com.diksh.firstcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dalvik.system.BaseDexClassLoader

@Preview(heightDp = 500)
@Composable
fun PreviewItem(){
    //Lazy Columns is nothing but just like the RecyclerView. Normal columns and rows renders all the list and rows
    //once the activity is launched but LazyRows and LazyColumns renders them only when needed.
    LazyColumn(content = {
        items(getCategoryList()){ item ->
            BlogCategory(img = item.img, title = item.title, subtitle =item.subtitle)
        }
    })

}
@Composable
fun BlogCategory(img: Int, title: String, subtitle: String){
    Card(elevation = CardDefaults.cardElevation(8.dp), modifier = Modifier.padding(8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(8.dp)) {
            Image(painter = painterResource(id = R.drawable.baseline_perm_identity_24),
                contentDescription ="dummy",
                modifier = Modifier.padding(4.dp),
                alignment = Alignment.Center)
            ItemDescription(title, subtitle,Modifier.weight(10f))
        }
    }
}

@Composable
private fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(title, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold)
        Text(subtitle)
    }
}

data class Category(val img: Int, val title: String, val subtitle: String)

fun getCategoryList() : MutableList<Category>{
    val list = mutableListOf<Category>()
    list.add(Category(1, "Diksh", "Software DEveloper"))
    list.add(Category(1, "dedawda", "Software qwwe13"))
    list.add(Category(1, "asdadas", "Software qwq"))
    list.add(Category(1, "jutyjtyj", "Software DEvfefwfweloper"))
    list.add(Category(1, "rwerrr", "Software xzvdwvww"))
    list.add(Category(1, "uytjn", "Software wefew"))
    list.add(Category(1, "dedawda", "Software qwwe13"))
    list.add(Category(1, "asdadas", "Software qwq"))
    list.add(Category(1, "jutyjtyj", "Software DEvfefwfweloper"))
    list.add(Category(1, "rwerrr", "Software xzvdwvww"))
    list.add(Category(1, "uytjn", "Software wefew"))
    list.add(Category(1, "Diksh", "Software DEveloper"))
    list.add(Category(1, "dedawda", "Software qwwe13"))
    list.add(Category(1, "asdadas", "Software qwq"))
    list.add(Category(1, "jutyjtyj", "Software DEvfefwfweloper"))
    list.add(Category(1, "rwerrr", "Software xzvdwvww"))
    list.add(Category(1, "uytjn", "Software wefew"))
    list.add(Category(1, "dedawda", "Software qwwe13"))
    list.add(Category(1, "asdadas", "Software qwq"))
    list.add(Category(1, "jutyjtyj", "Software DEvfefwfweloper"))
    list.add(Category(1, "rwerrr", "Software xzvdwvww"))
    list.add(Category(1, "uytjn", "Software wefew"))
    return list
}
