package models.util

/**
 * Author: michal, 14.10.12
 */

object Color {
  val WHITE = Color("23f10f")

  def apply(rgb: String) = new Color(rgb)
}

class Color(val hexColor: String)

