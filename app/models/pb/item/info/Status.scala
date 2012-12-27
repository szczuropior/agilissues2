package models.pb.item.info

import models.pb.item.data.Color


class Status(val name: String, val description: String = "", val color: Color = Color.WHITE) extends PBItemInfo {
  val id: Long = 0

  def this() = this("")

  def getType = Status
}

case object Status extends PBItemInfoType {
  def getDefaultValue = DefaultStatus
}

object DefaultStatus extends Status() {

}
