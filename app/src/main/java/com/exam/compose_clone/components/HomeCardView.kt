package com.exam.compose_clone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.exam.compose_clone.AppColors
import com.exam.compose_clone.model.Snack

@Composable
fun HomeCardView(
    item: Snack
) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .width(170.dp)
            .height(250.dp)
            .border(width = 1.dp, color = AppColors.ColorADADAD, shape = RoundedCornerShape(20.dp))
            .padding(bottom = 16.dp),
        colors = CardDefaults.cardColors(containerColor = AppColors.White)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .height(160.dp)
                    .fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .height(100.dp)
                        .fillMaxWidth()
                        .background(brush =
                            Brush.horizontalGradient(
                                colors = listOf(
                                    AppColors.Color5922B6,
                                    AppColors.Color8C9CFF
                                )
                            )
                        )
                )

                AsyncImage(
                    model = item.image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .size(120.dp)
                        .background(AppColors.White, CircleShape)
                        .clip(CircleShape)
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = item.name,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = AppColors.Black,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Text(
                text = item.tag ?: "",
                fontSize = 14.sp,
                color = AppColors.Color868686,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
    }
}