package com.exam.compose_clone.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exam.compose_clone.AppColors
import com.exam.compose_clone.R
import com.exam.compose_clone.components.FilterSection
import com.exam.compose_clone.components.HomeCardView
import com.exam.compose_clone.components.HomeListSection
import com.exam.compose_clone.model.Snack

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val androidPicks = remember {
        listOf(
            Snack(R.drawable.cupcake, "Cupcake", "A tag Name"),
            Snack(R.drawable.donut, "Donut", "A tag Name"),
            Snack(R.drawable.eclair, "Eclair", "A tag Name"),
            Snack(R.drawable.froyo, "Froyo", "A tag Name"),
            Snack(R.drawable.gingerbread, "Gingerbread", "A tag Name"),
            Snack(R.drawable.honeycomb, "Honeycomb", "A tag Name"),
            Snack(R.drawable.jelly_bean, "Jelly bean", "A tag Name"),
            Snack(R.drawable.kitkat, "Kitkat", "A tag Name"),
            Snack(R.drawable.lollipop, "Lollipop", "A tag Name"),
            Snack(R.drawable.marshmallow, "Marshmallow", "A tag Name"),
            Snack(R.drawable.nougat, "Nougat", "A tag Name"),
            Snack(R.drawable.oreo, "Oreo", "A tag Name"),
        )
    }

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
            HorizontalDivider(
                color = AppColors.Color868686,
                thickness = 0.8.dp
            )
            FilterSection()
            HomeListSection(
                title = "Android's picks",
                onClick = {}
            ) {
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp),
                ) {
                    items(androidPicks) {
                        HomeCardView(item = it)
                    }
                }
            }
        }
    }
}