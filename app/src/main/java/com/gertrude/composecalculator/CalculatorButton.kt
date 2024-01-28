package com.gertrude.composecalculator

import android.service.autofill.OnClickAction
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    symbol:String,
    modifier: Modifier,
    onClick: () -> Unit
){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RectangleShape)
            .padding(7.dp)
            .clickable { onClick() }
            .then(modifier)
    ) {
        Text(
            text = symbol,
            fontSize = 36.sp,
            color = Color.Magenta
            )
    }

}