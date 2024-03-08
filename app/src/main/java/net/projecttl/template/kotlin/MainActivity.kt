package net.projecttl.template.kotlin

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.projecttl.template.kotlin.ui.theme.DefaultTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultTheme {
                Column(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
                    Greeting("Android")
                    FilledButton {
                        val toast = Toast.makeText(this@MainActivity, "Hello!", Toast.LENGTH_SHORT)
                        toast.show()

                        Log.d("Clicked Button", "successfully execute function.")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        color = Color.White,
        modifier = modifier
    )
}

@Composable
fun FilledButton(onClick: () -> Unit) {
    Button(onClick = { onClick() }, modifier = Modifier.size(80.dp, 35.dp)) {
        Text("test")
    }
}
