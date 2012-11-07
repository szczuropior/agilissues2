package models.pb.item.data

import models.util.Color


class Feature(val name: String, val description: String = "", val color: Color = Color.WHITE) extends PBItemInfo {
  val id: Long = 0

  def this() = this("")

  def getType = Feature

}

case object Feature extends PBItemInfoType {
  def getDefaultValue = DefaultFeature
}

object DefaultFeature extends Feature() {

}
