package models.pb.item.data

class Color private (val color: String) {
  if (Color.HEX_COLOR.matcher(color).matches())
    throw new IllegalArgumentException("Illegal value for color : " + color);

  def hexColor = Color.HTML_PREFIX + color
}

object Color {
  private val HEX_COLOR = """\d{6}""".r.pattern
  private val HTML_PREFIX = "#"

  def apply(rgb: String) = new Color(rgb)
}

