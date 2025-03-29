package com.example.composablequadrants

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composablequadrants.ui.theme.ComposableQuadrantsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposableQuadrantsTheme {
                QuadrantsMainScreen()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun QuadrantsMainScreen(modifier : Modifier = Modifier) {
    Column(modifier.padding(16.dp)) {
        Row() {
            FirstQuadrantComposable()
            SecondQuadrantComposable()
        }
        Row() {
            ThirdQuadrantComposable()
            ForthQuadrantComposable()
        }
    }
}

@Composable
fun FirstQuadrantComposable(modifier : Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxWidth(fraction = 0.5f)
            .fillMaxHeight(fraction = 0.5f)
            .background(color = Color(0xFFEADDFF))){
        Text(
            text = stringResource(id = R.string.firstQuadTitle),
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(0.dp, 0.dp, 0.dp, 16.dp)
        )
        Text(
            text = stringResource(id = R.string.firstQuadDesc),
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.Normal
        )
    }
}

@Composable
fun SecondQuadrantComposable(modifier : Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f)
            .background(color = Color(0xFFD0BCFF))) {
        Text(
            text = stringResource(id = R.string.secondQuadTitle),
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(0.dp, 0.dp, 0.dp, 16.dp)
        )
        Text(
            text = stringResource(id = R.string.secondQuadDesc),
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.Normal
        )
    }
}

@Composable
fun ThirdQuadrantComposable(modifier : Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxWidth(0.5f)
            .fillMaxHeight()
            .background(color = Color(0xFFB69DF8))){
        Text(
            text = stringResource(id = R.string.thirdQuadTitle),
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(0.dp, 0.dp, 0.dp, 16.dp)
        )
        Text(
            text = stringResource(id = R.string.thirdQuadDesc),
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.Normal
        )
    }
}

@Composable
fun ForthQuadrantComposable(modifier : Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFF6EDFF))){
        Text(
            text = stringResource(id = R.string.forthQuadTitle),
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(0.dp, 0.dp, 0.dp, 16.dp)
        )
        Text(
            text = stringResource(id = R.string.forthQuadDesc),
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.Normal
        )
    }
}