package presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// ============================================================
// Apple-derived type scale.
// FontFamily.Default resolves to San Francisco on iOS and to the
// platform system font on Android; no bundled font is required.
// Sizes/weights/tracking approximate SF Pro Display (large roles)
// and SF Pro Text (body/label roles), per Apple's public metrics.
// ============================================================

private val AppleFontFamily = FontFamily.Default

val AppleTypography = Typography(
  displayLarge = TextStyle(
    fontFamily = AppleFontFamily,
    fontWeight = FontWeight.SemiBold,
    fontSize = 56.sp,
    lineHeight = 60.sp,
    letterSpacing = (-0.28).sp,
  ),
  displayMedium = TextStyle(
    fontFamily = AppleFontFamily,
    fontWeight = FontWeight.SemiBold,
    fontSize = 48.sp,
    lineHeight = 52.sp,
    letterSpacing = (-0.14).sp,
  ),
  displaySmall = TextStyle(
    fontFamily = AppleFontFamily,
    fontWeight = FontWeight.SemiBold,
    fontSize = 40.sp,
    lineHeight = 44.sp,
    letterSpacing = 0.sp,
  ),
  headlineLarge = TextStyle(
    fontFamily = AppleFontFamily,
    fontWeight = FontWeight.SemiBold,
    fontSize = 32.sp,
    lineHeight = 36.sp,
    letterSpacing = 0.13.sp,
  ),
  headlineMedium = TextStyle(
    fontFamily = AppleFontFamily,
    fontWeight = FontWeight.SemiBold,
    fontSize = 28.sp,
    lineHeight = 32.sp,
    letterSpacing = 0.2.sp,
  ),
  headlineSmall = TextStyle(
    fontFamily = AppleFontFamily,
    fontWeight = FontWeight.SemiBold,
    fontSize = 24.sp,
    lineHeight = 28.sp,
    letterSpacing = 0.22.sp,
  ),
  titleLarge = TextStyle(
    fontFamily = AppleFontFamily,
    fontWeight = FontWeight.SemiBold,
    fontSize = 21.sp,
    lineHeight = 26.sp,
    letterSpacing = 0.23.sp,
  ),
  titleMedium = TextStyle(
    fontFamily = AppleFontFamily,
    fontWeight = FontWeight.SemiBold,
    fontSize = 19.sp,
    lineHeight = 24.sp,
    letterSpacing = 0.23.sp,
  ),
  titleSmall = TextStyle(
    fontFamily = AppleFontFamily,
    fontWeight = FontWeight.Medium,
    fontSize = 17.sp,
    lineHeight = 22.sp,
    letterSpacing = (-0.37).sp,
  ),
  bodyLarge = TextStyle(
    fontFamily = AppleFontFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 17.sp,
    lineHeight = 25.sp,
    letterSpacing = (-0.37).sp,
  ),
  bodyMedium = TextStyle(
    fontFamily = AppleFontFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 15.sp,
    lineHeight = 21.sp,
    letterSpacing = (-0.24).sp,
  ),
  bodySmall = TextStyle(
    fontFamily = AppleFontFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 13.sp,
    lineHeight = 18.sp,
    letterSpacing = (-0.08).sp,
  ),
  labelLarge = TextStyle(
    fontFamily = AppleFontFamily,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp,
    lineHeight = 18.sp,
    letterSpacing = (-0.22).sp,
  ),
  labelMedium = TextStyle(
    fontFamily = AppleFontFamily,
    fontWeight = FontWeight.Medium,
    fontSize = 12.sp,
    lineHeight = 16.sp,
    letterSpacing = (-0.12).sp,
  ),
  labelSmall = TextStyle(
    fontFamily = AppleFontFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 10.sp,
    lineHeight = 14.sp,
    letterSpacing = (-0.08).sp,
  ),
)
