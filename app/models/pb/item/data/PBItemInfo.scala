package models.pb.item.data

import models.util.Color


trait PBItemInfo extends Serializable {
  val id: Long
  val name: String
  val description: String
  val color: Color

  def getType: PBItemInfoType

  def colorStr: String = color.hexColor
}

trait PBItemInfoType extends Serializable {
  def getDefaultValue: PBItemInfo
}
