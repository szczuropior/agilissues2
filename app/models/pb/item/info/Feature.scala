package models.pb.item.info

import models.pb.item.data.Color


class Feature(val name: String, val description: String = "") extends PBItemInfo {
  val id: Long = 0

  def this() = this("")

  def getType = Feature

}

case object Feature extends PBItemInfoType {
  def getDefaultValue = DefaultFeature
  def apply(name: String, description: String = "") = new Feature(name, description)
}

object DefaultFeature extends Feature() {

}
