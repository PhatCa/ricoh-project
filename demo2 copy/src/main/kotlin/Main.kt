import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.*
@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }
    var counter by remember {mutableStateOf(0)}
    MaterialTheme {
        Button(onClick = {
            text = "Hello, Desktop!"
        }) {
            Text(text)
        }

        Button(onClick = {
            counter++
        }) {
            Text("Increment Counter")
        }

        Text("Counter: $counter", fontSize = 20.sp) // Use "sp" for text size
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
