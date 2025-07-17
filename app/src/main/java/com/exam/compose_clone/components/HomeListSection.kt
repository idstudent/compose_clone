package com.exam.compose_clone.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exam.compose_clone.AppColors
import com.exam.compose_clone.R

@Composable
fun HomeListSection(
    title: String,
    onClick: () -> Unit,
    content: @Composable () -> Unit,
) {
    Column(
        modifier = Modifier
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = title,
                fontSize = 20.sp,
                color = AppColors.PrimaryColor
            )
            Icon(
                painter = painterResource(R.drawable.outline_arrow_forward_24),
                contentDescription = "detail",
                tint = AppColors.PrimaryColor,
                modifier = Modifier.clickable { onClick() }
            )
        }
        content()
    }
}