package com.exam.compose_clone.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.exam.compose_clone.AppColors
import com.exam.compose_clone.R

@Composable
fun FilterSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Box(
            modifier = Modifier.border(
                width = 1.dp,
                color = AppColors.PrimaryColor,
                shape = RoundedCornerShape(24.dp)
            ),
            contentAlignment = Alignment.Center
        ){
            Icon(
                painter = painterResource(R.drawable.outline_filter_list_24),
                contentDescription = "filter",
                tint = AppColors.PrimaryColor,
                modifier = Modifier
                    .padding(8.dp)
                    .clickable {
                    // TODO: 필터화면 작업
                }
            )
        }
        FilterChip("Organic")
        FilterChip("Gluten-free")
        FilterChip("Dairy-free")
        FilterChip("Sweet")
        FilterChip("Savory")
    }
}
