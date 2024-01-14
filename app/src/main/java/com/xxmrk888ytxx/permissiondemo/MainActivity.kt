package com.xxmrk888ytxx.permissiondemo

import android.content.ComponentName
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.xxmrk888ytxx.permissiondemo.ui.theme.PermissionDemoTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Button(onClick = {
                    val intent = Intent()
                    intent.setComponent(
                        ComponentName(
                            "com.xxmrk888ytxx.app2",
                            "com.xxmrk888ytxx.app2.BossActivity2007"
                        )
                    )
                    startActivity(intent)
                }) {
                    Text("Узреть легенду")
                }

                Button(onClick = {
                    if (checkSelfPermission("china_party_great_xi.dangerous") == PackageManager.PERMISSION_GRANTED) {
                        val intent = Intent()
                        intent.setComponent(
                            ComponentName(
                                "com.xxmrk888ytxx.app2",
                                "com.xxmrk888ytxx.app2.SocialXRating"
                            )
                        )
                        startActivity(intent)
                    } else {
                        requestPermissions(arrayOf("china_party_great_xi.dangerous"), 1)
                    }
                }) {
                    Text("Тест на лояльность")
                }

                Button(onClick = {
                    val intent = Intent()
                    intent.setComponent(
                        ComponentName(
                            "com.xxmrk888ytxx.app2",
                            "com.xxmrk888ytxx.app2.JasonStatham"
                        )
                    )
                    startActivity(intent)
                }) {
                    Text("Народная мудрость")
                }

                Button(onClick = {
                    val intent = Intent()
                    intent.setComponent(
                        ComponentName(
                            "com.xxmrk888ytxx.app2",
                            "com.xxmrk888ytxx.app2.Activity2"
                        )
                    )
                    startActivity(intent)
                }) {
                    Text("Хобана")
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PermissionDemoTheme {
        Greeting("Android")
    }
}