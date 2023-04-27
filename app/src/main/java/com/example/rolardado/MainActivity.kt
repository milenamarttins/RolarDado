package com.example.rolardado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rolardado.ui.theme.RolarDadoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RolarDadoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   RolarDado()
                    CorFundo()
                }
            }
        }
    }
}
@Preview
@Composable
fun CorFundo(){

}
@Composable
fun RolarDado(){
    var resultado = 1
    Text(
        text ="Jogo do Dado",
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .width(500.dp)
            .padding(45.dp),
        color = androidx.compose.ui.graphics.Color.Gray,
        fontWeight = FontWeight.Bold,
        fontSize = 37.sp,

        )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.dice_1),
            contentDescription = null,
        )
        Button(
            onClick = { /*TODO*/
            resultado = (1..6).random()
            }

        ) {
            Text(
                text ="Rodar"
            )
        }
    }
    
}