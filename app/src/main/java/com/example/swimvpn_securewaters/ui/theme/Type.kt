package com.example.swimvpn_securewaters.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.res.fontResource
import com.example.swimvpn_securewaters.R

val GeneralSans = FontFamily(
    Font(R.font.generalsans_sb, FontWeight.SemiBold),
    Font(R.font.generalsans_b, FontWeight.Bold),
    Font(R.font.generalsans_m, FontWeight.Medium)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = GeneralSans,
        fontWeight = FontWeight.Medium,  // Обычный текст
        fontSize = 24.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = GeneralSans,
        fontWeight = FontWeight.Bold,  // Жирный текст
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelMedium = TextStyle(
        fontFamily = GeneralSans,
        fontWeight = FontWeight.SemiBold,  // Средний вес
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp
    )
)