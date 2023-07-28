package com.example.study

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeaderPreview()
        }
    }
}

/*
	<thead>
	<tr style="width: 100%; height: 50px; margin: 0px; padding: 0px; background-color: #DCDCDC;">
		<td style="margin: 0px; padding: 0px; min-width: 50px; text-align: center;">
			<label style="margin: 0px; padding: 0px; color: #575757; font-size: 11pt;" lang_key="no">編號</label>
		</td>
		<td style="margin: 0px; padding: 0px; min-width: 100px; text-align: center;">
			<label style="margin: 0px; padding: 0px; color: #575757; font-size: 11pt;" lang_key="name">名稱</label>
		</td>
		<td style="margin: 0px; padding: 0px; width: inherit; text-align: left;">
			<label style="margin: 0px; padding: 0px 0px 0px 30px; color: #575757; font-size: 11pt;" lang_key="name"></label>
		</td>
		<td style="margin: 0px; padding: 0px; min-width: 100px; text-align: center;">
			<label style="margin: 0px; padding: 0px 0px 0px 30px; color: #575757; font-size: 11pt;" lang_key="count">數量</label>
		</td>
	</tr>
	</thead>
 */
@Composable
fun HeaderField(name: String, modifier: Modifier = Modifier) {
    Text(
        color = Color(0x57, 0x57, 0x57),
        fontSize = 11.sp,
        text = "$name",
        modifier = modifier.background(Color(0xDC, 0xDc, 0xDC)).padding(10.dp)
    )
}

@Composable
fun Header(names: List<String>, modifier: Modifier = Modifier) {
    Row(
        modifier.padding(0.dp).height(33.dp)

        // modifier = modifier.background(Color(0xDC, 0xDc, 0xDC))
    ) {
        names.forEach {
            HeaderField(it)
        }
    }

}

@Preview()
@Composable
fun HeaderFieldPreview() {
    HeaderField("編號")
}

@Preview()
@Composable
fun HeaderPreview() {
    Header(listOf("編號", "名稱", "數量"))
}