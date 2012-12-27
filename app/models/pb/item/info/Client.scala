package models.pb.item.info

import models.pb.item.data.Color


class Client(val name: String, val description: String = "", val color: Color = Color.WHITE) extends PBItemInfo {
  def this() = this("")

  val id: Long = 0
  def getType = Client


}

case object Client extends PBItemInfoType {
  def getDefaultValue = DefaultClient
}

object DefaultClient extends Client()