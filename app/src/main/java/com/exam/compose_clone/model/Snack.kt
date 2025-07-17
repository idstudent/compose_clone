package com.exam.compose_clone.model

import androidx.compose.runtime.Stable

@Stable
data class Snack(
    val image: Int,
    val name: String,
    val tag: String? = "",
)