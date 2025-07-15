package com.exam.compose_clone.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exam.compose_clone.AppColors

@Composable
fun FilterChip(
    content: String
) {
    Box(
        modifier = Modifier
            .border(width = 1.dp, color = AppColors.PrimaryColor, shape = RoundedCornerShape(20.dp))
            .padding(horizontal = 16.dp, vertical = 8.dp),
        contentAlignment = Alignment.Center

    ) {
        Text(
            text = content,
            color = AppColors.Black,
            fontSize = 16.sp
        )
    }
}