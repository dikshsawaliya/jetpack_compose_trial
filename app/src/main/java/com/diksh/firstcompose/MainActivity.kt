package com.diksh.firstcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.diksh.firstcompose.ui.theme.FirstComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            previewFunction()
        }
    }

    @Preview(showBackground = true, widthDp = 300, heightDp = 500)
    @Composable
    fun previewFunction(){
        Column() {
            ListViewItem(imgId =R.drawable.baseline_perm_identity_24 , name ="Diksh" , occupation ="Android Developer")
            ListViewItem(imgId =R.drawable.baseline_perm_identity_24 , name ="Diksh" , occupation ="Android Developer")
            ListViewItem(imgId =R.drawable.baseline_perm_identity_24 , name ="Diksh" , occupation ="Android Developer")
            ListViewItem(imgId =R.drawable.baseline_perm_identity_24 , name ="Diksh" , occupation ="Android Developer")
        }

    }


    @Composable
    fun ListViewItem(imgId: Int, name: String, occupation: String){
      
        Row(Modifier.padding(8.dp)) {
            Image(painter = painterResource(id = imgId),
                contentDescription ="userImage",
                Modifier.size(40.dp)
            )

            Column() {
                Text(text = name)
                Text(text = occupation)
            }
        }
    }
}