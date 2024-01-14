package com.xxmrk888ytxx.app2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource

class BossActivity2007 : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            var alpha by remember {
                mutableFloatStateOf(0f)
            }

            val animatedAlpha by animateFloatAsState(targetValue = alpha, label = "", animationSpec = tween(1000))


            LaunchedEffect(key1 = Unit, block = {
                alpha = 1f
            })

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .alpha(animatedAlpha),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.boss_of_the_jum),
                    contentDescription = null
                )
            }
        }
    }
}