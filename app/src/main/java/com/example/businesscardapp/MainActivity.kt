package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 105.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = null,modifier=Modifier.height(150.dp))
            Text(text = "Hudita Alexandru", fontSize = 26.sp)
            Text(text = "Business Card", fontWeight = FontWeight.Bold)
        }
            Column(modifier=Modifier.fillMaxWidth().padding(top=100.dp)) {
                Row() {
                    Image(painter = painterResource(id = R.drawable.phone), contentDescription = null, modifier=Modifier.padding(start=50.dp,top=50.dp).height(50.dp))
                    Text(text="   +40 751 485 629", modifier=Modifier.padding(start= 70.dp,top=65.dp),)
                }
                Row{
                    Image(painter = painterResource(id = R.drawable.gmail), contentDescription = null, modifier=Modifier.padding(start=50.dp).height(50.dp))
                    Text(text="alexhudita@gmail.com", modifier=Modifier.padding(start= 70.dp,top=15.dp))

                }
            }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        Greeting()
    }
}