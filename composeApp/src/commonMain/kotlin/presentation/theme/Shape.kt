package presentation.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

// ============================================================
// Apple-derived corner radius scale.
// 8px  -> compact controls / small chips
// 12px -> standard fields and buttons
// 18px -> cards, module frames, commerce-style panels
// 28px -> large spotlight/feature containers
// 36px -> hero/carousel-level shells
// ============================================================

val AppleShapes = Shapes(
  extraSmall = RoundedCornerShape(8.dp),
  small = RoundedCornerShape(12.dp),
  medium = RoundedCornerShape(18.dp),
  large = RoundedCornerShape(28.dp),
  extraLarge = RoundedCornerShape(36.dp),
)
