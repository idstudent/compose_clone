package com.exam.compose_clone.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exam.compose_clone.AppColors
import com.exam.compose_clone.components.FilterSection
import com.exam.compose_clone.components.HomeCardView
import com.exam.compose_clone.components.HomeListSection
import com.exam.compose_clone.components.HomeSquareView
import com.exam.compose_clone.model.androidPicks
import com.exam.compose_clone.model.popularSnacks

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val firstGradient = Brush.horizontalGradient(
        colors = listOf(
            AppColors.Color5922B6,
            AppColors.Color8C9CFF
        )
    )

    val secondGradient = Brush.horizontalGradient(
        colors = listOf(
            AppColors.ColorF6447C,
            AppColors.Color8546F3
        )
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text("Delivery to 1600 Amphitheater Way", fontSize = 20.sp)
                        Spacer(Modifier.width(8.dp))
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowDown,
                            contentDescription = "dropdown",
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = AppColors.White,
                    titleContentColor = AppColors.Black
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(AppColors.White)
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
        ) {
            FilterSection()

            HomeCardSection(title = "Android's picks", gradient = firstGradient)
            HomeSquareSection("Popular on Jetsnack")
            HomeCardSection(title = "WFH favourites", gradient = secondGradient)
            HomeSquareSection("Newly Added")
            HomeCardSection(title = "Only on Jetsnack", gradient = firstGradient, visibleDivider = false)
        }
    }
}
@Composable
fun HomeCardSection(title: String, gradient: Brush, visibleDivider: Boolean = true) {
    HomeListSection(
        title = title,
        onClick = {},
        visibleDivider = visibleDivider
    ) {
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp),
        ) {
            items(androidPicks) {
                HomeCardView(item = it, gradient = gradient)
            }
        }
    }
}

@Composable
fun HomeSquareSection(title: String, visibleDivider: Boolean = true) {
    HomeListSection(
        title = title,
        onClick = {},
        visibleDivider = visibleDivider
    ) {
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(popularSnacks) {
                HomeSquareView(item = it)
            }
        }
    }
}
