package com.example.learntogether


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface(modifier = Modifier.fillMaxSize()){
                    ImageImplementation(title = stringResource(R.string.jetpack_compose_tutorial_title),
                        text1 = stringResource(R.string.jetpack_compose_tutorial_text1) ,
                        text2 = stringResource(R.string.jetpack_compose_tutorial_text2))
                }
                }
            }
        }
    }

@Composable
fun FirstParagraphe(title: String,modifier: Modifier = Modifier){
        Text(
            text=title,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
}
@Composable
fun SecondParagraphe(text: String,modifier: Modifier = Modifier){
        Text(
            text = text,
            fontSize = 16.sp,
            modifier = modifier.padding( start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
}
@Composable
fun ThirdParagraphe(text: String,modifier: Modifier = Modifier){
    Text(
        text = text,
        fontSize = 16.sp,
        modifier = modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}
@Composable
fun ImageImplementation(title: String, text1: String,text2: String,modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier.fillMaxSize()
        ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.Fit,
        )
        FirstParagraphe(title = title)
        SecondParagraphe(text= text1)
        ThirdParagraphe(text = text2)
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        ImageImplementation(title = stringResource(R.string.jetpack_compose_tutorial_title),
            text1 =stringResource(R.string.jetpack_compose_tutorial_text1) ,
            text2 = stringResource(R.string.jetpack_compose_tutorial_text2))
    }
}