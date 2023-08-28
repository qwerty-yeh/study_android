package com.example.study

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test()
        }
    }
}

@Composable
fun NumberHeaderField(name: String, modifier: Modifier = Modifier) {
    Text(modifier = Modifier
        .padding(5.dp)
        .width(100.dp),
        color = Color(0x57, 0x57, 0x57),
        fontSize = 11.em,
        textAlign = TextAlign.Center,
        text = "$name",
    )
}

@Composable
fun StringHeaderField(name: String, modifier: Modifier = Modifier) {
    Text(modifier = Modifier
        .padding(5.dp),
        color = Color(0x57, 0x57, 0x57),
        fontSize = 11.em,
        textAlign = TextAlign.Left,
        text = "$name",
    )
}

@Composable
fun Header(modifier: Modifier = Modifier) {
    Row(modifier = Modifier
        .background(Color(0xDC, 0xDc, 0xDC))
    ) {
        NumberHeaderField("編號")
        Spacer(modifier = Modifier.width(8.dp))
        StringHeaderField("名稱")
        Spacer(modifier = Modifier.width(8.dp))
        NumberHeaderField("數量")
    }
}

@Composable
fun Test(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = Modifier.background(Color(0xDC,0xDC,0xDC))
    ) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    modifier = Modifier.padding(5.dp)
                        .width(40.dp),
                    color = Color(0x57,0x57,0x57),
                    fontSize = 3.em,
                    textAlign = TextAlign.Center,
                    text = "編號",
                )
                Text(
                    modifier = Modifier.padding(5.dp)
                        .weight(1f),
                    color = Color(0x57, 0x57, 0x57),
                    fontSize = 3.em,
                    textAlign = TextAlign.Start,
                    text = "起",
                )
                Text(
                    modifier = Modifier.padding(5.dp)
                        .weight(1f),
                    color = Color(0x57, 0x57, 0x57),
                    fontSize = 3.em,
                    textAlign = TextAlign.Start,
                    text = "迄",
                )
                Text(
                    modifier = Modifier.padding(5.dp)
                        .width(50.dp),
                    color = Color(0x57,0x57,0x57),
                    fontSize = 3.em,
                    textAlign = TextAlign.Right,
                    text = "時間",
                )
            }
        }
        item {
            Row(
                modifier = Modifier.fillMaxHeight()
                    .background(Color(0xFF, 0xFF, 0xFF))
            ) {
                Text(
                    modifier = Modifier.padding(5.dp)
                        .width(40.dp),
                    color = Color(0x57, 0x57, 0x57),
                    fontSize = 3.em,
                    textAlign = TextAlign.Center,
                    text = "1",
                )
                Text(
                    modifier = Modifier.padding(5.dp)
                        .weight(1f, true),
                    color = Color(0x57, 0x57, 0x57),
                    fontSize = 3.em,
                    textAlign = TextAlign.Left,
                    text = "2023-07-30 12:34:56",
                )
                Text(
                    modifier = Modifier.padding(5.dp)
                        .weight(1f, true),
                    color = Color(0x57, 0x57, 0x57),
                    fontSize = 3.em,
                    textAlign = TextAlign.Left,
                    text = "2023-07-30 12:34:56",
                )
                Text(
                    modifier = Modifier.padding(5.dp)
                        .width(50.dp),
                    color = Color(0x57, 0x57, 0x57),
                    fontSize = 3.em,
                    textAlign = TextAlign.Right,
                    text = "100",
                )
            }
        }
    }
}

@Preview()
@Composable
fun HeaderFieldPreview() {
    // NumberHeaderField("編號")
}

@Preview()
@Composable
fun HeaderPreview() {
    // Header()
}

@Preview()
@Composable
fun TestPreview() {
    Test()
}